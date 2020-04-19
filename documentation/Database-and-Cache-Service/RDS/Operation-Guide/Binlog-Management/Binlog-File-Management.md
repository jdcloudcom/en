# Binlog File View
The Binlog file records the transaction information of the instances and is the basis for MySQL/Percona/MariaDB service instance HA architecture, availability and restorability.
MySQL/Percona/MariaDB instance of the Cloud Database periodically automatically synchronize the Binlog file to the Cloud Storage, and cleanse local Binlog files according to the back-up policies of the instance. At that time, the local storage space of the instance can be released for other purposes.

## Precautions
* At present, JD Cloud does not charge for the space occupied by Binlog files.

## View Binlog files uploaded to Cloud Storage
1. Enter [RDS Console](https://rds-console.jdcloud.com/database).
2. Select the Binlog target instance to be view and click the target instance name and enter the instance details.
3. Select **Backup Management**, click **Binlog** and enter the Binlog list page. Then, the Binlog files uploaded to Cloud Storage can be viewed.
