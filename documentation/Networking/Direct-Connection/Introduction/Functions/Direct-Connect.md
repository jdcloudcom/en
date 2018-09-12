## **Direct Connection**

### **Basic Concept**

Direct Connection is a service provided by JD Cloud to open up the network environment of JD Public Cloud and customer’s IDC/hosting operator’s IDC to realize intranet-level communication between JD Cloud VPC and your own network. With large bandwidth, low latency, low packet loss rate, etc., it provides customers with multicloud solutions at the intranet level.

Sub-products of Direct Connection: Physical Connection and Private Virtual Interface.

Partner: Partner of JD Direct Connection Service, the partner has completed the connection with JD Cloud, and the customer can directly connect with the partner. For more information about the partner, see JD Cloud Marketplace.



### **Product Function**

- Multiple access points: At least 2~3 Direct connect points are provided in each Region, which is convenient for near access and saves the cost of long-distance Direct connect. At the same time, it can be connected to a wealth of partners through JD Cloud Direct Connection, providing partners with more access points and more flexible access modes.
- Multi-port bandwidth: The Direct Connection supports 1000Base-T, 1000Base-LX, and 10GBase-LR physical ports by default. It supports RJ45 electrical ports and LC mode optical ports in Ethernet format. The single physical connection supports up to 10Gbps bandwidth. ECMP extended bandwidth caps can be reached through multiple physical connections to meet your multiple bandwidth needs.
- Network High availability: Allows multiple physical links to be created between your IDC and JD Cloud Direct connect points to realize load balance of traffic and ensure high availability of Direct Connection Service.
- Multi-user and Multi-service Isolation: You can share the physical links that have been connected to the public cloud to other users for the full use of the physical link. At the same time, the physical link can run a variety of different business, currently supporting the Direct connect of the same account.
- High security: The physical link is exclusive to the users who access it. Without risk of data leakage, it enjoys high security and meets the needs of customers with high security requirements such as games enterprises, financial enterprises, and government enterprises. If higher security is required, it can be guaranteed by application-level security.



### **Physical Connection**

Physical connection is a physical link used to connect the JD Cloud machine room and customer IDC. The customer can contact the operator to carry out the line laying, and JD Cloud will cooperate with the connection work, or the connection can be completed by a wealth of Direct Connection partner of JD Cloud.

JD Cloud Direct Connection supports the following three access modes:

- The customer directly pulls the dedicated line to JD IXP Direct connect point (Layer 2) switch, and establishes a direct connection between the customer network and JD Cloud (establishing BGP Peer) to realize the private line communication between the customer network and JD Cloud. For details of the Direct connect points of each Region, see the list of Direct connect points on the page that creates Physical Connection.
- The customer establishes a direct-connected three-layer interconnection (establishing BGP Peer) between the customer network and JD Cloud through the partner IXP (Layer 2) switch to realize the private line communication between the customer network and JD Cloud;
- The customer establishes a three-layer interconnection (establishing a BGP peer) between the router of the customer Provider Edge (PE) and the JD Dedicated Line Router (DLR) to realize the private line communication between the customer network and JD Cloud;

Q-in-Q is used between the Operator's IXP/Partner's PE router and JD Cloud DLR. The customer specifies the Customer VLAN tag (c-tag) when using the business channel (Private Virtual Interface), and the operator/partner automatically allocate the Service VLAN tag (s-tag) which is used to identify the customer.



### **Private Virtual Interface**

A Private Virtual Interface is a logical link used to connect a border gateway to a physical connection.

When creating a Private Virtual Interface, you need to specify the following necessary information:

- The /30 address used to establish a BGP session. Usually, the customer needs to configure two pairs of BGP sessions to connect to multiple services on JD Cloud. Allocate an interconnection address to four BGP sessions for establishing a three-layer interconnection with the DLR. The client uses the first address of 30/, and JD Cloud uses the second address of 30/;
- The private AS number used to establish the BGP session. JD Cloud DLR uses the fixed AS number 64512, JD Cloud BGW uses the fixed AS number 65501, and the customer can be allocated an AS number ranging from 65001 to 65499;
- Vlan for business isolation, ranging from 2 to 4,000;



#### **JD Cloud Direct Connect Points Coverage**

![](/image/Networking/Direct-Connect-Service/IXP-Location.png)



List of JD Cloud Direct Connect Points (** Last Updated on 01.10.2018**)

The list only provides the information of the Direct Connect Points of JD Cloud, which is suitable for self-service application. For the information of the Direct Connect Points of the partner, please contact the specific partner.

| **Regionl** | **Access Point Name** | **Detailed Address**                                      |
| --------- | -------------- | ------------------------------------------------- |
| cn-north-1 | Beijing-Haidian      | Building C, Advanced Technology & Materials Co., Ltd. Yongfeng Industrial Base in the Yongfeng High Technology and New Technology Industrial Base, Xibeiwang Town, Haidian District, Beijing |
| cn-east-1 | Suqian-Suyu      | West Side of the Intersection of Fazhan Avenue and Qingtong Road, Hubin New District, Suqian City, Jiangsu Province    |
| cn-south-1 | Guangzhou-Nansha      | No.8, Nanjiang 3rd Road, Zhujiang Industrial Park, Nansha District, Guangzhou, Guangdong           |




