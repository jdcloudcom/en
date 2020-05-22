# Configure Active Directory
Active Directory on cloud can be configured in SQL Server and the account and permission of SQL Server can be managed through AD

# Operation Steps
## Add to Domain
1. Users first need to create an active directory in the region and VPC same as the JCS for SQL Server. For specific operation steps, users can view [Document](https://docs.jdcloud.com/cn/driectory-service/create-instance) of Active Directory
2. Log in "Instance Information" page of SQL Server, click **Modify Active Directory

![修改目录服务1](../../../../../image/RDS/Modify-AD-1.png)

3. In the popup window, select the active directory to be connected, and then click **OK

![修改目录服务2](../../../../../image/RDS/Modify-AD-2.png)

4. You can see the "Active Directory Status" is "Adding to Domain". Wait for a few minutes, and then the status changes to "Added to Domain, meaning that the active directory is successfully modified.

## Delete Domain
In the popup mentioned in the above Step 3, click **Remove** to clear the drop-down box of the active directory, and then click **OK

![修改目录服务3](../../../../../image/RDS/Modify-AD-3.png)
