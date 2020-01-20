## VPN Connects to Amazon AWS
This Tutorial will guide you how to establish private connection between JD Cloud VPC and Amazon AWS VPC by virtue of JD Cloud IPsec VPN.

### Business Scenarios
A customer deploys businesses to services offered by a number of public cloud manufacturers in consideration of business availability, and requires access to each other or disturbance switching among multiple businesses.</br>
![](../../../../image/Networking/VPN/Best-Practices/connection-with-amazon.png)

### Precondition
The segment in JD Cloud VPC cannot overlap with that in Amazon AWS VPC.

### Detailed Steps
###### Step 1. JD Cloud creates a border gateway

a) Log in [JD Cloud Border Gateway Console](https://cns-console.jdcloud.com/host/borderGateway/list);  </br>
b) Select the region using VPN, and click to create a border gateway;</br>
c) The border gateway supports running BGP routing protocol. The BGP ASN of current JD Cloud border gateway is fixed to 65000, which will be open to modify in the future;</br>

For more contents, refer to [Border Gateway Management](../Operation-Guide/Border-Gateway-Management/Border-Gateway-Configuration.md).

###### Step 2. JD Cloud creates a VPC attachment
a) Log in [JD Cloud VPC Attachment Console](https://cns-console.jdcloud.com/host/vpcAttachment/list);  </br>
b) Select the region using VPN, and click to create a VPC attachment;</br>
c) Select the border gateway created in Step 1, select the VPC that passes the route traffic of this border gateway, and select the VPC segment to be transmitted to this border gateway. After the VPC attachment is created, the segment selected will be automatically added to the transmission route table of this border gateway, and the Next Hop will point to the VPC attachment created in this step;</br>

For more contents, refer to [VPC Attachment Management](../Operation-Guide/Border-Gateway-Management/VPC-Attachment-Configuration.md).

###### Step 3. JD Cloud creates a customer gateway
a) Log in [JD Cloud Customer Gateway Console](https://cns-console.jdcloud.com/host/customerGateway/list);  </br>
b) Select the region using VPN, and click to create a customer gateway;</br>
c) The customer gateway is the logical representation of client VPN device on cloud, and the customer will create VPN connection based on border gateway and customer gateway. The customer gateway itself only represents relevant information of the client device (``which is only related to public network address and BGP ASN and has no concept of specific geographic location``), and do not have a regional attribute theoretically. However, as almost all of the resources in cloud have regional attribute, the customer gateway is assigned with a regional attribute. The customer gateways with the same configuration can be repeatedly created in different regions without affecting each other.</br>
d) If the client device supports BGP routing protocol, please designate BGP ASN of the client;</br>
e) The client has configured four public network addresses and given four of any of the public network routable addresses. After Amazon is assigned with a public network address, the public network address of JD Cloud customer gateway needs to be updated;</br>

For more contents, refer to [Customer Gateway Management](../Operation-Guide/Customer-Gateway-Management/Customer-Gateway-Configuration.md).

###### Step 4. JD Cloud creates VPN connection
a) Log in [JD Cloud VPN Connection Console](https://cns-console.jdcloud.com/host/vpnConnection/list);  </br>
b) Select the region using VPN, and click to create a VPN connection;</br>
c) Select the border gateway used to implement the cloud VPN gateway function;</br>
d) Select the customer gateway representing the client VPN device;</br>
e) Select the connection type. The inner and outer addresses of the tunnel can only be IPv4 address family at present and IPv6 address family is available in the future;</br>
f) Select whether to enable BGP route or not. The BGP route is enabled by default in consideration of business high availability, so BGP sessions will be established based on border gateway and customer gateway;</br>
g) After the VPN connection is created, two cloud public network addresses will be automatically allocated for setting up a VPN tunnel to client public network addresses;</br>

For more contents, refer to [VPN Connection Management](../Operation-Guide/VPN-Connection-Management/VPN-Connection-Configuration.md).

###### Step 5. Amazon AWS creates VPN resources
Create the corresponding resources in Amazon AWS, including a VPC and a VGW, use the two public network addresses assigned by JD Cloud VPN connection to create two CGWs in Amazon, and then use the VGW and the two CGWs to create VPN Connection respectively.

###### Step 6. JD Cloud updates public network addresses of customer gateway
Use the AWS cloud public network addresses of the four tunnels assigned by VPN Connection of Amazon AWS to update the four public network addresses of JD Cloud customer gateway.

###### Step 5. JD Cloud creates VPN tunnel
a) Log in [JD Cloud VPN Connection Console](https://cns-console.jdcloud.com/host/vpnConnection/list);  </br>
b) Select the region using VPN, and select the VPN connection;</br>
c) Click **Add Tunnel** in the "Resource Information" Tab to automatically initialize the creation page of the four tunnels, in which the public network addresses at two ends of the first two tunnels are the first one in the cloud public network address of VPN connection and the first and second ones in the public network addresses of the customer gateway, and those of the latter two tunnels are the second one in the cloud public network address and the third and fourth ones in the public network address of the customer gateway; </br>
d) All VPN tunnels under the same VPN connection use the same routing mode, which is the routing mode set in VPN connection;</br>
e)``Based on tunnel configuration parameters created in Amazon AWS``, configure the parameters used by two-stage negotiation for each VPN tunnel of JD Cloud, including IKE version, pre-shared key, gateway identifier at two ends of tunnel, tunnel inner IP (used for routing data package in tunnel), as well as authentication algorithm, encryption algorithm and SA statement cycle at the two stages;</br>
```
In overall consideration of the security and performance, JD Cloud gives default tunnel IKE and IPsec configurations, so customers are recommended establishing VPN tunnels according to the recommended configurations through negotiation.
```
f) When a number of tunnels are created, other tunnels can duplicate the IKE and IPsec configuration parameters of Tunnel 1 to simply the configuration process. Users can also customize the IKE and IPsec configuration parameters of each tunnel;</br>

For more contents, refer to [VPN Tunnel Management](../Operation-Guide/VPN-Connection-Management/VPN-Tunnel-Configuration.md).

###### Step 7. Configure BGP (optional)
a) JD Cloud supports running EBGP routing protocol with VPN client device using a different BGP ASN from JD Cloud border gateway. For BGP ASN used by JD Cloud, refer to [Border Gateway ASN](../Operation-Guide/Border-Gateway-Management/Border-Gateway-Configuration.md);</br>
b) The interconnection address used to establish BGP is the inner address of the tunnel. For details, refer to [VPN Tunnel Management](../Operation-Guide/VPN-Connection-Management/VPN-Tunnel-Configuration.md);</br>
c)``Whether or not the BGP routing is configured, customers can configure static route at the border gateway to forward data``;</br>

###### Step 8. Configure routing
a) JD Cloud VPN connection supports using static route/BGP dynamic route between cloud and client, and using BGP dynamic route to automatically update route is recommended;</br>
b) Configuration methods of different routes:</br>
  * Configure static route. In the configuration of static route to client in the static route table of border gateway, the Target End should be client segment and the Next Hop should be VPN connection. In the configuration of static route to cloud in client VPN device, the Target End should be cloud segment and the Next Hop should be attachment to VPN tunnel;</br>
  * Configure BGP dynamic route. After BGP sessions are established between border gateway and client VPN device, the border gateway will automatically release all routes configured to Peer client, and the client needs to release the client segment route to Peer cloud.</br>
c) Whichever routing protocol is run between border gateway and client VPN device, because a VPC attachment is created between border gateway and VPC as well as setting route transmission, the route to client segment will also be automatically transmitted to VPC route table. Refer to [VPC Attachment Route Transmission](https://docs.jdcloud.com/en/direct-connection/vpc-interface-features);</br>

For more contents, refer to [Border Gateway Route Configuration (../Operation-Guide/Route-Management/Border-Gateway-Route-Configuration.md) and [VPC Route Configuration](../Operation-Guide/Route-Management/VPC-Route-Configuration.md).

###### Step 9. Test connectivity
a) Log in [JD Cloud Virtual Machines Console](https://cns-console.jdcloud.com/host/compute/list), in the region where VPN connection is created, create one Virtual Machines in the VPC to be interconnected to the IDC intranet segment of the enterprise, and confirm that the route properly connected to the IDC intranet segment of the enterprise exists in the route table of the Subnet of this Virtual Machines;  </br>
b) Use the Virtual Machines created in a to ping the intranet address of one instance in enterprise IDC intranet in order to verify whether the intranet communication is normal;</br>
