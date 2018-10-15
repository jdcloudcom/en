# Network Overview
## Network Environment

[Virtual Private Cloud](http://docs.jdcloud.com/cn/virtual-private-cloud/product-overview)(Virtual Private Cloud, VPC) provides the logic-isolated network space customized for you by JD Cloud, which is similar to the traditional network you set up in the data center. This Virtual Private Cloud space is completely controlled by users, and supports customized network segmentation and routing policies, etc. Users can create and manage multiple cloud products in VPC, such as VM instance, Load Balancer, etc., and configure resources within the network to connect to the Internet. In addition, you can access your IDC intranet and JD cloud network through VPN/Direct Access to achieve multicloud deployment of applications and smooth migration of applications to the cloud.

## Elastic IP

An elastic IP address is a EIP address that can be independently applied. It can be dynamically associated and disassociated with resources such as VM instance, Load Balancer, and NFV instance. The main function of the elastic IP is to shield the instance fault. In the manual configuration mode, when the instance fails, the elastic IP can be drifted to the redundant instance to achieve the purpose of quickly responding to the fault.

**Completely Elastic: **The EIP provided by JD Cloud is all elastic IP. Whether you purchase an elastic IP address independently or purchase an elastic IP address when you purchase other resources such as an instance, you can change the associated relationship between the elastic IP and the cloud resource at any time.

**Support multiple resource bindings: **Elastic IP supports binding to cloud resources such as VM instance, Load Balancer, and NFV instance to provide public network access for cloud resources.

**Supports multiple billing types: **Elastic IP supports three billing types, including monthly package billing, pay by configuration and pay by consumption. Users can select the appropriate billing type according to actual business needs.

**Flexible bandwidth adjustment: **Elastic IP supports bandwidth adjustment. Users can change the bandwidth at any time according to the change of service traffic demand, and the modification will take effect immediately.

## Elastic Network Interface

**Elastic Network Interface**(http://docs.jdcloud.com/cn/elastic-network-interface/product-overview) is a virtual network interface, you can bind the elastic network interface on the instance to connect the instance to different networks. Elastic network interface can be used to support application scenarios such as separation of service traffic, multi-service bearer, and network availability.

JD Cloud provides an elastic network interface with no availability zone attribute. The elastic network interface can be associated to any instance of the VPC. A single instance can be associated to multiple elastic network interfaces, the number of which depends on the instance type.

## Network Access


**Public Network Access:** The elastic IP provided by JD Cloud is associated with your account, and can be associated with resources such as any instance and NAT Gateway in the same region to implement the internet access of the instance. Adjust the bandwidth and change the binding instance in actual use. JD Cloud provides up to 2GB of DDoS protection for elastic IP for free, without any defense against network attacks.

**Intranet Access:** Instances deployed on JD Cloud can access each other through private IP, and networks in different regions and different users are isolated from each other.

## Network Interface Multi-Queue
There is bottleneck for a single vCPU when handles the network interruption. You can configure the network interface multi-queue to distribute the network interface interruption in the instance to different vCPUs so as to improve network processing performance.

## Related Reference

[VPC](http://docs.jdcloud.com/cn/virtual-private-cloud/product-overview)

**Elastic Network Interface**(http://docs.jdcloud.com/cn/elastic-network-interface/product-overview)

