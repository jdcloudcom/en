# Restore Instance

## 1. Operation Entrance
Click ***Restore based on Backup*** on the right side of the backup list.
![Restore Instance 1](../../../../image/RDS/Restore-Instance-1.png)

## 2. Choose Restoring Method
**Remarks: This operation is only supported by the JCS for SQL Server. Other databases can skip this step**<br>
1) If the backup granularity of the backup is "instance" and the backup type is "Full", users can choose "Restore Instance" or "Restore Single Database".<br>
![Restore Instance 2](../../../../image/RDS/Restore-Instance-2.png)

2) If the backup granularity is "instance" but the backup type is "incremental", users can only select "Restore Instance".
![Restore Instance 3](../../../../image/RDS/Restore-Instance-3.png)

3) If the backup granularity is "multi-database", users can only select "Restore Single Database". Select the database to be restored from the pull-down menu.
![Restore Instance 4](../../../../image/RDS/Restore-Instance-4.png)

## 4. Restore Confirmation
The following dialog box will pop up according to different restoration types. click ***OK*** and restore.
### Confirmation Dialog of JCS for SQL Server
**Restore Instance**<br>
![Restore Instance 5](../../../../image/RDS/Restore-Instance-5.png)

**Restore Single Database**<br>
![Restore Instance 6](../../../../image/RDS/Restore-Instance-6.png)

## 5. Instance Status
The instance status is displayed as "Restoring" (Restore Instance)
![Restore Instance 8](../../../../image/RDS/Restore-Instance-8.png)
<br> or "Backup and Restore Single Database" (SQL Server only)
![ Restore Instance 7](../../../../image/RDS/Restore-Instance-7.png)
