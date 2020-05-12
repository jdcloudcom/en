# Migrate self-built PostgreSQL to JCS for PostgreSQL

The document specifies how to migrate self-built PostgreSQL database to JCS for PostgreSQL with data transmission DTS.

Data transmission DTS supports structure migration, full migration and incremental migration. You can select one type according to your real conditions.

## Notes

### Source database configuration requirement

Connection method:

- Self-built database with EIP
- Self-built database connected via direct connection/Intranet

Database version:

- 9.4、9.6
- 10.5、10.6、10.7、10.8、10.9
- 11.2、11.3、11.4

Database configuration:

- The database table to be migrated shall have the unique key.

- The IP of DTS is not limited by PostgreSQL configuration file (pg_hba.conf).

- In case of incremental migration

  - Install logical_decoding plug-in.

    ```
    tar -xvf logical_dedoing.tar 
    cp logical_decoding.so /usr/lib/postgresql/9.6/lib/ 
    cp logical_decoding.control /usr/share/postgresql/9.6/extension/
    ```
    
  - Set max_replication_slots greater than or equal to 5.
    
  - Set max_wal_senders greater than or equal to 5.
    
  - Set wal_level as logical.

Account permission:

- Structure migration: select
- Full migration: select
- Incremental migration: super
### Source database configuration requirement

Database type:

- For JCS for PostgreSQL, JCS for PostgreSQL instances shall be created in advance.

Database version:

- Be consistent with the source database version or above

Account permission:

- schema create /  schema owner。

Data requirement:

- If customized data type or plug-in customized data type is used in the source database table, the corresponding data type shall be created or the corresponding plug-in shall be installed in the target database, and the target database user shall have the use permission for the corresponding data type.
- If sequence is used in the source database table, the corresponding sequence shall be created in advance in the target database.
- The same table under the same schema with the source database does not exist.

## Operation Steps

1. Create a migration task.

   - Task name: The name shall contain no less than 2 characters, but no more than 32 characters and shall support Chinese, numbers, uppercase and lowercase letters, English underline and line-through.

   - Source database information:

     - For the database type, please select "self-built database with EIP" or the "self-built database connected via Direct Connection/Intranet" can be selected.
     - For the database type, please select PostgreSQL.
     - For the database address, please fill in database domain or IP, or fill in Private IP in case of Direct Connection/Intranet.
     - Port, namely database port.
     - For account and password, please confirm in advance that if the account has corresponding permissions.

   - Target database information:

     - For the database type, please select "JCS for PostgreSQL"
     - For region, please select the region where the target instance is located.
     - For instance ID, please select the target instance.
     - For account and password, please confirm in advance that if the account has corresponding permissions.

   - Migration type

     - Please select migration type as structure migration, full migration or incremental migration.

   - Data consistency check

     - If full check is selected, it can be enabled on the task list or the Details after the full data migration is completed.

     - Description:

       PostgreSQL full check is a dynamic check, i.e., if some data have been checked, changes of such data will not be checked anymore.

       In PostgreSQL data consistency check process, incremental data will be continuously synchronized, but performance will be reduced. It is suggested that data consistency check shall be executed after source end writing is stopped.

   - Select migration object

     - Support migration by databases and data tables.

     - When the "self-built database with EIP" is selected as the source database type, definition of database tables to be migrated via two methods are supported, i.e. **Visual Selection** and **JSON**.

     - When the "self-built database connected via the Direct Connection/Intranet" is selected as the source database type, definition of the database tables to be migrated via **JSON** is supported only.

     - Description

       When one database contains more than 100 tables, selection by tables is not supported. Only the current database can be selected or tables can be chosen with the JSON method.

2. Start migration task.

   - Click **Start** on the task list page or Details to start a migration task. After the task is started, the pre-check will be executed at the first step.
   - After pre-check succeeded, click **Next** in the pre-check popup and execute data migration.

3. Execute data check.

   - Where "full check" is selected when a task is created, please click **Check** button after full data migration is completed to execute data consistency check.
   - In the check process, incremental data will be continuously synchronized, but performance will be reduced. It is suggested that data consistency check shall be executed after source end writing is stopped.

4. End migration task.

   - If the migration type is structure migration or full migration, the task will be automatically ended after data migration is completed.

   - If the migration type is incremental migration, the migration task shall be manually ended. It is suggested that when data of a target database catch up with the source database, writing to the source database shall be stopped and the migration task shall be ended after the target database data are checked to be correct.

   - Note: When the migration task is completed, it cannot be enabled again.

     