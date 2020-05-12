# Use Restrictions

#### Relevant Restrictions on VPC

- VPCs have geographical attributes and do not support cross-regional deployment, such as across the regions of cn-east-2 and cn-north-1.
- VPCs do not support multicast or broadcast.
- VPC can contain multiple subnets. The network blocks of each subnet are the subset of the VPC’s CIDR. CIDR network blocks of multiple subnets cannot overlap.
- The first address of the subnet CIDR is the network address; the last address is the broadcast address; the second and third IP addresses have been reserved by JD Cloud for network management. For example, the CIDR of the subnet is 10.1.0.0. /24. Wherein, 10.1.0.0 is the network address, 10.1.0.255 is the broadcast address AND 10.1.0.1 & 10.1.0.2 are reserved by JD Cloud, therefore the users cannot use them. Hence, the quantity of the available IPs of this subnet is 252.



#### Relevant Restrictions on Subnet

- After the subnet is created, the CIDR network cannot be modified.
- The first address of CIDR is the network address; the last address is the broadcast address; the second and third IP addresses are reserved by JD Cloud & AI for network management. For example, the CIDR is 10.1.0.0/24, in which 10.1.0.0 is the network address, 10.1.0.255 is the broadcast address, and 10.1.0.1 and 10.1.0.2 are reserved by JD Cloud & AI and cannot be used by users. Therefore, the available IP count of this subnet is 252.
- The intranet among resources of Edge Subnet and Standard Subnet is not connected and the intranet among resources of different edge zones is not connected.



#### Restrictions of Route Table

- Each subnet must be associated with one route table and each route table can be associated with multiple subnets;
- The default route table and the customized route table which has been associated with the subnet cannot be deleted;
- Default Local route rules cannot be edited and deleted;
- Dynamic route protocols are not supported;



#### Restrictions of VPC Peering Connection:

- If you want to enable the real communication between the two ends of the peering connection, you must ensure that the relevant route rules are configured on the related route table of the local end and the opposite end.
- Currently, it only supports the VPC peering connection between the VPCs in the same region.
- VPC CIDR on both ends of the peering connection cannot overlap. If overlap is created, errors will be reported.
- Peering connection can interrupted  by both ends at any time. The traffic between the two VPCs will be interrupted immediately after the interruption.
- There is no bandwidth upper limit for peering connection in the same region.



#### Relevant Restrictions on Independent Edge Zone

- Products supported in independent edge zone: Edge Subnet, Edge Elastic IP, ACL, Security Group, Route Table, Local Storage Virtual Machines, Virtual Machine and SSH Key Pair; products not supported include NAT Gateway, LB, BGW, VPN and Native Container.
- Route Table can only associate with multiple Standard Subnets or associate with Edge Subnets with the same independent edge zone.
- The intranet among resources of Edge Subnet and Standard Subnet that associate with independent edge zone is not connected and the intranet among resources of different independent edge zones is not connected.



#### Quota of VPC’s Related Resource

| Resources 	| Restrictions 	| Exceptional Application Method 	|
| :-: | :-: | :-: |
|Quantity of VPCs in the same region 	|10	| Ticket 	|
|Range of VPC CIDR Mask 	|16 to 28	| Ticket 	|
|Range of subnet CIDR Mask 	|16 to 28	| Unchangeable 	|
|Quantity of ACLs in the same VPC	|20	| Ticket 	|
|Number of Subnets in each of the VPCs	|10	| Ticket	|
|Quantity of two-way rules for each ACL (inbound + outbound) 	|100	| Ticket 	|
|Quantity of ACL which can be associated with each subnet 	|1	| Unchangeable 	|
|Quantity of security groups in the same VPC	|50	| Ticket 	|
|Quantity of two-way rule in each security group (inbound + outbound) 	|100	| Ticket 	|
|Quantity of security groups which can be associated with each machine’s instance 	|5	| Ticket 	|
|Quantity of route tables in the same VPC	|10	| Ticket 	|
|Quantity of route tables that can be associated with each subnet 	|1	| Unchangeable 	|
|Count of static route rules of each Route Table	|50	| Ticket	|
|Count of transmission route rules (including quantity of invalid transmission routes) of Each Route Table	|100	| Ticket	|
|Quantity of VPC peering connections which can be created by each VPC 	|10	| Ticket 	|
|Quantity of VPC peering connections which can be created between the same two VPCs 	|1	| Unchangeable 	|


