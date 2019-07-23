# FAQ
## Current Types Supported by Cloud Database
The following engines and versions are supported by RDS which will support more database engine types and versions

- MySQL
    - 5.6
    - 5.7
    - 8.0
  
- Percona:
    - 5.7
  
- MariaDB
    - 10.2
  
- SQL Sever
    - 2008 R2: Enterprise Version
    - 2012: Enterprise Version and Standard Version
    - 2014: Enterprise Version and Standard Version
    - 2016: Enterprise Version, Standard Version and Web Version

## VM's Failure to Access RDS
Following conditions shall be met for the VM accessing RDS:
  - The VM shall be in one VPC with RDS.
  - VM may fail to access database due to wrong rules of the security group configured in the VM. The correct configuration of the VM security group is given in the VM settings.

## Software License
- The JCS for SQL server service already contains the Microsoft SQL Server software license, and will be authorized by Microsoft SQL Server license after the instance is created. You don't have to purchase JCS for SQL Server license separately.
- When a SQL Server instance is expired and deleted, the corresponding software license will fail accordingly, and you cannot use the original license for other authorization.
- The JCS for SQL Server Service does not support users' own SQL Server license temporarily.

## The historical data in JCS for SQL Server performance analysis cannot be seen after the JCS for SQL Server service instance is rebooted.
The data in the performance analysis is saved in the instance memory. The performance analysis data will be lost after the instance is rebooted. You can use following two OpenAPIs to export the data if demanding the historical data analysis.
- describeIndexPerformance
- describeQueryPerformance

## Users still cannot connect to the RDS instance via internet after the instance access is opened.
In default, the RDS White List is only available to the VPC where this instance resides to ensure data security. Thus, you need to add your new IP address in the White List to access the database instance.

## Why not enter a username and password when creating a database based on backup or time point.
The username and password of the backup source database may be used for the new database created based on the backup or time point, which temporarily does not support the manual input during creation.

## Why does only a part of optional configuration can be displayed during backup creation?
Users can only select configurations not less than the actual size of the backup when creating a backup according to a backup.

## How many days are the automatic backup available now?
Automatic backup is currently available for 7 days at least.

## JD Cloud RDS instance is in the status of creating for a long time, how to resolve it
If a network ACL is set for the subnet selected when the JD Cloud RDS is created, please ensure that DNS (UDP) rules are added into the outbound rules and accepted. Since the network ACL is stateless, please ensure that the inbound rules also allow the ALL UDP configurations. If the problem remains unresolved, please contact the customer service in work order form.

## How to modify parameters of JCS for MySQL service instance?
At present, user are not allowed to modify JCS for MySQL instance parameters in JD Cloud. Therefore, users can feed back the demands through open ticket to the engineers of JD Cloud, and the engineers will help give assistance in the modification.

## Some data is deleted for a large table in JCS for MySQL, but the data space disk usage has not changed through the monitoring graph
This is a data file fragment hole problem. When InnoDB performs data deletion, the deleted space will not be recovered, and it will cause a lot of file holes, leading to that the data space usage in the monitoring graph will not change. Optimization method: `OPTIMIZE TABLE <table>` or `ALTER TABLE <table> ENGINE=Innodb` to rebuild the table space.

## I want to modify the character set of a created database. But my account does not have such permission and the console does not provide corresponding interface. What shall I do?
You can modify the character set of a database via DMS; Click **Console** to log in the database, select the name of the database containing the character set intended to be modified from the left after logging in DMS and click the operation tab on the top bar behind to refresh the current page; then, the ranking rule option will be shown in the current page; and choose the character set intended to be modified and click **Execute**.

## I want to store emoticons in MySQL, which needs to set character_set_server as utf8mb4, can it be solved only by opening ticket?
Actually, the main function of the parameter character_set_server is to create a library based on the value of character_set_server by default when creating such library from the command line without specifying a character set; but the default operation of creating a database by JD Cloud JCS for MySQL can be operated only by Console, and the character set can be assigned as utf8mb4. Some users may find that even if they do so, the data they see when connecting to the database instance through the client tool are unreadable code, they think this is caused by not setting character_set_server as utf8mb4, in fact it is not, it also involves setting of relevant fields such as character_set_client, character_set_connection, character_set_result, *** and such fields actually can be assigned manually by client***, for details, please see official document: [Connection Character Sets and Collations](https://dev.mysql.com/doc/refman/5.7/en/charset-connection.html)

## I searched by SQL statements and learned that the hard disk space used by MySQL database is smaller than the total usage amount of the space of the monitor hard disk. 
To view the space used by the local disk of a database instance, please refer to the total usage amount of hard disk space in the monitor. As for the space used by database as searched by SQL command, the relevant statistical result may be inaccurate, because the information in the information_schema.tables table of MySQL isn’t updated in real time.
