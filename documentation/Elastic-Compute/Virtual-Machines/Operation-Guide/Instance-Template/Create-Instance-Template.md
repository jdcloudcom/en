# Create Instance Template
## Operation Steps
1.  Access [Instance Template Console](https://cns-console.jdcloud.com/host/launchtemplate/list) and enter the instance template list page. Or access [JD Cloud & AI Console](https://console.jdcloud.com) Click navigation bar on the left **Elastic Compute** - **Virtual Machines** - **Instance Template** to enter the instance template list page.
2. Select a region, please note that the instance templates cannot be used across regions, and the instance templates in the cn-south-1 region are not supported for creating VM instances. If the quota of the selected region is full, it can be increased by open ticket.
3. Click **Create** to enter the instance template creation page.
4. Set the instance template name and description.
5. Select Images:
	The image is divided into cloud system disk image and local system disk image, the former only supports to create the instance with the system disk of cloud disk, and the latter only supports the instance with the system disk of local disk.
	
	In addition, the image is divided into the following image types:
	
	* Public Image: It is provided and maintained by JD Cloud & AI, which provides basic operating system, initialization components and some pre-installed software, and supports multiple released versions of Linux and Windows, thus it is available to all users.
	* Private Image: A customized image created based on the user's instance. You can create the image for an instance with deployed environment and quickly create multiple VMs with the same configuration and software environment based on this image. You can share the private image with other JD Cloud & AI users, and the shared image will be displayed in the shared image list of the target user in the same region. The private image supports deletion and basic information modification.
	* Shared Image: A customized image shared by other JD Cloud & AI users through the image sharing function, the display region is the same as the shared private image. The shared image can only be used to create VM, while the modification of basic information and deletion cannot be performed. If the image owner cancels the sharing, the image will not be displayed on the list and automatically deleted from the list.
	* Marketplace Image: A image provided by the service providers in the cloud marketplace, integrating the running environment or software for different business scenarios to make it easy for users to quickly deploy their businesses.
	
	Users first using JD Cloud & AI can choose the "Public Image" provided by JD Cloud & AI. You can choose the corresponding system and the appropriate version as required. If you have created your own instance and configured the appropriate environment, you can create a private image for this instance, create a batch of instances based on this image with the same system and environment configuration, and share this private image with other JD Cloud & AI users.


6. Instance Type Selection: JD Cloud & AI instance type supports customized selection: Users can select instance types and corresponding configurations according to different business scenarios, please refer to [Instance Type] for details(http://docs.jdcloud.com/en/virtual-machines/instance-type-family).

		Note: If you plan to use the instance template to create an  Availability Group, you should select a second generation instance type, such as g.n2.large when creating the instance template.

7. Storage Selection: JD Cloud & AI provides the cloud disk and local disk.
	
	Cloud Disk: Adopt a multi-backup and distributed storage mode with high data reliability;
	
	Local Disk: A storage device on a physical machine where the VM is located. It can obtain a lower delay, but there is a risk of data loss due to single point of failure.

	Virtual Machines System Disk: Support local disk and cloud disk, where the local disk has 40GB for free, and the capacity cannot be changed. The cloud disk supports 40GB~500GB.

	Virtual Machines Data Disk: If the system disk is a local disk, 8 data disks can be attached. If the system disk is a cloud disk, 7 data disks can be attached. The data disk options include General SSD Cloud Disk, Performance SSD Cloud Disk and Capacity HDD Cloud Disk. After the cloud disk is attached to a VM, it needs to access the Virtual Machines operating system to attach a cloud disk.
	
	You can create an empty data disk of the specified type and capacity with the instance, or you can create a data disk based on an existing cloud disk snapshot (the type of data disk created based on the snapshot does not support adjustment for the time being, and the capacity adjustment range is limited within the snapshot capacity). If the private image you choose contains preset data disk configuration information, then the data disk will be automatically configured according to the device mapping information in the image after selecting a private image. If you only want to use part of the default configuration of the image, you can also delete it (do not support replacing the snapshot on the default configuration, if you want to replace the snapshot, please select the snapshot after deleting the default configuration and adding a new disk separately). For the assignment rules of data disk device name, please refer to Assign Device Name(../Storage/Assign-Device-Name.md).
	
	You can designate the same or different snapshot policies for different cloud disks according to the backup and policy designation of single disk granularity is supported. JD Cloud & AI will automatically and periodically back up your cloud disks according to the designated policies. For details, please refer to [Customized Snapshot Policy](https://docs.jdcloud.com/en/cloud-disk-service/snapshotpolicy).

8. Select Network: <br> Select **VPC** and **Subnet**. After selecting the subnet, you can determine the number of Virtual Machines that can be created under this subnet. If there is no subnet, a new subnet can be created through the quick access and selected in the **Virtual Machines Network**. Please refer to the VPC and subnet for details.        

	You can select the corresponding created security group, which is required, from the default security group or create it from a quick access, please refer to [Security Group Creation](../Security-Group/Create-Security-Group.md) for details, and select in the "Network" configuration after creation.


9. Select EIP Bandwidth:

	The EIP bandwidth provided by JD Cloud & AI is charged by fixed bandwidth and by traffic, the former is charged according to the bandwidth upper limit set when purchasing, which is not related to the real-time access bandwidth to the public network of your instance, and the latter is charged according to the actual traffic of your real-time access to the public network.
    EIP providers are divided into BGP and non-BGP, and BGP is provided for a faster and more efficient network access.        

	Bandwidth Range: 1Mbps~200Mbps, EIP cannot be configured with instance, and you could purchase and associate it after creating instance by instance template.

	The EIP bandwidth cost is independent of the instance cost. Please refer to [Public IP Price](http://docs.jdcloud.com/en/elastic-ip/price-overview) for detailed price information.
**Please note that the instance template service is free of charge. The following billing information is estimated when creating VM instance by instance template.**
	<table>
	   <tr>
	      <td >Instance Billing Methods</td>
	      <td >EIP Bandwidth Billing Methods</td>
	      <td >Cost Estimation</td>
	   </tr>
	   <tr>
		   <td rowspan="2">Pay By Configuration  </td>
	      <td >By Fixed Bandwidth </td>
	      <td > The configuration cost includes instance type (CPU and memory configuration), Cloud Disk (if configured) and elastic IP bandwidth.</td>
	   </tr>
	   <tr>
	      <td >By Traffic </td>
	      <td > Public Network Traffic Cost + Configuration Cost. Among them, the configuration cost includes instance type (vCPU and memory configuration), Cloud Disk (if configured) and elastic IP configuration.           </td>
	   </tr>
	   <tr>
		   <td rowspan="2">Monthly Package  </td>
	      <td >By Fixed Bandwidth </td>
	      <td > The configuration cost includes instance type (vCPU and memory configuration), Cloud Disk (if configured) and elastic IP bandwidth.</td>
	   </tr>
	   <tr>
	      <td >By Traffic </td>
	      <td > Among them, the configuration cost includes instance type (CPU and memory configuration) cost, the cost of Cloud Disk (if configured) and elastic IP configuration.     </td>
	   </tr>
   </table>

10. Configure Login Information:

	The login user name of Windows system is administrator;  the login user name of Linux system is root;    
    
	You can select **Set Now** or **Set Later** during the login password setting, if you choose "Set Later", the system will send a random password by SMS and mail when using the starting template to create VM instance. We recommend that you could change the password through the console after VM instance creation.    
    
	For Linux system, you can also choose the key pair to login and associate the created key pair to conduct safer instance login verification. Please refer to [Key Pair](../Key-Pair/KeyPair-Overview.md) for detailed key pair creation and login help.


The instance template service is free, the information you have configured is displayed on the right side of the create page, and the estimated cost based on the instance template and your configuration is also displayed: Including monthly cost in the case of monthly package and hourly cost in the case of billing by configuration. It includes the cost of the cloud disk and the EIP with billing by fixed bandwidth, the EIP cost should be listed separately if you choose billing by traffic.

11. Configuration of Advanced Option:


	In the Advanced Option, the No Fees for Stopped Instances feature (closed beta) can be set for the instances created based on the enabling template. In the case that the instances in your template meet applicable conditions for the No Fees for Stopped Instances feature, JD Cloud & AI will preferentially set enabling/disabling of the function in accordance with the default status of No Fees for Stopped Instances feature and you can modify the status here as per your actual business situation. For the instances enabling the No Fees for Stopped Instances feature, their vCPU, GPU, memory and local data disk resource will be released and JD Cloud & AI will stop the billing of such instances. When you re-enable such instances, you may fail to enable them due to insufficient inventory of resource database.
	
	In the case that you have enabled the No Fees for Stopped Instances feature in instance template and created instances with Monthly Package as the billing method based on such template, the No Fees for Stopped Instances feature of such instances will automatically become not applicable. This is because you have made one-off payment to fees for using resources for a month, several months or several years during which your resources will not be released and you can use the resources all the way.
	
	For detailed introduction, applicable conditions and other information of the No Fees for Stopped Instances feature, please refer to [No Fees for Stopped Instances](../Instance/uncharged_for_stopped_vm.md).

## Related Reference

[Public IP Price](http://docs.jdcloud.com/en/elastic-ip/price-overview)

[Instance Type](http://docs.jdcloud.com/en/virtual-machines/instance-type-family)

[Key Pair](../Key-Pair/KeyPair-Overview.md)

[No Fees for Stopped Instances](../Instance/uncharged_for_stopped_vm.md)
