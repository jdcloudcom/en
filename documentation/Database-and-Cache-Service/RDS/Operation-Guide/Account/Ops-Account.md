# Operation and maintenance account
If you need technical support from JD Cloud or need to operate your instances during the use of the database, you can provide the temporary operation and maintenance account to the technical support personnel.
The temporary operation and maintenance account will give global Select and Process permission by default and can only perform such operations as creation, deletion and authorization of accounts through console or OpenAPI, while users cannot carry out relevant operations to the accounts by SQL statement.

## Use Restrictions
* At present, one instance only supports one operation and maintenance account
* At present, the validity of the operation and maintenance account must be longer than the current system time with one year as the longest time to be supported
* Operation and maintenance account applies to MySQL, Percona and mariaDB

## Enable operation and maintenance account
1. Log in to [Cloud Database RDS Console](https://rds-console.jdcloud.com/database).
2. Select target instances with a demand to enable operation and maintenance account and click the target instance to enter the details of the instance.
3. Select **Account Management** tag to open the Account Management page and click **Enable Operation and Maintenance Account** button to set the expiration time of the account in the pop-up box:
    * The validity of the account is 24 hours by default and you can make adjustments as required;

    ![开启运维账号](../../../../../image/RDS/MySQL-Create-OPS-Account.png)

4. Click **Confirm** button to enable the operation and maintenance account and then return to the Account Management page.

    ![开启运维账号](../../../../../image/RDS/Create-OPS-Account.png)

## Modify the validity of operation and maintenance account
1. Log in to [Cloud Database RDS Console](https://rds-console.jdcloud.com/database).
2. Select target instances with a demand to modify the validity of operation and maintenance account, and click the target instances to enter the details of these instances.
3. Select **Account Management** tag to open Account Management page and click **Modify** button to re-set the expiration time of the operation and maintenance account in the pop-up box.

    ![开启运维账号](../../../../../image/RDS/Create-OPS-Account.png)

4. Once the **Confirm** button is clicked, the validity of the operation and maintenance account will be re-set. After that, you shall return to the Account Management page.

## Disable operation and maintenance account
1. Log in to [Cloud Database RDS Console](https://rds-console.jdcloud.com/database).
2. Select target instances with a demand to disable operation and maintenance account and click the target instances to enter the details of the instances.
3. Select **Account Management** tag to open Account Management page and click **Disable Operation and Maintenance Account** button to open the popup for secondary confirmation.

    ![关闭运维账号](../../../../../image/RDS/Delete-OPS-Account.png)

4. Click **Confirm** button to disable the operation and maintenance account and then return to the Account Management page.


