# Create Instance

You should specify information such as the instance type, image, Virtual Private Cloud, security group, and login password when creating an instance. JD Cloud provides the user with a variety of ways to create an instance, including:

* [Create customized instance](#user-content-Create customized instance)
* [Create instance by instance template (in beta) ](#user-content-Create instance by instance template (in beta))
* [Create instance in Availability Group (in beta)](#user-content-Create instance in Availability Group (in beta))


The customized instance creation also includes the clone instance.

## Create Customized Instance
The custom creation indicates that you need to customize the region, availability zone, instance type, image, Virtual Private Cloud, security group, and login password based on your business scenarios. Depending on the types of operating system platforms, please refer to [Create Linux Instance]() and [Create Windows Instance]() for detailed creation steps.

### Clone Instance
You can create an instance of the same configuration as your current instance, including information such as the region, instance type, image, virtual private cloud, security group, etc., without including information such as the availability zone, login password, instance name, and description, etc. Clone instance creation is a quick customized creation method,

The detailed steps are as follows:

1. Access [Virtual Machines Console](https://cns-console.jdcloud.com/host/compute/list) and enter the instance list page. Or access [JD Cloud Console](https://console.jdcloud.com) Click navigation bar on the left **Elastic Compute** - **Virtual Machines** to enter the instance list page.
2. Select Regions.
3. Select the instance in the list where you want to create within the same configuration, click **Operate** - **More** - **Clone Instance**, or click **More** - **Clone Instance** on the detail page of the instance where you want to create within the same configuration to enter the instance creation page.
4. The creation method in the creation page is customized instance creation by default, and instance type, image, virtual private cloud, security group, etc. will be selected in the same configuration as the original instance by default, which you can change. In addition, you should re-select the availability zone, re-specify the login password, instance name, and description, etc. 
5. Click **Buy Now** to trigger the purchase. If you choose to create a monthly package billing instance, you will need to pay the fee.

		Please note:
		* Do not allow the creation of the same configuration instance across regions, that is, only the same configuration instance can be created in the current instance region;
		* If the private image used by the current Virtual Machines is deleted, you should re-specify the image;
		The Clone Instance indicates that the new configuration information is the same, but the data in the instance is not replicated.

## Create Instance by Instance Template (in Beta)
The instance template is the configuration information template for creating VM instance provided by JD Cloud, including the image, instance type, type and capacity of system disk & data disk, Virtual Private Cloud and subnet configuration, security group, and login information, etc., but without including the availability zone, instance name and description, etc. Please refer to [Instance Template Overview]() for detailed instructions of the instance template.

When creating instance by instance template, the configuration included in the instance template is selected by default in the case of the clone instance, and you can change it based on this.

The detailed steps are as follows, there are two operation entrances:

* Virtual Machines List Page/Detail Page

	1.  Access [Virtual Machines Console](https://cns-console.jdcloud.com/host/compute/list) and click **Create** to enter the instance creation page.
	2. Select region and availability zone to create instance.
	3. For creation method, if you select  to create instance by instance template and select instance template, instance type, image, Virtual Private Cloud, security group information, login password, etc., you will select configuration already included in instance template by default and you can change it based on this. In addition, you need to select availability zone, assign instance name and description, etc.
	4. Click **Buy Now** to trigger the purchase. If you choose to create monthly package billing instance, you will need to pay.

* Instance Template List Page/Details Page

	1. Access [Instance Template Console](https://cns-console.jdcloud.com/host/launchtemplate/list), select instance template, and click **Operation** - **Create Instance** to enter the creation instances page.
	2. For creation method in create page, if you select to create instance by instance template and select instance template, instance type, image, Virtual Private Cloud, security group information, login password, etc., you will select configuration already included in instance template by default and you can change it based on this. In addition, you need to select availability zone, assign instance name and description, etc.
	3. Click **Buy Now** to trigger the purchase. If you choose to create monthly package billing instance, you will need to pay.
		
			Note: If the configuration resource contained in the current instance template has been deleted, you need to reassign the corresponding resource information.

## Create Instance in Availability Group (in Beta)
Availability Group (AG) is a logical collection of VM instance provided by JD Cloud. The instances in Availability Group are distributed on physical resources that are isolated from each other. When a hardware failure occurs, only some instances are affected. Your overall business is still not available. For details of Availability Group, please see [Availability Group Overview]().

Create instance in Availability Group means that the newly created instance will be deployed on the corresponding physical resources according to the rules of the current Availability Group

The detailed steps are as follows, there are two operation entrances:

* Virtual Machines List Page/Detail Page

	1. Access [Virtual Machines Console](https://cns-console.jdcloud.com/host/compute/list) and click **Create** to enter the instance creation page.
	2. Select the region in which you want to create instance.
	3. For creation method, you shall select to create instance in Availability Group and select Availability Group, Instance Type, Image, Virtual Private Cloud, Security Group Information, Login Password, etc. and select the configuration already included in the instance template associated with Availability Group by default. without being changed. The system will automatically select availability zone which is available (can be multiple) configured by the high Availability Group, and you need to assign the instance name, description and other information.
	4. Click **Buy Now** to trigger the purchase. If you choose to create a monthly package billing instance, you will need to pay the fee.

* Instance Template List Page/Details Page

	1. Access [Availability Group Console](https://cns-console.jdcloud.com/host/availabilitygroup/list), select Availability Group, and click **Operate** - **Add New Instance** to enter the instance creation page.
	2. Creation method in creation page will be selected to create instance in Availability Group, and select the corresponding Availability Group, Instance Type, Image, Virtual Private Cloud, Security Group information, Login Password, etc. and will select the configuration already included in the instance template by default. You can be change it on this basis. In addition, you need to select availability zone, assign instance name and description, etc.
	3. Click **Buy Now** to trigger the purchase. If you choose to create monthly package billing instance, you will need to pay.
		
			Please note:
			* If the configuration resource included in the instance template associated with Availability Group has been deleted, you cannot create instance in Availability Group, that is, the instance template is unavailable but you can choose to replace the Availability Group instance template at the time.
			* Select a new instance in the Availability Group does not require you to specify availability zone. The system will create instance by selecting availability zone in Availability Group based on the distribution of instance in availability zone in the case of uniform distribution as far as possible.


## Related Reference

[Create Linux Instance]()

[Create Windows Instance]()

[Instance Template Overview]()

[Availability Group Overview]()