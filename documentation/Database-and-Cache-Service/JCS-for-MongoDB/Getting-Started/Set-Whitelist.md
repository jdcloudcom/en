# Set White List

JCS for MongoDB supports setting the white list function, and you can precisely control the access source through the white list.

After the MongoDB instance is created, 0.0.0.0/0 will be added to the white list by default, which means that there is no limit to the access IP. For the security of the database, you can add the IP address or IP segment of the access source to the white list after creating the instance.

## Usage Restrictions
- Each MongoDB instance is currently allowed to add up to 45 IP addresses or IP segments.

## Precondition
- The MongoDB instance status is up and the billing status is normal.

## Operation Steps
1. Login [MongoDB Console](https://mongodb-console.jdcloud.com/mongodb?dataCenter=bj_02).
2. On the "Instance List" page, select the **target instance**, then click **Instance Name** to enter the  instance details page.
3. On the "Instance Details" page, click **Data Security** to enter the White list settings page.

   ![White List](https://github.com/jdcloudcom/cn/blob/master/image/mongodb/mongo-008.png)
4. Click **Set White List** to open the settings popup.	

   You can manually fill in the IP or IP segment, or you can directly load the Virtual Machines intranet IP.
   
   - Fill in Manually
      
     ![Fill in Manually](https://github.com/jdcloudcom/cn/blob/master/image/mongodb/mongo-004.png)

     Enter the IP or IP segment that you want to access in the text box. Multiple IPs (or IP segments) are separated by commas or newlines. E.g.:
     - Assigned IP address: 192.168.0.1 access of IP address 192.168.0.1 is allowed.
     - Assigned IP segment: 192.168.0.0/24 Allow IP address access from 192.168.0.1 to 192.168.0.255.
     - Multiple IP settings shall be separated by English comma or newlines, such as 192.168.0.1,192.168.0.0/24.
     - If you do not make a restriction, enter "0.0.0.0/0".
   
   - Upload private IP of Virtual Machines
   
     ![Upload Private IP](https://github.com/jdcloudcom/cn/blob/master/image/mongodb/mongo-005.png)
  
     1. Click on the bottom left corner of the pop-up window **Upload Private IP of Virtual Machines** to enter "IP Select Popup".
     2. The left side of the pop-up window shows the Virtual Machines IP that is currently in the same VPC as the MongoDB instance. You can use the Select All button and the Search Box to make a quick selection. The selected IP will be displayed in the preview area on the right.
     3. Complete the selection and click **OK**.
     4. The selected Virtual Machines private IP will be automatically loaded into the text box.
      
5. Edit is complete, click **OK** to complete the settings.
6. After the white list is set, it takes effect within 1 minute. You can view the currently set IP on the white list settings page, and adjust the settings at any time according to the business changes.
		
		
## Related Reference
- [Connection Instance](Connect-Instance.md)
- [Change Password](../Operation-Guide/Account-Management/Reset-Password.md)
- [Import Data](Import-Data.md)
- [Alter Configuration](../Operation-Guide/Instance-Management/Modify-Instance-Spec.md)
