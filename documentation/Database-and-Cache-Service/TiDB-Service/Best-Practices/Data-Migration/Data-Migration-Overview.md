# Data Migration Overview

## Overview
This document introduces in detail how to migrate MySQL data to TiDB.

We assume that MySQL and TiDB service information is as below:

|Name|	Address|	Port|	User|	Password|
|-|-|-|-|-|
|MySQL|	127.0.0.1|	3306|	root|	*|
|TiDB|	127.0.0.1|	4000|	root|	*|

In the course of this data migration, we will use the following four tools:

- checker checks whether schema can be compatible with TiDB
- mydumper exports data from MySQL
- loader imports data to TiDB
- syncer implements increment synchronization of MySQL data to TiDB

## Two migration scenarios
- The first scenario: Only fully import historical data (require checker + mydumper + loader);
- The second scenario: After fully importing historical data, synchronize new data by increment method (require checker + mydumper + loader + syncer). binlog shall be enabled in advance in this scenario, with its format must be ROW.

## Enable binlog for MySQL
**Note: Only in the second scenario mentioned above, shall binlog be enabled in advance before dump data**

- See Setting the Replication Master Configuration for enabling binlog function for MySQL
- Binlog format must be ROW format, which is the recommended binlog format after MySQL 5.7 and can be enabled by the following instruction:
```
SET GLOBAL binlog_format = ROW;
```

## Use checker to conduct Schema check
Before migration, we can use checker tool of TiDB to check whether TiDB can support the table schema to be migrated in advance. If you failed to check a certain table schema, it means that TiDB does not support the table schema currently so that we cannot migrate data in the table. checker is included in TiDB toolkit that can be directly downloaded.

## Download TiDB toolkit (Linux)
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

## An Example for Checking by Checker
- Create several tables in the test database of MySQL and insert data:
```
USE test;
CREATE TABLE t1 (id INT, age INT, PRIMARY KEY(id)) ENGINE=InnoDB;
CREATE TABLE t2 (id INT, name VARCHAR(256), PRIMARY KEY(id)) ENGINE=InnoDB;

INSERT INTO t1 VALUES (1, 1), (2, 2), (3, 3);
INSERT INTO t2 VALUES (1, "a"), (2, "b"), (3, "c");
```

- User checker to check all tables in test database
```
./bin/checker -host 127.0.0.1 -port 3306 -user root test
2016/10/27 13:11:49 checker.go:48: [info] Checking database test
2016/10/27 13:11:49 main.go:37: [info] Database DSN: root:@tcp(127.0.0.1:3306)/test?charset=utf8
2016/10/27 13:11:49 checker.go:63: [info] Checking table t1
2016/10/27 13:11:49 checker.go:69: [info] Check table t1 succ
2016/10/27 13:11:49 checker.go:63: [info] Checking table t2
2016/10/27 13:11:49 checker.go:69: [info] Check table t2 succ
```

- User checker to check a certain table in test database
Suppose we only need to migrate table t1 at here.

```
./bin/checker -host 127.0.0.1 -port 3306 -user root test t1
2016/10/27 13:13:56 checker.go:48: [info] Checking database test
2016/10/27 13:13:56 main.go:37: [info] Database DSN: root:@tcp(127.0.0.1:3306)/test?charset=utf8
2016/10/27 13:13:56 checker.go:63: [info] Checking table t1
2016/10/27 13:13:56 checker.go:69: [info] Check table t1 succ
Check database succ!
```

## An Example for a table Unable to be Migrated
We create the following table in MySQL:

```
CREATE TABLE t_error ( a INT NOT NULL, PRIMARY KEY (a))
ENGINE=InnoDB TABLESPACE ts1
PARTITION BY RANGE (a) PARTITIONS 3 (
PARTITION P1 VALUES LESS THAN (2),
PARTITION P2 VALUES LESS THAN (4) TABLESPACE ts2,
PARTITION P3 VALUES LESS THAN (6) TABLESPACE ts3);
```
When checking with checker, it will report an error, which indicates that we cannot migrate the table of t_error.

```
./bin/checker -host 127.0.0.1 -port 3306 -user root test t_error
2017/08/04 11:14:35 checker.go:48: [info] Checking database test
2017/08/04 11:14:35 main.go:39: [info] Database DSN: root:@tcp(127.0.0.1:3306)/test?charset=utf8
2017/08/04 11:14:35 checker.go:63: [info] Checking table t1
2017/08/04 11:14:35 checker.go:67: [error] Check table t1 failed with err: line 3 column 29 near " ENGINE=InnoDB DEFAULT CHARSET=latin1
/*!50100 PARTITION BY RANGE (a)
(PARTITION P1 VALUES LESS THAN (2) ENGINE = InnoDB,
 PARTITION P2 VALUES LESS THAN (4) TABLESPACE = ts2 ENGINE = InnoDB,
 PARTITION P3 VALUES LESS THAN (6) TABLESPACE = ts3 ENGINE = InnoDB) */" (total length 354)
github.com/pingcap/tidb/parser/yy_parser.go:96:
github.com/pingcap/tidb/parser/yy_parser.go:109:
/home/jenkins/workspace/build_tidb_tools_master/go/src/github.com/pingcap/tidb-tools/checker/checker.go:122:  parse CREATE TABLE `t1` (
  `a` int(11) NOT NULL,
  PRIMARY KEY (`a`)
) /*!50100 TABLESPACE ts1 */ ENGINE=InnoDB DEFAULT CHARSET=latin1
/*!50100 PARTITION BY RANGE (a)
(PARTITION P1 VALUES LESS THAN (2) ENGINE = InnoDB,
 PARTITION P2 VALUES LESS THAN (4) TABLESPACE = ts2 ENGINE = InnoDB,
 PARTITION P3 VALUES LESS THAN (6) TABLESPACE = ts3 ENGINE = InnoDB) */ error
/home/jenkins/workspace/build_tidb_tools_master/go/src/github.com/pingcap/tidb-tools/checker/checker.go:114:
2017/08/04 11:14:35 main.go:83: [error] Check database test with 1 errors and 0 warnings.
```
