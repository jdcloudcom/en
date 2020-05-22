# Backup Strategy
JCS for MariaDB instance automatic backup has a default trigger time supporting customization.

## Precautions
* Please ensure to automatically back up in the business off-peak season.
* Automatic backup: daily backup is preserved for 7 days.

## Modify Backup Policy
1. Login [Cloud Database RDS console](https://rds-console.jdcloud.com/database).
2. Select the target instance needs to set automatic backup policies and click the target instance to enter the Details of the instance.
3. Select ***Backup Management***, click ***backup policy*** to enter Details page of Instance Backup Policy, click ***Modify Policy*** and the parameters of Modification Backup Policy pop-up box are described as below:
    * Automatic backup time: select the time slot that you want to perform automatic backup, system will automatically start to execute backup operation at any time point within this time slot; as the backup time will be prolonged according to the increment of the instance so that it cannot ensure that the backup operation is able to complete within the specified time slot.
    * Duration that Binlog can be kept locally: Enter a duration that you want to keep binlog locally, which supports a period of 1-168 hours. The Binlog exceeding the specific duration will be automatically cleaned;
    * Upper limit of Binlog local space occupancy: Enter an upper limit of binlog local space occupancy, which supports a range of 1-50. After being set, the space percent locally occupied by binlog will not exceed the specified value;
    * Click ***OK*** to complete modification of backup policy.
    * Click ***Cancel*** to give up modification of backup policy.
    
    ![备份策略](../../../../../../image/RDS/Create-Backup-policy.png)

4. Click ***OK*** to return Backup Policy Details page.
