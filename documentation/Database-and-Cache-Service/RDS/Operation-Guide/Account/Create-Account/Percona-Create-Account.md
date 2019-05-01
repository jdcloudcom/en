# Percona Create Account
Before using the database, you need to create an account in the JCS for Percona instance. You can't manage the database account by SQL statement but only by actions on console.

## Operation Steps 
1. Login [Cloud Database RDS Console](https://rds-console.jdcloud.com/database).
2. Select the target instance needs to create account and click the target instance to enter the Details of the instance.
3. Select ***Account Management*** tag to open the Account Management page; click ***Create Account*** button. The parameters in the Create Account popup are described as below:
    * Database account and password: we have reserved some keyword names for database accounts for your reference [Restrictions](../../../Introduction/Restrictions/Percona-Restrictions.md) and the length and characters of the account and password have some limits which are subject to the Console.
    * Authorize database: database authorized by this account
        * Add authorized database, click the database name in the authorizable database list and click the middle button **>**, then the selected database name will be removed from the authorizable database list and added to the end of the authorized database list. Read Only permission is selected by default.
        * Remove authorized database, click the database name in the authorized database list and click the middle button **<**, then the selected database name will be removed from the authorized database list and added to the end of the authorizable database list.
        * Modify in batches the permission of authorized database, move the mouse to ***Batch Operations*** to select an option in the drop-down list, then the database permission in the authorized database list will all be modified to corresponding options.

    ![创建账号](../../../../../../image/RDS/MySQL-Create-Account.png)

4. Click ***OK*** button to create account and return to the account management page.
