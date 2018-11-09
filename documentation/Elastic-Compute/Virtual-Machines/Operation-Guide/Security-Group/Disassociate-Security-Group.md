# Security Group Unbinding

## Operation Steps
1. Access [Virtual Machines Console](https://cns-console.jdcloud.com/host/compute/list) and enter the instance list page. Or access [JD Cloud Console](https://console.jdcloud.com) Click navigation bar on the left **Elastic Compute** - **Virtual Machines** to enter the instance list page.
2. Select a region.
3. In the instance list, select the instance to which you want to associate the security group and click on the name to enter the details page.
4. Click **Security Group** tab.
5. Find the security group to be unbound and click **Unbind**.
	![](../../../../../image/vm/Operation-Guide-SG-unbind1.png)
6. Click **OK** in the confirmation pop-up window.

		Please note:
		* If the current security group is the only security group bound to the main network interface of current instance, the current security group cannot be deleted until the other security group is bound to the instance.
		* The instance side only supports the security group unbinding operation on the main network interface of current instance. To perform the instance auxiliary network interface operation, operate from the security group side.



In addition, you can also unbind from the security group console. Refer to [Security Group Unbinding Instance](../../../../Networking/Virtual-Private-Cloud/Operation-Guide/Security-Group-Configuration.md) for details.