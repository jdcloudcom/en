## **Route Table**

### Basic Concept

Route table is the set of a series of route rules and it is used to control the outward direction of the traffic from the subnets in VPC. JD Cloud has two types of route tables: Default route table and customized route table. The route table automatically created when VPC is created is a default route table. The route table actively created by users is a customized route table. Each subnet must be associated with a route table and can only be associated with one route table. Each route table can be associated with multiple subnets.

Route table is composed of a series of route policies. Route policy is composed of route’s destination, the type of next hop and the address of next hop. The options supported by next-hop’s type are: Internet and VM. Among which, Internet is used for the access of EIP. The instance which perform Internet communication through EIP must be configured with this route. VM can be used as the internet gateway.Please visit Internet for details.



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

- Destination End: Description of the destination network segment (only the format of network segment is supported. If you want the destination end to be the single IP, you can set the subnet mask code to `32` (for example: `192.168.10.10/32`). If the destination end is the network segment in VPC where the route table is located, this route policy will be overwritten by the Local rule, and the data packet will be routed according to the Local rule.
- Next Hop Type: VPC’s data-packet exit. The type of next hop supports the types such as **Internet** and **VM**, etc.
- Next Hop: Specify the specific address of route’s next-hop.

> Remarks: In all route tables, there is a default Local route policy, which means that the intranets of the VPC are interconnected. Its route rule is [ Local，Local，Local ], and this route rule cannot be modified or deleted.

### **Route Transmission**

  The route transmission is the route rule obtained other than by means of manual configuration, such as route information that is obtained by synchronizing, automatically updating or forwarding information in Route Table of different gateway entities (such as Route Gateway and Border Gateway where VPC Route Table is located) via internal working mechanism.

  Dynamic transmission with two-way routing can be realized between VPC Route Table and Border Gateway Route Table:

  Border Gateway->Route transmission to VPC direction: When the VPC Route Table configures route transmission, select the source Border Gateway of route transmission and fill in the scope of route transmission. After the transmission relation is created, the system will automatically add the route rules that conform to the transmission range in the valid route table of the Border Gateway to the VPC route table, and the Next Hop points to the relevant Border Gateway;
  
  VPC->Route transmission to a Border Gateway: When creating VPC Attachment based on BGW, if "VPC All Segment" or "Specify Subnet Segment is selected in transmission of VPC segment, it is the automatic route transmission method. The Border Gateway route table will automatically add or delete route table items that reach the relevant subnet based on the configured subnet scope, the route prefix is the subnet segment, and the Next Hop is the VPC Attachment connecting the specified VPC and the Border Gateway.

### **Route Policy Priority**

  VPC route table supports two route types: Dynamic transmission route and static route. The static route can be edited, and the dynamic transmission route can be viewed but cannot be edited.
  
  JD Cloud VPC route table priority range is 1~256, the smaller the value, the higher the route priority. The static route priority of JD Cloud VPC route table is 100 by default and the transmission route priority is 120 by default.

  - When there are multiple route policies in the route table, the route priority from high to low is as follows, respectively:

    Local route takes the priority;

    The longest prefix (the prefix with the longest mask length) takes the priority for matching;

    If the routes have the same prefix length, and different route types, the static route precedes the dynamic transmission route;

    If the routes have the same prefix length, and same route type (such as that they are both transmission routes or static routes), they are equivalent routes. Currently, only the transmission route supports the equivalent route.

E.g: If a VM in VPC is associated with the elastic IP and it is also in the subnet associated with NAT gateway (in route table, the next hop setting the access Internet traffic of this subnet is the NAT gateway), then the traffic, which this VM accesses to the Internet, will all be realized through NAT gateway. Because the priority of the most accurate route is higher than EIP.

### **Billing Mode**

Route table is completely free. 
