# Migrate self-built MongoDB to JCS for MongoDB

The document specifies how to migrate self-built MongoDB database to JCS for MongoDB with data transmission DTS.

Data transmission DTS supports structure migration, full migration and incremental migration. You can select one type according to your real conditions.

## Note

### Source Database Configuration Requirement

Connection method:

- Self-built Database of Public IP in Source Database

Database version:

- MongoDB 3.2 Version
- MongoDB 3.4 Version
- MongoDB 3.6 Version

Database configuration:

- Replica set mode is required

Account permission:

- Read permission of database to be migrated.
- Read permission of admin database.

### Target Database Version and Configuration Requirement

Database version:

- Be consistent with the source database version or above version.

Account permission:

- Write Permission

Data requirement:

- There shall not be any database in the same name of the database to be migrated.

## Operation Steps

1. Create migration task.

   - Task name: The name shall contain no less than 2 characters, but no more than 32 characters and shall only support Chinese, numbers, uppercase and lowercase letters, English underline and line-through.

   - Source database information:

     - Please select the database type as "self-built database of Public IP".
     - Please select database type as MongoDB.
     - Please fill in database domain or IP as the database address.
     - Port, database port.
     - For account and password, please confirm in advance that if the account has corresponding permissions.

   - Target library information:

     - Please select database type as "JCS for MongoDB"."
     - Region, select the region of the target instance.
     - Instance ID, please select the target instance.
     - For authentication database, account and password, please confirm in advance that if the account has corresponding permissions.

   - Migration Type

     - Please select migration type as full migration or incremental migration.

   - Select Migration Object

     - Support migration by databases and data tables.

     - When the "self-built database of Public IP" is selected as the source database type, definition of database tables to be migrated via two methods are supported, i.e., **Visual Selection** and **JSON**.

     - Description

       The following data under MongoDB will not be migrated:

       \- lib: amdin, local and config

       \- Set: the set which start with "system." or include "$".

       When one database contains more than 100 tables, selection by tables is not supported. Only the current database can be selected or tables can be appointed with the JSON method.

2. Start migration task.

   - Click **Start** on the task list page or Details to start a migration task. After the task is started, the pre-check will be executed at the first step.
   - After pre-check is succeeded, click **Next** in the pre-check popup and execute data migration.

3. End migration task.

   - If the migration type is full migration, the task will be automatically ended after data migration is completed.
   - If the migration type is incremental migration, the migration task shall be manually ended. It is suggested that when data of a target database catch up with the source database, writing to the source database shall be stopped and the migration task shall be ended after the target database data are checked to be correct.
   - Note: When the migration task is completed, it cannot be enabled again.
