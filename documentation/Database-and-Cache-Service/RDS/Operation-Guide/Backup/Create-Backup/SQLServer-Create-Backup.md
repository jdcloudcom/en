# Create Backup

## 1. Operation Entrance
Click the instance name, enter the instance page, select ***Backup Management*** page, click ***Create Backup*** and input the backup name.<br/>
![Create Backup 1](../../../../image/RDS/Create-Backup-1.png)

## 2. Select Backup Granularity
Selection of Backup Granularity
- Instance Backup: To backup the entire instance;
- Multiple Database Backup: To backup multiple databases based on the unit of database.

Select "Instance Backup" and click "OK" to start the backup.
![Create Backup 2](../../../../image/RDS/Create-Backup-2.png)

 If users select "Multi-database Backup", the currently selectable database will be listed (only the database in the "running" state will be displayed in the list). Select the database to be backed up and click OK to start the backup.
![Create Backup 3](../../../../image/RDS/Create-Backup-3.png)

## 3. Backup Completed
Return to the backup list page, and the page will be displayed as in "Pending".
After a while, click the refresh button to manually refresh the page, it can be seen that the backup is completed and the backup is "normal".
![Create Backup 4](../../../../image/RDS/Create-Backup-4.png)
