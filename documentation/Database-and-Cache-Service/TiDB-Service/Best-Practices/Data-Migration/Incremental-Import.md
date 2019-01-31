# Increment Migration

## Use syncer to conduct increment data import
We have introduced how use mydumper/loader to conduct full data import from MySQL to TiDB above. But if MySQL data are updated later and we still want to make a quick import, then the Full Import method is not appropriate.

TiDB provides syncer tool to conveniently conduct increment data import from MySQL to TiDB.

syncer belongs to a toolkit of TiDB enterprise version, see Download TiDB Enterprise Version Toolkit for acquisition.

## Download TiDB Enterprise Version Toolkit (Linux)
```
# Download tool compressed package
wget http://download.pingcap.org/tidb-enterprise-tools-latest-linux-amd64.tar.gz
wget http://download.pingcap.org/tidb-enterprise-tools-latest-linux-amd64.sha256

# Check the integrity of file. Returning ok indicates correctness
sha256sum -c tidb-enterprise-tools-latest-linux-amd64.sha256
# Extract the compressed package
tar -xzf tidb-enterprise-tools-latest-linux-amd64.tar.gz
cd tidb-enterprise-tools-latest-linux-amd64
```

Suppose we have imported some data of two tables of t1 and t2 by using mydumper/loader before. Now we want to implement real-time synchronization from any update of the two tables to TiDB.

## Obtain synchronization position
As mentioned above, there is metadata file containing position information needed by us in the data directory exported by mydumper.

The example of metadata file information content:
```
Started dump at: 2017-04-28 10:48:10
SHOW MASTER STATUS:
    Log: mysql-bin.000003
    Pos: 930143241
    GTID:

Finished dump at: 2017-04-28 10:48:11
```

We save information related to position in a syncer.meta file for syncer synchronization:

```
# cat syncer.meta
binlog-name = "mysql-bin.000003"
binlog-pos = 930143241
binlog-gtid = "2bfabd22-fff7-11e6-97f7-f02fa73bcb01:1-23,61ccbb5d-c82d-11e6-ac2e-487b6bd31bf7:1-4"
```

- **Note: Syncer.meta only need to be configured when first use, which will be automatically updated to new position after follow-up synchronization of syncer to binlog.**

- **Note: If you use binlog position synchronization, you only need to configure binlog-name binlog-pos; if you use gtid synchronization, you need to set gtid and --enable-gtid must be used when starting syncer**

## Start syncer
Before starting syncer service, please carefully read Syncer Increment Import

The configuration file config.toml of syncer:

```
log-level = "info"

server-id = 101

## meta file address
meta = "./syncer.meta"

worker-count = 16
batch = 10

## Debugging address of pprof. Prometheus can also obtain syncer metrics through the address
## Modify 127.0.0.1 to IP address of corresponding host
status-addr = "127.0.0.1:10086"

## Skip DDL or other statements, with the format of **full matching of prefix**, e.g., for `DROP TABLE ABC`, `DROP TABLE` need to be entered at least.
# skip-sqls = ["ALTER USER", "CREATE USER"]

## After using route-rules function,
## the value priority relationship after replicate-do-db & replicate-ignore-db matching the table (target-schema & target-table)
## : replicate-do-db --> replicate-do-table --> replicate-ignore-db --> replicate-ignore-table
## Designate the database name to be synchronized; support regex match, which the statement of expression must be begun with `~`
#replicate-do-db = ["~^b.*","s1"]

## Design db.table table to be synchronized
## db-name and tbl-name do not support `db-name ="dbname, dbname2"` format
#[[replicate-do-table]]
#db-name ="dbname"
#tbl-name = "table-name"

#[[replicate-do-table]]
#db-name ="dbname1"
#tbl-name = "table-name1"

## Design db.table table to be synchronized; support regex match, which the statement of expression must be begun with `~`
#[[replicate-do-table]]
#db-name ="test"
#tbl-name = "~^a.*"

## Designate **Ignore** database synchronization; support regex match, which the statement of expression must be begun with `~`
#replicate-ignore-db = ["~^b.*","s1"]

## Designate **Ignore** database synchronization
## db-name & tbl-name do not support `db-name ="dbname, dbname2"` statement format
#[[replicate-ignore-table]]
#db-name = "your_db"
#tbl-name = "your_table"

## Designate **Ignore** database name synchronization; support regex match, which the statement of expression must be begun with `~`
#[[replicate-ignore-table]]
#db-name ="test"
#tbl-name = "~^a.*"


# sharding synchronization rule adopts wildcharacter
# 1. Asterisk (*) character can match zero or multiple characters,
#    E.g., doc* matches doc and document but dodo;
#    Asterisk can only be placed at the end of pattern and one pattern with one asterisk
# 2. Question mark (?) character It matches any character

#[[route-rules]]
#pattern-schema = "route_*"
#pattern-table = "abc_*"
#target-schema = "route"
#target-table = "abc"

#[[route-rules]]
#pattern-schema = "route_*"
#pattern-table = "xyz_*"
#target-schema = "route"
#target-table = "xyz"

[from]
host = "127.0.0.1"
user = "root"
password = ""
port = 3306

[to]
host = "127.0.0.1"
user = "root"
password = ""
port = 4000
```

Start syncer:

```
./bin/syncer -config config.toml

2016/10/27 15:22:01 binlogsyncer.go:226: [info] begin to sync binlog from position (mysql-bin.000003, 1280)
2016/10/27 15:22:01 binlogsyncer.go:130: [info] register slave for master server 127.0.0.1:3306
2016/10/27 15:22:01 binlogsyncer.go:552: [info] rotate to (mysql-bin.000003, 1280)
2016/10/27 15:22:01 syncer.go:549: [info] rotate binlog to (mysql-bin.000003, 1280)
```

## Insert new data in MySQL
```
INSERT INTO t1 VALUES (4, 4), (5, 5);
```

Login TiDB to view:

```
mysql -h127.0.0.1 -P4000 -uroot -p
mysql> select * from t1;
+----+------+
| id | age  |
+----+------+
|  1 |    1 |
|  2 |    2 |
|  3 |    3 |
|  4 |    4 |
|  5 |    5 |
+----+------+
```

syncer will output current synchronization statistics every 30s, shown as below

```
2017/06/08 01:18:51 syncer.go:934: [info] [syncer]total events = 15, total tps = 130, recent tps = 4,
master-binlog = (ON.000001, 11992), master-binlog-gtid=53ea0ed1-9bf8-11e6-8bea-64006a897c73:1-74,
syncer-binlog = (ON.000001, 2504), syncer-binlog-gtid = 53ea0ed1-9bf8-11e6-8bea-64006a897c73:1-17
2017/06/08 01:19:21 syncer.go:934: [info] [syncer]total events = 15, total tps = 191, recent tps = 2,
master-binlog = (ON.000001, 11992), master-binlog-gtid=53ea0ed1-9bf8-11e6-8bea-64006a897c73:1-74,
syncer-binlog = (ON.000001, 2504), syncer-binlog-gtid = 53ea0ed1-9bf8-11e6-8bea-64006a897c73:1-35
```
It can be seen that we are able to make update and synchronization of MySQL to TiDB automatically by using syncer.
