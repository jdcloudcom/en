## **Route Table**

### Basic Concept

Route table is the set of a series of route rules and it is used to control the outward direction of the traffic from the subnets in VPC. JD Cloud has two types of route tables: Default route table and customized route table. The route table automatically created when VPC is created is a default route table. The route table actively created by users is a customized route table. Each subnet must be associated with a route table and can only be associated with one route table. Each route table can be associated with multiple subnets.

Route table is composed of a series of route policies. Route policy is composed of route’s destination, the type of next hop and the address of next hop. The options supported by next-hop’s type are: Internet and VM. Among which, Internet is used for the access of EIP. The instance which perform Internet communication through EIP must be configured with this route. VM can be used as the gateway of EIP. Please visit Internet for details.



### **Default Route Table**

The route table automatically created when the VPC is created is the default route table. The default route table occupies one quota of the route table. The default route table has two route policies by default:

1. Local rule for the access of VPC’s intranet;

2. Internet rule for the access of Internet;

Default route table cannot be deleted.

Route policy of the default route table can be edited, added, or deleted. The two default route policies cannot be deleted. Local rule cannot be edited.



### Customized Route Table

The route table actively created by the user is the customized route table. Customized route table deems that there is one route policy by default: Local rule for the access of VPC’s intranet.

The customized route tables associated with subnets cannot be deleted.

The route policy with customized route table can be edited, added and deleted. The default Local route policy cannot be edited or deleted.



### **Associated Route Table**

Each route table can be associated with multiple subnets in the same VPC. Each subnet can only be associated with one route table. You can modify the associated route table on the side of subnet or modify the associated subnet on the side of route table.



### Route Policy

Route policy is used to control the route path of the data packet in subnet. It is divided into the default route policy and customized route policy. Each route policy contains three parameters:

- Destination End: Description of the destination network segment (only the format of network segment is supported. If you want the destination end to be the single IP, you can set the mask code to `32` (for example: `192.168.10.10/32`). If the destination end is the network segment in VPC where the route table is located, this route policy will be overwritten by the Local rule, and the data packet will be routed according to the Local rule.
- Next Hop Type: VPC’s data-packet exit. The type of next hop supports the types such as "Internet" and "VM", etc.
- Next Hop: Specify the specific address of route’s next-hop.

> Remarks: In all route tables, there is a default Local route policy, which means that the intranets of the VPC are interconnected. Its route rule is [ Local，Local，Local ], and this route rule cannot be modified or deleted.



### **Route Policy Priority**

When there are multiple route policies in route table, from the highest to the lowest, route priority is respectively as follows:

- Internal Traffic of the VPC: Internal traffic of the VPC will be matched first;
- Precise Route: The one which is not the internal traffic of the VPC shall be matched according to the most accurate route policy;

E.g: If a VM in VPC is associated with the elastic IP and it is also in the subnet associated with NAT gateway (in route table, the next hop setting the access Internet traffic of this subnet is the NAT gateway), then the traffic, which this VM accesses to the Internet, will all be realized through NAT gateway. Because the priority of the most accurate route is higher than EIP.



### **Billing Mode**

Route table is completely free. 
