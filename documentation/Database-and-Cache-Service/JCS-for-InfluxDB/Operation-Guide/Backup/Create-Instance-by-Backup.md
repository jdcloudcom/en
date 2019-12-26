# Create Instance Based on Backup

InfluxDB Console provides the backup-based creation instance function. You can create new instance according to backup file of one instance.

## Note

- Do not delete the backup issue in service during the new instance creation process. Otherwise, creation may fail.
- The region of new instance can only be consistent with that of the source instance.

## Operation Steps

1. Log in [InfluxDB Console](http://tsds-console.jdcloud.com/list).

1. On the "Instance List" page, select the target instance and click ** Instance Name** to go to the "Instance Details" page.

1. On the "Instance Details" Page, click **Backup Management** to view the backup data.

1. Select the backup to be used, click **Create Based on Backup** to enter the backup-based instance creation page.

   ![image-20191209164029987](../../../../../image/JCS-for-InfluxDB/20191209164029987.png)

1. On the backup creation instance page, select information such as billing type, instance type configuration and network to complete instance creation.

   Note: Please keep the region as the same as that of the source instance and do not modify the region.

   ![image-20191209164847452](../../../../../image/JCS-for-InfluxDB/20191209164847452.png)

