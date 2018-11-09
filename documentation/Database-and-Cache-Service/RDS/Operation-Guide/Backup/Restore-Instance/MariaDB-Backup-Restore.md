# Restore Based on Backup of MariaDB
If you needs to make destructive tests for instances of JCS for MariaDB, please make a full backup before such test and recover the current instances according to such full backup after the test. By doing so, data within instances of JCS for MariaDB can be recovered to the original status.

## Precautions
* The operation can be carried out only when the instance is in the ***Running*** status.

## Action Steps
1. Login [Cloud Database RDS console] (https://rds-console.jdcloud.com/database).
2. Select the target instance to be recovered based on backup and click the target instance name to enter the details of the instance.
3. Click ***Backup Management***, select the target backup file, and click ***Restore Based on Backup*** in the actions column and the parameter description in the pop-up box is as follows:
    * Click **OK** to complete the backup creation operation.
    * Click **Cancel** to call off the backup creation operation.
    ! [Snapshot](../../../../image/RDS/restore-rds-instance.png)
