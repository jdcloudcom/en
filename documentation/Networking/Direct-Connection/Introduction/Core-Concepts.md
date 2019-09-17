## **Terminology**

| **Terminology** | **Definition**                                                     |
| -------- | ------------------------------------------------------------ |
| BGW      | Border Gateway, traffic endpoint of business within VPC for the external access
| DLR      | Dedicated Line Router, three-layer route device required for Direct Connection Service and used for physical link connection |
| VNET     | Virtual Network, Virtual Network                                    |
|Circuit  | Logical description of the physical link between the IP provider, customer and JD Cloud                 |
| IXP      | Internet Exchange Point, Internet Exchange Point                      |
| BGP | Border Gateway Protocol, Border Gateway Protocol                        |
| Partner  | Partner of JD Cloud Direct Connection Service that provide Direct Connection Service for JD Cloud customers   |
| S-tag    | A vlan tag used to uniquely identify a customer's data stream on the physical port when QinQ is configured, QinQ's service VLAn tag |
| C-tag    | A vlan tag used to uniquely identify the data flow of a customer's business channel on the physical port when QinQ is configured, QinQ's Customer VLAN tag |

 ## **Dynamic Route Design Description**
 
  As a route gateway among multiple isolation networks (VPCs) of JD Cloud or connected to user IDC from JD Cloud, the Border Gateway provides static and BGP dynamic route capabilities, and supports the two-way transmission capability of route between VPC and Border Gateway and the dynamically announcing route capability via eBGP of Border Gateway and Gateway inside IDC to simplify the deployment of user business, so as to complete end-to-end route automatic update from VPC to IDC.

### **Route Transmission**

  The route transmission is the route rule obtained other than by means of manual configuration, such as the route learned by means of dynamic route and other standard BGP protocol, or route information that synchronizes, automatically updates or goes through forwarding business of each other route table item information of different gateway entities (e.g. the route gateway and Border Gateway where the VPC route table is located) through internal work mechanism.

- Dynamic transmission with two-way routing can be realized between VPC route table and Border Gateway route table by VPC Attachment:

  Border Gateway->Route Transmission on the Direction of VPC: When the VPC route table configures route transmission, select the source Border Gateway of route transmission and fill in the scope of route transmission. After the transmission relation is created, the system will automatically add the route rules that conform to the transmission range in the valid route table of the Border Gateway to the VPC route table, and the Next Hop points to the relevant Border Gateway;
  
  VPC->Route Transmission on the Direction of Border Gateway: When creating VPC Attachment based on BGW, if "VPC All Segment" or "Specify Subnet Segment is selected in transmission of VPC segment, which is the routing automatic transmission method. The Border Gateway route table will automatically add or delete route table items that reach the relevant subnet based on the configured subnet scope, the route prefix is the subnet segment, and the Next Hop is the VPC Attachment connecting the specified VPC and the Border Gateway.

- The Border Gateway connects to user IDC gateway through the route learned via BGP protocol and the route type is also defined as transmission route in Border Gateway route table. Including:

   Route learned by Border Gateway from user IDC gateway via eBGP hosted by Private Virtual Interface;
 
   Route learned by Border Gateway from user IDC gateway via eBGP hosted by Hosted Private Virtual Interface;
   
   Route learned by Border Gateway from user IDC gateway via eBGP hosted by VPN Channel.
 
- Valid route of Border Gateway announced by Border Gateway to user IDC gateway via BGP protocol. Including:

   Valid route announced by Border Gateway to the connected user IDC gateway via eBGP hosted by Private Virtual Interface;
 
   Valid route announced by Border Gateway to the connected user IDC gateway via eBGP hosted by Hosted Private Virtual Interface;
   
   Valid route announced by Border Gateway to the connected user IDC gateway via eBGP hosted by VPN Channel.
   
### **Route Priority**

#### **VPC Route Table Priority**

  VPC route table supports two route types: Transmission (dynamic)) route and static route.

  JD Cloud VPC route table priority range is 1~256, the smaller the value, the higher the route priority. The static route priority of JD Cloud VPC route table is 100 by default and the transmission route priority is 120 by default.

  ***Matching Order of VPC Route Table Route Rules***
  
   Local route takes the priority;
   
   Route matching with the longest prefix (the prefix with the longest mask length) takes the priority;

   If the routes have the same prefix, same mask length and different route types, the static route precedes the transmission route;

   If the routes have the same prefix, same mask length and same route type, and they are both static routes, or both are transmission routes, they are equivalent routes. Currently, equivalent routes only support transmission routes and do not support static routes.


#### **Border Gateway Route Table Priority**

  Border Gateway route table supports two routing methods: Transmission (dynamic)) route and static route.
  
  The valid route table of Border Gateway will select the valid routes according to type of next hop of route, route type, route Metric and other different levels:
  * Step 1: Select the route of the highest type of next hop priority. If the unique route entry can be confirmed, return to this route. At present, the VPC Attachment priority value is 100, the Private Virtual Interface/Hosted Private Virtual Interface priority value is 120 and the VPN channel priority value is 140. The smaller the priority value, the higher the route priority. If there are many routes of the same priority, continue comparing the next factor;
  * Step 2: Select the route of the highest route type priority (route protocol management distance). If the unique route entry can be confirmed, return to this route. At present, the static route priority value is 100, the internal transmission (VPC Attachment transmission) route priority value is 120, the EBGP route priority value is 150 and the IBGP route priority value is 200. The smaller the priority value, the higher the route priority. If there are many routes of the same priority, continue comparing the next factor;
  * Step 3: Select the route of the highest Metric priority. If the unique route entry can be confirmed, return to this route. If the AS_PATH of BGP protocol is shorter, the Metric value is smaller. The smaller the Metric value, the higher the route priority. If there are many routes of the same priority, these routes shall be valid routes and forward data package by way of ECMP.
  

  ***Matching Order of Border Gateway Valid Routes***

   When the Border Gateway forwards the business data, match item by item according to the route rules in the valid route table of Border Gateway, then forward the packet to the corresponding API or channel according to the next hop information of route rules. Its basic route matching and forwarding rules are:
   
   Route matching with the longest prefix (the prefix with the longest mask length) takes the priority;

   The equivalent route will hash based on quintuple (TCP/UDP), triple (ICMP) or source/destination IP (other protocol types) of each data packet head so as to forward by selecting different routes of next hop.

