# Table Operation

## Create, View and Delete Table
```
CREATE TABLE table_name column_name data_type constraint;
```
E.g:
```
CREATE TABLE person (
number INT(11),
name VARCHAR(255),
birthday DAT
);
```
If the table already exists, adding IF NOT EXISTS can prevent the occurrence of error:
```
CREATE TABLE IF NOT EXISTS person (
  number INT(11),
  name VARCHAR(255),
  birthday DATE
);
```

## View All Tables
```
SHOW TABLES from db_name
```
E.g:
```
SHOW TABLES FROM testdb;
```
<br>

## View Statement for Creating Table
```
SHOW CREATE TABLE table_name;
```
E.g:
```
SHOW CREATE table person;
```

## View Columns of the Table
```
SHOW FULL COLUMNS table_name;
For example:
SHOW FULL COLUMNS FROM person;
```
## Delete Table
```
DROP TABLE table_name;
```
E.g:
```
DROP TABLE person;
Or
DROP TABLE IF EXISTS person;
```
