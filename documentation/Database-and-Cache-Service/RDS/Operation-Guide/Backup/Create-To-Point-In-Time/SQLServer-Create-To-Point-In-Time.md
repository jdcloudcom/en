# Creation by SQL Server Based on Time Point

SQL Server can built one new instance in the same region according to the backup, and data in the instance can be recovered to the designated moment within last 7 days (default).

When it needs to recover the failed instance, we suggest that one new instance shall be created with the method **Create Based on Backup** or **Create Based on Time Point** with priority, then the row data shall be checked and finally the recovered data shall be confirmed to be correct or not. When data verification is passed, use the **Domain Switch** function to switch the domain of original instance to the new instance.

## 1. Operation entry
Log in the backup management page of Instance Details and click **Build According to Backup**

![根据时间点恢复1](../../../../../../image/RDS/SQL-Server-Create-To-Point-In-Time-1.png)

## 2. Select the time to be recovered
Select the time point on which data of new instance is to be recovered

![根据时间点恢复2](../../../../../../image/RDS/SQL-Server-Create-To-Point-In-Time-2.png)

## 3. Enter relevant information about new instances
Select specification of new instances, VPC availability zone, instance name and other information. For specific steps, please refer to [Create Instance](https://docs.jdcloud.com/en/rds/create-instance)
