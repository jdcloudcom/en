# MariaDB 创建备份
云数据库 MariaDB 实例支持自动备份和手动备份两种方式；您可以通过修改备份策略来设置自动备份触发的时间点，具体操作请参考 [备份策略](./备份策略.md)。
The backup instance will be stored in the cloud storage service of JD Cloud. At present, JD Cloud does not charge for the backup space.

## Precautions
* Manual Backup: 5 instances at most can be created in each region, and the manual backup will be automatically released as the instance is deleted.
* Please manually back up the instance in advance to ensure that the database of database instances can be restored to the original normal state after the test and verification if to test and modify the data of the database instance.

## Create Manual Backup
1. Login [RDS Console](https://rds-console.jdcloud.com/database).
2. Select the instance to be manually backed up, click the name of the instance, and enter the instance detailed page.
3. Select the tag of ***Backup Management*** and click ***Create Backup***. Then a backup creation box will be popped up, and the parameters are as follows:
    * Backup Name: It is allowed to repeat, while the length and characters of the name have certain limits, which shall be subject to the console.
    * Click ***OK*** to complete the backup.
    * Click ***Cancel*** to cancel the backup creation.

    ![image2018-3-8 11_41_42.png](https://img1.jcloudcs.com/cms/b11d4a53-6117-4db5-9254-144b92f2322520180308115433.png)

4. Click ***OK*** to return to the backup list page and start the manual backup.
