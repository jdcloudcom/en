# Product Overview

ENI is a virtual network interface, making ENI can be associated on the VM to connect the VM to different networks. The ENI is applicable in building application scenarios such as business traffic separation, multiply businesses hosting and network high availability. The JD Cloud ENI is region-level, which can be associated to any availability zone VM in the virtual private cloud. Each VM can be associated with multiple ENIs, and the associated number depends on the instance type of VM.

The ENI mainly has the following features:

* Multiple network interfaces and multiple IPs: based on the instance type of VM, each VM of JD Cloud can be associated with multiple ENIs, and each ENI can be assigned with multiple private IP addresses. At the same time, each private IP address can be connected with one Elastic IP address.

* Elastic plugging: The JD Cloud ENI is region-level, which can be associated to any availability zone VM in the virtual private cloud. In case of failure, the ENI can be disassociated from the failed VM and migrated to another standby VM.

* Business security: each VM of JD Cloud can be mounted with multiple under the subnet, and the traffic of specific business can be hosted by specific ENI. Different ENIs can be independently associated with different security groups, which applied to different security group policies, thus improving the security of the business traffic.

* Routing control: Each VM of JD Cloud can be mounted with ENI with different subnets in the same virtual private cloud, and each subnet can be set with identity and access management policies and routing forwarding policies respectively. By matching the internal routing configuration tools of VMs, accurate control of network traffic can be realized.

## Common Operation

- Management of ENI
	- [Create ENI](../Operation-Guide/Elastic-Network-Interface-Management/Create-Elastic-Network-Interface.md)
	- [Delete ENI](../Operation-Guide/Elastic-Network-Interface-Management/Delete-Elastic-Network-Interface.md)
	- [Associate ENI](../Operation-Guide/Elastic-Network-Interface-Management/Associate-Elastic-Network-Interface.md)
	- [Disassociate ENI](../Operation-Guide/Elastic-Network-Interface-Management/Disassociate-Elastic-Network-Interface.md)
	- [Enable Deletion on Instance Termination](../Operation-Guide/Elastic-Network-Interface-Management/Enable-Delete-with-VM.md)
	- [Cancel Deletion on Instance Termination](../Operation-Guide/Elastic-Network-Interface-Management/Disable-Delete-with-VM.md)
- Management of private IP
	- [Assign Private IP](../Operation-Guide/Private-IP-Management/Assign-Secondary-IP.md)
	- [Release Private IP](../Operation-Guide/Private-IP-Management/Unassign-Secondary-IP.md)
	- [Associate Public Network IP](../Operation-Guide/Private-IP-Management/Associate-Elastic-IP.md)
	- [Disassociate Public Network IP](../Operation-Guide/Private-IP-Management/Disassociate-Elastic-IP.md)
- Management of security group
	- [Add Security Group](../Operation-Guide/Security-Group-Management/Associate-Security-Group.md)
	- [Remove Security Group](../Operation-Guide/Security-Group-Management/Disassociate-Security-Group.md)
- VM configuration
	- [Linux system temporary configuration](../Operation-Guide/VM-Configuration/Linux-Temporary-Configuration.md)
	- [Linux System Permanent Configuration](../Operation-Guide/VM-Configuration/Linux-Temporary-Configuration.md)

## Billing
The ENI service is free, and the elastic IP associated with the ENI is charged independently. For details, refer to: [Billing Instructions](../Pricing/Billing-Overview.md)
