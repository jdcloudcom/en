## **VPC**

### Basic Concept

JD Virtual Private Cloud (hereinafter referred to as VPC) is the logically isolated cyberspace which you customize on the JD public Cloud. It is similar with the traditional network which you built in data center. This private cyberspace is completely controlled by the user and supports the customized division of the network segment and route policy, etc. Users can create and manage multiple cloud products in VPC, such as VMs, load balancers, etc., and configure resources within the network to connect to the Internet. In addition, you can get through your IDC intranet and JD VPC by VPN tunnel, to realize hybrid cloud deployment of applications and enable the applications to migrate to the cloud smoothly.

JD Cloud & AI VPC provides you with the following functions:

- Creating VPC and customizing the division of network segmentation, IP addresses and route policies, etc. can be realized through console and API
- Flexible access to the Internet can be realized through the manners of EIP and NAT Instance, etc.
- Subnet-level access control can be realized through network ACL.
- Instance-level access control can be realized through security group.

When creating a VPC, users can designate the IP address range for the VPC by Classless Inter-Domain Routing (CIDR, e.g. 10.0.0.0/16) or choose not to preset CIDR (then the VPC range will change dynamically with the CIDR range of the Subnet created therein). When you create a VPC supporting IPv6, JD Cloud & AI will provide you with (/56) IPv6 CIDR of fixed size, so you are unable to choose the IPv6 CIDR range. Since the Virtual Private Cloud is limited by regions, you cannot create cross-region VPCs. IP address blocks among different VPCs can be overlapped.



### IP Address of the VPC

You can realize the overall IP division of the VPC and subnet by specifying the CIDR (classless inter-domain routing). In JD Cloud & AI VPC, IP addresses which can be used by the users are divided into two categories:

- IP address of intranet, which is the IP address automatically assigned to the resources in VPC. The range shall be the address field of the VPC specified by RFC1918. Private IP address belongs to overlap IP. It can be used for the intercommunication between the resources in VPC and it cannot perform Internet communication directly.
- IP address of EIP, which can be independently applied by the user. It supports the dynamic associating and dissassociating with the resources. IP address of EIP is the only EIP address in the world and can be used for the communication between resources and the Internet.



### **CIDR**

CIDR (Classless Inter-Domain Routing) is the independent address block in cyberspace specified by the user. The division for the address can be realized through the combination of prefix and mask. Take 10.1.0.0/16 as an example. If the 10.1.0.0 on the left side of the slash is prefix and the 16 on the right side of the slash is mask, the size of the network block can be adjusted by setting the size of the mask. The quantity of IP included by the network block of the VPC is 2^(32-mask), thus the 10.1.0.0/16 network block contains up to 65536 IP addresses.

Matters required attention when planning CIDR:

- When creating the VPC, it can choose that whether to specify the CIDR or not. If you have deep understanding of the network or are uncertain about the future development of the network, it is recommended to create the VPC without CIDR.
- CIDR of the subnet must be part of its VPC CIDR.
- Currently, the Virtual Private Cloud supports private IPs of IPv4 in three segments: 10.a.0.0/16 (a is from 0 to 255), 172.b.0.0/16 (b is from 16 to 31), 192.168.0.0/16.
- Currently, mask of the VPC and subnet CIDR support the value of 16-28.
- VPCs supporting IPv6 addresses do not support customized CIDR. JD Cloud & AI will provide (/56) IPV6 CIDR of fixed size

Please see more details of CIDR at: <https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing>
