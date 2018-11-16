## **Product Overview**

The Direct Connection Service is a high-speed, secure and stable network access service provided by JD Cloud. It enables the intranet communication, data backup, and cross-machine room disaster tolerance between JD Cloud network and the network environment of your IDC and partners, so as to provide the user with multicloud solutions.



Sub-products of Direct Connection Service: Direct Connection and Hosted Connect.



Direct Connection: Connect the machine room of JD Cloud and your IDC machine room through physical links to realize Intranet-level communication between JD Cloud network and your IDC network.

Hosted Connect: Connect the machine room of JD Cloud and your physical device in the cloud managed service area of JD Cloud through a physical link to realize Intranet-level communication between JD Cloud network and your network in JD Cloud hosted area.



JD Cloud Resources that can be connected to Direct Connection Service: All resources in JD Cloud VPC, including Virtual Machine, Cloud Database, and cloud cache, JCS, etc.



#### **Overall Structure**

Direct Connection Service vs VPN

| **Benefits**     | ** Direct Connect Service**                                                 | **VPN**                                                    |
| ---------------- | ------------------------------------------------------------ | ---------------------------------------------------------- |
| Good Network Quality       | Access to JD Cloud network through a dedicated physical link, provide Intranet-level communication, low network latency and low packet loss rate. | Communicating with shared public network resources cannot guarantee low network delay or packet loss rate.   |
| Safe and Reliable         | The physical link is exclusively used by the accessed user, without the risk of data breach and with the high level of security, so that the customer’s requirements for high network security by game enterprises, financial enterprises and government-owned enterprises can be met. | Public network-based encrypted communication, which can meet the security requirements of network transmission for general customers. |
| High Transmission Bandwidth       | The single physical link supports a maximum bandwidth of 10Gbps, which can satisfy the customers of large data volume service. It supports several dedicated lines as ECMP, and superimposes and expands the bandwidth cap on the basis of guaranteeing the service availability. | Network bandwidth is limited by the bandwidth of public IP.                               |
| Multiple Access Modes are Available | Supports Layer 2 and Layer 3 access of the network. It is specified while select the Direct Connection partner. When you select Layer 2 access, you will run a routing protocol with the public cloud; when you select Layer 3 access, you will run a routing protocol with the partner. Layer 2 access is recommended. | Only supports point-to-point public network transmission.                                     |



#### **Conditions required to use the direct connection service**

- Completed enterprise real-name verification in JD Cloud
- The customer’s initiator of the Direct Connect needs to be a Layer 3 switch or a router device.
- Support BGP Protocol
- Support VLAN or 802.1q Protocol
- Support Three-layer Sub-interface Configuration (Optional)

