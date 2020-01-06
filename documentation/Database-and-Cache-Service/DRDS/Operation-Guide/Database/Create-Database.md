# Create Database

**1. Enter **Database Management** page**

Click the instance name to enter Instance page, select **Database Management** page, and click **Create Database****

![DB List](../../../../../image/DRDS/db-list.png)


**2. Enter relevant information of database**

**Database name: ** database name, the rules of database name are prompted on the console

**Character sets: ** supports UTF8 character set currently and the other character sets of subsequent versions will be provided successively

**Type: ** only supports "split", i.e., the database will be corresponded to multiple databases of multiple JCS for MySQL instance

**Number of Sub-library Per Instance: The number of sub-libraries to be created on each RDS MySQL can be customized. Currently, each RDS Instance supports 8~64 sub-libraries.

**Select backend JCS for MySQL instance**

All JCS for MySQL instances under VPC in the DRDS will be listed, and DRDS will automatically create 8 databases on each JCS for MySQL instance and save the corresponding relations. For example, 4 instances have been selected, the number of sub-libraries per instance is 8, and then DRDS will create 8 databases on each instance, 32 in total; if 10 instances have been selected, 80 databases will be created in total.

Users need not to create each sub-database on MySQL by manual

![Create Database 1](../../../../../image/DRDS/create-db-1.png)
