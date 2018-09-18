# View Instance

You can view the instances you have through the console:

* [Overview Page](#user-content-Overview Page): You can view the number of region instances and quota under the current account.
* [Instance List Page](#user-content-Instance List Page): You can view the information about all instances in each domain, including ID, name, Availability Zone, IP Address, and so on.
* [Instance Details Page](#user-content-Instance Details Page): You can view the details of the specified instance.

## Overview Page

[Overview Page](https://console.jdcloud.com) is the default home page for logging in to the JD Cloud console. You can view the number of region instances and quota in the current account. ![](../../../../../image/vm/queryinstance4.png)

	
	

## Instance List Page

1. Access [Virtual Machines Console](https://cns-console.jdcloud.com/host/compute/list) and enter the instance list page. Or access [JD Cloud Console](https://console.jdcloud.com) Click navigation bar on the left **Elastic Compute** - **Virtual Machines** to enter the instance list page.
2. Select Region. ![](../../../../../image/vm/queryinstance3.png)

	You can view the information about all instances in the selected territory, including ID, name, availability zone, IP address, and more. Since there are many instance information items, you can adjust the information items displayed on the instance list page through Edit Columns as needed. The detailed steps are as follows:

3. Click the Edit Columns on the top right corner of the instance list page icon ![](../../../../../image/vm/queryinstance2.png)

4. In the pop-up window of the edit columns, select the information item you want to display and click **OK**. ![](../../../../../image/vm/queryinstance1.png)


		Note: The current list supports up to 10 items of information.
		
You can also view related information from the instance list page to Virtual Private Cloud, Subnet, and Availability Group, etc. of instance.
	
## Instance Details Page

1. Access [Virtual Machines Console](https://cns-console.jdcloud.com/host/compute/list) and enter the instance list page. Or access [JD Cloud Console](https://console.jdcloud.com) Click navigation bar on the left **Elastic Compute** - **Virtual Machines** to enter the instance list page.
2. Select Regions.
3. In the instance list, select the instance for which you want to view the details, and click the instance name to go to the details page.

You can view the following instance information:

* Basic Information: ID, name, description, billing type, creation time, expiration time (monthly package billing type), region, availability zone, Availability Group, fault domain, label
* Configuration Information: Image, Specification, System Disk, Key Pair
* Network Information: Virtual Private Cloud, subnet, Private IP, Public IP

You can also view the related information from the instance details page to Virtual Private Cloud, Subnet, the availability instance binding Cloud Disk Service, the instance binding elastic network interface, the instance binding security group, and the instance monitoring alarm.
