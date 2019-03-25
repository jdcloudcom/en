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

There are 2 versions for Cloud on Single Database, the functions of which are roughly the same.
- **Import from OSS (recommend)**: Users can use upload tool of OSS to upload the backup files to OSS with higher upload efficiency and the number and size of uploaded backup files are not limited. It is recommended to use
- Import from uploaded files (offline soon): Support uploading from the windows client only. The sum of file size uploaded for a single instance cannot exceed 600GB. It will be offline later

## Precautions
1. The file name of backup files (including path, etc.) **cannot contain spaces** , and it is recommended to use English letters, numbers and underlines.
2. **The restoring mode of the database must be Full** during the backup.
3. The files with the same name are not allowed to replace when files are uploaded. Please delete the original files before uploading for the sake of security.
4. Database, account and backup cannot be created or deleted when the instance in the cloud on single database.

## Main Steps
The operation of the cloud on single database are basically carried out in three steps:

1. Users back up the database to be stored in the cloud to the local, and click [Documentation](./V2/Backup-Local-Database-v2.md).
2. The user uploads the backup files to JD Cloud OSS; click to view [Document](./V2/Upload-Backup-v2.md) and [Set Bucket Permission](./V2/Grant-File-Privilege-V2.md)
3. The user uses the uploaded backup files, restore the same to the database and complete cloud access task. Click to view [Documentation](./V2/Import-BacBackup-Local-Database-v2.mdup-v2.md).
