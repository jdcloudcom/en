# Migrate MySQL data to JDW



py-mysql2pgsql is an open-source data migration tool, supporting migration tables in MySQL to JDW. It can be connected to the source end MySQL database and the target database at the same time, search from MySQL database, get data to be exported and import the same to the target end with the command COPY.

## Installation Description

1. pip installation

   ```
   pip install py-mysql2pgsql
   ```

2. Source code compilation

   ```
   1. git clone git://github.com/philipsoutham/py-mysql2pgsql.git
   2. cd py-mysql2pgsql
   3. python setup.py install
   ```

   Possible error treatment:

   - Error: pg_config executable not found.
     - sudo yum install postgresql-devel
     - whereis pg_config
     - Add PATH environment variables
   - EnvironmentError: mysql_config not found.
     - yum install python-devel mysql-devel

3. Official dependence description

   ![1567490088823](../../../../../image/JCS-for-Greenplum/jdw-014.png)

## Operation Instructions

1. View help

   ```
   py-mysql2pgsql -h
   ```

2. Use for the first time:

   Execute the command py-mysql2pgsql and get configuration file template.

3. Edit the configuration file

   ```
   # a socket connection will be selected if a 'socket' is specified
   # also 'localhost' is a special 'hostname' for MySQL that overrides the 'port' option
   # and forces it to use a local socket connection
   # if tcp is chosen, you can use compression
   
   mysql:
    hostname: localhost
    port: 3306
    socket: /tmp/mysql.sock
    username: mysql2psql
    password:
    database: mysql2psql_test
    compress: false
   destination:
    # if file is given, output goes to file, else postgres
    file:
    postgres:
     hostname: localhost
     port: 5432
     username: mysql2psql
     password:
     database: mysql2psql_test
   
   # if tables is given, only the listed tables will be converted.  leave empty to convert all tables.
   #only_tables:
   #- table1
   #- table2
   # if exclude_tables is given, exclude the listed tables from the conversion.
   #exclude_tables:
   #- table3
   #- table4
   
   # if supress_data is true, only the schema definition will be exported/migrated, and not the data
   supress_data: false
   
   # if supress_ddl is true, only the data will be exported/imported, and not the schema
   supress_ddl: false
   
   # if force_truncate is true, forces a table truncate before table loading
   force_truncate: false
   
   # if timezone is true, forces to append/convert to UTC tzinfo mysql data
   timezone: false
   
   # if index_prefix is given, indexes will be created whith a name prefixed with index_prefix
   index_prefix:
   ```

   **Key parameters description:**

   - file

     Record mysql data import statement in a specified file rather than import data. Records include, but not limited to (DDl statement and COPY instruction). If you expect direct imported data, please make sure they are null.

   - only_tables、exclude_tables

     Import specified tables only. In addition to that all tables shall be imported, you only need to note that do not omit "-" before a table name, otherwise unexpected import will incur.

   - supress_data

     Import tables only rather than data.

   - supress_ddl

     Import data only in the condition that the table structure is well created by you.

4. Execute instructions

   ```
   py-mysql2pgsql -v -f mysql2pgsql.yml
   ```

   -v: Exhibit operation process

5. For more details, please view https://github.com/philipsoutham/py-mysql2pgsql
