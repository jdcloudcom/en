# Table Operation

## Create, View and Delete Table
```SQL
CREATE TABLE table_name column_name data_type constraint;
```

E.g:
```SQL
CREATE TABLE person (
number INT(11),
name VARCHAR(255),
birthday DAT
);
```

If the table already exists, adding IF NOT EXISTS can prevent the occurrence of error:
```SQL
CREATE TABLE IF NOT EXISTS person (
  number INT(11),
  name VARCHAR(255),
  birthday DATE
);
```

## View All Tables
```SQL
SHOW TABLES from db_name
```
E.g:
```SQL
SHOW TABLES FROM testdb;
```
<br>

## View Statement for Creating Table
```SQL
SHOW CREATE TABLE table_name;
```
E.g:
```SQL
SHOW CREATE table person;
```

## View Columns of the Table
```SQL
SHOW FULL COLUMNS table_name;
```

E.g:
```SQL
SHOW FULL COLUMNS FROM person;
```
## Delete Table
```SQL
DROP TABLE table_name;
```
E.g:
```SQL
DROP TABLE person;
DROP TABLE IF EXISTS person;
```
