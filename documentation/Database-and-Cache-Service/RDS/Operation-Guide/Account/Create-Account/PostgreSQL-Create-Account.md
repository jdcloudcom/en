# PostgreSQL Create Account
Before using the database, you need to create an account in the Cloud Database PostgreSQL instance.

## Note
* The Cloud Database PostgreSQL can only be created one account owning administrator permissions through the Console.
* The account name cannot be modified after the account is created. 

## Operation Steps 
1. Login [Cloud Database RDS Console](https://rds-console.jdcloud.com/database).
2. Select the target instance needs to create account and click the target instance to enter the Details of the instance.
3. Select ***Account Management*** tag to open the Account Management page; click ***Create Account*** button. The parameters in the Create Account popup are described as below:
    * Administrator account: we have reserved some keyword names for accounts for your reference [Restrictions](../../../Introduction/Restrictions/PostgreSQL-Restrictions.md) and the length and characters of the account have some limits which are subject to the Console.
    * Password: the length and characters of the password have some limits which are subject to the Console.

    ![创建账号](../../../../../../image/RDS/PostgreSQL-Create-Account.png)

4. Click ***OK*** button to create account and return to the account management page.
