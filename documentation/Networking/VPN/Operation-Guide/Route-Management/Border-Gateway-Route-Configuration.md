## Border Gateway Route Configuration
After configuration of VPN Connection and VPN Tunnel on cloud is completed, corresponding routes including Border Gateway Route Table route and VPC Route Table route shall be configured.

```
  If you operate BGP Routing Protocol between Border Gateway and Customer Gateway, you shall operate EBGP and establish BGP session based on VPN Tunnel IP, Border Gateway ASN and Customer Gateway ASN.

  After you declare client segment on client routing devices, Border Gateway establishing BGP session with it will automatically learn client route into dynamic route table on Border Gateway by virtue of BGP Protocol, and you do not need to add the client route manually into static route table on Border Gateway. Meanwhile, Border Gateway automatically declare the routes in its valid route table to routing devices on client.
```

The following steps are descriptions for configuration of static route on Border Gateway ("based on the consideration of business high availability, you are recommended to use BGP route").

### Operation Steps
##### 1. Create VPC Attachment
For creation of VPC Attachment and setting of VPC transmission segment, refer to [VPC Attachment Management](../../Operation-Guide/Border-Gateway-Management/VPC-Attachment-Configuration.md).

##### (Selectable) 2. Border Gateway route table adds route to VPC
If VPC Attachment is created with no VPC segment being assigned for transmission, routes to VPC can be manually added.
a) Log in [Border Gateway Console](https://cns-console.jdcloud.com/host/borderGateway/list);  <br />
b) Click corresponding border gateway and enter border gateway Details Page;<br />
c) The "Route Table" Tab will display effective, static and dynamic route tables on current Border Gateway, click **Edit** on "Static Route Table" and select **Add One**. Target End is targeted VPC Intranet segment(such as: 192.168.0.0/24), Type of Next Hop is VPC Attachment and Next Hop is VPC Attachment created with VPC. Comments can be added to the route. For more content of Border Gateway Route Going Into Effect, refer to [Border Gateway Route Management](https://docs.jdcloud.com/en/direct-connection/border-gateway-features);

```
  Valid route table stores all valid route clauses in Border Gateway.
  Static route table stores all route clauses added manually in Border Gateway.
  Dynamic route table stores all route clauses learned through BGP dynamic route and route transmission in Border Gateway.
```

##### 3. Border Gateway route table adds route to client
a) Log in [Border Gateway Console](https://cns-console.jdcloud.com/host/borderGateway/list);  <br />
b) Click corresponding border gateway and enter border gateway Details Page;<br />
c) If BGP routing is enabled for VPN connection setting and BGP session can be normally set between the Border Gateway and the Customer Gateway, the Border Gateway can automatically add the client routing to the Route Table without addition configuration of static route after the routing is released by the client;<br />

![](../../../../../image/Networking/VPN/Operation-Guide/vpn-route-bgp.png)

d) Configuration of static routing can be selected; in "Route Table" Tab, click **Edit** on "Static Route Table" and select **Add One**; the Target End is the targeted client segment (for example: 10.0.0.0/16); Type of Next Hop is VPN Connection, and the Next Hop is the VPN Connection created between Customer Gateways; remarks can be added to this routing;<br />


```
  Because there are multiple VPN tunnels contained in VPN Connection, it is defaulted that traffic flows through all VPN tunnels with tunnel status as "UP". You shall disconnect or disable the tunnel if you want to prevent traffic from flowing through certain VPN tunnel.
```
