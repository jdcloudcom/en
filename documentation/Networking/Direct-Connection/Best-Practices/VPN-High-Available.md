## VPN High Availability Solution
This Tutorial will guide you how to establish high-availability private connection between enterprise IDC and public cloud VPC by virtue of JD Cloud & AI IPsec VPN.

### Business Scenarios
For core businesses or businesses not suitable for JD Cloud Onboarding, which are deployed in the self-established IDC, and non-core/expanded businesses deployed in JD Cloud & AI VPC by customers, it is necessary to open up the network environment between IDC and public cloud VPC so as to achieve intranet communication while guaranteeing high availability of businesses.</br>
![](../../../../image/Networking/VPN/Best-Practices/vpn-high-available.png)

### Precondition
* The segment in enterprise IDC cannot overlap with that in public cloud VPC.
* The VPN connection runs BGP routing protocol.

For the requirements for client device, refer to [Use Restrictions](../Introduction/Restrictions.md).

### Detailed Steps
###### Step 1. Create Border Gateway

a) Log in [JD Cloud & AI Border Gateway Console](https://cns-console.jdcloud.com/host/borderGateway/list);  </br>
b) Select the region using the VPN, and click **Create Border Gateway**;</br>
c) The border gateway supports running BGP routing protocol. The BGP ASN of current JD Cloud & AI border gateway is fixed to 65000, which will be open to modify in the future;</br>

For more contents, refer to [Border Gateway Management](../Operation-Guide/Border-Gateway-Management/Border-Gateway-Configuration.md).

###### Step 2. Create VPC Attachment
a) Log in [JD Cloud & AI VPC Attachment Console](https://cns-console.jdcloud.com/host/vpcAttachment/list);  </br>
b) Select the region using the VPN, and click **Create VPC Attachment**;</br>
c) Select the border gateway created in Step 1, select the VPC that passes the route traffic of this border gateway, and select the VPC segment to be transmitted to this border gateway. After the VPC attachment is created, the segment selected will be automatically added to the transmission route table of this border gateway, and the Next Hop will point to the VPC attachment created in this step;</br>

For more contents, refer to [VPC Attachment Management](../Operation-Guide/Border-Gateway-Management/VPC-Attachment-Configuration.md).

###### Step 3. Create Customer Gateway
a) Log in [JD Cloud & AI Customer Gateway Console](https://cns-console.jdcloud.com/host/customerGateway/list);  </br>
b) Select the region using VPN, and click **Create Customer Gateway**;</br>
c) The customer gateway is the logical representation of client VPN device on cloud, and the customer will create VPN connection based on border gateway and customer gateway. The customer gateway itself only represents relevant information of the client device (``which is only related to public network address and BGP ASN and has no concept of specific geographic location``), and do not have a regional attribute theoretically. However, as almost all of the resources in cloud have regional attribute, the customer gateway is assigned with a regional attribute. The customer gateways with the same configuration can be repeatedly created in different regions without affecting each other.</br>
d) If the client device supports BGP routing protocol, please designate BGP ASN of the client;</br>
e) The client supports configuring multiple public network addresses, but in consideration of business high availability, select client double IP to create the customer gateway;</br>

For more contents, refer to [Customer Gateway Management](../Operation-Guide/Customer-Gateway-Management/Customer-Gateway-Configuration.md).

###### Step 4. Create VPN Connection
a) Log in [JD Cloud & AI VPN Connection Console](https://cns-console.jdcloud.com/host/vpnConnection/list);  </br>
b) Select the region using VPN, and click **Create VPN Connection**;</br>
c) Select the border gateway used to implement the cloud VPN gateway function;</br>
d) Select the customer gateway representing the client VPN device;</br>
e) Select the connection type. The inner and outer addresses of the tunnel can only be IPv4 address family at present and IPv6 address family is available in the future;</br>
f) Select whether to enable BGP route or not. The BGP route is enabled by default in consideration of business high availability, so BGP sessions will be established based on border gateway and customer gateway;</br>
g) After the VPN connection is created, two cloud public network addresses will be automatically allocated for setting up a VPN tunnel to client public network addresses;</br>

For more contents, refer to [VPN Connection Management](../Operation-Guide/VPN-Connection-Management/VPN-Connection-Configuration.md).

###### Step 5. Create VPN Tunnel
a) Log in [JD Cloud & AI VPN Connection Console](https://cns-console.jdcloud.com/host/vpnConnection/list);  </br>
b) Select the region using VPN, and select the VPN connection;</br>
c) Click **Add Tunnel** in the "Resource Information" Tab to automatically initialize the creation page of the two tunnels, in which the IPs at two ends of a tunnel are one of the cloud IPs of VPN connection and one of the public network addresses of the customer gateway, and those of the other tunnel are the other one of the cloud IPs and the other one of the public network address of the customer gateway; </br>
e) Configure the parameters used by two-stage negotiation for each VPN tunnel, including IKE version, pre-shared key pair, gateway identifier at two ends of tunnel, tunnel inner IP (used for routing data package in tunnel), as well as authentication algorithm, encryption algorithm and SA statement cycle at the two stages;</br>

```
In overall consideration of the security and performance, JD Cloud & AI gives default tunnel IKE and IPsec configurations, so customers are recommended establishing VPN tunnels according to the recommended configurations through negotiation.
```

For more contents, refer to [VPN Tunnel Management](../Operation-Guide/VPN-Connection-Management/VPN-Tunnel-Configuration.md).

###### Step 6. Configure VPN client
a) The current [JD Cloud & AI VPN Connection Console](https://cns-console.jdcloud.com/host/vpnConnection/list) does not provide VPN tunnel client configuration and download functions;</br>
b) For the list of supported client routers/firewall devices tested, refer to [Use Restrictions](../Introduction/Restrictions.md). There is little difference of VPN configuration items among various platforms and software versions provided by the same manufacturer, so you can set it according to the recommended client configuration of the same series that passed the test. If any question, please consult your device provider;</br>
c) For device manufacturer models that are not listed in b, you can conduct standard IPsec configuration according to the configuration manual offered by the device manufacturer;</br>
d)``After the client VPN device configuration is completed, the cloud will take initiative to initiate a negotiation to establish a tunnel by default``, and then you can view whether the tunnel running status is updated to "UP" in [JD Cloud & AI Console](https://console.jdcloud.com/overview). If it is "UP", the tunnel negotiation succeeded; if it is "DOWN", please refer to [FAQ](../FAQ/FAQ.md) for fault handling;</br>

For more contents, refer to [VPN Client Management](../Operation-Guide/Client-Site-Configuration/Cisco-Configuration.md).

###### Step 7. Configure BGP
a) JD Cloud & AI supports running EBGP routing protocol with VPN client device using a different BGP ASN from JD Cloud & AI border gateway. For BGP ASN used by JD Cloud & AI, refer to [Border Gateway ASN](../Operation-Guide/Border-Gateway-Management/Border-Gateway-Configuration.md);</br>
b) The interconnection address used to establish BGP is the inner address of the tunnel. For details, refer to [VPN Tunnel Management](../Operation-Guide/VPN-Connection-Management/VPN-Tunnel-Configuration.md);</br>
c) Other configurations of cloud BGP use the default configurations that can be modified on the client device;</br>

###### Step 8. Configure routing
a) JD Cloud & AI VPN connection supports using BGP dynamic route between cloud and client;</br>
b) Configure the route transmission of the border gateway route table and the VPC route table;</br>

For more contents of route transmission, refer to [Border Gateway Route Configuration](../Operation-Guide/Route-Management/Border-Gateway-Route-Configuration.md) and [VPC Route Configuration](../Operation-Guide/Route-Management/VPC-Route-Configuration.md).

###### Step 9. Test connectivity and verify route switch
a) Log in [JD Cloud & AI Virtual Machines Console](https://cns-console.jdcloud.com/host/compute/list), in the region where the service is created, create one Virtual Machines in the VPC to be interconnected to the IDC intranet segment of the enterprise, and confirm that the route properly connected to the IDC intranet segment of the enterprise exists in the route table of the Subnet of this Virtual Machines;  </br>
b) Use the Virtual Machines created in a to ping the intranet address of one instance in enterprise IDC intranet in order to verify whether the intranet communication is normal;</br>
c) On the client router, break off the BGP session of one of the VPN tunnel, or remove its route, or place DOWN at the port of its route, and view whether the traffic is switched to another VPN tunnel, if yes, then establish the first VPN tunnel and route;</br>
