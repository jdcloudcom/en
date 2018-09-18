# Set Automatic Backup

The JCS for MongoDB supports automatic backup. After the instance is created, a full backup is performed every day. The backup data is stored in the JD Cloud Object Storage Service, and can be kept for up to 7 days. Currently, no fee is charged. The default start time of the backup task is 0:00-1:00 every day. You can adjust the automatic backup time according to the business situation.


## Precautions
- Deletion of automatic backup files is not supported.
- If automatic backup has been performed that day and the time to modify the automatic backup is post to the current time, the backup will still be created.

## Operation Steps
1. Login [MongoDB Console](https://mongodb-console.jdcloud.com/mongodb?dataCenter=bj_02).
1. On the "Instance List" page, select the target instance, then click **Instance Name** to enter the "Instance Details" page.
1. On the  "Instance Details" page, click **Backup and Recovery** > **Backup Strategy** to go to the "Backup Strategies" page.
   
   ![](https://github.com/jdcloudcom/cn/blob/master/image/mongodb/mongo-017.png)

1. On the "Backup Strategy" page, click **Modify Strategies** to open the "Modify Strategies Popup".

   ![](https://github.com/jdcloudcom/cn/blob/master/image/mongodb/mongo-018.png)

1. In the "Modify Strategies Popup", reselect the desired automatic backup time.
	
1. Click **OK** to save your modifications.
2. You can view the results of the modifications on the "Backup Strategy" page.

## Related Reference

- [Create Backup Manually](Create-Backup.md)
- [Download Backup File](Download-Bckup.md)
- [Create Instance based on Backup](Create-Instance-by-Backup.md)
- [Create Instance based on Time Point](Create-Instance-by-Point-in-Time.md)
- [Data Recovery](Restore-Instance.md)


