## Direct Connection

### Basic Concept

Direct Connection is a service provided by JD Cloud & AI to open up the network environment of JD Public Cloud and customer’s IDC/hosting operator’s IDC to realize intranet-level communication between JD Cloud & AI VPC and your own network. With large bandwidth, low latency, low packet loss rate, etc., it provides customers with multicloud solutions at the intranet level.

Sub-products of Direct Connection: Physical Connection and Private Virtual Interface.

Partner: Partner of JD Direct Connection Service, the partner has completed the connection with JD Cloud & AI, and the customer can directly connect with the partner. For more information about the partner, see JD Cloud Marketplace.

### Product Function

- Multiple access points: At least 2~3 Direct connect points are provided in each Region, which is convenient for near access and saves the cost of long-distance Direct connect. At the same time, it can be connected to a wealth of partners through JD Cloud & AI Direct Connection, providing partners with more access points and more flexible access modes.
- Multi-port Bandwidth: The Direct Connection supports multiple physical ports such as 1000Base-T, 1000Base-LX, 10GBase-LR and 100GBase-LR4. It supports RJ45 electrical ports and LC mode optical ports in Ethernet format. The single physical connection supports up to 100Gbps bandwidth. ECMP extended bandwidth caps can be reached through multiple physical connections to meet your multiple bandwidth needs.
- Network High availability: Allows multiple physical links to be created between your IDC and JD Cloud & AI Direct connect points to realize load balance of traffic and ensure high availability of Direct Connection Service.
- Multi-user and Multi-service Isolation: You can share the physical links that have been connected to the public cloud to other users for the full use of the physical link. At the same time, the physical link can run a variety of different business, currently supporting the Direct connect of the same account.
- High security: The physical link is exclusive to the users who access it. Without risk of data leakage, it enjoys high security and meets the needs of customers with high security requirements such as games enterprises, financial enterprises, and government enterprises. If higher security is required, it can be guaranteed by application-level security.

### Physical Connection

Physical connection is a physical link used to connect the JD Cloud & AI machine room and customer IDC. The customer can contact the operator to carry out the line laying, and JD Cloud & AI will cooperate with the connection work, or the connection can be completed by a wealth of Direct Connection partner of JD Cloud & AI.

JD Cloud & AI Direct Connection supports the following 2 access modes:
- For exclusive port, customers directly connect to JD Cloud's access points by direct connection to establish a three-layer interconnection within intranet between the customer network and JD Public Cloud. For details of the direct access points of each region provided by JD Cloud, see the bottom of this page;
- For shared port, customers will access via partners who in advance have a direct link with JD Cloud. Customers connect to the access points provided by the partners to establish a three-layer interconnection within intranet between the customer network and JD Public Cloud.

Comparison of these two access methods:
| Access Method | Advantage | Disadvantage | How to Select |
|:---:|:---:|:---:|:---:|
| Exclusive Port | The device port is exclusive for one customer, who will not compete with other customers for bandwidth, guaranteeing service stability and network experience consistency| Direct connection has a longer construction period and higher cost | Customers requiring large bandwidth are recommended to select this method |
| Shared Port | Reusing the direct connection and port interconnected between the partners and JD Cloud together with other customers and there is a risk in competing for bandwidth | Direct connection has a shorter construction period and lower cost than exclusive port and the partners can offer an overall JD Cloud Onboarding Solution and support | Customers requiring small bandwidth and having a requirement for construction period are recommended to select this method |

### Private Virtual Interface

A Private Virtual Interface is used to connect the Public Cloud and the Enterprise IDC.

Services that can be accessed currently: VPC;

When creating a Private Virtual Interface, you need to specify the following necessary information:

- The /30 address used to establish a BGP session. Usually, the customer needs to configure two pairs of BGP sessions to connect to multiple services on JD Cloud & AI. Allocate an interconnection address to four BGP sessions for establishing a three-layer interconnection with the DLR. The client uses the first address of 30/, and JD Cloud & AI uses the second address of 30/;
- The private AS number used to establish the BGP session. JD Cloud & AI DLR uses the fixed AS number 64512, and the customer can be allocated an AS number ranging from 65001 to 65499;
- Vlan for business isolation, ranging from 1 to 4,000;


#### JD Cloud & AI Direct Connect Points Coverage

![](../../../../../image/Networking/Direct-Connect-Service/Feature/IXP-Location.png)


##### List of JD Cloud & AI Direct Connect Points
The list only provides the information of the Direct Connect Points of JD Cloud, which is suitable for self-service physical connection. For the information of the direct access points of the partner, please contact the specific partner.

| Regionl | Access Point Name | Detailed Address | Access Supporting Operators |
|:---:|:---:|:---:|:---:|
| cn-north-1 | Beijing-Haidian |No. 11, Fenghui Middle Road, Yongfeng Industrial Park, Haidian District, Beijing | China Mobile, China Unicom, China Telecom and Other Operators in China |
|  | Beijing-Yizhuang | No.32, 9th Kechuang Street, Yizhuang Economic Development Zone, Beijing | China Mobile, China Unicom, China Telecom and Other Operators in China |
|  | Beijing-Shunyi | No. 12, Xiying Road, Zhaofeng Industry Base, Zhaoquanying Town, Shunyi District, Beijing | China Mobile, China Unicom, China Telecom and Other Operators in China |
|  | Beijing-Fengtai | No. 56, Jiujingzhuang Road, Fengtai District, Beijing | China Mobile, China Unicom, China Telecom and Other Operators in China |
| cn-east-2  | Shanghai-Jing’an | No. 777, Beiwenchuan Road, Luojing Town, Baoshan District, Shanghai | China Mobile, China Unicom, China Telecom and Other Operators in China |
|  | Shanghai-Minhang | No.1188, Xinyuan Road, Zhuanqiao Town, Minhang District, Shanghai | China Mobile, China Unicom, China Telecom and Other Operators in China |
|  | Shanghai-Jing’an | No. 1268, Wanrong Road, Jing'an District, Shanghai | China Mobile, China Unicom, China Telecom and Other Operators in China |
|  | Shanghai-Xuhui | No. 418, Tianlin Road, Xuhui District, Shanghai | China Mobile, China Unicom, China Telecom and Other Operators in China |
| cn-east-1  | Suqian-Suyu | No. 199, Longquan Road, Hubin New Area, Suqian, Jiangsu Province | China Mobile, China Unicom, China Telecom and Other Operators in China |
| cn-south-1 | Guangzhou-Huangpu1 | No. 20, Guanda Road, Science City, Huangpu District, Guangzhou, Guangdong Province | China Mobile, China Unicom, China Telecom and Other Operators in China |
|  |Guangzhou-Huangpu2 | South China Advanced Materials Innovation Park, No.31, Kefeng Road, Huangpu District, Guangzhou, Guangdong Province | China Mobile, China Unicom, China Telecom and Other Operators in China |
