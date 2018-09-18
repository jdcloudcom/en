# Data Recovery


The JCS for MongoDB supports one-click recovery of backup data to the original instance, and also the data recovery to minimize data loss.

## Precautions

- Data recovery will overwrite the original data with backup data. This operation is irreversible, please be cautious. It is recommended to manually create a backup before the operation.
- Do not write to the MongoDB instance during the data recovery process.
- The data recovery time is related to the quantity of data. When the amount of data is large, it takes a long time. Please wait patiently.

## Precondition

- The instance status is Running and the billing status is normal.

## Operation Steps

1. Login [MongoDB Console](https://mongodb-console.jdcloud.com/mongodb?dataCenter=bj_02).
1. On the "Instance List" page, select the target instance, then click **Instance Name** to enter the "Instance Details" page.
1. On the Instance Details page, click **Backup and Recovery** to view the backup data.
1. Select the backup you want to use and click **Data Recovery** in the operation items to open the "Confirm Popup".

   ![](https://github.com/jdcloudcom/cn/blob/master/image/mongodb/mongo-021.png)

1. Click **OK** to confirm the execution of data recovery, and the instance status changes to "Under Recovery". Please wait for the  completion of data recovery.
2. When the instance status changes to "Normal", the data recovery is complete.


## Related Reference

- [Create Backup Manually](Create-Backup.md)
- [Download Backup File](Download-Bckup.md)
- [Create Instance based on Backup](Create-Instance-by-Backup.md)
- [Create Instance based on Time Point](Create-Instance-by-Point-in-Time.md)
- [Set Auto Backup](Modify-Backup-Policy.md)
