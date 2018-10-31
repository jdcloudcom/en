# Backup Strategy
MariaDB instance automatic backup will have a default trigger time, which can be customized.

## Precautions
* Automatic Backup: Daily backup, retained for 7 days.

## Modify Backup Strategy
1. Login [RDS Console](https://rds-console.jdcloud.com/database).
2. Select the instance that requires automatic backup strategy setting, click the name of the target instance, and enter the instance detailed page.
3. Select the tag of ***Backup Management*** and click ***Backup Strategy*** to enter the details page of the instance backup strategy, click ***Modify Strategy***. Then a backup strategy modification box will be popped up, and the parameters are as follows:
    * Automatic backup time: Select the time period of automatic backup, and the system will automatically start the backup operation at any time in this time period. Since the backup time increases as the amount of data in the instance increases, there is no guarantee that the backup operation can be completed within a specified period of time.
    * Click ***OK*** to complete the modification of backup strategy.
    * Click ***Cancel*** to cancel the modification of backup strategy.
    
    ![image2018-3-8 11_35_24.png](https://img1.jcloudcs.com/cms/c24d3cf4-4e58-4443-88d8-ee7e278ed42520180308115416.png)

4. Click ***OK*** to return to the detail page of backup strategy.
