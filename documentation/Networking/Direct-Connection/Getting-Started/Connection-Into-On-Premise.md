## Enterprise IDC connects to Public Cloud
This Tutorial will guide you how to establish private connection between enterprise IDC and public cloud VPC by virtue of JD Cloud & AI Direct Connect.

### Business Scenarios
For core businesses or businesses not suitable for JD Cloud Onboarding, which are deployed in the self-established IDC, and non-core/expanded businesses deployed in JD Cloud & AI VPC by customers, it is necessary to open up the network environment between IDC and public cloud VPC so as to achieve intranet communication.</br>
![](../../../../image/Networking/VPN/Getting-Started/connection-into-idc.png)

### Precondition
Before using the direct connection, please first read the relevant information [Use Restrictions](../Introduction/Restrictions.md)

### Configuration Steps
![](../../../../image/Networking/VPN/Getting-Started/connection-into-idc-step.png)

### Detailed Steps
###### Step 1. Create Physical Connection
a) Log in [JD Cloud & AI Physical Connection Console](https://cns-console.jdcloud.com/host/physicalConnection/list);  </br>
b) Select region and click **Create**;</br>
c) Enter the connection name, description, access method, customer’s IDC address, partners/operator (partners access), access point (self-service access), optional customer contacts and contact information, and create physical connection;</br>
d) After created, the physical connection is in the status of to be audited. JD Cloud & AI will complete the review within 1~2 working days after receiving your physical connection application. You can also contact and confirm with JD Cloud & AI;
e) After the review approval and payment completion, JD Cloud & AI will lay the physical circuit in cooperation with your circuit provider, and

![](../../../../../image/Networking/VPN/Operation-Guide/create-vpnconnection.png)




###### Step 2. Create Border Gateway

a) Log in [JD Cloud & AI Border Gateway Console](https://cns-console.jdcloud.com/host/borderGateway/list);  </br>
b) Select the region using the VPN, and click **Create Border Gateway**;</br>
c) The border gateway supports running BGP routing protocol. The BGP ASN of current JD Cloud & AI border gateway is fixed to 65000, which will be open to modify in the future;</br>
For more contents, refer to [Border Gateway Management](../Operation-Guide/Border-Gateway-Management/Border-Gateway-Configuration.md).

###### Step 3. Create VPC Attachment
a) Log in [JD Cloud & AI VPC Attachment Console](https://cns-console.jdcloud.com/host/vpcAttachment/list);  </br>
b) Select the region using the VPN, and click **Create VPC Attachment**;</br>
c) Select the border gateway created in Step 1, select the VPC that passes the route traffic of this border gateway, and select the VPC segment to be transmitted to this border gateway. After the VPC attachment is created, the segment selected will be automatically added to the transmission route table of this border gateway, and the Next Hop will point to the VPC attachment created in this step;</br>

For more contents, refer to [VPC Attachment Management](../Operation-Guide/Border-Gateway-Management/VPC-Attachment-Configuration.md).

###### Step 4. Create Private Virtual Interface
a) Log in [JD Cloud & AI VPN Connection Console](https://cns-console.jdcloud.com/host/vpnConnection/list);  </br>
b) Select the region using VPN, and click **Create VPN Connection**;</br>
c) Select the border gateway used to implement the cloud VPN gateway function;</br>
d) Select the customer gateway representing the client VPN device;</br>
e) Select the connection type. The inner and outer addresses of the tunnel can only be IPv4 address family at present and IPv6 address family is available in the future;</br>
f) Select whether to enable BGP route or not. The BGP route is enabled by default in consideration of business high availability, so BGP sessions will be established based on border gateway and customer gateway;</br>
g) After the VPN connection is created, two cloud public network addresses will be automatically allocated for setting up a VPN tunnel to client public network addresses;</br>

For more contents, refer to [VPN Connection Management](../Operation-Guide/VPN-Connection-Management/VPN-Connection-Configuration.md).

###### Step 6. Configure connection client
a) At present [JD Cloud & AI VPN Connection Console](https://cns-console.jdcloud.com/host/vpnConnection/list), downloading function for VPN Tunnel client configuration is not provided, and you shall refer to client configuration example for configuration of client devices, e.g. [Cisco Client Configuration](../Operation-Guide/Client-Site-Configuration/Cisco-Configuration.md);</br>
b) For the list of supported client routers/firewall devices tested, refer to [Use Restrictions](../Introduction/Restrictions.md). There is little difference of VPN configuration items among various platforms and software versions provided by the same manufacturer, so you can set it according to the recommended client configuration of the same series that passed the test. If any question, please consult your device provider;</br>
c) For device manufacturer models that are not listed in b, you can conduct standard IPsec configuration according to the configuration manual offered by the device manufacturer;</br>
d)``After the client VPN device configuration is completed, the cloud will take initiative to initiate a negotiation to establish a tunnel by default``, and then you can view whether the tunnel running status is updated to "UP" in [JD Cloud & AI Console](https://console.jdcloud.com/overview). If it is "UP", the tunnel negotiation succeeded; if it is "DOWN", please refer to [FAQ](../FAQ/FAQ.md) for fault handling;</br>

###### Step 7. Configure BGP (optional)
a) JD Cloud & AI supports running EBGP routing protocol with VPN client device using a different BGP ASN from JD Cloud & AI border gateway. For BGP ASN used by JD Cloud & AI, refer to [Border Gateway ASN](../Operation-Guide/Border-Gateway-Management/Border-Gateway-Configuration.md);</br>
b) Tunnel’s inner layer address is recommended as the interconnection address to be used by BGP, and for details, refer to [Tunnel Inner Layer](../Operation-Guide/VPN-Connection-Management/VPN-Tunnel-Configuration.md);</br>
c) Other configurations of cloud BGP use the default configurations that can be modified on the client device;</br>
d) "Whether or not BGP route is configured, customer can configure static route on border gateway to forward data", and under normal circumstances, static route is superior to BGP route. For exceptions, refer to [Border Gateway Route Management](https://docs.jdcloud.com/en/direct-connection/border-gateway-features).</br>

###### Step 8. Configure routing
a) JD Cloud & AI VPN connection supports using static route/BGP dynamic route between cloud and client, and using BGP dynamic route to automatically update route is recommended;</br>
b) Configuration methods of different routes:</br>
  * Configure static route. In the configuration of static route to client in the static route table of border gateway, the Target End should be client segment and the Next Hop should be VPN connection. In the configuration of static route to cloud in client VPN device, the Target End should be cloud segment and the Next Hop should be attachment to VPN tunnel;</br>
  * Configure BGP dynamic route. After BGP sessions are established between border gateway and client VPN device, the border gateway will automatically release all routes configured to Peer client, and the client needs to release the client segment route to Peer cloud.</br>
c) Whichever routing protocol is run between border gateway and client VPN device, because a VPC attachment is created between border gateway and VPC as well as setting route transmission, the route to client segment will also be automatically transmitted to VPC route table. Refer to [VPC Attachment Route Transmission](https://docs.jdcloud.com/en/direct-connection/vpc-interface-features);</br>

For more contents, refer to [Border Gateway Route Configuration (../Operation-Guide/Route-Management/Border-Gateway-Route-Configuration.md) and [VPC Route Configuration](../Operation-Guide/Route-Management/VPC-Route-Configuration.md).

###### Step 9. Test connectivity
a) Log in [JD Cloud & AI Virtual Machines Console](https://cns-console.jdcloud.com/host/compute/list), in the region where VPN connection is created, create one Virtual Machines in the VPC to be interconnected to the IDC intranet segment of the enterprise, and confirm that the route properly connected to the IDC intranet segment of the enterprise exists in the route table of the Subnet of this Virtual Machines;  </br>
b) Use the Virtual Machines created in a to ping the intranet address of one instance in enterprise IDC intranet in order to verify whether the intranet communication is normal;</br>

###### Step 10. Tunnel Maintenance
a) If client devices need to be maintained or cloud components need to be upgraded, certain tunnel shall be temporarily suspended/disconnected with the traffic flowing through tunnel being switched to other tunnels available. In order to ensure no impact on normal business, please "disable" the tunnel before disconnecting it. After completion of maintenance for client devices and upgrade for cloud components, you shall use the "restarted", renegotiated and re-established tunnel to carry business traffic;</br>
b) Please "disable" the tunnel before changing its configuration, for example, IKE and IPsec configuration and pre-shared key pair of the tunnel need to be updated. After the tunnel is disabled, the original tunnel will be disconnected and its configuration will be disabled either. After the VPN tunnel on cloud and client is updated, you shall "restart" the tunnel and re-negotiate and re-establish the tunnel with new configuration;</br>
c) The above a and b only listed operations for the tunnel. Please note: you shall remove routes of the tunnel from client devices before "disabling" the tunnel, and add the routes of the tunnel to client device after "enabling" the tunnel;</br>

For more contents, refer to [VPN Tunnel Management](../Operation-Guide/VPN-Connection-Management/VPN-Tunnel-Configuration.md).

for details of billing method for VPN, refer to[VPN Billing](../Pricing/Billing-Overview.md).
