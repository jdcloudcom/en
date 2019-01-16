# Network Configuration

Function is deployed on the public network by default and cannot access resources in the VPC.

 
**Configure Function to access VPC resources**

Usually, you create resources within JD Cloud VPC so that these resources are not accessible over the public Internet. By default, resources in VPC cannot be accessed through Function.

If your Function wants to access resources in the VPC, such as databases, Redis, and other products or services, you must provide configuration information for both Virtual Private Cloud and Subnets.

**Please note the following notes:**

When you add the VPC configuration to the Function, it can only access resources in that VPC. If Function accesses both VPC resources and the public Internet, then there must be an internal network address translation instance (NAT) instance in the VPC. For details, please refer to JD Cloud [NAT Instance Gateway](https://docs.jdcloud.com/cn/virtual-private-cloud/nat-instance-gateway).
