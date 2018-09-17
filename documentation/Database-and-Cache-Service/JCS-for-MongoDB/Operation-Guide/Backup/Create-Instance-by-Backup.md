# Create Instance based on Backup

The MongoDB console provides the function to create instance based on backup, allowing you to create new instance based on the backup files for an instance.

## Precautions

- Do not delete the backup problem you are using during the new instance creation process, otherwise the creation will fail.
- The new instance region can only be consistent with the region of source instance.

## Operation Steps

1. Login [MongoDB Console](https://mongodb-console.jdcloud.com/mongodb?dataCenter=bj_02).
1. On the "Instance List" page, select the target instance, then click **Instance Name** to enter the "Instance Details" page.
1. On the "Instance Details" page, click **Backup and Recovery** to view the backup data.
1. Select the backup you want to use. In the operation items, click **Create based on Backup** to enter the page for creating instance based on backup.

   ![](https://github.com/jdcloudcom/cn/blob/master/image/mongodb/mongo-022.png)

	
1. On the page for creating instance based on backup, select the billing type and instance type configuration to complete the instance creation. The creation process is the same as [Create Instance](https://github.com/jdcloudcom/cn/blob/master/documentation/Cloud-Database-and-Cache/MongoDB/Getting-Started/CreateInstance.md).

   Note: The region is the same as the that of the source instance and cannot be modified.

   ![](https://github.com/jdcloudcom/cn/blob/master/image/mongodb/mongo-023.png)

## Related Reference

- [Create Backup Manually](Create-Backup.md)
- [Download Backup File](Download-Bckup.md)
- [Create Instance based on Time Point](Create-Instance-by-Point-in-Time.md)
- [Set Auto Backup](Modify-Backup-Policy.md)
- [Data Recovery](Restore-Instance.md)
