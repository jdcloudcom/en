# Pre-check Description

After a migration task is enabled, please carry out pre-check at first; check if the source database and the target database can be communicated with and if version, setting and others reach migration requirements; and database migration can be executed after the pre-check is passed.

Check items for different database types are listed below. Please check relevant items before any task is created.



## MySQL

| Check Item                     | Content                                                     |
| ---------------------- | ------------------------------------------------------------ |
| Source Database Connectivity Check | Check if the source database can be connected                                           |
| Source Database Permission Check | Check if the source database account can meet migration requirements                                 |
| Source Database server_id Check | Check if the source database server_id is greater than 1                                   |
| Source Database binlog Enable Check | Check if the source database enables binlog                                       |
| Source Database binlog Format Check | Check if the source database binlog_format is ROW                                   |
| Source Database binlogRowImage Check | Check if the source database binlog_row_image is FULL                               |
| Source Database Schema Existence Check | Check if Schema to be migrated and _jdts_check__xxxx are existed in the source database              |
| Source Database Table Existence Check | Check if Table to be migrated is existed in the source database                                  |
| Source Database Table Primary Key Check | Check if the primary key is existed in the source database that cannot be migrated without the primary key                    |
| Source Database Table External Key Check | Check if the external key is existed in the source database that only can be migrated without the external key                    |
| Target Database Connectivity Check | Check if the target database can be connected                                         |
| Target Database Schema Check | Check if Schema having the same name with the data to be migrated and _jdts_check__xxxx are existed in the target database |
| Database Version Check | Check if the version of source database version and target database can meet migration requirements                   |



## SQL Server

| Check Item               | Description                                       |
| -------------------- | ------------------------------------------ |
| Source Database Connectivity Check | Source Database Connectivity Check                             |
| Check Source Database Permission         | Check if the source database account meet the migration requirements               |
| Source Database DB Existence Check | Check if DB to be migrated is existed in the source database                   |
| Source Database Table Existence Check | Check if DB to be migrated is existed in the source database                   |
| Source Database Table Primary Key Check | Check if the primary key is existed in the source database that cannot be migrated without the primary key  |
| Source Database Recovery Mode Monitoring | Check if Recovery mode of source database is FULL             |
| Target Database Connectivity Check | Check if the target database can be connected                       |
| Check Target Database Permission       | Check if the target database account meet the migration requirements             |
| Target Database DB Existence Check | Check if DB having the same name with the data is existed in the target database     |
| Database Version Check | Check if the version of source database version and target database can meet migration requirements |



## MongoDB

| Check Item                     | Description                                           |
| -------------------------- | ---------------------------------------------- |
| Source Database Connectivity Check | Check if the source database can be connected                             |
| Source Database Permission Check | Check if the source database account can meet migration requirements                   |
| Source Database Version Check | Check if the source database version can meet migration requirements                   |
| Source Database Oplog Check | Check if source database is in the replica set mode                       |
| Target Database Connectivity Check | Check if the target database can be connected                           |
| Target Database Permission Check | Check if the target database account can meet migration requirements                 |
| Target Database Collection Existence Check | Check if Collection having the same name with the data is existed in the target database |
| Target Database Version Check | Check if the target database version can meet migration requirements                 |
