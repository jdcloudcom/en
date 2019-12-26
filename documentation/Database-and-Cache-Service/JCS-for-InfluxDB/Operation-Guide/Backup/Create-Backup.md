# Manually Create Backup

By default, each user can create 5 InfluxDB backups. The backup file can be saved for a long term, without any charge now.

## Note

- If there is any backup task in process, do not initiate backup creation task at this time.

## Operation Steps

1. Log in [InfluxDB Console](http://tsds-console.jdcloud.com/list).

2. On the "Instance List" page, select the target instance and click ** Instance Name** to go to the "Instance Details" page.

3. On the "Instance Details" Page, click in turn **Backup Management**  >  **Backup** to enter the "Backup" Page.

   ![image-20191209163058876](../../../../../image/JCS-for-InfluxDB/20191209163058876.png)

4. Click **Create Backup** on the **Backup** Page and open the "Backup Instance" Popup.

   ![image-20191209163321952](../../../../../image/JCS-for-InfluxDB/20191209163230920.png)

   - Fill in backup name.

   - Click **OK** to confirm backup creation.

5. You can view backup status in the "Backup List". If the backup status is changed to "Backup Completed", it means that the backup is created successfully.

