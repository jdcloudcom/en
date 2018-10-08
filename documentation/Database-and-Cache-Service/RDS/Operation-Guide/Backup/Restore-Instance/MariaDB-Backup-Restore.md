# MariaDB 根据备份恢复
如果你需要对云数据库 MariaDB 实例进行一些破坏性的测试，那么可以选择在进行测试前进行一次全量备份，在完成测试之后，可以根据之前的全量备份恢复当前实例，这样云数据库 MariaDB 实例内的数据就恢复到了原有的状态。

## Precautions
* The operation can only be performed when the instance is ***running***.

## Operation Steps
1. Login [RDS Console](https://rds-console.jdcloud.com/database).
2. Select the instance to be restored based on backup, click the name of the instance, and enter the instance detailed page.
3. Click the tag of ***Backup Management***, select the target backup file, click ***Restore Based on Backup***, and the parameters of the pop-up box are as follows:
    * Click ***OK*** to complete the backup.
    * Click ***Cancel*** to cancel the backup creation.
    ![Screenshot](../../../../image/RDS/restore-rds-instance.png)
