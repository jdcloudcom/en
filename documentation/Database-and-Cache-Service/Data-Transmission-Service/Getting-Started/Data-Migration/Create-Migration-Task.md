# Create Migration Task

Data migration tasks can be created by a few of simple operations steps on the DTS Console.

The document specifies the general configuration processes for creating migration tasks, which are slightly different for configuration of databases of different types. For details, please refer to the migration description in the Operation Guide.

## Preparatory Work

- Create a cloud database instance as the target database for migration.
- Public IP has been enabled to the database to be migrated or the Direct Connection has been subscribed for communication with the target database.
- Migration accounts of corresponding permissions have been set up for source databases and target databases.

## Operation Steps

1. Log in DTS console.

2. Click **Create Migration Task** on the DTS list page and enter the migration creation task page.

   ![](../../../../../image/Data-Transmission-Service/dts-010.png)

3. Complete task name, source database information and target database information on the migration task creation page.

   ![](../../../../../image/Data-Transmission-Service/dts-001.png)

   Task name: The name shall contain no less than 2 characters, but no more than 32 characters and shall only support Chinese, numbers, uppercase and lowercase letters, English underline and line-through.

   Source database information:

   - For the instance type family, the "self-built database of Public IP" and the "self-built database connected via Direct Connection" can be selected.
   - For database type, i.e., source database type, MySQL, Percona, MariaDB, SQL Server, PostgreSQL and MongoDB are supported.
   - Domain or IP can be filled in as the database address.
   - Port, database port.
   - Database Account
   - Database Password

   Target library information:

   - Database Type
   - Instance region refers to the region where the target instance is located.
   - Instance ID
   - Database Account
   - Database Password
   - Search DTS IP section for search Public IP of DTS service. If an IP white list is enabled for source database, this IP segment shall be added to the white list, to ensure that DTS service can be connected to the source database. 

4. After completion, click **Next** and go to the next page to fill in information such as migration type, data check and migration object.

   ![image-20200421182534224](../../../../../image/Data-Transmission-Service/dts-024.png)

   Migration type: The structure migration, full migration and incremental migration are available for selection.

   Data consistence check: No detection or full detection can be selected.

   Migration object:

   - When the "self-built database of Public IP" is selected as the source database type, definition of database tables to be migrated via two methods are supported, i.e., **Visual Selection** and **JSON**.

     Visual selection supports editing filter table rules after the database is selected and supports defining migrated tables or excluding tables not to be migrated, and the table name supports "*" wildcard.

     ![image-20200421185942156](../../../../../image/Data-Transmission-Service/dts-025.png)

   - When the "self-built database connected via the Direct Connection" is selected as the source database type, definition of the database tables to be migrated via **JSON** is supported only, and please see the format at: [Define the Migration Object in JSON](Define-The-Migration-Object-in-JSON.md).

5. Agree to "Authorize DTS Service Management Source Database", click **Next** and select the migration instance type.

   ![image-20200113174954675](../../../../../image/Data-Transmission-Service/dts-008.png)

6. Select the migration instance type and click **Save** to save the task and wait until the migration task is created.

