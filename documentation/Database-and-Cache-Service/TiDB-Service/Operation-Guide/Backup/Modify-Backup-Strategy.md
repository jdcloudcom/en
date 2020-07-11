# Set Backup Policy

Backup policies can be set for automatic backup of TiDB, including:
- Backup period: Set the days for conducting automatic backup per week. As suggested, full data backup shall be conducted at least once per week
- Backup start time: Set time range when the automatic backup is started. The system will make sure the backup is started within the time range selected as much as possible, but will not guarantee that such backup is completed in the time range. If the data volume is high, backup might last for hours.

> Note: AS IO resources will be occupied during backup, it is suggested that backup shall be conducted during the period where the business volume is low.

## Operation Steps
#### 1. Enter the **Backup Management** Page
Click an instance name, enter the Instance Page, Select **Backup Management** --> **Backup Policy** Page and click **Modify Policy

![备份策略](../../../../../image/TiDB/modify-backup-strategy-1.png)

#### 2. Set backup policy
1. Select a period for automatic backup
2. Select start time for automatic backup
3. Click **OK

![备份策略](../../../../../image/TiDB/modify-backup-strategy-2.png)
