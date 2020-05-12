# Use s3_fdw Plug-in to Transfer Data to OSS
## Operation Description
JD Cloud & AI RDS-PostgreSQL supports loading the data in OSS to PostgreSQL database with s3_fdw plug-in, and writing the data in PostgreSQL Database to OSS.

Currently, s3_fdw supports reading and writing files in csv format.
## Preconditions
JD Cloud & AI PostgreSQL instances support versions 9.6, 10.6, 11.2 and 12.2.
## s3_fdw Parameter Description
Like other fdw APIs, s3_fdw encapsulates the data in the external data OSS. Users can read the data stored in OSS through s3_fdw as if they use a datasheet. s3_fdw provides unique parameters for connecting and parsing file data in OSS.

## CREATE SERVER Parameter
|Parameter Name|Mandatory or Not|Description|
|---|---|---|
|host|Yes|Access OSS Address via Intranet|
|bucket|Yes|OSS Bucket, you need to first create the corresponding bucket in OSS and then set this parameter|
### Example
*CREATE USER MAPPING FOR CURRENT_USER SERVER s3_fdw_server OPTIONS (access_key_id 'xxxxx', secret_access_key 'xxxxx')*

## CREATE FOREIGN TABLE Parameter
|Parameter Name|Mandatory or Not|Description|
|---|---|---|
|filename|Either filename or dir, but not both must exist and the mode of exporting data to OSS only supports dir, not filename|Single file, match the single file name on OSS|
|dir|Either filename or dir, but not both must exist and the mode of exporting data to OSS only supports dir, not filename|When matching all files in virtual folders on OSS, each table must have one-to-one correspondence to the virtual folder on OSS|
|format|No|File format, immediately designate as csv format|
|delimiter|No|Designate delimiter of the column|
|quote|No|Designate quote character of the file|
|escape|No|Designate escape character of the file|
|null|No|Designate the column matching the corresponding character string to be null, e.g. null ‘test’, namely, the character string of column value ’test’ shall be null|
|force_not_null|No|Designate value of some columns not to be null. For example, force_not_null ‘id’ represents: If the id column value is null, this value shall be null character string rather than null|
|force_null|No|Designate value of some columns to be null. For example, force_null ‘id’ represents: If the id column value equals to null character string, this value shall be null rather than null character string|
### Example
*CREATE FOREIGN TABLE oss(id integer,name character varying,password character varying) SERVER s3_fdw_server OPTIONS(dir 's3_fdw_dir/', format 'csv')*

## Auxiliary Function
|Parameter Name|Purpose|
|---|---|
|s3_fdw_list_file(relname text, schema text DEFAULT ‘public’)|Used to obtain the name and size of files on OSS matched by an external table|
### Example


```select * from s3_fdw_list_file('oss');

name | size

------------------------------------+------

s3_fdw_dir/s3_put_xxxxx_18547 | 20
s3_fdw_dir/s3_put_xxxxx_18579 | 10
s3_fdw_dir/s3_put_xxxxx_18618 | 10
s3_fdw_dir/s3_put_xxxxx_18680 | 24
s3_fdw_dir/s3_put_xxxxx_18736 | 23
s3_fdw_dir/s3_put_xxxxx_18796 | 20

(6 rows)
```

## Auxiliary Parameter
|Parameter Name|Default Value|Description|
|---|---|---|
|s3_fdw.read_files|Null Character String|Designate the file matched by an external table in read mode. After set, only this set file can be matched when this external table is searched and multiple files can be set by separating with commas|
|s3_fdw.put_buffer_size|20MB|Buffer size when writing in, optional range from 20MB to 200MB|
|s3_fdw.put_file_size|1GB|Maximum file size writing in OSS, the file will switch to another file for continuation after the size is exceeded, the optional range from 200MB to 2048MB|

### s3_fdw Use Example
``` Create Plug-in
pgbench=> create extension s3_fdw;

Create SERVER 
pgbench=> CREATE SERVER s3_fdw_server FOREIGN DATA WRAPPER s3_fdw options(host 's3-internal.cn-north-1.jdcloud-oss.com', bucket 'postgresql');

Create USER MAPPING
pgbench=> CREATE USER MAPPING FOR CURRENT_USER SERVER s3_fdw_server OPTIONS (access_key_id 'xxxxxx', secret_access_key 'xxxxxx');

Create OSS external table
pgbench=> CREATE FOREIGN TABLE oss(id integer, name character varying, password character varying) SERVER s3_fdw_server OPTIONS(dir 's3_fdw_dir/', format 'csv');

Create local table
pgbench=> CREATE TABLE local(id integer, name character varying, password character varying);

First inset 200 pieces of data in local table
pgbench=> insert into local select generate_series(1,200), md5(random()::text), md5(random()::text);
INSERT 0 200

Test exporting local table data to OSS external table
pgbench=> insert into oss select * from local;
INSERT 0 200

Search external table
pgbench=> select * from oss;
 id  |               name               |             password             
-----+----------------------------------+----------------------------------
   1 | 7263461406680f166631e2ef19ed9c52 | 9c42a9ba08e87144d62082cea78e9cb8
   2 | b2207a08ae9ead98988c90ac1fcf1efa | b7bb25d85cb609c84fedd57caee3dee4
   3 | 259c54a61310d60410bf4399512ffb8e | 754f7ad4a6cb766c127fe0db6d9de69b
   4 | c8a42b1446e5a23b8a9ed05fc6617538 | e7041f530ad0ff6ee329f85c6d867b8b
   5 | a2a1ca6fb3b6a1d817033f66e396c061 | 617d8948261de8169ebca29a96cbe897
   6 | 93b4ee53b71f330d99758847ef16342e | eecc16fa3dfd2106dcac3f38dc78fb56
   7 | e3e0dc0cef94eaeafc78a91b8a3c3d91 | 6e67262d815254f630c58c981b92731b
   8 | d895f484a84f84167443ea9c4d59eccf | 1b775141459747503078e727052e7080
   9 | 3ae3813417250cbad1bc694797d9e16c | 4fb07b82d97d9d8764a1f8b03d750314
  10 | 8b0f0c7ccc5765a09b49a9243da870f9 | 953a2a8f88532458c4be413126064b86
  11 | fcf6fe783fe97e22e0ce0c6f9ecb28e9 | f6128067bd5f07e68540693a4c4d623b
  12 | 2ecaac61d7e048f719336f599096c2e9 | 6464ee0c80a39910cbd2e18aa0a85f9a
  13 | e021b894702e764f554bbf5492468cd4 | 010e3c1913c1b8dbadf2960761ca63af
  14 | d492456d322c8324f7db4add9d4f6954 | 2ee0faabf54d07a549cc1234f634ca9b
  15 | 4656b9285baea13e5a0f8a43d2825c52 | 8967f3a69285fb1435e161af4dd1391d
  16 | 005648a30057f3d38df6047bf23babb7 | c24f7aba341b5937ce3505dbfa38d574
  17 | f850bac9431de26dbaa5985c5d35112a | 794e17b17a3a9917473385495a280f01
  18 | 4b05b06c9c50c5d8de2f0c4f77af43c9 | 99d9c479114c09eedb5a55a3b536d9ea

pgbench=> explain select * from oss;
                                   QUERY PLAN                                   
--------------------------------------------------------------------------------
 Foreign Scan on oss  (cost=0.00..16.50 rows=145 width=68)
   OSS File Path: s3_fdw_dir/s3_put_88d55295-1e5d-42e9-aeba-e560fe8be435_21557 
(2 rows)

Delete local table data
pgbench=> truncate table local;
TRUNCATE TABLE
pgbench=> select * from local;
 id | name | password 
----+------+----------
(0 rows)

Test importing data on OSS to local table
pgbench=> insert into local select * from oss;
INSERT 0 200
pgbench=> select * from local;
 id  |               name               |             password             
-----+----------------------------------+----------------------------------
   1 | 7263461406680f166631e2ef19ed9c52 | 9c42a9ba08e87144d62082cea78e9cb8
   2 | b2207a08ae9ead98988c90ac1fcf1efa | b7bb25d85cb609c84fedd57caee3dee4
   3 | 259c54a61310d60410bf4399512ffb8e | 754f7ad4a6cb766c127fe0db6d9de69b
   4 | c8a42b1446e5a23b8a9ed05fc6617538 | e7041f530ad0ff6ee329f85c6d867b8b
   5 | a2a1ca6fb3b6a1d817033f66e396c061 | 617d8948261de8169ebca29a96cbe897
   6 | 93b4ee53b71f330d99758847ef16342e | eecc16fa3dfd2106dcac3f38dc78fb56
   7 | e3e0dc0cef94eaeafc78a91b8a3c3d91 | 6e67262d815254f630c58c981b92731b
   8 | d895f484a84f84167443ea9c4d59eccf | 1b775141459747503078e727052e7080
   9 | 3ae3813417250cbad1bc694797d9e16c | 4fb07b82d97d9d8764a1f8b03d750314
  10 | 8b0f0c7ccc5765a09b49a9243da870f9 | 953a2a8f88532458c4be413126064b86
  11 | fcf6fe783fe97e22e0ce0c6f9ecb28e9 | f6128067bd5f07e68540693a4c4d623b
  12 | 2ecaac61d7e048f719336f599096c2e9 | 6464ee0c80a39910cbd2e18aa0a85f9a
  13 | e021b894702e764f554bbf5492468cd4 | 010e3c1913c1b8dbadf2960761ca63af
  14 | d492456d322c8324f7db4add9d4f6954 | 2ee0faabf54d07a549cc1234f634ca9b
  15 | 4656b9285baea13e5a0f8a43d2825c52 | 8967f3a69285fb1435e161af4dd1391d
  16 | 005648a30057f3d38df6047bf23babb7 | c24f7aba341b5937ce3505dbfa38d574
  17 | f850bac9431de26dbaa5985c5d35112a | 794e17b17a3a9917473385495a280f01
  18 | 4b05b06c9c50c5d8de2f0c4f77af43c9 | 99d9c479114c09eedb5a55a3b536d9ea

pgbench=> explain insert into local select * from oss;
                                      QUERY PLAN                                      
--------------------------------------------------------------------------------------
 Insert on local  (cost=0.00..16.50 rows=145 width=68)
   ->  Foreign Scan on oss  (cost=0.00..16.50 rows=145 width=68)
         OSS File Path: s3_fdw_dir/s3_put_88d55295-1e5d-42e9-aeba-e560fe8be435_21557 
(3 rows)

pgbench=> analyze oss;
ANALYZE
pgbench=> explain insert into local select * from oss;
                                      QUERY PLAN                                      
--------------------------------------------------------------------------------------
 Insert on local  (cost=0.00..22.00 rows=200 width=70)
   ->  Foreign Scan on oss  (cost=0.00..22.00 rows=200 width=70)
         OSS File Path: s3_fdw_dir/s3_put_88d55295-1e5d-42e9-aeba-e560fe8be435_21557 
(3 rows)
``` 

## s3_fdw Notes

1. s3_fdw is an external table plug-in developed under PostgreSQL FOREIGN TABLE framework

2. The performance of data import is related to resources of PostgreSQL cluster (CPU IO MEM NET) and OSS









