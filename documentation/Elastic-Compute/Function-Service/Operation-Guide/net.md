# Network Configuration

Function is deployed on the public network by default and cannot access resources in VPC.

 
**Configure Function to access VPC resources**

Usually, you create resources within JD Cloud VPC so that these resources are not accessible over the public network. By default, resources in VPC cannot be accessed through Function.

If your Function wants to access resources in VPC, such as databases, Redis and other products or services, you must prepare VPC and Subnet information in advanced configuration of function attribute.

**Please note the following notes:**

When you add the VPC configuration to the Function, it can only access resources in that VPC. If Function accesses both VPC resources and the public Internet, then there must be an internal network address translation instance (NAT) instance in the VPC. For details, please refer to JD Cloud [NAT Instance Gateway](https://docs.jdcloud.com/en/virtual-private-cloud/nat-instance-gateway).
