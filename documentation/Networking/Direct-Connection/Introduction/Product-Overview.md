## **Product Overview*

The Direct Connection Service is a high-speed, secure and stable network access service provided by JD Cloud. It enables the intranet communication, data backup, and cross-machine room disaster tolerance between JD Cloud network and the network environment of your IDC and partners, so as to provide the user with multicloud Solutions.



Sub-products of Direct Connection Service: Direct Connection and Hosted Connect.



Direct Connection: Connect the machine room of JD Cloud and your IDC machine room through physical links to realize Intranet-level communication between JD Cloud network and your IDC network.

Hosted Connect: Connect the machine room of JD Cloud and your physical equipment in the hosted area of JD Cloud through a physical link to realize Intranet-level communication between JD Cloud network and your network in JD Cloud hosted area.



JD Cloud Resources that can be connected to Direct Connection Service: All resources in JD Cloud VPC, including Virtual Machine, Cloud Database, and cloud cache, etc.



#### **Overall Structure**

Direct Connection Service vs VPN

| **Product Advantages**     | **Direct Connection Service**                                                 | **VPN**                                                    |
| ---------------- | ------------------------------------------------------------ | ---------------------------------------------------------- |
| Good Network Quality       | Access to JD Cloud network through a dedicated physical link, enjoy Intranet-level communication, low network latency and low packet loss rate. | Communicating with shared public network resources cannot guarantee low network delay or packet loss rate.   |
| Safe and Reliable         | The physical link is exclusive to the users who access it. Without risk of data leakage, it enjoys high security and meets the needs of customers with high security requirements such as games enterprises, financial enterprises, and government enterprises. | Public network-based encrypted communication, which can meet the security requirements of network transmission for general customers. |
| High Transmission Bandwidth       | A single physical link supports a maximum of 10 Gbps of bandwidth, which can satisfy customers with data bulk business. It supports multiple dedicated lines for ECMP, and superimposes the bandwidth limit on the basis of ensuring service availability. | Network bandwidth is limited by the bandwidth of public IP.                               |
| Multiple Access Modes are Available | Supports Layer 2 and Layer 3 access of the network. It is specified while choosing the Direct Connection partner. When you select Layer 2 access, you will run a routing protocol with the public cloud; when you select Layer 3 access, you will run a routing protocol with the partner. Layer 2 access is recommended. | Only supports point-to-point public network transmission.                                     |



#### **Conditions Required to Use the Direct Connection Service**

- Completed enterprise real-name verification in JD Cloud
- The client’s initiator of the Direct Connect needs to be a Layer 3 switch or router device.
- Support BGP Protocol
- Support VLAN or 802.1q Protocol
- Support Three-layer Sub-interface Configuration (Optional)

