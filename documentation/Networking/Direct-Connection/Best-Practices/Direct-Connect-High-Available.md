## Direct Connection High Availability Solution
This Tutorial will guide you how to establish high-availability private connection between enterprise IDC and public cloud VPC by virtue of JD Cloud Direct Connection.

### Business Scenarios
For core/non-suitable JD Cloud Onboarding businesses deployed in the self-established IDC and non-core/expanded businesses deployed in JD Cloud VPC by customers, it is necessary to open up the network environment between IDC and public cloud VPC so as to achieve intranet communication while guaranteeing high availability of businesses.<br />

![](../../../../image/Networking/Direct-Connect-Service/Getting-Started/connection-into-idc.png)

### Preconditions
* The segment in enterprise IDC cannot overlap with that in public cloud VPC;
* The direct connection runs BGP routing protocol;
* The operator has laid two different physical ISP lines for you, which are accessed to two different JD Cloud Direct Connection access points;

For the requirements for client device, refer to [Use Restrictions](../Introduction/Restrictions.md).

### Detailed Steps
###### Step 1. Create Border Gateway

a) Log in [JD Cloud Border Gateway Console](https://cns-console.jdcloud.com/host/borderGateway/list);  <br />
b) Select the region using the direct connection, and click **Create Border Gateway**;<br />
c) The border gateway supports running BGP routing protocol. The BGP ASN of current JD Cloud border gateway is fixed to 65000, which will be open to modify in the future;<br />

For more contents, refer to [Border Gateway Management](../Operation-Guide/Border-Gateway-Management/Border-Gateway-Configuration.md).

###### Step 2. Create VPC Attachment
a) Log in [JD Cloud VPC Attachment Console](https://cns-console.jdcloud.com/host/vpcAttachment/list);  <br />
b) Select the region using the direct connection, and click **Create VPC Attachment**;<br />
c) Select the border gateway created in Step 1, select the VPC that passes the route traffic of this border gateway, and select the VPC segment to be transmitted to this border gateway. After the VPC attachment is created, the segment selected will be automatically added to the transmission route table of this border gateway, and the Next Hop will point to the VPC attachment created in this step;<br />

For more contents, refer to [VPC Attachment Management](../Operation-Guide/Border-Gateway-Management/VPC-Attachment-Configuration.md).

###### Step 3. Create Physical Connection
Please confirm that you have accessed JD Cloud via two physical connections provided by the operator.
a) Log in [JD Cloud Physical Connection Console](https://cns-console.jdcloud.com/host/physicalConnection/list);  <br />
b) Select region and click **Create**;<br />
c) Enter the connection name, description, access method, customer’s IDC address, partners/operator (access via partners), access point (self-service access), optional customer contacts and contact information, and create physical connection. For the difference between two access methods, refer to: [Direct Connection Features](../Introduction/Features/Direct-Connect-Features.md), create the physical connection based on the first physical ISP line;<br />
d) Repeat the above step and create the physical connection based on the second physical ISP line;<br />

For more contents, refer to [Physical Connection Management](../Operation-Guide/Direct-Connection-Management/Physical-Connection-Configuration.md).

###### Step 4. Create Private Virtual Interface
a) Log in [JD Cloud Private Virtual Interface Console](https://cns-console.jdcloud.com/host/dedicatedVif/list);  <br />
b) Select the region using the direct connection, and click **Create Private Virtual Interface**;<br />
c) Select the physical connection created previously in a status of "Available", select the border gateway, and designate the parameters interconnected among cloud and client three-layer device, including Vlan Tag, client BGP ASN, BGP key pair, two pairs of interconnection addresses; create the physical connection private virtual interface based on the first physical ISP line;<br />
d) Repeat the above step and create the physical connection private virtual interface based on the second physical ISP line;<br />

For more contents, refer to [Private Virtual Interface Management](../Operation-Guide/Direct-Connection-Management/Private-Virtual-Interface-Configuration.md).

###### Step 6. Configure Direct Connection Client
a) At present [JD Cloud Private Virtual Interface Console](https://cns-console.jdcloud.com/host/dedicatedVif/list) doesn't provide download function in private virtual interface client configuration. You shall refer to client configuration example when configuring a client device, e.g. [Cisco Client Configuration](../Operation-Guide/Client-Site-Configuration/Cisco-Configuration.md);<br />
b)``After the client direct connection device is configured, BGP will be automatically established through consultation``. Then you can view the establishment status and routing of BGP Peer in the client device. If the BGP Peer cannot be normally established, please refer to [FAQ](../FAQ/FAQ.md) to handle the failure;<br />

###### Step 7. Configure Routing
a) JD Cloud Direct Connection supports using static route/BGP dynamic route between cloud and client, and using BGP dynamic route to automatically update route is recommended;<br />
b) Configuration methods of different routes:<br />
  * Configure static route. In the configuration of static route to client in the static route table of border gateway, the target end should be client segment and the next hop should be two private virtual interfaces. On the client three-layer device, configure the static route to the cloud, where the target end should be cloud segment and the next hop should be APIs of two private virtual interfaces. In current configuration of static ECMP route, JD Cloud's personnel are required to conduct configuration at background (the open Console will be launched soon for user configuration). If different masks are used, users can create it by themselves;
  * Configure BGP dynamic route. After BGP sessions are established between border gateway and client three-layer device, the border gateway will automatically release the valid routes to Peer client, and the client needs to release the client segment route to Peer cloud. Then the whole link is connected and the route has taken effect if the route transmission of VPC route table is configured;

For more contents, refer to [Border Gateway Route Configuration (../Operation-Guide/Route-Management/Border-Gateway-Route-Configuration.md) and [VPC Route Configuration](../Operation-Guide/Route-Management/VPC-Route-Configuration.md).

###### Step 8. Test Connectivity and Verify Route Switch
a) Log in [JD Cloud Virtual Machines Console](https://cns-console.jdcloud.com/host/compute/list), in the region where the service is created, create one set of Virtual Machines in the VPC to be interconnected to the IDC intranet segment of the enterprise, and confirm that the route properly connected to the IDC intranet segment of the enterprise exists in the route table of the Subnet of this Virtual Machines;  <br />
b) Use the Virtual Machines created in a to ping the intranet address of one instance in enterprise IDC intranet in order to verify whether the intranet communication is normal;<br />
c) On the client router, break off the BGP session of one of the private virtual interface, or remove its route, or place DOWN at the port of its route, and view whether the traffic is switched to another private virtual interface, if yes, then establish the first private virtual interface and route;<br />
