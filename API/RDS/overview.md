# Cloud Database RDS


## Introduction
At present, RDS Open API supports JCS for MySQL, Percona, MariaDB and SQL Server


### Version
v1


## API
|Interface name|Request mehod|Function description|
|---|---|---|
|**alterTableWithOnlineDDL**|POST|Process DDL commands by PT-OSC Service to avoid lock tables. This API is temporarily opened to some users|
|**clearBinlogs**|POST|Clear local binlog and release spaces. The system will only clear binlog backed up to the memory, without any influence to backup recovery of MySQL instances<br>- Support MySQL only|
|**copyParameterGroup**|POST|Copy Parameter Set|
|**createAccount**|POST|Create a database account. The user can use the client, application, etc. to log in to the RDS database instance through the account and password. <br>For ease of management and recovery, RDS restricts accounts. Database accounts can only be created, deleted, and authorized by the console or OpenAPI. Users cannot perform related operations on accounts through SQL statements.|
|**createAudit**|POST|It enables the database audit function of SQL Server and currently supports instance-level database audit. Users can enable and disable the audit function, customize audit policies, and download audit files as needed. The audit file is a native SQL Server audit file and is saved for 6 months by default. <br>- Support SQL Server Only|
|**createBackup**|POST|Creating a full backup of the RDS instance can be fully backed up for the entire instance or part of the database (SQL Server supports only). At the same time, there is only be one running backup task can work<br>- Support SQL Server only|
|**createBackupSynchronicity**|POST|Create a cross-region backup synchronization service.|
|**createDatabase**|POST|Create a Database. For instance management and data restoration, RDS restricts user permissions, and users can only create databases through the console or this API.|
|**createInstance**|POST|Create an RDS instance and the user can use the corresponding database client or application to link to the RDS instance through the domain name and port to operate.|
|**createInstanceByTime**|POST|Create a new instance based on the source instance backup, and recover the data of the new instance to the same status as the data at the specified time point of the source instance by adding new logs. <br>For example, creating an instance B at the time point '2018-06-18 23:00:00' based on instance A means creating an instance B, of which the data is exactly the same as the data of instance A at the time point '2018-06-18 23:00:00'. <br>For the SQL Server, recovery/creation by time point is not supported within 30 minutes after the primary/backup switchover. For example, if the user performs the primary/backup switchover at 10:05, recovery/creation by time point is unavailable during the time period from 10:05 to 10:35.|
|**createInstanceByTimeInCrossRegion**|POST|Create Instance according to cross-region backup synchronization time point.|
|**createInstanceFromBackup**|POST|Creates a new instance based on the full backup of the source instance. The data of the new instance is the same as the data status of the source instance when the backup is created. <br>For example, create a new instance B according to a full backup 'mybak' of source instance A. The backup is created in '2018-8-18 03:23:54'. Then the data status of the new instance B is consistent with the status of the instance A'2018-8-18 03:23:54'|
|**createParameterGroup**|POST|Create a parameter set<br>- Only support MySQL, Percona, MariaDB and PostgreSQL|
|**createROInstance**|POST|Create read-only instances of MySQL<br> \- Only support MySQL<br> \- The created read-only instances are in the same subnet under the same VPC of the main instance<br> * The read-only instance only support Pay by Configuration|
|**createSuperAccount**|POST|Create a database account, and then users can use the client, applications or others to log in to RDS database instance through this account and password via client, applications, etc. <br>For management and recovery, RDS has restricted accounts, database account can only create, delete and authorize accounts, etc. through Console or OpenAPI, and users cannot take relevant actions to their accounts by the SQL statement.|
|**deleteAccount**|DELETE|Delete the database account. After the account is deleted, it cannot be restored and the user cannot use this account to log in the RDS instance.|
|**deleteAudit**|DELETE|Disable Database Audit. After the database audit is disabled, the previously generated audit result files are not deleted immediately. The audit result files will be automatically deleted by the system after the expiration date. The default expiration time is 6 months<br>- Support SQL Server Only|
|**deleteBackup**|DELETE|Deletes the RDS instance backup. Only the user-generated backups are allowed to be deleted and the system automatic backups are not allow to be deleted.|
|**deleteBackupSynchronicity**|DELETE|Delete a cross-region backup synchronization service.|
|**deleteDatabase**|DELETE|Delete Database from RDS Instance. For management and data recovery, RDS controls the user permission, and the user only can delete Database through the Console or API<br>Sensitive Operation, enable<a href="https://docs.jdcloud.com/en/security-operation-protection/operation-protection">MFA Operation Protection</a>|
|**deleteImportFile**|DELETE|Delete database backup file uploaded by users via the tool of Cloud on Single Database<br>- Support SQL Server only|
|**deleteInstance**|DELETE|Delete one RDS instance or the read-only instance of MySQL/PostgreSQL. Corresponding MySQL/PostgreSQL read-only instances will also be deleted while deleting the main MySQL/PostgreSQL<br>Sensitive operation can be enabled<a href="https://docs.jdcloud.com/en/security-operation-protection/operation-protection">MFA operation protection</a>|
|**deleteParameterGroup**|DELETE|Delete parameter set<br>- Support MySQL, Percona, MariaDB and PostgreSQL only|
|**describeAccountPrivilege**|GET|View the permission information for RDS instance account \- Only support MySQL, Percona and MariaDB|
|**describeAccounts**|GET|View all account information in an RDS instance, including the account name, access rights to each database, etc.|
|**describeActiveQueryPerformance**|GET|Obtain performance information about a running SQL execution according to search conditions defined by the user. The user can search performance necks related to SQL execution based on such information and make the optimization. <br>- Only support SQL Server|
|**describeAudit**|GET|View the audit options of the current instance that have been enabled. If no audit option is enabled for the current instance, it returns an empty array<br>- Support SQL Server Only|
|**describeAuditDownloadURL**|GET|Obtain the download link of a certain audit file, both internal and external links are supported, and the validity time of the link is 24 hours<br>- Only support SQL Server|
|**describeAuditFiles**|GET|Obtain the list of all the audit result files under the current instance<br>- only support SQL Server|
|**describeAuditOptions**|GET|Obtain the audit option of various database version supported by the current system and the relevant options<br>- only support SQL Server|
|**describeAuditResult**|GET|Only support view of audit content of MySQL instance<br>- Only support MySQL 5.6, MySQL 5.7, Percona, MariaDB and PostgreSQL|
|**describeAzs**|GET|View availability zones supported by various RDS databases in specified regions. The availability zones supported by RDS of different types are different|
|**describeBackupDownloadURL**|GET|Obtain the download link of the entire backups or  a single file in the backup. <br>- When there is a file name in the input parameter, obtain the download link of the file. <br>- When there is no file name in the input parameter, obtain the download link of the entire backups. <br>Due to the difference of backup mechanism, when using this API to download backups, SQL Server must input the file name, and each file is downloaded one by one. It does not support downloading the entire backup. The file name (excluding the suffix) in the SQL Server backup is the database name of the backup. For example, the file name is my_test_db.bak, indicating that the file is a backup of the my_test_db database. <br>MySQL can download the entire backup set, but does not support the download of a single file. <br>- Support SQL Server Only|
|**describeBackupPolicy**|GET|View RDS instance backup policy. The supported backup policies differ based on different database type. See the detailed instructions in return parameters|
|**describeBackupSynchronicities**|GET|Search the Cross-Region Backup Synchronization Service List.|
|**describeBackups**|GET|View the detailed information of all backups in the RDS instance. The returned backup list is sorted in descending order from start time of backup (backupStartTime). <br>- Support SQL Server Only|
|**describeBinlogDownloadURL**|GET|Obtain the binlog download link of MySQL instance<br>- Only support MySQL, Percona and MariaDB|
|**describeBinlogs**|GET|Obtain the binlog detailed information in MySQL instance<br>- Only support MySQL, Percona and MariaDB|
|**describeDatabases**|GET|Obtain a list of all database details for the current instance|
|**describeErrorLog**|GET|Search the summary information of error logs of PostgreSQL instance. <br>- Only Support PostgreSQL|
|**describeErrorLogs**|GET|Obtain error logs of SQL Server and download information<br>- only support SQL Server|
|**describeImportFiles**|GET|Obtain the list of files uploaded by the user to the instance through Cloud on Single Database<br>- only support SQL Server|
|**describeIndexPerformance**|GET|Obtain statistics on index performance based on user-defined query conditions, and provide missing indexes and suggestions for index creation. Users can use these information to find index-related performance bottlenecks and optimize them. <br>- Support SQL Server Only|
|**describeInstanceAttributes**|GET|Search detailed information of RDS instances (MySQL, SQL Server, etc.) as well as information of MySQL/PostgreSQL real-only instance|
|**describeInstances**|GET|Get summary information of all RDS instances and MySQL/PostgreSQL read-only instances under the current account, such as instance type family, version, billing information, etc.|
|**describeIntercept**|GET|View the security mode enabled in current instance. If high security mode of database is enabled, configuration information will be returned<br>- Only support MySQL|
|**describeInterceptResult**|GET|View SQL interception records of current instance after enabling high security mode<br>- Only support MySQL|
|**describeLatestRestoreTime**|GET|When recover/create the obtained SQL Server instances based on the time point, the latest time point can be recovered<br>- Support SQL Server only|
|**describeLogDownloadURL**|POST|Generate log file download link according to download link expiration time of log file, only supporting PostgreSQL, MySQL, Percona and MariaDB|
|**describeLogs**|GET|Obtain log file list of PostgreSQL<br>- Only support PostgreSQL, MySQL, Percona and MariaDB|
|**describeParameterGroupAttachedInstances**|GET|View Cloud Database Instance associated by parameter set<br>- Only support MySQL, Percona, MariaDB and PostgreSQL|
|**describeParameterGroupParameters**|GET|View parameters of parameter set<br>- Only support MySQL, Percona, MariaDB and PostgreSQL|
|**describeParameterGroups**|GET|Get all parameter set lists under current account<br>- Only support MySQL, Percona, MariaDB and PostgreSQL|
|**describeParameterModifyRecords**|GET|View parameter modification history<br>- Only support MySQL, Percona, MariaDB and PostgreSQL|
|**describeParameters**|GET|View configuration parameter of SQL Server instance<br>- only support SQL Server|
|**describePrivilege**|GET|View the permission information for Cloud Database RDS \- Only support MySQL, Percona and MariaDB|
|**describeQueryPerformance**|GET|Obtain the information of performance statistics of SQL execution, such as slow SQL, etc. based on user-defined query conditions. Based on this information, users can find and optimize performance bottlenecks related to SQL execution. <br>- Support SQL Server Only|
|**describeSSL**|GET|View the current instance with the encrypted connection enabled.|
|**describeSlowLogAttributes**|GET|Query the detailed information of slow log of MySQL instance. <br>- only support MySQL|
|**describeSlowLogs**|GET|Query the summary information of slow log of MySQL instance. <br>- only support MySQL|
|**describeTables**|GET|Obtain the list information of the library designated by the current instance \- Only support MySQL, Percona and MariaDB|
|**describeTde**|GET|View whether the current instance enables TDE|
|**describeWhiteList**|GET|View the current White List of RDS instances. The White List is a list of IP/IP segments that are allowed to access the current instance. By default, the White List is open to the VPC. If the user has enabled the internet access, you need to configure a White List for the IP of the internet.|
|**disableAudit**|POST|Only support disabled database audit of MySQL instance<br>- Only support MySQL 5.6, MySQL 5.7, Percona, MariaDB and PostgreSQL|
|**disableIntercept**|POST|Disable high security mode of database<br>- Support MySQL only|
|**disableInternetAccess**|POST|Disable the internet access function of the RDS instance. After the disabling, users cannot access the RDS through the Internet, but can access the domain name through the intranet domain in JD Cloud|
|**enableAudit**|POST|Only support enabled database audit of MySQL instance<br>- Only support MySQL 5.6, MySQL 5.7, Percona, MariaDB and PostgreSQL|
|**enableIntercept**|POST|Enable high security mode of database<br>- Support MySQL only|
|**enableInternetAccess**|POST|Enable the internet access function of the RDS instance. After enabling, users can access RDS instances through the internet|
|**enableSSL**|POST|Enable the encryption connection to database, and restart the database instance|
|**enableTde**|POST|Enable TDE function of database|
|**exchangeInstanceDns**|POST|Exchange the domains of two instances, including intranet and internet ones. No exchange is allowed, when one instance has an internet domain while the other doesn’t. <br>- Only Support SQL Server|
|**failoverInstance**|POST|Perform a RDS Instance Failover. <br>Note: If the instance is being backed up, the failover will terminate the backup operation. You can view the start time of backup in the backup policy to see whether a backup is running. If you need to perform the failover during the instance backup, you are advised to perform a full instance backup manually<br>for SQL Server, within 30 minutes of failover, restore/create by time point is not supported. For example, the user performs the failover at 10:05, then the time period from 10:05 to 10:35 cannot be restored/created. <br>- Support SQL Server Only|
|**getUploadKey**|POST|Obtain the required key for uploading files from Cloud on Single Database. Cloud on Single Database needs the correct key value to connect to JD Cloud<br>- only support SQL Server|
|**grantAccountPrivilege**|POST|Grant fine-grained permission to access the database account \- Only support MySQL, Percona, and MariaDB|
|**grantPrivilege**|POST|Grant the database access privilege to the account, i.e., the privilege the account has to the database. An account can have access to multiple databases. <br>For ease of management, RDS classifies the privileges. Currently, it provides the following two privileges<br>- ro: Read-only privilege, with which, the user can only read the data in the database, and cannot perform creation, insertion, deletion, change, etc. <br>- rw: Read-write privilege, with which, the user can perform addition, deletion, change and other operations on the database<br>-Support SQL Server Only|
|**modifyAudit**|POST|Modify Current Audit Options. Currently available audit options are available through describeAudit, and all supported options are available through getAuditOptions. <br>- Support SQL Server Only|
|**modifyBackupPolicy**|POST|Modify the RDS instance backup policy. Currently only the modification by the user of the "automatic backup start time window" parameter is supported, and other parameters are not open for modification|
|**modifyConnectionMode**|POST|Modify the connection mode of MySQL instance: standard and high security modes.<br>- **Standard mode**: the despondence time is short, without SQL audit and interception capability. <br>- **High security mode**: has certain SQL injection interception capability (through analysis expression, key system function, etc. to implement the prevention from SQL injection attack), and SQL audit may be enabled, but the response time will be extended to a certain extent. <br>- only support MySQL|
|**modifyInstanceAz**|POST|Modify the availability zone of an instance. For example, adjust the availability zone of the instance from a single availability zone to a multi-availability zone|
|**modifyInstanceName**|POST|Modify Instance Nam, which may support Chinese, and the specific rules of Instance Nam may refer to the Help Center Document: [Name and Password Restrictions](../../documentation/Database-and-Cache-Service/RDS/Introduction/Restrictions/SQLServer-Restrictions.md)|
|**modifyInstanceSpec**|POST|Instance Expansion, Supports Upgrading the Instance CPU, Memory and Disk.|
|**modifyParameterGroup**|PUT|Modify parameters of a DS instances<br>- Only support MySQL|
|**modifyParameterGroupAttribute**|PUT|Modify parameter set name and description<br>- Only support MySQL, Percona, MariaDB and PostgreSQL|
|**modifyParameterGroupParameters**|PUT|Modify parameters of parameter set<br>- Only support MySQL, Percona, MariaDB and PostgreSQL|
|**modifyParameters**|PUT|For modifying the configuration parameter of SQL Server instance, the following parameter:max_worker_threads,max_degree_of_parallelism,max_server_memory_(MB) is supported. Some modified parameters can come into force only when being rebooted. For details, please refer to relevant document of Microsoft. <br>- Only Support SQL Server|
|**modifyWhiteList**|PUT|Modify the IP White List that allows access to the instance. The White List is a list of IP/IP segments that are allowed to access the current instance. By default, the White List is open to the VPC. If the user has enabled the internet access, you need to configure a White List for the IP of the internet.|
|**rebootInstance**|POST|Reboot the RDS instance. For example, after modifying some configuration parameters, you need to reboot the instance to take effect. You can combine the failover function to reboot the standby machine to reduce the impact on the service<br>**Note: If the instance is being backed up, rebooting the primary instance will terminate the backup operation.** You can view the start time of backup in the backup policy to see whether a backup is running. If you need to reboot the primary instance during the instance backup, you are advised to perform a full instance backup manually after rebooting.|
|**resetPassword**|POST|Reset Database Account Password. If the user forgets the password of the account, he/she can use this API to reset the specified account password. After the password is reset, the previous password will not be available and you must log in or connect to the database instance with the new password after the reset.|
|**restoreDatabaseFromBackup**|POST|Restore the single database from backup, and support recovery from backups of other instances (but must be instances under the same account). For example, you can restore from a backup of a database instance in a production environment to a database in a test environment. <br>- Support SQL Server Only|
|**restoreDatabaseFromFile**|POST|Restore a single database from the backup file uploaded by the user to the cloud through the Cloud on Single Database<br>- only support SQL Server|
|**restoreDatabaseFromOSS**|POST|Restore a single database from the backup file uploaded to OSS<br> \- only support SQL Server|
|**restoreInstance**|POST|Use the full backup of instance to replace and recover the current instance|
|**restoreInstanceByTime**|POST|Select a single table to recover the current instance base on the point in time<br>- Only support MySQL|
|**revokePrivilege**|POST|Cancel all permissions of the account to a certain database. After the permissions are canceled, the account will not be able to access the database. Cancel the access permission of the account to a certain database without affecting the access permissions of the account to other databases|
|**setImportFileShared**|POST|Set or cancel whether the uploaded file is shared to other instances under the same account. By default, files are only visible and can be imported on the uploaded instance. Other instances are not visible and cannot be imported. If you need this file to be imported on other instances, you can set this file to share<br>- only support SQL Server|
|**updateLogDownloadURLInternal**|POST|Set a download link expiration time to log file, and refresh to generate a log file download link to PostgreSQL|
