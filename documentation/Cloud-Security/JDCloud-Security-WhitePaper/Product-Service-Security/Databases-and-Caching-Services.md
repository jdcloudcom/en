# 4. Database and Cache Service

## 4.1 JCS for MySQL

JCS for MySQL is a stable and reliable Cloud Database service provided by JD Cloud based on the worldwide popular MySQL Database. It’s easy to deploy, manage and expand JCS for MySQL and JCS for MySQL supports the primary-secondary hot standby architecture by default, and provides complete solutions such as data backup, fault recovery and monitoring.

· High Availability

By default, it supports the primary-secondary hot standby architecture and automatic failure transfer, provides continuous database access, and has complete data automatic backup mechanism. Each instance is automatically backed up once a day by default, and the backup can be manually created according to the business situation. There is no need to worry about data loss.

· Security Mode

The default JCS for MySQL instance uses the standard mode, supports switching to high security mode, has certain SQL interception capability, and also provides SQL auditing function.

· Instance Disaster Tolerance

JD Cloud provides cloud computing service to multiple regions around the world. Each region contains multiple Availability Zones (AZ). JCS for MySQL provides the primary-secondary high available architecture by default, which supports the selection of primary-secondary replications deployed in the same Availability Zone or different Availability Zones, supports Availability Zone deployments that can withstand rack-level failures, and failed multiple Availability Zones deployments that can withstand the machine room level.

· IAM

Set the IP whitelist to control which IP addresses can access the MySQL database. Administrators need to configure each permission access to the database in advance (read-write or read-only). JCS for MySQL domain access address only allows Intranet access.

## 4.2 JCS for SQL Server

JCS for SQL Server is a cloud-based database product based on Microsoft SQL Server. It has the following advantages: High service availability, high data reliability, rich functions, high efficiency and stability, easy operation and maintenance. It is the most suitable commercial Cloud Database for government, enterprise and e-commerce.

· Identity Verification

JCS for SQL Server only supports Virtual Private Cloud, only provides Intranet connection, and cannot be accessed by public network. Virtual Machines are required to use the JCS for SQL Server. SQL identity verification, using the user name and password.

· IAM

Set the IP whitelist to control which IP addresses can access the SQL Server Database. Each account can only read and write, and read its own database.

· Data Encryption

SQL Server provides built-in encryption functions for data encryption. JD Cloud provides a secure and reliable security encryption method for JCS for SQL Server to prevent database data leakage and dragging.

· Primary and Standby High Availability, Automatic Fault Switch

Provide high available architectures wherein one for use and one for standby based on SQL Server image, and the primary instance data is synchronized to the standby instance in real time. In the event of a failure, the system automatically senses and performs a primary and standby switch. Switching can be completed in tens of seconds, no data is lost in the process of switching, and the application has almost no awareness.

· Security Protection Mechanism

The host machine is under the protection of the firewall, only the necessary ports are opened, and various system patches are installed to protect against various malicious attacks and ensure database security.

SQL Server instances run in a logically isolated Virtual Private Cloud (VPC), avoiding direct exposure of the database to the public network and evading most attacks.

Security policies can be defined and enhanced through security groups and ACL rules to further enhance database security.

· Security Auditing

Based on the SQL Server native audit, the reliability is high and the audit is exhaustive. The audit results are in binary format and cannot be tampered with.

· Multiple Dimensional Monitoring, Customized Alarm

Provide system-level and database instance-level monitoring from various dimensions, with rich monitoring indicators. The alarm rules can be customized according to the monitoring indicators, and notify by SMS, email, etc.

## 4.3 JCS for MongoDB

JCS for MongoDB, based on MongoDB, is a high-performance NoSQL database service provided by JD Cloud, which is widely accepted in the world. It is fully compatible with MongoDB protocol and provides a highly available architecture of three-node replica set by migration. It supports automatic disaster tolerance switching, and the fault immigration can be automatically completed to ensure service availability.

· Security Features

The instance is deployed in a user customized VPC Virtual Private Network, and network isolation protection is performed directly at the TCP layer to ensure data security. Support user customized IP whitelist for security control from access sources.

· Instance Disaster Tolerance

Three-node replica set: Automatically build the three-node replica set; three data nodes are located on different physical servers, and automatically synchronize data.

Automatic disaster tolerance: The Primary and Secondary nodes provide services by default. When the Primary node fails, the system automatically elects a new Primary node. When the Secondary node is unavailable, the standby node takes over the service so that the service availability can be multiply guaranteed.

City-wide disaster tolerance: Support multiple Availability Zones deployment mode. The primary-secondary nodes and the hidden nodes are distributed in different Available Zones and can withstand the fault of the machine room level.

· Backup Recovery

Automatic backup: Automatically back up the data in full and keep it for 7 days, and the backup file is stored in cloud storage in three copies.

Manual backup: Support instant manual backup creation and backup data can be stored for a long time.

Backup recovery: Support one-click recovery of backup data to the current instance; in addition, support creation of new Cloud Database MongoBD instance based on backup.

## 4.4 JCS for Percona

JCS for Percona is a stable and reliable database service built by JD Cloud based on the open source Percona 5.7 version. It is easy to deploy, manage and expand JCS for Percona, and JCS for Percona supports the primary-secondary hot standby architecture by default, and provides complete solutions such as data backup, fault recovery and monitoring.

· High Reliability

The perfect automatic data backup mechanism is provided; by default, each instance is automatically backed up once per day and meanwhile, manual backup may be created according to the workload conditions, so that there is no risk of data loss.

· High Availability

By default, it supports functions such as the primary-secondary hot standby architecture, automatic fault transfer, persistent access to the database, automatic database backup, hand backup to greatly improve database availability.

· Security Mode

The default JCS for Percona instance uses the standard mode, supports switching to high security mode, has certain SQL interception capability, and also provides SQL auditing function.

## 4.5 TiDB Service

A distributed cloud database product that supports both OLTP and OLAP scenarios built jointly by JD Cloud and PingCAP based on domestic open source NewSQL data TiDB, implementing automatic horizontal scaling, strong consistent distributed transactions, and simple deployment, without the online asynchronous table structure changes affecting business. It is compatible with MySQL protocol at the same time, making migration usage costs extremely low.

· High Service Availability

TiDB uses multiple copies for data storage and relies on the industry's most advanced Raft majority election algorithm to ensure 100% consistency and high availability of data. The primary backup copy can automatically switch in case of fault, without manual intervention, automatically ensuring the continuity of business.

· IAM

Set the IP whitelist to control which IP addresses can access the TiDB Database. Each account can only read and write, and read its own database.

## 4.6 JCS for Redis

JCS for Redis is an online cache service based on Redis protocol provided by JD Cloud. It supports various types for users to select from, such as the primary-secondary version and the cluster version. It can meet the requirements of availability, reliability, and high read/write performance in multiple service scenarios. It supports hot standby, and provides automatic switch for disaster tolerance, instance monitoring and other services to reduce business risks and ensure business continuity.

· High Availability

The pair hot standby mode realizes automatic switch. When a fault occurs to the primary node, the secondary node is upgraded to become the new primary node to provide services continuously; the persistent service data and instance allocation across availability zones ensure data security and continuous operation of services.

· Monitor Alarm

Various types of monitoring are provided for users, including a variety of monitoring of amount of usage, number of connections, QPS and number of Key, etc., with the aim to display the visual data monitoring. The all-link monitoring and early warning can assist the users in giving an early warning, prompting risks and quickly positioning and solving problems in advance.

· IAM

Instances run in Virtual Private Cloud (VPC), enhancing security and isolation. Provide access restrictions such as subnets and identity and access management policies.
