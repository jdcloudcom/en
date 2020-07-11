# Start Migration Task

Once a data migration task is created, it cannot be automatically started by default. You can start the task in the data migration task list page or the Details.

When a migration task is enabled, DTS will pre-check the migration task, including community, account permission, etc. Data migration can be executed only when the pre-check is passed.

## Operation Steps

1. Click **Start** on the migration task list page or Details.

   ![image-20200113175505316](../../../../../image/Data-Transmission-Service/dts-009.png)

2. After the pre-check is completed, you can view progress and check result in the pre-check popup.

   ![image-20200113180223366](../../../../../image/Data-Transmission-Service/dts-012.png)

3. After the pre-check is completed, click **Next** to execute data migration.

4. Wait until data migration is completed.

   - When the migration types are "structure migration" and "incremental migration", the task will be automatically ended after data migration is completed.
   - When the migration type is "incremental migration", DTS service will continuously get data changes of source database and duplicated the same to the target database. In such case, you need to pay attention to incremental migration progress. It is suggested that source database writing shall be stopped before confirmation and the migration task shall be ended after it is confirmed that the target database data have caught up with source database.
