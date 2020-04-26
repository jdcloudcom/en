# View instance details

One Bastion instance corresponds to one bastion system which independently runs. You can view all of your instances via Console.
* [Instance List Page](Instance-Info#user-content-2): Yes can view the information of all instances under each region, including ID, Availability Zone, Public IP/domain address, etc.
* [Instance Details](Instance-Info#user-content-3): You can view details of specified instance.

<div id ="user-content-2"></div>

## Instance List Page

1. Access [Bastion Console](https://bastion-console.jdcloud.com/list), i.e., enter the Instance List Page. Or, access [JD Cloud & AI Console](https://console.jdcloud.com) and click **Cloud Service** - **Monitoring, Operation and Maintenance** - **Bastion** on the navigation bar on the header to enter the Instance List Page.
2. Select a region.

![](/image/Bastion/instance-list.png) 

	Yes can view the information of all instances under each region, including instance ID, Availability Zone, Public IP/domain name, status, specification, expiration time, etc.
		

Table 1 Parameter Description of Instance List
Parameter   |Description   
:------- |:---    
Instance ID|Unique identifier ID of instance, automatically generated and cannot be edited
Availability Zone|Region of Available Instance      
Public IP/Domain|Log in Public IP and domain of Bastion
Status|Current Running Status of Instance
Specification|Specification of Purchased Instance
Expiration Time|Service Expiration Time
Operation|Instance Management Operation. Management: Via the management button, you can enter the Bastion system. Disable/Enable: After the instance is disabled, the user cannot log in the resource machine via Bastion. Such login can be enabled until the instance is enabled again. More: Renew and upgrade specification.

<div id ="user-content-3"></div>	

## Instance Details

1. Access [Bastion Console](https://bastion-console.jdcloud.com/list), i.e., enter the Instance List Page. Or, access [JD Cloud & AI Console](https://console.jdcloud.com) and click **Cloud Service** - **Monitoring, Operation and Maintenance** - **Bastion** on the navigation bar on the header to enter the Instance List Page.
2. Select a region.
3. Select instances for which you need to view detailed information in an instance list, click the instance ID to enter the Details.

You can view the instance information below:

* Basic information: instance ID, region, availability zone, billing type, creation time and expiration time
* Configuration information: specification and hard disk
* Network information: VPC, subnet and Public IP
* Configuration information of Security Group: Public IP and Private IP of the containers corresponding to the Bastion instances can be used for setting rules of Security Group. There are several containers corresponding to high availability versions.

You can redirect from the Instance Details to the Instance Monitoring and Alarm Details and others to view relevant information.




