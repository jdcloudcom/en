# Backup Strategy
Cloud Database PostgreSQL instance automatic backup has a default trigger time point, but customization of such trigger time point is not supported currently.

## Note
* Please ensure to automatically back up in the business off-peak season.
* Automatic backup: daily backup is preserved for 7 days.

## Modify Backup Policy
1. Login [Cloud Database RDS Console](https://rds-console.jdcloud.com/database).
2. Select the target instance needs to set automatic backup policies and click the target instance to enter the Details of the instance.
3. Select ***Backup Management*** tag and click ***Backup Policy*** tag to enter details of the instance backup policy, click ***Modify Policy*** button, modify the backup policy, and the description of pop-up box parameters is as follows:
    * Automatic backup time: select the time slot that you want to perform automatic backup, system will automatically start to execute backup operation at any time point within this time slot; as the backup time will be prolonged according to the increment of the instance so that it cannot ensure that the backup operation is able to complete within the specified time slot.
    * Click ***OK***button to complete modification of backup policy.
    * Click ***Cancel***button to give up modification of backup policy.

    ![image2018-3-8 11_35_24.png](https://img1.jcloudcs.com/cms/c24d3cf4-4e58-4443-88d8-ee7e278ed42520180308115416.png)

4. Click ***OK***button to return Backup Policy Details page.
