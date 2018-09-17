# Download Backup File

Download of backup files for the MongoDB instances is supported, and you can download the backup files yourself as needed.

## Operation Steps:
1. Login [MongoDB Console](https://mongodb-console.jdcloud.com/mongodb?dataCenter=bj_02).
1. On the "Instance List" page, select the **target instance**, then click **Instance Name** to enter the "Instance Details" page.
1. On the "Instance Details" page, click **Backup and Recovery** to view the backup data.
1. Select the backup you want to download. In the operation items, click **Download** to open "Download Popup".
	
   ![](https://github.com/jdcloudcom/cn/blob/master/image/mongodb/mongo-020.png)

1. Download the backup file to your local machine.

	Description
	
	- The validity period of intranet address and internet address is 24 hours;
	- English quotation marks shall be added to URL when download using wget;
	- If the Virtual Machines is in the same region with the virtual database, you are recommended to use the intranet address for downloading;

## Related Reference

- [Create Backup Manually](Create-Backup.md)
- [Create Instance based on Backup](Create-Instance-by-Backup.md)
- [Create Instance based on Time Point](Create-Instance-by-Point-in-Time.md)
- [Set Auto Backup](Modify-Backup-Policy.md)
- [Data Recovery](Restore-Instance.md)
