# Create Backup
TiDB instances support two backup method, including automatic backup and manual backup. At present, backup is not charged.
- Automatic backup: Automatic backup triggering time can be set by modify backup policy. For details of operation, please refer to the backup policy. Instance backup will be stored in Cloud Storage Service of JD Cloud. By default, automatic backup will be saved for 7 days and is not allowed to be deleted
- Manual backup: Backup initiated via the Console or OpenAPI. The system will not delete the backup manually initiated by any user. **By default, 3 manual backups can be created for each instance**


## Operation Steps 
#### 1. Enter the [Backup Management] Page 
Click an instance name, enter the Instance Page, select **Backup Management** Page, click **Create Backup** and enter the backup name

![创建备份](../../../../../image/TiDB/Create-Backup-1.png)

#### 2. Enter the backup information
1) Enter the backup name according to hints on the Console

2) Click **OK** to develop and create a backup

![创建备份](../../../../../image/TiDB/Create-Backup-2.png)
