## **Product Overview*

The Direct Connection Service is a high-speed, secure and stable network access service provided by JD Cloud. It enables the intranet communication, data backup, and cross-machine room disaster tolerance between JD Cloud network and the network environment of your IDC and partners, so as to provide the user with multicloud Solutions.



Sub-products of Direct Connection Service: Direct Connection and Hosted Connect.



Direct Connection: Connect the machine room of JD Cloud and your IDC machine room through physical links to realize Intranet-level communication between JD Cloud network and your IDC network.

Hosted Connect: Connect the machine room of JD Cloud and your physical equipment in the hosted area of JD Cloud through a physical link to realize Intranet-level communication between JD Cloud network and your network in JD Cloud hosted area.

Border Gateway: The gateway to host the communication between VPCs and between VPC and external device/environment and the current hosted functions include Direct Connection, VPN Connection and VPC Attachment.

VPC Attachment: Interconnection APIs between JD Cloud VPC and Border Gateway.

JD Cloud resources that can be connected to Direct Connection: IDC can access the main resources in JD Cloud VPC via Direct Connection, including Virtual Machines, Container, Load Balancer, Cloud Database, JCS, etc., but the NAT Gateway in VPC cannot be used to unify the Internet exit.



#### **Overall Structure**

Direct Connection Service vs VPN

| **Product Advantages**     | **Direct Connection Service**                                                 | **VPN**                                                    |
| ---------------- | ------------------------------------------------------------ | ---------------------------------------------------------- |
| Good Network Quality       | Access to JD Cloud network through a dedicated physical link, enjoy Intranet-level communication, low network latency and low packet loss rate. | Communicating with shared public network resources cannot guarantee low network delay or packet loss rate.   |
| Safe and Reliable         | The physical link is exclusive to the users who access it. Without risk of data leakage, it enjoys high security and meets the needs of customers with high security requirements such as games enterprises, financial enterprises, and government enterprises. | Public network-based encrypted communication, which can meet the security requirements of network transmission for general customers. |
| High Transmission Bandwidth       | A single physical link supports a maximum of 10 Gbps of bandwidth, which can satisfy customers with data bulk business. It supports multiple dedicated lines for ECMP, and superimposes the bandwidth limit on the basis of ensuring service availability. | Network bandwidth is limited by the bandwidth of public IP.                               |
| Multiple Access Modes are Available | Supports Layer 2 and Layer 3 access of the network. It is specified while choosing the Direct Connection partner. When you select Layer 2 access, you will run a routing protocol with the public cloud; when you select Layer 3 access, you will run a routing protocol with the partner. Layer 2 access is recommended. | Only supports point-to-point public network transmission.                                     |



#### **Use Rules of Border Gateway**

- You need to create VPC Attachment before interconnecting with VPC
- For routes from Border Gateway to VPC, you can not only manually add the static route rules in the Border Gateway route table, but also specify the scope of target subnet of route rules that can be dynamically updated when creating VPC Attachment and automatically create or delete updates via route transmission
- The Border Gateway route table includes valid route table, static route table and transmission route table. The Border Gateway forwards packet according to the valid route table. The valid route table will select the valid routes according to type of next hop of route, route type, route Metric and other different levels:
  * Step 1: Select the route of the highest type of next hop priority. If the unique route entry can be confirmed, return to this route. At present, the VPC Attachment priority value is 100, the Private Virtual Interface/Hosted Private Virtual Interface priority value is 120 and the VPN channel priority value is 140. The smaller the priority value, the higher the route priority. If there are many routes of the same priority, continue comparing the next factor;
  * Step 2: Select the route of the highest route type priority (route protocol management distance). If the unique route entry can be confirmed, return to this route. At present, the static route priority value is 100, the internal transmission (VPC Attachment transmission) route priority value is 120, the EBGP route priority value is 150 and the IBGP route priority value is 200. The smaller the priority value, the higher the route priority. If there are many routes of the same priority, continue comparing the next factor;
  * Step 3: Select the route of the highest Metric priority. If the unique route entry can be confirmed, return to this route. If the AS_PATH of BGP protocol is shorter, the Metric value is smaller. The smaller the Metric value, the higher the route priority. If there are many routes of the same priority, these routes shall be valid routes and forward data package by way of ECMP.

#### **Conditions Required to Use the Direct Connection Service**

- Completed enterprise real-name verification in JD Cloud
- The client’s initiator of the Direct Connect needs to be a Layer 3 switch or router device.
- Support BGP Protocol
- Support VLAN or 802.1q Protocol
- Support Three-layer Sub-interface Configuration (Optional)

