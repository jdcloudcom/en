# Import Backup Files
## 1. Operation Entrance
- Enter the page to see the imported files. Click the refresh button if the files are not found.
- Click ***Import*** on the right of the files to be uploaded to import files.
![Import Backup 1](../../../../../image/RDS/Import-Backup-1.png)

## 2. Select Database to be Imported
- Only databases in "running" status can be displayed in the list.
- If the newly created database is under "Pending", it will appear in the database list after a while.

![Import Backup 2](../../../../../image/RDS/Import-Backup-2.png)

## 3. Confirm Import
- View that the operation information is correct. 
Note: Backup of Cloud on Single Database only supports backups in FULL mode. Therefore, please verify if the backup method is correct. You can view the [Document](https://docs.jdcloud.com/en/rds/backup-local-database) for the specific methods
- After information is confirmed to be correct, check the option box and start to import

![Import Backup 3](../../../../../image/RDS/Import-Backup-3.png)
         
## 4. View Importing Status
- Click ***Refresh*** and it can be seen that the files are "Importing", and the status of the instance is also changed to "Single Database Backup Recovering". 
- View the status of the database. It can be seen that the status of the database changes in the following order: "Deleting"-->"Single database backup recovering" --> "Running".

