## Enterprise IDC connects to Public Cloud
This Tutorial will guide you how to establish private connection between enterprise IDC and JD public cloud VPC by virtue of Direct Connection.

### Business Scenarios
For core businesses or businesses not suitable for JD Cloud Onboarding, which are deployed in the self-established IDC, and non-core/expanded businesses deployed in JD Cloud & AI VPC by customers, it is necessary to open up the network environment between IDC and public cloud VPC so as to achieve intranet communication.<br/>

![](../../../../image/Networking/Direct-Connect-Service/Getting-Started/connection-into-idc.png)

### Precondition
Before using the direct connection, please first read the relevant information [Use Restrictions](../Introduction/Restrictions.md).

### Configuration Steps
![](../../../../image/Networking/Direct-Connect-Service/Getting-Started/connection-into-idc-step.png)

### Detailed Steps
###### Step 1. Create Physical Connection
a) Log in [JD Cloud & AI Physical Connection Console](https://cns-console.jdcloud.com/host/physicalConnection/list);  <br/>
b) Select region and click **Create**;<br/>
c) Enter the connection name, description, access method, customer’s IDC address, partners/operator (access via partners), access point (self-service access), optional customer contacts and contact information, and create physical connection. For the difference between two access methods, refer to: [Direct Connection Features](../Introduction/Features/Direct-Connect-Features.md);<br />

```
  JD Cloud Physical Connection supports the following two access methods: Exclusive port and shared port.
  Exclusive port means that customers connect to JD Cloud's device by directly connecting to JD Cloud via direct connection;
  Shared port means that JD Cloud has a direct link with the direct connection partners in advance and customers may directly contact these partners to subscribe the service when having demand for access to public cloud, which can largely save access time and construction fees;
```

d) After created, the physical connection is in the status of "To be Audited". JD Cloud & AI will complete the review within 1~2 working days after receiving your physical connection application. You can also contact and confirm with JD Cloud & AI;     <br />
e) If approved, the physical connection will enter into the status of "Initialisation Fee to be Paid";<br />
f) After the initialisation fee is paid, the physical connection status turns to "Under Construction". JD Cloud will cooperate with your ISP line provider to lay the physical ISP line and debug the network;<br />
g) When the ISP line debugging is approved, the physical connection status will turn to "Confirm Construction Completion". Please "Confirm Construction Completion" of the physical connection after verifying the network connectivity. After the related rental for the pay-in-advance port is paid, the physical connection status turns to "Available";<br />

###### Step 2. Create Border Gateway
a) Log in [JD Cloud & AI Border Gateway Console](https://cns-console.jdcloud.com/host/borderGateway/list);  <br/>
b) Select the region using the direct connection, and click **Create Border Gateway**;<br />
c) The border gateway supports running BGP routing protocol. The BGP ASN of current JD Cloud border gateway is fixed to 65000, which will be open to modify in the future. BGP routing runs between border gateway and dedicated line router or between dedicated line router and client three-layer device. The BGP ASN used by the dedicated line router is fixed at 64512;<br />

For more contents, refer to [Border Gateway Management](../Operation-Guide/Border-Gateway-Management/Border-Gateway-Configuration.md).

###### Step 3. Create VPC Attachment
a) Log in [JD Cloud & AI VPC Attachment Console](https://cns-console.jdcloud.com/host/vpcAttachment/list);  <br/>
b) Select the region using the direct connection, and click **Create VPC Attachment**;<br />
c) Select the border gateway created in Step 2, select the VPC that passes the route traffic of this border gateway, and select the VPC segment to be transmitted to this border gateway route table. After the VPC attachment is created, the segment selected will be automatically added to the transmission route table of this border gateway, and the Next Hop will point to the VPC attachment created in this step;<br />

For more contents, refer to [VPC Attachment Management](../Operation-Guide/Border-Gateway-Management/VPC-Attachment-Configuration.md).

###### Step 4. Create Private Virtual Interface
a) Log in [JD Cloud Private Virtual Interface Console](https://cns-console.jdcloud.com/host/dedicatedVif/list);  <br />
b) Select the region using the direct connection, and click **Create Private Virtual Interface**;<br />
c) Select the physical connection created previously in a status of "Available";<br />
d) Select the border gateway;<br />
e) Designate the parameters interconnected among cloud and client three-layer device, including Vlan Tag, client BGP ASN, BGP key pair, two pairs of interconnection addresses;<br />

```
  vlan is used to distinguish different businesses. If you use a same physical connection to create multiple private virtual interfaces, please designate different vlans for each private virtual interface to implement isolation among businesses.
  As for interconnection address, there are two dedicated line router devices on cloud providing services for customers. From the view of business high availability, it is necessary to designate two pairs of interconnection addresses here to build the BGP Peer between client and one of the dedicated line routers.
```

For more contents, refer to [Physical Connection Configuration](../Operation-Guide/Direct-Connection-Management/Physical-Connection-Configuration.md) and [Private Virtual Interface Configuration](../Operation-Guide/Direct-Connection-Management/Private-Virtual-Interface-Configuration.md).

###### Step 6. Configure connection client
a) At present [JD Cloud Private Virtual Interface Console](https://cns-console.jdcloud.com/host/dedicatedVif/list) doesn't provide download function in private virtual interface client configuration. You shall refer to client configuration example when configuring a client device, e.g. [Cisco Client Configuration](../Operation-Guide/Client-Site-Configuration/Cisco-Configuration.md);<br />
b)``After the client direct connection device is configured, BGP will be automatically established through consultation``. Then you can view the establishment status and routing of BGP Peer in the client device. If the BGP Peer cannot be normally established, please refer to [FAQ](../FAQ/FAQ.md) to handle the failure;<br />

###### Step 7. Configure routing
a) JD Cloud Direct Connection supports using static route/BGP dynamic route between cloud and client, and using BGP dynamic route to automatically update route is recommended;<br />
b) Configuration methods of different routes:<br/>
  * Configure static route. In the configuration of static route to client in the static route table of border gateway, the target end should be client segment and the next hop should be private virtual interface. On the client three-layer device, configure the static route to the cloud, where the target end should be cloud segment and the next hop should be APIs of private virtual interface. In current configuration of static route, JD Cloud's personnel are required to verify the interconnection and bring it into effect;
  * Configure BGP dynamic route. After BGP sessions are established between border gateway and client three-layer device, the border gateway will automatically release the valid routes to Peer client, and the client needs to release the client segment route to Peer cloud. Then the whole link is connected and the route has taken effect if the route transmission of VPC route table is configured;

For more contents, refer to [Border Gateway Route Configuration (../Operation-Guide/Route-Management/Border-Gateway-Route-Configuration.md) and [VPC Route Configuration](../Operation-Guide/Route-Management/VPC-Route-Configuration.md).

###### Step 8. Test connectivity
a) Log in [JD Cloud Virtual Machines Console](https://cns-console.jdcloud.com/host/compute/list), in the region where the direct connection is created, create one set of Virtual Machines in the VPC to be interconnected to the IDC intranet of the enterprise, and confirm that the route properly connected to the IDC intranet segment of the enterprise exists in the route table of the Subnet of this Virtual Machines;  <br />
b) Use the Virtual Machines created in a to ping the intranet address of one instance in enterprise IDC intranet in order to verify whether the intranet communication is normal;<br />

For details of billing method for direct connection, refer to [Direct Connection Billing](../Pricing/Billing-Overview.md).
