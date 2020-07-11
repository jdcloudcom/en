# Create Based on Backup
When a failed instance requires recovery, you can use the method "Create Based on Backup" to create an instance, carry out data check as per original instance and confirm if the recovered data are correct. 

> Note: When "Create Based on Backup" is used, it is suggested that the bucket of the created instance shall be no less than that of the original one, so as to avoid creation failure due to insufficient space.

## Operation Steps
#### 1. Enter the Backup Management Page  
Enter the Backup Management Page on the Instance Details and click **Create Based on Backup** on the right side of the selected backup

#### 2. Enter relevant information of the new instance
Selected backup name, backup creation time and region information can be viewed on the pop-up page.

![根据备份创建1](../../../../../image/TiDB/Create-Instance-From-Backup-1.png)

Select the specification of the created instance, VPC availability zone, instance name and other information. For specific steps, please refer to [Create Instance](../Instance/Create-Instance.md)
