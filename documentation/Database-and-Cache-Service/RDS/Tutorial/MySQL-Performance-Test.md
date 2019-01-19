# MySQL Performance Test
The maximum connection number and IOPS are different according to different specifications of JCS for MySQL, see [here](../Introduction/Specifications.md).

Tutorial of performance test for JCS for MySQL is shown as below

## Test Environment
* All tests are completed in Availability Zone A of cn-north-1
* Virtual Machines Specification for Test: 4C 16GB
* Virtual Machines Image for Test: CentOS 6.5 64-bit
* JCS for MySQL version for Test: 5.7

## Test Tool
### SysBench
SysBench is a scriptable multi-thread benchmark test tool based on LuaJIT. It is mostly used for database benchmark test, but it can also be used to create any complex workload involving no database server.

#### Installation
1. Download Link of sysbench, [Click to Download](https://github.com/akopytov/sysbench/archive/1.0.zip)
2. Installation Commands

```
$ yum install gcc gcc-c++ autoconf automake make libtool bzr mysql-devel
$ unzip sysbench-1.0.zip
$ cd sysbench-1.0
$ ./autogen.sh
$ ./configure --prefix=/usr
$ make
$ make install
```

## Test Commands
### Data Preparation

```
$ sysbench ./share/sysbench/oltp_read_write.lua --table_size=10000000 --db-driver=mysql --tables=10 --mysql-host=XXX --mysql-user=XXX --mysql-password=XXX prepare
```

### Pressure Test for Performance

```
$ sysbench ./share/sysbench/oltp_read_write.lua --tables=10 --threads=32 --max-requests=999999999 --time=3600 --table_size=10000000  --db-driver=mysql --mysql-host=XXX --mysql-user=XXX --mysql-password=XXX run
```

### Environment Clear

```
$ sysbench ./share/sysbench/oltp_read_write.lua --tables=10 --threads=32 --max-requests=999999999 --time=3600 --table_size=10000000  --db-driver=mysql --mysql-host=XXX --mysql-user=XXX --mysql-password=XXX cleanup
```

## Test Model
### Table Structure

```
CREATE TABLE `sbtest7` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `k` int(11) NOT NULL DEFAULT '0',
  `c` char(120) NOT NULL DEFAULT '',
  `pad` char(60) NOT NULL DEFAULT '',
  PRIMARY KEY (`id`),
  KEY `k_7` (`k`)
) ENGINE=InnoDB
```

### Data Format

```
id: 1
  k: 5003504
  c: 98210233655-92920312724-46680254539-74097273196-30247159819-37778834059-40387910259-28547466616-68642657061-93956851311
pad: 13866500364-00628646396-45402716318-87575412098-94787248459
```

### SQL Pattern
#### Search

```
$ SELECT c FROM sbtest3 WHERE id=5007521
$ SELECT c FROM sbtest7 WHERE id BETWEEN 5000580 AND 5000679
$ SELECT SUM(k) FROM sbtest2 WHERE id BETWEEN 4992664 AND 4992763
$ SELECT DISTINCT c FROM sbtest6 WHERE id BETWEEN 5041654 AND 5041753 ORDER BY c
```

#### Update

```
$ UPDATE sbtest2 SET k=k+1 WHERE id=4979352
$ DELETE FROM sbtest6 WHERE id=5037406
$ INSERT INTO sbtest4 (id, k, c, pad) VALUES (4995019, 4995155, '58990155292-53936825106-56125467619-3...
``` 

## Test Indicators
* TPS: Transaction Per Second, number of transactions performed by database per second, which is subject to commit.
* QPS: Query Per Second, number of SQL performed by database per second (including insert, select, update, and delete.)
* QT: Query Time, time for performing each request by database.
