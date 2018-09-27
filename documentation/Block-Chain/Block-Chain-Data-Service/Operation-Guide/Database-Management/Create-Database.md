# Create Database
 You can create database through the Block Chain data service management console. The databases name are unique in an instance but not limited among different instances.  

## Action Steps
1. Log in [Block Chain Data Service console](https://bds-console.jdcloud.com/block/list).  
2. Click the region of the target instance. 
3. Click the target instance to enter the detail of the instance; switch to  **Database Management** tab and click  **Create Database**. The parameters in the popup of creating database are described as below.
    * Database Name: we reserved some keyword names for database name, for your reference [Restrictions](../../Introduction/Restrictions.md) and the length and characters of the database name have restriction which is subject to the console.
    * Character Sets: Chinese_PRC_CI_AS by default, in addition to Chinese_PRC_CS_AS, SQL_Latin1_General_CP1_CI_AS, SQL_Latin1_General_CP1_CS_AS and Chinese_PRC_BIN that you can select as required.
    * Authorize account: click the account to be authorized with database access in the authorizable accounts; click ***>*** button, then the account will be added to the authorized account list. The default account access to database is **Read Only** and can be modified to **Read/Write**.
![Create Database](Pic/Create database.png)

