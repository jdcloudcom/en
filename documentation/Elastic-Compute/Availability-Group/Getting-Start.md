# Getting Started Guide

There are four steps to deploy availability service via JD Cloud:

![](../../../image/ag/gettingstart1.png)

## Step 1: Create Instance Template

Instance template defines the configuration information of VM instances of Availability Group, including the information of image, VM specification, system disk and data disk type and capacity, VPC /subnet configuration, security group and log-in information etc.

### Preconditions:

* You can in advance [Create VPC ](../../Networking/Virtual-Private-Cloud/Operation-Guide/VPC-Configuration.md) and [Create Subnet](../../Networking/Virtual-Private-Cloud/Operation-Guide/Subnet-Configuration.md) or create VPC and subnet together with the VM.
* If you need a SSH key pair to login an instance on Linux VM, you can in advance the [ Create SSH Key Pair](../Virtual-Machine/Operation-Guide/Key-Pair/Create-Keypair.md) or create key pair together with of the VM.
* If you need a security group to mange the Identity and Access Management of VM, you can in advance [Create Security Group](../../Networking/Virtual-Private-Cloud/Operation-Guide/Security-Group-Configuration.md) and [Configure Security Group](../../Networking/Virtual-Private-Cloud/Operation-Guide/Security-Group-Configuration.md), or create the security group together with of the VM.

### Creation Steps

1. Access to [Instance Template Console](https://cns-console.jdcloud.com/host/launchtemplate/list) to go to the Instance Listing page. Or visit [JD Cloud Console](https://console.jdcloud.com) and click **Elastic Compute**-**Virtual Machine**-**Instance Template** in left guide bar to go to the Instance Template Listing page.
2. Choose region
3. Click **Create** to go to the Instance Template Creation page
4. Select Regions: This step allows you to choose the responding region for new instance template. Please note that cross-region use of instance template is not allowed. For instance, cn-south-1 instance template cannot be used to create cn-north-1 VM. If the number of the selected region has reached its quota limit, you can open ticket to increase the quota.
5. Set up the name and description of instance template
6. Choose image:
	
	JD Cloud is available for the following image types:
	
	* Public Image: Public image is provided and maintained by JD Cloud. It supports various release versions of Linux and Windows, provides basic operation system, and instantiates the component and partial pre-installed software. It is applicable to all users.
	* Private Image: It is available for users to create customized image based on their own machine instance creation. You can create image for VM of deployed service and create many of VMs of same configuration and software environment based on this image. You can share this private image to other JD Cloud users. The shared image will be displayed in shared image list of the same region of target users. Private image supports the deletion and modification of basic information.
	* Shared Image: The obtained customized image shared by other JD Cloud users has the same display region as that of private image. Shared image can be used for Create VM instance but is not available for basic information modification and deletion. If a user who initiates a sharing cancels the sharing process, the image will be automatically deleted from the list.
	* Image Marketplace Image: It is provided by providers participating in Cloud Marketplace. The image integrates variety of operating environments and software for different services, which enables users to conduct quick service deployment.
	
	First-time users can choose “Public Image” provided by JD Cloud and pick up the responding system and applicable version which meet your requirement. If you have already established your instance and the responding environment is also configured up, you can use this instance to create private image. You can also create machine of same system and environment based on the image and share this private image to other JD Cloud users.


7. Choose Specification Type: JD Cloud supports a customized instance type choice: Users are able to choose instance type and the responding configuration according to different service. Please view [Instance Specification Type]() for more details.

		Please note that: If you plan to use this instance template to create Availability Group, a second-generation specification shall be applied, such as g.n2.large.

8. Choose Storage Type: JD Cloud offers cloud disk service and local disk for storage.
	
	Cloud Disk Service: It boasts one disk and multiple back-up storing approach. Data is highly reliable;
	
	Local Disk: It is a storage device installed in physical machine where the cloud server is located. This storage type has low time-lapse but also has a risk of single storage loss.

	VM System Disk: It supports local disk and cloud disk service, including a 40GB local disk provided free of charge, and the storage capacity cannot be modified. Cloud disk service supports a storage capacity of 40GB~500GB.

	VM Data Disk: It is able to attach 8 data disks. You can choose from premium HDD cloud disk and SSD cloud disk. After Cloud Disk Service attach to a VM, you also need to enter the VM operation system to attach Cloud Disk.

		Using the Premium HDD Cloud Disk as data disk: Available capacity range: 20GB~3000GB

		Using SSD cloud disk as data disk: Available capacity range: 20GB~1000GB

	You can create specified disk type and capacity at the time of instance creation or create data disk from the existed cloud disk snapshot (this type does not support modification at present and capacity lower limit shall be the snapshot capacity). If data disk Configuration Information is included in private image, after your selection of private image the configuration, it will automatically reflect the one previously set. If you only need part of default image configuration, you can choose to delete some of them (It does not support snapshot change. If you want to change the snapshot, delete the default configuration and change the snapshot after adding a new disk). Please check device name allocation rules to see how data disk device name is allocated.

9. Select Network: You need to select “VPC” and “Subnet”. After selecting the subnet, check how many VMs can be created under this subnet. If there is no subnet available at present, create a new subnet at quick entrance and then select it from “VM Network”. For more information please see VPC and Subnet section.        

	Select the corresponding created security group. The security group is a necessary option and can be created at the quick entrance (please refer to the Security Group Creation section for more details). After creation, select it from “Web”.


10. Select the public network bandwidth:

	The bandwidth of public IP JD Cloud provides is charged by: Fixed bandwidth - charged according to the upper limit of the set bandwidth at the time of purchase and has nothing to do with real time access to public network; by traffic - charged according to the real time access to the public network. IP provider are divided into: IP providers are BGP and non-BGP type. If you require a faster and more effective network access, please choose the BGP type.        

	Bandwidth range: 1Mbps~200Mbps. It supports a temporary non-public IP configuration, which you can purchase and associate later after create instance by instance template.

	The bandwidth cost of EIP is independent from instance cost. Detailed price information can be viewed at [EIP Price]().**Please note that instance template service is for free. The following billing information is an estimated cost of Create VM instance on the basis of the instance template.
**
	<table>
	   <tr>
	      <td >Instance Billing Method</td>
	      <td >Public Bandwidth Billing Method</td>
	      <td >Cost Estimation</td>
	   </tr>
	   <tr>
		   <td rowspan="2"> Pay by configuration </td>
	      <td >By fixed bandwidth </td>
	      <td > Configuration costs, including: Costs for instance type (CPU and memory), Cloud Disk Service (if configured), and elastic IP bandwidth. </td>
	   </tr>
	   <tr>
	      <td >By traffic </td>
	      <td > EIP traffic costs + configuration costs. Where, the configuration costs include: Costs for instance type (vCPU and memory), cloud disk service (if configured), and Elastic IP bandwidth.          </td>
	   </tr>
	   <tr>
		   <td rowspan="2">Monthly Package </td>
	      <td >By fixed bandwidth </td>
	      <td > Configuration costs, including: Price for instance type (vCPU and memory), cloud disk service (if configured), and Elastic IP bandwidth. </td>
	   </tr>
	   <tr>
	      <td >By traffic </td>
	      <td > EIP traffic costs + configuration costs. Where, the configuration costs include: Price for instance type (CPU and memory), cloud disk service (if configured), and Elastic IP bandwidth.    </td>
	   </tr>
   </table>


11. Configure Login Information:

	Login name for Windows: administrator; login name for Linux: root;

	For setting up the login password, you can make your choice from “Set now” or “Set Later”. If you choose “Set Later” option, a random password will be sent to you via text message and e-mail at the time you using the activation template to Create VM instance. We suggest you change your password via console after Create VM instance.

	For Linux system, you can choose to log in by key pair. Instance login verification is safer by associating to the established SSH secret key. More details about key pair creation and login help can be found at [Key pair]().

Instance template is provided for free. On the right page you will see the configuration information you have completed and the estimated instance cost (created based on this activation template) according to your configuration, which includes: Monthly cost (monthly package) and hourly cost (pay by configuration). The cost shall include cloud disk service cost and public IP cost (billing by fixed bandwidth). Public IP cost shall be listed separately if it is charged by traffic.


## Step 2: Create Availability Groups

Availability Group is a highly available service deployment solution provided by JD Cloud, which integrates the logic set of computation resources. It provides a mechanism where units in central data can be evenly allocated across the multiple fault domains and instances are scattered over the isolated physical devices. When there is a hardware fault or at the period of time-bound maintenance, only part of instances will be affected and your service remains in available state.

1. Access[High Availability Groups Console](https://cns-console.jdcloud.com/availabilitygroup/list) to enter the Availability Groups List page. Or access[JD Cloud Console](https://console.jdcloud.com) and then click on the left navigation bar **Elastic Compute**-**High Availability Groups** to enter the Availability Groups List page.
2. Choose region
3. Click **Create** to go to the Availability Group Creation page.
4. Select Regions: At this step, you are able to choose the corresponding region for new Availability Group. If the number of the selected region has reached its quota limit, you can open ticket to increase the quota.
5. Set up the attribute of the Availability Zone of the Availability Group. In order to ensure the best service availability, we recommend you choose multiple Availability Zones. VMs in the Availability Group will be allocated evenly, so as to reduce the influence to your service in case of a single failure in the Availability Zone.
6. Set up a name and description for Availability Group, e.g.: High Availability Group for Web Services.
7. Select instance template. A drop down box will show a list of satisfied instance templates. Please remember to choose the instance template configured with second generation VM specification. Please choose herein the “Instance Template of Web service” created in previous step.
8. Click the **OK** to trigger the creation of Availability Group. You can see the Availability Group created successfully on the Availability Group Listing page.

## Step 3: Add new VM

When you choose to use Availability Group to deploy service, new VM Instance shall be added to the Availability Group. As Availability Group does not support the adding of established instances, all added instances are newly created instances. Real-name Verification is required at the time of instance creation. If VM you created is Pay By Configuration, you must ensure that the Account Balance plus Coupon exceeds CNY 50.

1. Access[High Availability Groups Console](https://cns-console.jdcloud.com/availabilitygroup/list) to enter the Availability Groups List page. Or access[JD Cloud Console](https://console.jdcloud.com) and then click on the left navigation bar **Elastic Compute**-**High Availability Groups** to enter the Availability Groups List page.
2. Choose region.
3. Find the Availability Group in need of adding new instance.
4. Click **Add New Instance** to skip to the VM instance Creation page. Select “Create instance in Availability Group” as the Creation Method and choose the corresponding Availability Group, e.g.: High Availability Group for Web Services. Match the configured information of instance templates (the one the Availability Group associated) to the current page. It is necessary to note, however, that such configuration information is not allowed to be modified.
5. You can choose billing type and purchasing quantity. You can choose monthly package or Pay By Configuration. If you choose monthly package Virtual Machine, Purchase Duration shall be specified.
6. If you only add one VM at a time, you can specify its Private IP, and it should be noted that the Intranet IP should be within the scope of the corresponding subnet CIDR;
7. Set up VM name and description;
8. Click **Buy Now** after completing the above configuration. VMs under Monthly Package can be viewed from the detail page of Availability Group after creation. For VMs Pay By Configuration, the creation process is directly triggered therein. There will be several minutes’ gap before the running of the created VM. Please be patient.

If instance templates the Availability Group associated have already deployed services and configured with self-start private image, it is considered that you have obtained a group of high availability VMs of outbound service after adding the new instances.

## Step 4: Enable the auto-scaling mode (optional)

After starting the auto-scaling mode of the Availability Group, you can set up an alarm strategy based on monitoring index (such as CPU, memory utility efficiency) and pre-set time. The timing strategy of the auto-scaling will help to add or delete the quantity of VMs upon pre-set time and handle the load fluctuation condition.

### Enable Auto-scaling

1. Access[High Availability Groups Console](https://cns-console.jdcloud.com/availabilitygroup/list) to enter the Availability Groups List page. Or access[JD Cloud Console](https://console.jdcloud.com) and then click on the left navigation bar **Elastic Compute**-**High Availability Groups** to enter the Availability Groups List page. 
2. Find the name of the corresponding Availability Group.
3. Click **Operation**-**Enable Auto-Scaling**.
4. In the pop-out window, please specify the minimum and maximum instance number as well as the remove strategy of the Availability Group.
		
		The number of instances in the Availability Group will remain between the minimum and maximum number of scaling. If the current instance number of Availability Group is lower than the minimum instance number, new instances will be automatically added to meet the minimum limit. Please note that the automatically added VMs will be Pay By Configuration; if the current instance number of Availability Group is higher than the maximum instance number, instances will be removed to meet the maximum limit. Note: the automatically removed VMs will be directly deleted (different from those removed manually) and VMs under monthly package will not be automatically removed.

5. Click **OK** to trigger the Enable Auto-Scaling.

You can also configure alarm strategy and timing strategy after enabling the auto-scaling.

### Create Alarm Task

* Go to the auto-scaling tab page under detail page of Availability Group , select **Alarm Strategy** option and click **Add** button;
* Set up in the pop-up window the alarm strategy (based on monitoring indexes such as CPU, memory etc.) to automatically add or remove the instances of high availability group.
![](../../../image/ag/gettingstart2.png)

At the end of setting, the alarm strategy will be shown on the listing page. Example: ![](../../../image/ag/gettingstart3.png)


### Create Timing Task

* Go to the auto-scaling tab page under detail page of Availability Group , select **Alarm Strategy** option and click **Add** button;

* Specify in the Add pop-up window the timing information such as name, time of execution and scaling rules etc. You can also tick **Repeat Tasks** to perform tasks at a defined interval.

![](../../../image/ag/gettingstart4.png)

At the end of setting the timing strategy will be shown on the listing page. Example:

![](../../../image/ag/gettingstart5.png)


## Related References

[Create VPC](../../Networking/Virtual-Private-Cloud/Operation-Guide/VPC-Configuration.md)

[Create Subnet](../../Networking/Virtual-Private-Cloud/Operation-Guide/Subnet-Configuration.md)

[Create Key Pair](../Virtual-Machine/Operation-Guide/Key-Pair/Create-Keypair.md)

[Create Security Group](../../Networking/Virtual-Private-Cloud/Operation-Guide/Security-Group-Configuration.md)
