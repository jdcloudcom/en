# Binlog File View
The Binlog file records the transaction information of the instances and is the basis for MySQL/Percona/MariaDB service instance HA architecture, availability and restorability.
The  JCS for MySQL/Percona/MariaDB service instance automatically synchronizes Binlog files to cloud storage on a regular basis and cleans up the local Binlog files after 48 hours, at which point the instance's local storage space can be freed for other uses.

## Precautions
* At present, JD Cloud does not charge for the space occupied by Binlog files.

## View Binlog files uploaded to Cloud Storage
1. Enter [RDS Console](https://rds-console.jdcloud.com/database).
2. Select the Binlog target instance to be view and click the target instance name and enter the instance details.
3. Select **Backup Management**, click **Binlog** and enter the Binlog list page. Then, the Binlog files uploaded to Cloud Storage can be viewed.
