## Direct VPN Hybrid Cloud Solution
This Tutorial will guide you how to establish private connection between enterprise IDC and public cloud VPC by virtue of JD Cloud Direct Connection and VPN services.

### Business Scenarios
For core/non-suitable JD Cloud Onboarding businesses deployed in the self-established IDC and non-core/expanded businesses deployed in JD Cloud VPC by customers, it is necessary to open up the network environment between enterprise IDC and public cloud VPC by virtue of Direct Connection and VPN so as to achieve intranet communication.<br />

![](../../../../image/Networking/Direct-Connect-Service/Best-Practices/work-with-vpn.png)

### Preconditions
* The segment in enterprise IDC cannot overlap with that in public cloud VPC;
* The direct connection and VPN run the BGP routing protocol;

For the requirements of Direct Connection for client device, refer to [Use Restrictions](../Introduction/Restrictions.md).

### Configuration Steps
###### Step 1. Create Border Gateway

a) Log in [JD Cloud Border Gateway Console](https://cns-console.jdcloud.com/host/borderGateway/list);  <br />
b) Select the region using the services, and click **Create Border Gateway**;<br />
c) The border gateway supports running BGP routing protocol. The BGP ASN of current JD Cloud border gateway is fixed to 65000, which will be open to modify in the future;<br />
For more contents, refer to [Border Gateway Management](../Operation-Guide/Border-Gateway-Management/Border-Gateway-Configuration.md).

###### Step 2. Create VPC Attachment
a) Log in [JD Cloud VPC Attachment Console](https://cns-console.jdcloud.com/host/vpcAttachment/list);  <br />
b) Select the region using the services, and click **Create VPC Attachment**;<br />
c) Select the border gateway created in Step 1, select the VPC that passes the route traffic of this border gateway, and select the VPC segment to be transmitted to this border gateway. After the VPC attachment is created, the segment selected will be automatically added to the transmission route table of this border gateway, and the Next Hop will point to the VPC attachment created in this step;<br />

For more contents, refer to [VPC Attachment Management](../Operation-Guide/Border-Gateway-Management/VPC-Attachment-Configuration.md).

###### Step 3. Create Direct Connection
Refer to [Direct Connection Connects to Public Cloud](../Getting-Started/Connection-Into-On-Premise.md).

###### Step 4. Create VPN Connection
Refer to [VPN Connection Connects to Public Cloud](https://docs.jdcloud.com/en/vpn/connection-into-on-premise).

###### Step 5. Configure Routing
On the client router device, for the route released to VPC in the cloud by virtue of BGP routing protocol, the Next Hop should be respectively pointed to APIs of Direct Connection and VPN Connection, specifying that the private virtual interface should use a more elaborate route segment and the VPN Connection should use an aggregated route segment or that BGP AS_PATH of direct route should be shorter than BGP AS_PATH of VPN route in order to use direct route to carry traffic or use VPN route to carry traffic when the direct route is invalid.

###### Step 6. Test Connectivity and Verify Route Switch
a) Log in [JD Cloud Virtual Machines Console](https://cns-console.jdcloud.com/host/compute/list), in the region where the service is created, create one set of Virtual Machines in the VPC to be interconnected to the IDC intranet segment of the enterprise, and confirm that the route properly connected to the IDC intranet segment of the enterprise exists in the route table of the Subnet of this Virtual Machines;  <br />
b) Use the Virtual Machines created in a to ping the intranet address of one instance in enterprise IDC intranet in order to verify whether the intranet communication is normal;<br />
c) On the client router, break off the BGP session of direct connection, or remove the direct connection route, or place DOWN at the port of direct connection route, and view whether the traffic is switched to VPN connection, if yes, then switch the traffic back to the direct connection route;<br />
