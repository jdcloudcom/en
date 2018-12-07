# Backup Strategy
MariaDB instance automatic backup will have a default trigger time, which can be customized.

## Precautions
* Please ensure to automatically back up in the business off-peak season.
* Automatic Backup: Daily backup, retained for 7 days.

## Modify Backup Strategy
1. Login [RDS Console](https://rds-console.jdcloud.com/database).
2. Select the instance that requires automatic backup strategy setting, click the name of the target instance, and enter the instance detailed page.
3. Select the tag of ***Backup Management*** and click ***Backup Strategy*** to enter the details page of the instance backup strategy, click ***Modify Strategy***. Then a backup strategy modification box will be popped up, and the parameters are as follows:
    * Automatic backup time: Select the time period of automatic backup, and the system will automatically start the backup operation at any time in this time period. Since the backup time increases as the amount of data in the instance increases, there is no guarantee that the backup operation can be completed within a specified period of time.
    * Click ***OK*** to complete the modification of backup strategy.
    * Click ***Cancel*** to cancel the modification of backup strategy.
    
    ![backup](../../../../../../image/RDS/1109_6.jpg)

4. Click ***OK*** to return to the detail page of backup strategy.
