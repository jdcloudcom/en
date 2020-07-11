# Restrictions
- TiDB is 100% compatible with common functions and syntax of protocols MySQL5.7 and MySQL5.7. System tools in MySQL5.7 ecology (PHPMyAdmin, Navicat, MySQL Workbench, mysqldump and Mydumper/myloader), clients are all applicable to TiDB.
- TiDB is a distributed database. As some features of MySQL5.7 have high engineering realization difficulty and very low input-output ratio, they are not realized on TiDB or are only compatible with the syntax, but are not realized. Therefore, please pay special attention to such features in the application process. For example, ENGINE in the sentence CREATE TABLE is only compatible with the syntax function, but is not realized. Therefore, TiDB does not have the concept of ENGINE.

For specific compatibility description, please refer to the official document of TiDB: https://docs.pingcap.com/zh/tidb/v4.0/mysql-compatibility

## Unsupported Features
- Storage Process and Function
- Trigger
- Event
- Customized Function
- Foreign Key Constraint
- Full Text/Space Function and Index
- Non-ascii/latin1/binary/utf8/utf8mb4 Character Set
- SYS schema
- MySQL Trace Optimizer
- XML Function
- X Protocol
- Savepoints
- Column-level Permission
- XA syntax (submitted in two stages within TiDB, but not opened via the SQL API)
- CREATE TABLE tblName AS SELECT stmt Syntax
- CREATE TEMPORARY TABLE Syntax
- CHECK TABLE Syntax
- CHECKSUM TABLE Syntax
- SELECT INTO FILE Syntax

## Features different from MySQL
#### Self-increase ID
TiDB's Auto Increment ID only guarantee the auto increment and unique, and it does not guarantee continuous allocation. TiDB currently adopts batch allocation, therefore if you insert data on multiple TiDBs at the same time, the assigned auto-increment ID will be discontinuous.

#### Performance schema
TiDB is mainly used for storing and searching relevant performance monitor indicators with Prometheus and Grafana. Therefore, some tables of Performance schema are blank.

#### Query Schedule
EXPLAIN/EXPLAIN FOR is greatly different to MySQL with respect to output format, content and permission setting. See Understanding TiDB Execution Schedule.

#### Built-in Function
TiDB supports common built-in functions of MySQL rather than all functions. For details, please refer to [Official Syntax Document](https://pingcap.github.io/sqlgram/#FunctionCallKeyword).

#### View
Do not support write-in operation of UPDATE, INSERT, DELETE, etc.

#### Storage Engine
Storage engine will be specified only when the created tables are compatible with the syntax. Actually, TiDB will uniformly describe meta-information as InnoDB storage engine. TiDB supports storage engine abstracts similar to MySQL, but the storage engine shall be appointed via the --store configuration item while starting the system.


#### DDL Restriction
- Add Index
   - Creation of multiple indexes is not supported by the same SQL sentence.
   - Creation of different index types (HASH/BTREE/RTREE) is supported only in the syntax level, with functions not realized.

- Add Column
   - Setting of PRIMARY KEY and UNIQUE KEY is not supported. Setting of AUTO_INCREMENT attribute is not supported either. The following error information may be outputted: unsupported add column '%s' constraint PRIMARY/UNIQUE/AUTO_INCREMENT KEY

- Drop Column
   - Deletion of primary key column and index column is not supported and the following error information may be outputted: Unsupported drop integer primary key/column a with index covered.
- Drop Primary Key
   - Only primary keys of a table whose configuration item alter-primary-key is enabled while deleting and setting up such table is supported and the following error information may be outputted: Unsupported drop primary key when alter-primary-key is false.

- Order By can omit options related to sequencing of all columns.
- Change/Modify Column
   - Defective changes are not supported. For example, if BIGINT is changed to INTEGER or VARCHAR(255) is changed to VARCHAR(10), the following error information may be outputted: length %d is less than origin %d
   - Modification to precision of DECIMAL type is not supported. The possible error information outputted is: can't change decimal column precision.
   - Change of UNSIGNED attribute is not supported. The following error information may be outputted: can't change unsigned integer to signed or vice versa.
   - Change of attribute CHARACTER SET from utf8 to utf8mb4 is supported only

- LOCK [=] {DEFAULT|NONE|SHARED|EXCLUSIVE}
   - Such support is only in the syntax level, with function unrealized. Therefore all DDLs will not lock the table.

- ALGORITHM [=] {DEFAULT|INSTANT|INPLACE|COPY}
   - The syntaxes ALGORITHM=INSTANT and ALGORITHM=INPLACE are supported, but are different to MySQL with respect to behaviors. Some operations referred to as INPLACE in MySQL are INSTANT operations in TiDB.
ALGORITHM=COPY is supported in the syntax level only. If functions are unrealized, warnings will be returned.
   - A single syntax ALTER TABLE cannot perform several operations. For example, one syntax cannot be used for adding multiple columns or indexes. The following error information may be outputted: Unsupported multi schema change.

- Table Option supports AUTO_INCREMENT, CHARACTER SET, COLLATE and COMMENT only rather than the syntax below:
   - WITH/WITHOUT VALIDATION
   - SECONDARY_LOAD/SECONDARY_UNLOAD
   - CHECK/DROP CHECK
   - STATS_AUTO_RECALC/STATS_SAMPLE_PAGES
   - SECONDARY_ENGINE
   - ENCRYPTION

- Table Partition types support Hash and Range; Support Add/Drop/Truncate/Coalese; Omit operations of other partitions and the following error information may be outputted: Warning: Unsupported partition type, treat as normal table. The following syntax is not supported:
   - PARTITION BY LIST
   - PARTITION BY KEY
   - SUBPARTITION
   - {CHECK|EXCHANGE|TRUNCATE|OPTIMIZE|REPAIR|IMPORT|DISCARD|REBUILD|REORGANIZE} PARTITION

- ANALYZE TABLE
   - The sentence ANALYZE TABLE will fully reconstruct statistic data of the table. Although the sentence execution process is very long, it is a light sentence in MySQL/InnoDB and has a very short execution process.
View


#### SQL Mode
- The compatible mode is not supported, e.g., ORACLE and POSTGRESQL. MySQL 5.7 has abandoned the compatible mode and MySQL 8.0 has removed the compatible mode.
- ONLY_FULL_GROUP_BY is slightly different to MySQL 5.7 with respect of syntax.
- NO_DIR_IN_CREATE and NO_ENGINE_SUBSTITUTION MySQL are used for solving the compatibility issue and are not suitable for TiDB.


#### Time zone
- TiDB carries out calculation according to all time zone rules currently installed in the system (generally, the tzdata package); all time zone names can be used without importing data of time zone; and calculation rules cannot be modified by importing data of time zone table.
- By default, local time zone is used by MySQL and calculation is conducted on the basis of the current built-in time zone rules of the system (for example, when does the daylight saving time begin); In addition, before data of time zone table are imported, the time zone cannot be designated by virtual of a time zone name.

#### Zero Month and Zero Day
- Like MySQL, TiDB enables the modes NO_ZERO_DATE and NO_ZERO_IN_DATE by default, but TiDB is different to MySQL as for handling the two SQL modes:
   - TiDB will enable the above two SQL modes in non-strict modes, and no warnings will be sent if zero month/zero day/zero date is inserted, but corresponding warnings will be sent by MySQL in the same case.
   - If NO_ZERO_DATE is enabled by TiDB in the strict mode, the zero date can still be inserted. If NO_ZERO_IN_DATE is enabled, zero month/zero date cannot be inserted. In the strict mode, the two data types cannot be inserted.

#### Type System
- FLOAT4/FLOAT8 is not supported.
- FIXED (alias for DECIMAL) is not supported.
- SERIAL (alias for BIGINT UNSIGNED NOT NULL AUTO_INCREMENT UNIQUE) is not supported.
- SQLTSI* is not supported (including SQL_TSI_YEAR, SQL_TSI_MONTH, SQL_TSI_WEEK, SQL_TSI_DAY, SQL_TSI_HOUR, SQL_TSI_MINUTE and SQL_TSI_SECOND).
