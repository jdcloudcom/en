## Basic Architecture

#### Summary

Overall architecture diagram of Direct Connection is as follows:

 ![](../../../../image/Networking/Direct-Connect-Service/Introduction/Infrastructure.png)

#### Components of Direct Connection

Direct Connection

- Physical Connection: the physical links for the connection between JD Cloud & AI machine room and customer IDC machine room.
- Private Virtual Interface: Logistic links used to connect the Enterprise IDC and the Public Cloud.

Hosted Connect

- Hosted Connection: a physical link for the connection between JD Cloud & AI machine room of customer JD Cloud & AI hosted area.
- Hosted Private Virtual Interface: Logistic links used to connect the Cabinet Service and the Public Cloud.

Border Gateway (BGW): The gateway hosting the communications between VPCs, as well as VPC and external environment, currently carries functions including Direct Connect, Hosted Connect and VPN Connection.

VPC Attachment: Interconnection APIs between JD Cloud & AI VPC and Border Gateway.

#### High-availability Architecture

High-availability architecture designs are used/ supported for all components of the Direct Connection Service, in which:

- For physical connection/ hosted connection, it is recommended that the customer accesses more than two physical links in the same region to guarantee the high-availability of the physical links.
- When the customer creates a border gateway, the border gateway of active-active mode will be created by default.
- When the customer creates an interface, the private virtual interface/ hosted private virtual interface of active-active mode will be created by default.
