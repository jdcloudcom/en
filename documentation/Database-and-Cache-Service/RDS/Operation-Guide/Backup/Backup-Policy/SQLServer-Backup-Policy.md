# Backup Strategy
Backup policies for RDS SQL Server instances can be viewed and modified. SQL Server will start automatic backup in the defined time period per day and the backup is saved for 7 days for free. Automatic backup longer than 7 days will be cleared.
> **Note: As some CPU and IO resources will be used during backup, please make automatic backup at the low business peak as much as possible

## 1. Operation Entrance
You can see the backup strategy of the current instance by entering the page of "Backup Management" of "Instance Details".
![Backup Strategy 1](../../../../../../image/RDS/Backup-Strategy-1.png)

## 2. Modify Backup Strategy
- Click ***Modify Strategy*** to modify each backup strategy item in the pop-up dialog box.
- Currently it only supports the modification on "automatic backup time". The system will automatically start to execute backup operation at any time point within this time period; as the backup time will be prolonged with increment of the instance data volume, so that it cannot ensure that the backup operation can be completed within the specified time period.

![Backup Strategy 2](../../../../../../image/RDS/Backup-Strategy-2.png)
