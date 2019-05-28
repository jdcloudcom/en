# Restore Instance
Replace and Recover** instances via backup. As instance data will be recovered to the original backup time point after recovery. Please carry out the operation with care.

## Best Practices
When it needs to recover the failed instance, we suggest that one new instance shall be created with the method **Create Based on Backup** or **Create Based on Time Point** with priority, then the row data shall be checked and finally the recovered data shall be confirmed to be correct or not. 

When data verification is passed, please recover the instance with the **"Instance Recovery"** function or switch original instance domain to the newly-created instances by using the [**Domain Switch**](../../Instance/Exchanged-DNS.md) function.

## 1. Operation Entrance
Click ***Restore based on Backup*** on the right side of the backup list.
![Restore Instance 1](../../../../../../image/RDS/Restore-Instance-1.png)

## 2. Choose Restoring Method
1. If the backup granularity of this backup is "instance" and the backup type is "Full", then you can select **Instance Recovery** or **Single Database Recovery**
2. If the backup granularity is "instance" and the backup type is "Increment", then you can select **Instance Recovery** only**
3. If the backup granularity is "multi-database", only the **Single Database Recovery** can be selected and please select the database to be recovered from the drop-down list.
![Restore Instance 2](../../../../../../image/RDS/Restore-Instance-2.png)

## 3. Restore Confirmation
The following dialog box will pop up according to different restoration types. click ***OK*** and restore.
### The confirmation dialog of SQL Server
**Restore Instance**<br>
![实例恢复5](../../../../../../image/RDS/Restore-Instance-5.png)

**Restore Single Database**<br>
![实例恢复6](../../../../../../image/RDS/Restore-Instance-6.png)

## 5. Instance Status
On the Instance List Page or the Instance Details, it is able to view that the instance status is **"Recovering"** (instance recovery) or **"Single Database Backup Recovering"**

