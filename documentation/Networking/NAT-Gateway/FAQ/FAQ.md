# FAQ

**Q: Main Difference between NAT Instance and NAT Gateway**

A: Main difference between NAT Instance and NAT Gateway are shown in the following table

| Attribute | NAT Gateway | NAT Instance |
| :- | :- | :- |
| High Availability | AZ High Availability. NAT Gateway in each Availability Zone adopts redundant implementation. Creation of one NAT Gateway in each Availability Zone can ensure that the architecture does not depend on the Availability Zone. | Use failover between script management instance. |
| Bandwidth | Largest 4Gbps | Elastic IP bandwidth, can be configured into 200M |
| Maintenance | Managed by JDcloud. Maintenance by customer is not required. | Managed by the customer, e.g. customers install software updates or operating system patches on the instances by themselves. |
| Performance | Software is optimized to handle NAT traffic. | Configure to execute the image of NAT.|
| Cost | Depend on the number of used NAT Gateways, the length of use time, and the configuration of NAT Gateway. | The cost depends on the number of NAT Gateways you use, the length of use time, and the type and size of instance. |
| Type and size | Select the Gateway to be created according to specifications (large, medium and small) and bandwidth (1Mbps to 1Gbps). | Select the appropriate instance type family and size based on your predicted workload. |
| Public IP Address | Automatically apply for Public IP Address when creating to connect with NAT Gateway. Disassociate and release Public IP while deleting NAT Gateway. Public IP and NAT Gateway share the same life cycle, so the disassociation is not allowed. The NAT instance uses Elastic IP Address or Public IP Address. | Associate new Elastic IP Address and instance to change Public IP Address. |
| Private IP Address | Select from the IP address range of the subnet automatically when creating the gateway.| Assign a specific private IP address from the IP address range of the subnet when enabling the gateway.|
| Security Group | Unable to associate with NAT Gateway. Security Groups can be associated with resources behind NAT Gateways to control inbound and outbound traffic. | Associate your NAT instance resources with resources behind NAT instance to control inbound and outbound traffic. |
| Network ACL | Use Network ACL to control traffic to and from the subnet where your NAT gateway resides. | Use Network ACL to control traffic to and from the subnet where your NAT gateway resides.|
| Flow Log | Not Support Now | Use Flow Log to capture traffic.|
| Port Forwarding | Not Support. | Manually customize the configuration to support port forwarding. |
|Traffic Indicator | Please refer to [NAT Gateway Monitoring Indicator](../Operation-Guide/View-Nat-Gateway-Monitoring/View-Nat-Gateway-Monitoring.md) for details|View the monitoring indicators for the instance. |
| IP Shard | Not Support | Support IP fragment of restructured UDP, TCP and ICMP protocol.|
| ALG | icmp Support | Others are not currently supported Determined by NAT instance mirroring |

**Q: How to do network IAM on NAT Gateway**

A: NAT Gateway does not support Security Group. Network IAM can be performed by configuring ACL of Subnet where NAT Gateway resides or Security Group and ACL of backend Virtual Machines



**QWhat are precautions for deploying NAT Gateways**

A: NAT Gateways and Virtual Machines using NAT Gateways shall not be deployed in the same Subnet. After completion of NAT Gateway deployment, update Route Table before using NAT Gateway. Public IP of the NAT Gateway cannot be disassociated.



**Q: Can multiple routes to the same NAT Gateway be configured in one Route Table**

A:  Yes, but segments of multiple routes cannot be the same.



**Q: How does NAT Gateway carry out billing**

A: The billing of NAT Gateway is divided into two parts, including gateway cost (billed by hours) and cost of accessing public network bandwidth of Internet (billed by configuration). Please refer to [Product Pricing](../Pricing/Price-Overview.md) for specific billing information
