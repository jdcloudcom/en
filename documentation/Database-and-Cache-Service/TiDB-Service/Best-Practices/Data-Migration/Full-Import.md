# Full Import
## Use mydumper/loader to perform full data import
mydumper is a more powerful data migration tool, see https://github.com/maxbube/mydumper for details.

You can use mydumper to export data from MySQL, then use loader to import the data into TiDB.

**Note: Though TiDB also supports to use mysqldump tool of MySQL official for data migration, its performance of speed is much slower compared with mydumper/loader. So, we do not recommend it as it will spend a lot of time when migrating a massive of data.**

## Best Practices for Full Data Import by mydumper/loader
In order to rapidly migrate data (particularly for databases with huge data bulk), you can reference the following suggestions:

- You need SELECT, RELOAD, LOCK TABLES permissions at least to export data by mydumper
- The size of data file exported by mydumper shall be as small as possible, which is preferably no more than 64M. You can set parameters -F 64
- The -t parameter of loader can be evaluated and adjusted according to the number of instances and load of tikv. E.g., in the scenario of 3 tikvs, the value can be set as 3 * (1 ~ n); if tikv load is too high, leading to many backoffer.maxSleep 15000ms is exceeded appeared in the logs of loader and tidb, it can be adjusted to an appropriately small value, vice versa.

## An Example for import and Relevant Configuration
- The total data bulk exported by mydumper is 214G, with 8 columns in each single table and 2 billion rows of data
- Cluster Topology
  - TIKV * 12
  - TIDB * 4
  - PD * 3
- Set mydumper -F as 16 and loader -t parameter as 64

Result: Import time is about 11 hours, i.e., 19.4G/hour

## Export Data from MySQL
We use mydumper to export data from MySQL, shown as follows:

```
./bin/mydumper -h 127.0.0.1 -P 3306 -u root -t 16 -F 64 -B test -T t1,t2 --skip-tz-utc -o ./var/test
```
As we mentioned above, we use -B test to indicate that we operate the database of test, then we use -T t1, t2 to indicate that we only export two tables of t1 and t2.

-t 16 indicates that we use 16 threads to export data. -F 64 means the splitting size of chunk for the actual table, in this case one chunk is 64MB.

--Adding skip-tz-utc parameter means that the inconsistence between MySQL and machine conducting data migration will be ignored, which automatic conversion is prohibited.

**Note: In some clouds needing super privilege, such as Alibaba Cloud, we shall add --no-locks parameter, otherwise you will be prompted for No Operation Permission.**

## Import Data into TiDB
**Note: At present, TiDB supports UTF8mb4 character encoding. Suppose the data exported by mydumper is latin1 character encoding, please use iconv -f latin1 -t utf-8 $file -o /data/imdbload/$basename command to conduct conversion, wherein $file is the original file, $basename is the converted file.**

**Note: If mydumper uses -m parameter, data without table structure will be exported and loader cannot import such data at the moment.**

We use loader to import data exported before into TiDB. See Loader use document for Loader download and specific use method

```
./bin/loader -h 127.0.0.1 -u root -P 4000 -t 32 -d ./var/test
```

After successful import, we can use official client of MySQL to enter TiDB for view:

```
mysql -h127.0.0.1 -P4000 -uroot

mysql> show tables;
+----------------+
| Tables_in_test |
+----------------+
| t1             |
| t2             |
+----------------+

mysql> select * from t1;
+----+------+
| id | age  |
+----+------+
|  1 |    1 |
|  2 |    2 |
|  3 |    3 |
+----+------+

mysql> select * from t2;
+----+------+
| id | name |
+----+------+
|  1 | a    |
|  2 | b    |
|  3 | c    |
+----+------+
```

