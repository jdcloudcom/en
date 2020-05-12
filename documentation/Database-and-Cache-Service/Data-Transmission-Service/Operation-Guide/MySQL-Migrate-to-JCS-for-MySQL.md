# Migrate self-built MySQL to cloud database MySQL

The document specifies how to migrate self-built MySQL database to JCS for MySQL with data transmission DTS.

Data transmission DTS supports structure migration, full migration and incremental migration. You can select one type according to your real conditions.

## Note

### Source Database Configuration Requirement

Connection method:

- Self-built Database of Public IP
- Self-built Database Connected via Direct Connection/Intranet

Database version:

- MySQL 5.5
- MySQL 5.6
- MySQL 5.7
- MySQL 8.0

Database configuration:

- server_id is greater than 1
- Enable binlog
- binlog_format is ROW
- binlog_row_image is FULL
- If check data consistence is selected, the database `_jdts_check__xxxx` shall not exist.
- The table type is 'BASE TABLE', requiring primary keys and having no foreign keys

Account permission:

- GRANT RELOAD, REPLICATION SLAVE, REPLICATION CLIENT ON *.* TO 'user'@'%';
- GRANT SELECT ON `schemas`.* TO 'user'@'%';
- When data check is enabled, GRANT ALL PRIVILEGES ON `_jdts_check__xxxx`.* TO 'user'@'%' is required;

Database engine:

- The InnoDB type is suggested. In the full migration process, only InnoDB and other transaction engine can ensure consistency status. Statuses of non-transaction engines such as MyISAM or MEMORY may be different.

### Source Database Configuration Requirement

Database Type:

- For JCS for MySQL, JCS for MySQL instances can be created in advance.

Database version:

- Be consistent with the source database version or above version.

Account permission:

- GRANT ALL PRIVILEGES ON `schemas`.* TO 'user'@'%';

Data requirement:

- There shall not be any database in the same name of the database to be migrated.
- The data check database `_jdts_check__xxxx` shall not exist.



## Operation Steps

1. Create migration task.

   - Task name: The name shall contain no less than 2 characters, but no more than 32 characters and shall only support Chinese, numbers, uppercase and lowercase letters, English underline and line-through.

   - Source database information:

     - The "self-built database of Public IP" or the "self-built database connected via Direct Connection/Intranet" can be selected as the database type.
     - Please select database type as MySQL.
     - Please fill in database domain or IP as the database address and fill in Private IP as the database address in case of Direct Connection/Intranet.
     - Port, database port.
     - For account and password, please confirm in advance that if the account has corresponding permissions.

   - Target library information:

     - Please select database type as "JCS for MySQL"
     - Region, select the region of the target instance.
     - Instance ID, please select the target instance.
     - For account and password, please confirm in advance that if the account has corresponding permissions.

   - Migration Type

     - Please select migration type as structure migration, full migration or incremental migration.

   - Data Consistence Check

     - If full check is selected, it can be enabled on the task list or the Details after the full data migration is completed.

     - Description:

       MySQL full check is a dynamic check, i.e., if some data have been checked, changes of such data will not be checked anymore.

       In MySQL data consistency check process, incremental data will be continuously synchronized, but performance will be reduced. It is suggested that data consistency check shall be executed after source end writing is stopped.

   - Select Migration Object

     - Support migration by databases and data tables.

     - When the "self-built database of Public IP" is selected as the source database type, definition of database tables to be migrated via two methods are supported, i.e., **Visual Selection** and **JSON**.

     - When the "self-built database connected via the Direct Connection/Intranet" is selected as the source database type, definition of the database tables to be migrated via **JSON** is supported only.

     - Description

       The MySQL system database will not be migrated.

       When one database contains more than 100 tables, selection by tables is not supported. Only the current database can be selected or tables can be appointed with the JSON method.

2. Start migration task.

   - Click **Start** on the task list page or Details to start a migration task. After the task is started, the pre-check will be executed at the first step.
   - After pre-check is succeeded, click **Next** in the pre-check popup and execute data migration.

3. Execute data check.

   - Where "full check" is selected when a task is created, please click **Check** button after full data migration is completed to execute data consistency check.
   - In the check process, incremental data will be continuously synchronized, but performance will be reduced. It is suggested that data consistency check shall be executed after source end writing is stopped.

4. End migration task.

   - If the migration types are structure migration and full migration, the task will be automatically ended after data migration is completed.

   - If the migration type is incremental migration, the migration task shall be manually ended. It is suggested that when data of a target database catch up with the source database, writing to the source database shall be stopped and the migration task shall be ended after the target database data are checked to be correct.

   - Note: When the migration task is completed, it cannot be enabled again.

     

   