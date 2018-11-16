# Introduction to Cloud on Single Database

"Cloud on Single Database" is to help users to transfer the offline JCS for SQL server service to JD Cloud service. The principle is to recover the offline JCS for SQL Server and backup it to the cloud database.

Supported versions of offline database:
- SQL Server 2000
- SQL Server 2005
- SQL Server 2008
- SQL Server 2008 R2
- SQL Server 2012
- SQL Server 2014
- SQL Server 2016

**Note: It only supports to restore the low-version database backups to a higher-version cloud database. For example, the JCS for SQL Server 2012 backups can be restored to the JCS for SQL Server Service 2014, but cannot be restored to the JCS for SQL Server Service 2008R2.**

#### 1. Main Steps
The operation of the cloud on single database are basically carried out in three steps:
1) Users back up the database to be stored in the cloud to the local, and click ***Step 1***(Backup-Local-Database.md).
2) Users download the uploading tools for backup data and upload the backup files to JD Cloud. Click ***Step 2***(Upload-Backup.md).
3) Users use the uploaded file, restore them to the database, import to cloud, and click ***Step 3***(Import-Backup.md).

#### 2. Precautions
1. The file name of backup files (including path, etc.) **cannot contain spaces**, and it is recommended to use English letters, numbers and underlines.
2. **The restoring mode of the database must be Full** during the backup.
3. The files with the same name are not allowed to replace when files are uploaded. Please delete the original files before uploading for the sake of security.
4. Database, account and backup cannot be created or deleted when the instance in the cloud on single database.
