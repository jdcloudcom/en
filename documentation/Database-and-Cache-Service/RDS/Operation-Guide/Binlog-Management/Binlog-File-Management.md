# Binlog File Uploading
The Binlog file records the transaction information of the instances and is the basis for MySQL/Percona/MariaDB service instance HA architecture, availability and restorability.
The  JCS for MySQL/Percona/MariaDB service instance automatically synchronizes Binlog files to cloud storage on a regular basis and cleans up the local Binlog files after 48 hours, at which point the instance's local storage space can be freed for other uses.
If the instance generates a large number of Binlog files in a short period of time, users can use the ***One-click Uploading of Binlog***  function provided by the console to actively synchronize the Binlog files to the cloud storage, and clean up the local Binlog files.

## Precautions
* At present, JD Cloud does not charge for the space occupied by Binlog files.
* You can clean up all local Binlog files before the last backup of the instance after actively uploading Binlog files by one click.

## Local Binlog File Uploading
1. Enter [RDS Console](https://rds-console.jdcloud.com/database).
2. Select the instance where the Binlog file cleaning is required, click the name of the target instance, and enter the instance detailed page.
3. Select the tag of ***Backup Management***, click the tag of ***Binlog*** to enter the list page and click ***one-click uploading of Binlog*** to upload Binlog files.
