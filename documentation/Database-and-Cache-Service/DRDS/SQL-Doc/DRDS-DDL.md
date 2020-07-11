# DRDS DDL SQL Syntax

## Split Table Creation
Automatic database and table sharding of DRDS is realized through splitting table. In other words, an original large-size table is split into table shardings in several databases and each table sharding only stores a part of data, improving performance of addition, deletion, modification and searching to tables. 

Although a large-size table is split into several small tables by DRDS, this process is transparent to users. Users also can access data of all table shardings with the original table name,
DRDS will judge to which table sharding an SQL statement shall be sent according to the split field value in the SQL statement.

Therefore, comparing with traditional non-split table, two key points shall be defined for definition of one split table in DRDS:
- Split field: Which field is used for splitting data in a table.
- Split function: Which algorithm is used for splitting data in a table.

### Syntax
```SQL
CREATE TABLE table_name
(create_definition,...)
[DRDS partition options]
```

**[DRDS Partition Optiosn] Syntax**
```SQL
 dbpartition by
     INT_MOD ([column_name])     |
     STRING_HASH ([column_name]) |
     YYYYMM ([column_name]) START ([start_date]) PERIOD [num]|
     YYYY ([column_name]) START ([start_date]) PERIOD [num]  
```

**Note**
1. Syntax of the part [DRDS Partition Options] must be placed to the end
2. Primary keys of tables must be split fields
3. For tables split by date and time, each sub-table can only store data of a time period and cannot be circulated. When table shardings are used up, users need to expand table shardings by hand.
For example, if there are 16 database shardings in a DRDS database of a user, the table tab1 is split by year and month and one table sharding is provided per month, then data of 16 months in total can be stored. Where a user needs to store data of more time period, he/she needs to add database shardings by hand and expand tables.

### Split Function
Currently, DRDS supports the following split functions, the names of which are case-insensitive
- INT_MOD(): For split of integer fields, int, smallint, bigint, tinyint and mediumint are supported
- STRING_HASH(): For split of character fields, char and varchar are supported
- YYYYMM(): For split of fields of time and date by month, timestamp, date and datetime are supported
- YYYY(): For split of time and date field by year, timestamp, date and datetime are supported
 
 **Keyword: ** (Case Insensitive)
 - START : For split by time, start time of data is in the format of ‘YYYY’ or ‘YYYY-MM’, with other formats rejected, e.g., start('2018') or start('2018-05')
 - PERIOD: Where split is made by time, data will put into one table sharding per time period. For example, data will be put into one table sharding per 3 months or per 2 years
  
 ### Examples
 1. Split by integer type field
  ```SQL
create table ddl_demo1(
id int,
name varchar(10) default ‘’,
dept varchar(10) not null,
primary key(id))
ENGINE=InnoDB DEFAULT CHARSET=utf8
dbpartition by int_mod(id);
```
 
2. Split by character field
  ```SQL
create table ddl_demo2(
id int,
name varchar(10) default ‘’
dept varchar(10) not null,
primary key(name))
ENGINE=InnoDB DEFAULT CHARSET=utf8
dbpartition by string_hash(name);
```
 
 3. If the function YYYYMM is used, the data start time is May 2019 and the data will be put into one table sharding per 3 months
 ```SQL
 create table ddl_demo3(
 order_id int,
 order_date datetime)
 ENGINE=InnoDB DEFAULT CHARSET=utf8
 dbpartition by YYYYMM(order_date) start('2019-05') period 3;
 ```
 4. If the function YYYY is used, the data start time is 2000 and the data will be put into one table sharding per 2 years
  ```SQL
 create table ddl_demo4(
 order_id int,
 order_date datetime)
 ENGINE=InnoDB DEFAULT CHARSET=utf8
 dbpartition by YYYY(order_date) start('2000') period 2;
 ```

## Create Broadcast Table
Table broadcasting refers to replicate a table to each sub-database of DRDS.  After table broadcasting is created, full data of this table is available in sub-database of each RDS node. When the user carries out addition, deletion or modification operation to this table, the DRDS backend will carry out the same operation to tables of each sub-database, realizing data consistence. In this way, RDS (MySQL) pushed to the underlayer with JOIN operation can be used for avoiding cross-database JOIN. 

Table broadcasting is mainly used for improving performance of cross-database join and is mainly applicable for relatively static configuration tables, dictionary tables and other tables with low data volume.

Table broadcasting supports self-growth type, i.e., self-growth type of MySQL itself

### Syntax
Add the keyword "BROADCAST" (case insensitive) at the end of the SQL syntax used for creating a table.

```SQL
CREATE TABLE table_name
(create_definition,...) BROADCAST
```
**Notes**
1. Table broadcasting is mutually exclusive to table splitting. In other words, a table cannot be a broadcasting table and a split table.
2. As distributed transactions are not supported now, if operation of any sub-database fails, data might be inconsistent. In such case, the application needs to handle the failure by itself.


### Example
```SQL
CREATE TABLE tbc1 (
id int(11) DEFAULT '0',
value varchar(32) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 broadcast;
```

## Delete split tables
Syntax for table deletion must be standard SQL
```SQL
drop table table_name1,table_name2,table_name3, ......
```
For example:
```SQL
drop table ddl_demo1,ddl_demo2,ddl_demo3, ddl_demo4;
```

## Expand Split Table
>Remark: Only support tables split by date and time

For tables split by date and time, each sub-table can only store data of a time period and cannot be circulated. When table shardings are used up, users need to expand table shardings by hand. There are two steps to expand the sub-table:

1. Add sub-library through the Console
2. Connect with DRDS Database and execute SQL to expand the corresponding table

For example, if there are 24 database shardings in a DRDS database of a user, the table tab1 is split by year and month and one table sharding is provided per month, then data of 24 months in total can be stored. Where users need to store data of more time period, they need to add new libraries on the Console and expand the sub-table through SQL.

### 1. Expand the sub-table in all new sub-libraries
This method is recommend for expanding the sub-table in all new sub-libraries
```SQL
alter table <table name> add partitions on all dbpartitions;
```

For example
```SQL
alter table demo_timetb add partitions on all dbpartitions;
```

### 2. Expand the sub-table in the specified sub-libraries
If you just want to expand the sub-table on the specific sub-library, you can use the following SQL:
```SQL
alter table <table name> add partitions on <sub db name1>,<sub db name1>,<sub db name1>,.......
```
sub db name: refers to the sub-library name of DRDS on RDS MySQL. You can view all sub-library names at the current database in the [Database Management] page in the Console instance details

For example, expand a sub-library in the sub-library db1_drds_593c_17,db1_drds_593c_18,db1_drds_593c_19,db1_drds_593c_20
```SQL
alter table demo_timetb add partitions on db1_drds_593c_17,db1_drds_593c_18,db1_drds_593c_19,db1_drds_593c_20;
```

## Delete partition of the split table
>Remark: Only support tables split by date and time

For tables split by date and time, you can effectively remove the historical data in batch by directly deleting the sub-table on a sub-library, the pre-release is as follows:
```SQL
alter table <table name> drop dbpartition <sub db name>;
```
sub db name: refers to the sub-library name of DRDS on RDS MySQL. You can view all sub-library names at the current database in the [Database Management] page in the Console instance details

For example, the historical data of Table timetb stored on the sub-library db1_drds_593c_17 for the previous 24 months are no more needed, you can directly clear it through the following SQL.
```SQL
alter table timetb drop dbpartition db1_drds_593c_17;
```


