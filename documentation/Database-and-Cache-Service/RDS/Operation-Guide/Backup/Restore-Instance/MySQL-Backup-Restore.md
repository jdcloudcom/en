# JCS for MySQL Restored based on Backup
You can perform a full backup before testing if to perform some destructive tests on JCS for MySQL service instance. After the test is completed, you can restore the current instance based on the previous full backup, so that the data in JCS for MySQL service instance can be returned to its original state.

## Precautions
* The operation can only be performed when the instance is ***running***.

## Operation Steps
1. Login [RDS Console](https://rds-console.jdcloud.com/database).
2. Select the instance to be restored based on backup, click the name of the instance, and enter the instance detailed page.
3. Click the tag of ***Backup Management***, select the target backup file, click ***Restore Based on Backup***, and the parameters of the pop-up box are as follows:
    * Click ***OK*** to complete the backup.
    * Click ***Cancel*** to cancel the backup creation.
    ![Screenshot](../../../../image/RDS/restore-rds-instance.png)
