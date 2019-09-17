## **Basic Architecture**

#### **Summary**

Overall architecture diagram of Direct Connection is as follows:

 ![](/image/Networking/Direct-Connect-Service/Infrastructure.png)



#### **Components of Direct Connection**

Direct Connection

- Physical Connection: the physical links for the connection between JD Cloud machine room and customer IDC machine room.
- Private Virtual Interface: a logical link for the connection between border gateway and physical connection.



Hosted Connect

- Hosted Connection: a physical link for the connection between JD Cloud machine room and devices of customer JD Cloud hosted area.
- Hosted Private Virtual Interface: a logical link for the connection between border gateway and hosted connection.



Border Gateway (BGW): The gateway to host the communication between VPCs and between VPC and external private environment and the current hosted functions include Direct Connection, Cabinet Service, VPN Connection and VPC Attachment.


VPC Attachment: Interconnection APIs between JD Cloud VPC and Border Gateway.



#### **High-availability Architecture**

High-availability architecture designs are used/ supported for all components of the Direct Connection Service, in which:

- For physical connection/ hosted connection, it is recommended that the customer accesses more than two physical links in the same region to guarantee the high-availability of the physical links.
- When the customer creates a border gateway, the border gateway of active-active mode will be created by default.
- When the customer creates an interface, the private virtual interface/ hosted private virtual interface of active-active mode will be created by default.

#### **Description of adjustment to interconnection method between Border Gateway and VPC**

1) Description of interconnection method

Before the Border Gateway supports the VPC Attachment function, once the Border Gateway is created, all VPCs in the same region will be connected automatically;

As the VPC Attachment function of the Border Gateway is released, newly created Border Gateways won’t connect to any VPC by default, so users need to create "VPC Attachments" to interconnect specified VPC with Border Gateways; for Border Gateways already created, routes, which have already connected to VPC, in the Border Gateway route table is still valid and available and can be modified and deleted, but no other routes to VPC can be created unless VPC Attachment connected to VPC is created.

2) Adjustment to routing method

Before the Border Gateway supports the VPC Attachment function, the Border Gateway route table and VPC route table only support static route;

As the VPC Attachment function of the Border Gateway is released, the Border Gateway route table and VPC route table can also support dynamic transmission route.

Valid routing of border gateway can be automatically spread to the associated VPC route table created, and the routing arriving VPC subnet segment can be automatically spread to the border gateway route table; the border gateway and the IDC gateway can mutually inform valid routings to each other via eBGP. The specific processes are as follows:

The Border Gateway will be added to the dynamic route table of Border Gateway by way of transmitting routes when accessing routes via the BGP route learned by private virtual interface and hosted private virtual interface and via the VPC subnet segment specified at the time of creating a VPC Attachment, and add the route of high priority after comparing the route priority to an valid route table; the VPC route table, which is transmitted by creating routes, can dynamically transmit the target address in the valid route table of Border Gateway to the extent of route rules in the scope of transmission address to the VPC route table; the Border Gateway will announce the valid route via eBGP to the BGP Peer of IDC gateway.
