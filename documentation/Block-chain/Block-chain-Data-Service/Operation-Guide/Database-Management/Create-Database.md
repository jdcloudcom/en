# Create database
 Users can create database through the block chain data service management console. The databases are uniquely named in an instance but not limited among different instances.  

## Action Steps
1. Log in [Block chain data service console](https://bds-console.jdcloud.com/block/list).  
2. Click the region of the target instance. 
3. Click the target instance to enter the details of the instance; switch to  **Database Management** tab and click  **Create Database** button; parameters in the popup of creating database are described as below.
    * Database name: we reserved some keyword names for database names for your reference [Limit Instructions](to be supplemented) and the length and characters of the database name have some limits which is subject to the console.
    * Character sets: Chinese_PRC_CI_AS by default, in addition to Chinese_PRC_CS_AS, SQL_Latin1_General_CP1_CI_AS, SQL_Latin1_General_CP1_CS_AS and Chinese_PRC_BIN that you can select as required.
    * Authorize account: Click the account to be authorized with database access in the authorizable accounts; click > button, then the account will be added to the authorized account list. The default account access to database is **Read Only** and can be modified to **Read/Write**.
![Create database](Pic/Create database.png)

