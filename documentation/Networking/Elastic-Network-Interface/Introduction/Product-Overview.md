# Product Overview

An elastic network interface (referred to as ENI in this documentation for short) is a type of virtual network interface in JD Cloud. A virtual machine can be attached with multiple elastic network interfaces to obtain the ability to access different networks. ENI is an essential building block in scenarios of business traffic separation, multi-business hosting and high availability applications. JD Cloud ENI is a regional elastic network interface, and it can be attached to a virtual machine in any availability zone in the same VPC. Each virtual machine can be attached with multiple elastic network interfaces, and the ENI quota per VM depends on the instance type of the virtual machine.

The primary features of JD Cloud ENI are described as following: 

* **Multi-ENI and Multi-IP**: Per the instance type of a virtual machine, each JD Cloud VM can be attahced with a variable number of ENIs and each JD Cloud ENI can be assigned with a variable number of private IP addresses. Concurrently, each private IP address can be associated with an elastic IP address.

* **Elastic Plugging**: JD Cloud ENI is a regional elastic network interface and it can be attached to a virtual machine in any availability zone in the same VPC. In case of failure, the ENI can be detached from the failed virtual machine and migrated to another backup virtual machine for the purpose of business recovery.

* **Business Security**: A JD Cloud VM can own multiple elastic network interfaces, and each ENI attached to this virtual machine will carry specific business traffic. Each ENI can also be associated with security groups with different rules independently, therefore enhancing business traffic security.

* **Route Control**: Currently, a JD Cloud VM can be attached with multiple elastic network interfaces of different subnets in a same VPC. Each subnet can provisioned with access control lists and routing policies independently. In conjunction with routing configuration tools inside virtual machines, ENI can assist in the accurate control of network traffic.

## Common Operations

- ENI Management
	- [Create ENI](../Operation-Guide/Elastic-Network-Interface-Management/Create-Elastic-Network-Interface.md)
	- [Delete ENI](../Operation-Guide/Elastic-Network-Interface-Management/Delete-Elastic-Network-Interface.md)
	- [Attach ENI](../Operation-Guide/Elastic-Network-Interface-Management/Attach-Elastic-Network-Interface.md)
	- [Detach ENI](../Operation-Guide/Elastic-Network-Interface-Management/Detach-Elastic-Network-Interface.md)
	- [Enable Deletion on Instance Termination](../Operation-Guide/Elastic-Network-Interface-Management/Enable-Delete-with-VM.md)
	- [Disable Deletion on Instance Termination](../Operation-Guide/Elastic-Network-Interface-Management/Disable-Delete-with-VM.md)
- Private IP Management
	- [Assign Private IP](../Operation-Guide/Private-IP-Management/Assign-Secondary-IP.md)
	- [Release Private IP](../Operation-Guide/Private-IP-Management/Unassign-Secondary-IP.md)
	- [Associate EIP](../Operation-Guide/Private-IP-Management/Associate-Elastic-IP.md)
	- [Disassociate EIP](../Operation-Guide/Private-IP-Management/Disassociate-Elastic-IP.md)
- Security Group Management
	- [Add Security Group](../Operation-Guide/Security-Group-Management/Associate-Security-Group.md)
	- [Remove Security Group](../Operation-Guide/Security-Group-Management/Disassociate-Security-Group.md)
- Virtual Machine Configuration
	- [Linux System Temporary Configuration](../Operation-Guide/VM-Configuration/Linux-Temporary-Configuration.md)
	- [Linux System Permanent Configuration](../Operation-Guide/VM-Configuration/Linux-Permanent-Configuration.md)

## Pricing
JD Cloud ENI is a free service, and the Elastic IP associated to the ENI is charged independently. For more detailed information, click and view [Billing Instructions](../Pricing/Billing-Overview.md).
