# Migrate self-built SQL Server to JCS for SQL Server

The document specifies how to migrate self-built SQL Server database to JCS for SQL Server with data transmission DTS.

Data transmission DTS supports structure migration, full migration and incremental migration. You can select one type according to your real conditions.

## Note

### Source Database Configuration Requirement

Connection method:

- Self-built Database of Public IP
- Self-built Database Connected via Direct Connection/Intranet

Database version:

- SQL Server 2008R2 Enterprise Version
- SQL Server 2012 Enterprise Version
- SQL Server 2014 Enterprise Version
- SQL Server 2016 Enterprise Version
- SQL Server 2017 Enterprise Version

Database configuration:

- A database enables complete recovery mode.
- A database enables periodic log backup.

Account permission:

- With sysadmin role

### Source Database Configuration Requirement

Database Type:

- For JCS for SQL Server, JCS for SQL Server instances can be created in advance.

Database version:

- Be consistent with the source database version or above version.

Account permission:

- GRANT ALL PRIVILEGES ON `schemas`.* TO 'user'@'%';

Data requirement:

- There shall not be any database in the same name of the database to be migrated.

## Operation Steps

1. Create migration task.

   - Task name: The name shall contain no less than 2 characters, but no more than 32 characters and shall only support Chinese, numbers, uppercase and lowercase letters, English underline and line-through.

   - Source database information:

     - The "self-built database of Public IP" or the "self-built database connected via Direct Connection/Intranet" can be selected as the database type.
     - Please select database type as SQL Server.
     - Please fill in database domain or IP as the database address and fill in Private IP as the database address in case of Direct Connection/Intranet.
     - Port, database port.
     - For account and password, please confirm in advance that if the account has corresponding permissions.

   - Target library information:

     - Please select database type as "JCS for SQL Server""
     - Region, select the region of the target instance.
     - Instance ID, please select the target instance.
     - For account and password, please confirm in advance that if the account has corresponding permissions.

   - Migration Type

     - Please select migration type as structure migration, full migration or incremental migration.

   - Data Consistence Check

     - Select no check or full check.
     - Where full check is selected, data consistence check can be automatically executed after data migration is completed.

   - Select Migration Object

     - Support migration by databases and data tables.

     - When the "self-built database of Public IP" is selected as the source database type, definition of database tables to be migrated via two methods are supported, i.e., **Visual Selection** and **JSON**.

     - When the "self-built database connected via the Direct Connection/Intranet" is selected as the source database type, definition of the database tables to be migrated via **JSON** is supported only.

     - Description

       The SQL Server system database will not be migrated.

       When one database contains more than 100 tables, selection by tables is not supported. Only the current database can be selected or tables can be appointed with the JSON method.

2. Start migration task.

   - Click **Start** on the task list page or Details to start a migration task. After the task is started, the pre-check will be executed at the first step.
   - After pre-check is succeeded, click **Next** in the pre-check popup and execute data migration.

3. End migration task.

   - If the migration types are structure migration and full migration, the task will be automatically ended after data migration is completed.

   - If the migration type is incremental migration, the migration task shall be manually ended. It is suggested that when data of a target database catch up with the source database, writing to the source database shall be stopped and the migration task shall be ended after the target database data are checked to be correct.

   - Where data check is selected for current task, data consistence check will be automatically executed after the migration task is completed.

   - Note: When the migration task is completed, it cannot be enabled again.

     