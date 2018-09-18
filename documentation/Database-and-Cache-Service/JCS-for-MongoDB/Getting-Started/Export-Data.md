# Export Data

JCS for MongoDB provides automatic backup and manual backup. To export the data, you can download the backup file and export it to your local database.

## Operation Steps
1. Login [MongoDB Console](https://mongodb-console.jdcloud.com/mongodb?dataCenter=bj_02).
2. On the "Instance List" page, select the target instance, then click **Instance Name** to enter the "Instance Details" page.
3. On the "Instance Details" page, click **Backup & Restore** to view the backup data.

   ![View Backup](https://github.com/jdcloudcom/cn/blob/master/image/mongodb/mongo-010.png)
   
4. Select the backup you want to download. In the operation items, click **Download** to open the download popup.

   ![View Backup](https://github.com/jdcloudcom/cn/blob/master/image/mongodb/mongo-009.png)
	
5. Download the backup file to local.
	
	Description
	- The validity period of intranet address and internet address is 24 hours;
	- English quotation marks shall be added to URL when download using wget;
	- If the Virtual Machines is in the same region with the virtual database, you are recommended to use the intranet address for downloading;
		
6. Import the backup file to the local database.

   > mongorestore --host xxx --port=27017 --authenticationDatabase admin --archive=xxx(file path)  --gzip -u root -p xxx

## Related Reference

- [Import Data](Import-Data.md)
