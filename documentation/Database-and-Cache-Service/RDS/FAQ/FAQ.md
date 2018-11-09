# FAQ
## Current Types Supported by Cloud Database
The current types supported by the database are JCS for MySQL 5.6, JCS for MySQL 5.7, JCS for Percona 5.7, JCS for SQL Server 2008 R2 Enterprise Edition, JCS for SQL Server 2012 Enterprise Edition, JCS for SQL Server 2014 Enterprise Edition, JCS for SQL Server 2016 Enterprise Edition, and there will be more available database types later.

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

## How to solve the problem that JD Cloud RDS instance is under creation for a long time and finally gets into an error state?
If a network ACL is set for the subnet selected when the JD Cloud RDS is created, please ensure that DNS (UDP) rules are added into the outbound rules and accepted. Since the network ACL is stateless, please ensure that the inbound rules also allow the ALL UDP configurations. If the problem remains unresolved, please contact the customer service in work order form.

## How to modify parameters of JCS for MySQL service instance?
At present, user are not allowed to modify JCS for MySQL instance parameters in JD Cloud. Therefore, users can feed back the demands through open ticket to the engineers of JD Cloud, and the engineers will help give assistance in the modification.

## VM's Failure to Access RDS
Following conditions shall be met for the VM accessing RDS:
- The VM shall be in one VPC with RDS.
- VM may fail to access database due to wrong rules of the security group configured in the VM. The correct configuration of the VM security group is given in the VM settings.

## JCS for SQL Service Software License
- The JCS for SQL server service already contains the Microsoft SQL Server software license, and will be authorized by Microsoft SQL Server license after the instance is created. You don't have to purchasethe JCS for SQL Server license separately.
- When a SQL Server instance is expired and deleted, the corresponding software license will fail accordingly, and you cannot use the original license for other authorization.
- The JCS for SQL Server Service does not support users' own SQL Server license temporarily.

## The historical data in JCS for SQL Server performance analysis cannot be seen after the JCS for SQL Server service instance is rebooted.
The data in the performance analysis is saved in the instance memory. The performance analysis data will be lost after the instance is rebooted. You can use following two OpenAPIs to export the data if demanding the historical data analysis.
- describeIndexPerformance
- describeQueryPerformance

## Users still fails to connect to the instance through the internet after the RDS instance access.
In default, the RDS White List is only available to the VPC where this instance resides to ensure data security. Thus, you need to add your new IP address in the White List to access the database instance.
