# Security Group Associating Instance
You can associate a security group when creating instances, or you can select security group to associate to the specified instance on the security group page after instance is created.

Each network interface of an instance must be associated to at least one security group.

## Operation Steps
1. Access [Virtual Machines Console](https://cns-console.jdcloud.com/host/compute/list) and enter the instance list page. Or access [JD Cloud Console](https://console.jdcloud.com) Click navigation bar on the left **Elastic Compute** - **Virtual Machines** to enter the instance list page.
2. Select a region.
3. In the instance list, select the instance to which you want to associate the security group and click on the name to enter the details page.
4. Click **Security Group** tab - **Add**.
5. In the pop-up window, select one or more security groups and click **OK**.<br> ![](../../../../../image/vm/Operation-Guide-SG-bind1.png)

		Note: The instance side only supports security group associating for the instance primary network interface. To operate the instance secondary network interface, please operate from the security group side.
	
In addition, you can also associate from the security group console. For details, see [Security Group Side Binding Instance](../../../../Networking/Virtual-Private-Cloud/Operation-Guide /Security-Group-Configuration.md).