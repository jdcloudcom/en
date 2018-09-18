# Create an Instance based on the Time Point

The MongoDB console provides the function to create instance based on time point, allowing you to create new instance based on the backup data time point for an instance.

## Precautions

- The new instance region can only be consistent with the region of source instance.
- The storage space selected for the new instance shall not be smaller than the source instance, otherwise the creation may fail.

## Operation Steps

1. Login [MongoDB Console](https://mongodb-console.jdcloud.com/mongodb?dataCenter=bj_02).
2. On the "Instance List" page, select the **target instance**, then click **Instance Name** to enter the "Instance Details" page.
3. On the "Instance Details" page, click **Create based on Time Point** of operation items on the right side to open the "Create Instance" page.

   ![](https://github.com/jdcloudcom/cn/blob/master/image/mongodb/mongo-036.png)

5. On the "Create Instance" page, select the **billing type** and **instance type configuration** to complete the instance creation. The creation process is the same as [Create Instance](https://github.com/jdcloudcom/cn/blob/master/documentation/Cloud-Database-and-Cache/MongoDB/Getting-Started/CreateInstance.md).

   ![](https://github.com/jdcloudcom/cn/blob/master/image/mongodb/mongo-036.png)

## Related Reference

- [Create Backup Manually](Create-Backup.md)
- [Download Backup File](Download-Bckup.md)
- [Create Instance based on Backup](Create-Instance-by-Backup.md)
- [Set Auto Backup](Modify-Backup-Policy.md)
- [Data Recovery](Restore-Instance.md)

