## Basic Business on the Cloud

Scenario: You can create different subnets in the private network. The entire Web layer is placed in a subnet. The elastic IP/NAT gateway is configured to communicate with the Internet. The logical layer is placed in one subnet separately, and the data layer is placed in another subnet. Traffic between subnets is controlled by the network ACL. This safe and flexible deployment support  your application to access the Internet, and also ensure the security of the database server. More connectivity needs can be achieved through VPC Peering, dedicated line services, VPN and more.

Recommended Configuration: VPC, subnet, VM, RDS, Cloud Buffer, EIP, network ACL, security group

![](/image/Networking/Virtual-Private-Cloud/Basic-Business-Into-Cloud.png)