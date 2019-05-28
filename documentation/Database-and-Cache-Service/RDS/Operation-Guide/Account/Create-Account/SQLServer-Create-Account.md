# SQL Server Create Account

## 1. Operation Entrance
Enter the instance list page, click the instance name, enter the instance page, select ***Account Management*** page, and click ***Create Account***. <br/>

## 2. Enter Account Information
- Enter "Database Account", "Password", and select the database to be authorized, and click ***OK***after authorization.
  - Users may refer to the account name and password rules prompt on the console, or refer to the document [name and password limit](https://docs.jdcloud.com/en/rds/sqlserver-restrictions)
  - The database may not be authorized temporarily when an account is created for the first time without any database. The authorization steps can be completed in "Create Database".
- Batch Operation
  - Select the bottom check box from the list box and then options in this list box can be selected
  - Move the mouse to **Batch Operations**, select an option in the drop-down list, then the database permission in the authorized database list will all be modified to corresponding options.

![创建账号2](../../../../../../image/RDS/Create-Account-2.png)
