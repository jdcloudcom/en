## **Hosted Connect**

### **Basic Concept**

Hosted Connect is a service provided by JD Cloud to open up the network environment of JD Public Cloud and JD Cloud hosted area, and realize intranet-level communication between JD Cloud VPC and your own network. With large bandwidth, low latency, low packet loss rate, etc., it provides customers with multicloud solutions at the intranet level.

Sub-products of hosted connect: hosted connection and hosted private virtual interface.



### **Product Function**

- Multi-port bandwidth: The Direct Connection supports 1000Base-T, 1000Base-LX, and 10GBase-LR physical ports by default. It supports RJ45 electrical ports and LC mode optical ports in Ethernet format. The single physical connection supports up to 10Gbps bandwidth. ECMP extended bandwidth caps can be reached through multiple physical connections to meet your multiple bandwidth needs.
- Network High availability: Allows multiple physical links to be created between your IDC and JD Cloud Direct connect points to realize load balance of traffic and ensure high availability of Direct Connection Service.
- Multi-user and Multi-service Isolation: You can share the physical links that have been connected to the public cloud to other users for the full use of the physical link. At the same time, the physical link can run a variety of different business, currently supporting the Direct connect of the same account.
- High security: The physical link is exclusive to the users who access it. Without risk of data leakage, it enjoys high security and meets the needs of customers with high security requirements such as games enterprises, financial enterprises, and government enterprises. If higher security is required, it can be guaranteed by application-level security.



### **Hosted Connection**

Hosted Connection is a physical link used to connect the JD Cloud machine room and the JD Cloud hosted area. The link is completed by JD Cloud.



### Hosted Private Virtual Interface

A hosted private virtual interface is a logical link used to connect border gateways and Hosted Connection.

When creating a hosted private virtual interface, you need to specify the following necessary information:

- The /30 address used to establish a BGP session. Usually, the customer needs to configure two pairs of BGP sessions to connect to multiple services on JD Cloud. Allocate an interconnection address to 4 BGP sessions for establishing a three-layer interconnection with the DLR. The client (the Intranet of hosted area) uses the first address of 30/, and JD Cloud uses the second address of 30/;
- The private AS number used to establish the BGP session. JD Cloud DLR uses the fixed AS number 64512, JD Cloud BGW uses the fixed AS number 65501, and the customer can be allocated an AS number ranging from 65001 to 65499;
- Vlan for business isolation, ranging from 2 to 4,000;

 
