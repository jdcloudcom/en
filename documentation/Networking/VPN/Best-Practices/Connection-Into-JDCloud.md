## Via VPN connection, cross-region resource interconnection with JD Cloud is realized
The course specifies how to set up safe intranet access from JD Cloud & AI VPC to a cross-region VPC via JD Cloud & AI IPsec VPN. For access in the same region, it is suggested to use VPC Peering or realize interconnection via the border gateway.

### Business Scenario
Considering from the perspective of business availability, customers will deploy business to different regions of JD Cloud, and mutual access or fault switch/disaster recover shall be realized between businesses of different regions.<br />
![](../../../../image/Networking/VPN/Best-Practices/connection-with-jdcloud.png)

### Precondition
Segments in home terminal of JD Cloud & AI cannot be as the same as those in cross-region VPC in the opposite terminal.

### Notes
* Interconnection between VPNs of JD Cloud & AI can use static route only. As the border gateways at two ends adopt the same BGP ASN and the inner address of tunnel does not support customized designation, dynamic route cannot be set up based on EBGP;

### Detailed Step
###### Step 1: Create a border gateway at a home terminal region of JD Cloud & AI

a) Log in [Border Gateway Console](https://cns-console.jdcloud.com/host/borderGateway/list);  <br />
b) Select a home terminal region using VPN and click **Create Border Gateway**;<br />
c) The border gateway supports operation of BGP route protocol. BGP ASN of the existing Border Gateway is fixed to be 65,000 and will be open for modification subsequently;<br />

For more details, please refer to [Border Gateway Management](../Operation-Guide/Border-Gateway-Management/Border-Gateway-Configuration.md).

###### Step 2: Create VPC attachment at a home terminal region of JD Cloud & AI

a) Log in [VPC Attachment Console](https://cns-console.jdcloud.com/host/vpcAttachment/list);  <br />
b) Select a home terminal region using VPN and Click **Create VPC Attachment**;<br />
c) Select the border gateway created in Step 1, select a VPC where the border gateway route traffic can pass through and select a VPC segment transmitted to the border gateway; after VPC Attachment is created, the selected segments will be automatically added to the transmission route table of the border gateway; the next hot redirects to the VPC attachment created in this step;<br />

For more details, please refer to [VPC Attachment Management](../Operation-Guide/Border-Gateway-Management/VPC-Attachment-Configuration.md).

###### Step 3: Create a customer gateway at a home terminal region of JD Cloud & AI

a) Log in [Customer Gateway Console](https://cns-console.jdcloud.com/host/customerGateway/list);  <br />
b) Select a home terminal region using VPN and click **Create Customer Gateway**;<br />
c) The customer gateway is a logic presentation of client VPN device at the cloud and the customer will create VPN connected based on the Border Gateway and the Customer Gateway. The customer gateway itself only represents relevant information of the client device (``only relates to public network address and BGP ASN, without the concept of specific geological location``) and does not have any region attribute theoretically. However, as almost every cloud resource has its region attribute, the Customer Gateway is distributed with the region attribute. Customer gateways of the same configuration can be repeatedly created in different regions, but are only available in the resource creation region, without any influence to another region.<br />
d) If the client device supports the BGP route protocol, use of BGP route is recommended and please designate client BGP ASN; as the border gateway of JD Cloud & AI only supports fixed BGP ASN now, the EBGP route cannot be run between two border gateways, and operation of static route is only supported;<br />
e) Configure two public addresses at the client and appoint addresses routed by two public networks at random; after a public network address is assigned to VPN Connection of an opposite terminal region, it needs to update customer gateway public network address in JD Cloud & AI's home terminal region;<br />

For more details, please refer to [Customer Gateway Management](../Operation-Guide/Customer-Gateway-Management/Customer-Gateway-Configuration.md).

###### Step 5: Create a border gateway at an opposite terminal region of JD Cloud & AI

a) Log in [Border Gateway Console](https://cns-console.jdcloud.com/host/borderGateway/list);  <br />
b) Select an opposite terminal region using VPN and click **Create Border Gateway**;<br />
c) The border gateway supports operation of BGP route protocol. BGP ASN of the existing Border Gateway is fixed to be 65,000 and will be open for modification subsequently;<br />

For more details, please refer to [Border Gateway Management](../Operation-Guide/Border-Gateway-Management/Border-Gateway-Configuration.md).

###### Step 6: Create VPC attachment at an opposite terminal region of JD Cloud & AI

a) Log in [VPC Attachment Console](https://cns-console.jdcloud.com/host/vpcAttachment/list);  <br />
b) Select an opposite terminal region using VPN and Click **Create VPC Attachment**;<br />
c) Select the border gateway created in Step 5, select a VPC where the border gateway route traffic can pass through and select a VPC segment transmitted to the border gateway; after VPC Attachment is created, the selected segments will be automatically added to the transmission route table of the border gateway; the next hot redirects to the VPC attachment created in this step;<br />

For more details, please refer to [VPC Attachment Management](../Operation-Guide/Border-Gateway-Management/VPC-Attachment-Configuration.md).

###### Step 7: Create a customer gateway at an opposite terminal region of JD Cloud & AI

a) Log in [Customer Gateway Console](https://cns-console.jdcloud.com/host/customerGateway/list);  <br />
b) Select an opposite terminal region using VPN and click **Create Customer Gateway**;<br />
c) The customer gateway is a logic presentation of client VPN device at the cloud and the customer will create VPN connected based on the Border Gateway and the Customer Gateway. The customer gateway itself only represents relevant information of the client device (``only relates to public network address and BGP ASN, without the concept of specific geological location``) and does not have any region attribute theoretically. However, as almost every cloud resource has its region attribute, the Customer Gateway is distributed with the region attribute. Customer gateways of the same configuration can be repeatedly created in different regions, but are only available in the resource creation region, without any influence to another region.<br />
d) If the client device supports the BGP route protocol, use of BGP route is recommended and please designate client BGP ASN; as the border gateway of JD Cloud & AI only supports fixed BGP ASN now, the EBGP route cannot be run between two border gateways, and operation of static route is only supported;<br />
e) Configure two public addresses at the client and appoint addresses routed by two public networks at random; after a public network address is assigned to VPN Connection of a home terminal region, it needs to update customer gateway public network address in JD Cloud & AI's opposition terminal region;<br />

For more details, please refer to [Customer Gateway Management](../Operation-Guide/Customer-Gateway-Management/Customer-Gateway-Configuration.md).

###### Step 8: Create VPN connection at an opposite terminal region of JD Cloud & AI

a) Log in [VPN Connection Console](https://cns-console.jdcloud.com/host/vpnConnection/list);  <br />
b) Select an opposite terminal region using VPN and Click **Create VPN Connection**;<br />
c) Select a border gateway used for creating VPN connection;<br />
d) Select a customer gateway representing client VPN device;<br />
e) Select the connection type. Now, only inner layer addresses and outer layer addresses, configured as the IPv4 address family, are supported, and the IPv6 address family will be supported in future;<br />
f) Select to enable BGP route or not; based on the consideration to high business availability, the BGP route is enabled by default, but the static route still can be effective; in such case, it is suggested to uncheck **Enable BGP Route**;<br />
g) After VPN connection is created, two cloud public network addresses will be automatically distributed for creating a VPN tunnel with client public network address;<br />

For more details, please refer to [VPN Connection Management](../Operation-Guide/VPN-Connection-Management/VPN-Connection-Configuration.md).

###### Step 9: Update the public network address for customer gateway in the home terminal region of JD Cloud & AI

Update two public network addresses of customer gateway in a home terminal region with two cloud public network addresses distributed by VPN Connection in the opposite terminal region.

###### Step 10: Create VPN connection a home terminal region of JD Cloud & AI

a) Log in [VPN Connection Console](https://cns-console.jdcloud.com/host/vpnConnection/list);  <br />
b) Select a home terminal region using VPN and Click **Create VPN Connection**;<br />
c) Select a border gateway used for creating VPN connection;<br />
d) Select a customer gateway representing client VPN device;<br />
e) Select the connection type. Now, only inner layer addresses and outer layer addresses, configured as the IPv4 address family, are supported, and the IPv6 address family will be supported in future;<br />
f) Select to enable BGP route or not; based on the consideration to high business availability, the BGP route is enabled by default, but the static route still can be effective; in such case, it is suggested to uncheck **Enable BGP Route**;<br />
g) After VPN connection is created, two cloud public network addresses will be automatically distributed for creating a VPN tunnel with client public network address;<br />

For more details, please refer to [VPN Connection Management](../Operation-Guide/VPN-Connection-Management/VPN-Connection-Configuration.md).

###### Step 11: Update the public network address for customer gateway in the opposite terminal region of JD Cloud & AI

Update two public network addresses of customer gateway in an opposite terminal region with two cloud public network address distributed by VPN Connection in the home terminal region.

###### Step 12: Create VPN tunnel at a home terminal region of JD Cloud & AI

a) Log in [VPN Connection Console](https://cns-console.jdcloud.com/host/vpnConnection/list);  <br />
b) Select a home terminal region using VPN and select **VPN Connection**;<br />
c) Click **Add Tunnel** in the "Resource Information" Tab and automatically initialize the creation page of two tunnels; the two-end public network addresses of the first tunnel refer to the first one of cloud public network address for VPN Connection and the first public network address of the customer gateway; the two-end public network addresses of the second tunnel refer to the second cloud public network address and the second public address of customer gateway; <br />
d) All VPN tunnels of the same VPN connection shall use the same route methods, that is, route method set on the VPN connection;<br />
e) Respectively configure parameters for two-stage negotiations of each VPN tunnel, including IKE version, pre-sharing key, two-end gateway identification of tunnel, inner layer IP of tunnel (for route data package in tunnel; as the static route uses the point-to-point tunnel, the inner layer address cannot come into effect and no conflicts will occur in such scenario, thus can be omitted) as well as certification algorithm, encryption algorithm and SA statement cycle for two stages;<br />

```
  For overall consideration of safety and performance, a default tunnel IKE and recommended configuration of IPsec are provided. Customers are suggested to make a negotiation on setting up a VPN tunnel as per recommended configuration.
```

f) Where several tunnels are created, to simplify the configuration process, other tunnels can reuse configuration parameters of IKE and IPsec of the tunnel 1; meanwhile, IKE and IPsec configuration parameters can also be customized for each tunnel;<br />

For more details, please refer to [VPN Tunnel Management](../Operation-Guide/VPN-Connection-Management/VPN-Tunnel-Configuration.md).

###### Step 13: Create VPN tunnel at an opposite terminal region of JD Cloud & AI

a) Log in [VPN Connection Console](https://cns-console.jdcloud.com/host/vpnConnection/list);  <br />
b) Select an opposite terminal region using VPN and select **VPN Connection**;<br />
c) Click **Add Tunnel** in the "Resource Information" Tab and automatically initialize the creation page of two tunnels; the two-end public network addresses of the first tunnel refer to the first one of cloud public network address for VPN Connection and the first public network address of the customer gateway; the two-end public network addresses of the second tunnel refer to the second cloud public network address and the second public address of customer gateway; <br />
d) All VPN tunnels of the same VPN connection shall use the same route methods, that is, route method set on the VPN connection;<br />
e) According to the designated configuration while creating VPN tunnels for home terminal region, respectively configure parameters for two-stage negotiations of each VPN tunnel in an opposite terminal region, including IKE version, pre-sharing key, two-end gateway identification of tunnel, inner layer IP of tunnel (for route data package in tunnel; as the static route uses the point-to-point tunnel, the inner layer address cannot come into effect and no conflicts will occur in such scenario, thus can be omitted) as well as certification algorithm, encryption algorithm and SA statement cycle for two stages;<br />

```
  For overall consideration of safety and performance, a default tunnel IKE and recommended configuration of IPsec are provided. Customers are suggested to make a negotiation on setting up a VPN tunnel as per recommended configuration.
```

f) Where several tunnels are created, to simplify the configuration process, other tunnels can reuse configuration parameters of IKE and IPsec of the tunnel 1; meanwhile, IKE and IPsec configuration parameters can also be customized for each tunnel;<br />

For more details, please refer to [VPN Tunnel Management](../Operation-Guide/VPN-Connection-Management/VPN-Tunnel-Configuration.md).

###### Step 8: Configure routing at JD Cloud & AI

a) VPN connection of JD Cloud & AI supports static route/BGP dynamic route between the cloud and the client. Please use the static route here;<br />
b) Configuration method of different routes:<br />
  * Configure static route and configure a static route to a client in the static route table of border gateway, with client segment serving as the target end and VPN connection serving as next hop. Configure the client VPN device with a static route to the cloud, with cloud segment serving as the target end and VPN tunnel API serving as the next hop.<br />
  * Configure BGP dynamic route. After a BGP session is set up by the border gateway and the client VPN device, the border gateway will automatically release all routes configured to the Peer client, and the client needs to release client segment to the Peer cloud.<br />
c) Whichever routing protocol is executed between the border gateway and the client VPN device, as VPC Attachment is set up between the border gateway and VPC and route transmission is set up, the route to the client segment will automatically transmitted to the VPC Route Table. See [VPC Attachment Route Transmission](https://docs.jdcloud.com/cn/direct-connection/vpc-interface-features);<br />

For more details, please refer to [Configure Border Gateway Route](../Operation-Guide/Route-Management/Border-Gateway-Route-Configuration.md) and [Configure VPC Route](../Operation-Guide/Route-Management/VPC-Route-Configuration.md).

###### Step 9: Test connectivity

a) Log in [JD Cloud & AI Virtual Machine Console](https://cns-console.jdcloud.com/host/compute/list). In the region where VPN connection is created, create one Virtual Machine for the home terminal VPC intended to be interconnected with VPC intranet segments in an opposite terminal region and confirm whether the route table of subnet of such Virtual Machine has the route used for correctly routing to the VPC intranet segment of an opposition terminal region;  <br />
b) Create one Virtual Machine in the opposite terminal region with the same method in item a and configure a corresponding route for routing to VPC in the home terminal region; <br />
b) Use ping of Virtual Machines created in a and the intranet address of Virtual Machines created in B to verify if intranet communication is normal; if yes, execute ping test reversely; if such test is passed, the normal use is allowed;<br />
