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

## Delete split tables
Syntax for table deletion must be standard SQL
```SQL
drop table table_name1,table_name2,table_name3, ......
```
For example:
```SQL
drop table ddl_demo1,ddl_demo2,ddl_demo3, ddl_demo4;
```
