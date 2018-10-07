# Determine Configuration Items
After you have successfully registered an account and completed real-name verification, and you ensure that your account balance is sufficient, you need to determine the following configuration items to complete the creation of a Windows VM instance.

* Billing Method:
   
   Provide two billing methods for the Virtual Machines, i.e., **Monthly Package** and **By Configuration**. To avoid that the configuration information related to billing is cleared caused by switching of billing type, please determine the billing method first. Please refer to [Billing Rules](../Pricing/Billing-Rules.md) for details.

* Region and Availability Zone:

	Currently, it covers domestic **cn-north-1 (both available), cn-south-1 (single available), cn-east-1 (single available), cn-east-2 (both available)**, the four multi-available zones. These zones are completed isolated from each other to ensure maximum stability and fault tolerance between them. Please refer to [Region and Availability Zone] for detailed regional information.

	The following points are recommended for reference when selecting a region:

	* Choose the region that is close to your customers to the maximum, which can reduce the access delay and increase the download speed. At the same time, JD Cloud provides BGP EIP in cn-north-1, cn-south-1 and cn-east-2, which can ensure fast access in mainland China. For instance, if most of the users are located near the Pearl River Delta, the cn-south-1 region is a better choice;
	* As for the deployment area of ​​other JD Cloud products and the communication requirements of the instance, by default, cross-region mutual intranet access of the instances cannot be realized and access to other cloud products, such as the cloud database and cloud cache, cannot be realized neither. The instance only supports associating the EIP and Load Balancer under the same region.
(The above mutual intranet access refers to the resources access under the same account, and the resource intranets of different accounts are completely isolated).

* Creation Method:
   
   There are three methods to create: **Create Customized Instance**, **Create Instance by Instance Template**, **Create Instance in Availability Group**.
    * Create Customized Instance: customize all instance configuration items.
    * Create Instance by Instance Template: quickly create an instance based on the preset configuration of the established instance template. Please see [Instance Template](../Operation-Guide/Instance-Template/Instance-Template-Overview.md) for details.
    * Create Instance in Availability Group: quickly create an instance based on the available zone and instance template specified by the established Availability Group. Please see [Availability Group](../../Availability-Group/Introduction/Product-Overview.md) for details.
* Image:
   
   It provides **Public Image**, **Private Image**, **Shared Image** and **Marketplace Image**.
   
   * Public Image: It is provided and maintained by JD Cloud, which provides basic operating system, initialization components and some pre-installed software, and supports multiple released versions of Linux and Windows, thus it is available to all users.
   * Private Image: It is a customized image created based on the user's VM instance. You can create the image for a machine deployed with businesses and quickly create multiple machines with the same configuration and software environment based on this image. You can share the private image with other JD Cloud users, and the shared image will be displayed in the shared image list of the target user in the same region. The private image is only available to the owner and the specified shared accounts.
   * Shared Image: a user-defined image shared by other JD Cloud users through the image sharing feature. The shared image can only be used to create VM instance under the same region, while the basic information modification and deletion cannot be performed. If the shared user cancels the sharing, the image will be automatically deleted from the list.
   * Marketplace Image: It is provided by the service provider in the cloud marketplace, which integrates the running environment or software for different business scenarios, so that users can quickly deploy services and all users can use it. It is applicable to all users.       
* Specifications:
    
    It provides for instance types, i.e., **General**, **Compute**, **Memory Optimized**, **High Frequency Compute** from the minimum specification 1C1GB (such as g.s1.micro) to the maximum specification 72C576GB (such as M.n2.18xlarge). You can select the instance type of the optimal CPU memory ratio according to different application levels. Please see [Instance Type](../Introduction/Instance-Type-Family.md) for details.
* Storage:
    
    JD Cloud provides cloud disk and local disk. A local disk is a storage device on a physical machine where the cloud server is located. It can obtain a lower delay, but there is a risk of single point data loss. The Cloud Disk Service adopts a multi-backup and distributed storage mode with high data reliability. The Cloud Disk Service provides **SSD Cloud Disk** and **Premium Hdd Cloud Disk** to be used as the system disk and data disk for the instance. Please see [Cloud Disk Service Type] for details.
    
    * System Disk: Support local disk, SSD Cloud Disk and Premium Hdd Cloud Disk, among which the local disk has a default capacity of 40G for free, and capacity of the Cloud Disk Service is set by yourself.
    Data Disk: It supports eight attachments for the most and supports SSD cloud disk and Premium Hdd cloud disk, and the capacity can be set by yourself.
    
   Different types of cloud  disk support different capacity ranges:
   
   * Premium Hdd Cloud Disk as a Data Disk: 20G~3,000G.                
   * SSD Cloud Disk as Data Disk: 20G~1,000G. 
 
* Networking:
    * Virtual Private Cloud and Subnet: You can plan and create a private Virtual Private Cloud and subnet first. If not, it supports using the default VPC and subnet created automatically by the system. Please see [Virtual Private Cloud](http://docs.jdcloud.com/cn/virtual-private-cloud/product-overview) and [Subnet](http://docs.jdcloud.com/cn/virtual-private-cloud/subnet-features) for details.
    * Private IP: It is the specified private IP address of main network card of the Virtual Machines, which can be specified in the number of available IPs in the selected subnet. If there is no special requirement, it can be allocated automatically by the system. Once the intranet IP is allocated to the Virtual Machines, it cannot be changed.
    * Security Group: You can create a security group that meets the identity and access management under each Virtual Private Cloud. If not, it supports to associate one from the three security group modules created automatically by the system. Please see [Security Group Overview](http://docs.jdcloud.com/cn/virtual-private-cloud/security-group-features) for details.
 
 * Bandwidth:
   
	If an instance needs to access to the public network, you can associate an elastic IP to the instance, or you can purchase to associate after the instance is created. The elastic IP supports to associate and disassociate with the instance at any time.
    
    * Billing by Bandwidth: It supports billing **By Fixed Bandwidth** and **By Traffic**.  If to select billing by bandwidth, the EIP billing type is consistent with the instance billing type, and if to select billing by traffic, the elastic IP billing type is separate from the instance billing type. Please see [Elastic IP Billing Rules](../../../Networking/Elastic-IP/Pricing/Billing-Rules.md) for details.
    * IP Provider: **BGP** and **Non-BGP**. Currently, both IP providers are available in cn-east-1 and cn-south-1 regions, while in cn-north-1 and cn-east-2 regions, only BGP IP is available.  compared to non-BGP (single line) IP, BGP IP has a more stable access speed and can not be changed after the line is selected. It is recommended to choose BGP IP as a priority.
    * Bandwidth Cap: As for public network **Output Traffic (instance to public network direction) Bandwidth Cap**, IP billing by fixed bandwidth will be charged and the rate will be limited according to the bandwidth cap you set, while only rate of IP billing by traffic will be limited according to band width cap you set. You can adjust the bandwidth cap at any time based on your traffic needs, and the new cap will take effect immediately.

* Basic Information:
    * Name: Name of the instance shall be filled in according to the naming notations, which cannot be blank but can be modified after creation.
    * Description: You can choose to add a description to the instance.

* Login Information:
    * Username: It is set automatically according to the selected operating system. Windows system defaults to **Administrator**, and Linux system defaults to **root**.
    * Password Setting: Password is used for remote login and console VNC login. You can select **Set Now** or **Set Later** (the system will send the default password by SMS and email). After the instance is created, it can be modified.


* Purchase Quantity:
   
   After selecting all the configuration parameters, user needs to determine the instance quantity to be purchased, which is limited to your Virtual Machines, Cloud Disk Service and EIP quota as well as the remaining IP quantity of the subnet you have selected. If the quota is not enough, you can increase it via [Open Ticket](https://ticket.jdcloud.com/myorder/submit). 

After knowing how to set the above configuration items, you can create a Windows VM instance in the console by referring to the next document.

## Related Reference

[Billing Rules](../Pricing/Billing-Rules.md)

[Region and Availability Zone]

[Instance Template](../Operation-Guide/Instance-Template/Instance-Template-Overview.md)

[Availability Group](../../Availability-Group/Introduction/Product-Overview.md)

[Instance Type](../Introduction/Instance-Type-Family.md)

[Cloud Disk Service Type](http://docs.jdcloud.com/cn/cloud-disk-service/specifications)

[Virtual Private Cloud](http://docs.jdcloud.com/cn/virtual-private-cloud/product-overview)

[Subnet](http://docs.jdcloud.com/cn/virtual-private-cloud/subnet-features)

[Security Group Overview](http://docs.jdcloud.com/cn/virtual-private-cloud/security-group-features)


[Elastic IP Billing Rules](../../../Networking/Elastic-IP/Pricing/Billing-Rules.md)




