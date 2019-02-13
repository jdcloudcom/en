# TDE  Support

## TDE Introduction

The encrypted operation of data stored in the database instance of Microsoft SQL Server via TDE is supported by RDS of JD. TDE will automatically encrypt such data before writing them into a memory and automatically decrypt such data when reading them from the memory. The database file is encrypted in the page level. The page in the encrypted database will be encrypted before being wrote into a disk, but will be decrypted when being read into a memory. TDE will not increase the size of an encrypted database.

For detailed introduction of transparent data encryption (TDE), please refer to the Microsoft document [TDE](https://docs.microsoft.com/zh-cn/sql/relational-databases/security/encryption/transparent-data-encryption?view=sql-server-2017)

RDS of JD Cloud supports the use of TDE in the following SQL Server version:
- SQL Server 2008R2 Enterprise Version
- SQL Server 2012 Enterprise Version
- SQL Server 2014 Enterprise Version
- SQL Server 2016 Enterprise Version

## Precautions
1. It is not allowed to disable TDE when it is enabled at the instance level
2. The user can enable (or disable) the database to be encrypted via SQL after enabling TDE
3. When TDE is enabled, the CPU load will be significantly increased. It is suggested to enable TDE after test. The TDE performance comparison, [TDE Performance Comparision](https://www.mssqltips.com/sqlservertip/2641/sql-server-transparent-data-encryption-tde-performance-comparison/?spm=5176.11156381.0.0.37b6706fyHyVsK), made by a third party is listed below for reference
4. If at least encrypted database is possessed by the database instance, the un-encrypted database performance may be reduced. Hence, you are suggested to keep the encrypted database and the un-encrypted database on different database instances.

## Restriction
- The encrypted database backup cannot be restored to other instances via the “cross-instance recovery” function
- After being downloaded, the encrypted database backup can be restored to the local database only after being decrypted. Please obtain the decryption key pair by contacting the Customer Service. The self-help download function will be provided later.
- The cross-origin backup synchronization is not supported by the encrypted database

## Operation Steps
1. Log in the RDS console and click the instance to enter the **"Security Management"** page.
2. Select **TDE Encryption** and click **Enable** to enable the instance-level TDE.
3. Execute the following SQL for the database with TDE to be enabled. Taking the database db1 for example
```
USE master
GO
SELECT name FROM sys.certificates WHERE name LIKE 'TDE%'
GO

-- TDECertificateName refers to the TDE certificate name searched in the last step.
CREATE DATABASE ENCRYPTION KEY
WITH ALGORITHM=AES_128
ENCRYPTION BY SERVER CERTIFICATE [TDECertificateName]
GO

ALTER DATABASE db1
SET ENCRYPTION ON
GO

-- TDE Verification Enabled
USE master
GO
SELECT name FROM sys.databases WHERE is_encrypted = 1
GO
SELECT db_name(database_id) as DatabaseName, * FROM sys.dm_database_encryption_keys
GO 
```



