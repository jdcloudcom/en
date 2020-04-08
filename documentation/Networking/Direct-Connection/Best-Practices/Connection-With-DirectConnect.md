## Direct VPN Hybrid Cloud Solutions
This Tutorial will guide you how to establish private connection between enterprise IDC and public cloud VPC by virtue of JD Cloud & AI Direct Connection and VPN services.

### Business Scenarios
For core businesses or businesses not suitable for JD Cloud Onboarding, which are deployed in the self-established IDC, and non-core/expanded businesses deployed in JD Cloud & AI VPC by customers, it is necessary to open up the network environment between enterprise IDC and public cloud VPC by virtue of Direct Connection and VPN so as to achieve intranet communication.</br>

![](../../../../image/Networking/VPN/Introduction/work-with-directconnect.png)

### Precondition
* The segment in enterprise IDC cannot overlap with that in public cloud VPC.
* The direct connection and VPN run the BGP routing protocol.

For the requirements of direct connection for client device, refer to [Conditions for Using Direct Connection Service](https://docs.jdcloud.com/en/direct-connection/direct-connect-service-overview).
For the requirements of VPN for client device, refer to [Use Restrictions](../Introduction/Restrictions.md).

### Configuration Steps
###### Step 1. Create Border Gateway

a) Log in [JD Cloud & AI Border Gateway Console](https://cns-console.jdcloud.com/host/borderGateway/list);  </br>
b) Select the region using the service, and click **Create Border Gateway**;</br>
c) The border gateway supports running BGP routing protocol. The BGP ASN of current JD Cloud & AI border gateway is fixed to 65000, which will be open to modify in the future;</br>
For more contents, refer to [Border Gateway Management](../Operation-Guide/Border-Gateway-Management/Border-Gateway-Configuration.md).

###### Step 2. Create VPC Attachment
a) Log in [JD Cloud & AI VPC Attachment Console](https://cns-console.jdcloud.com/host/vpcAttachment/list);  </br>
b) Select the region using the service, and click **Create VPC Attachment**;</br>
c) Select the border gateway created in Step 1, select the VPC that passes the route traffic of this border gateway, and select the VPC segment to be transmitted to this border gateway. After the VPC attachment is created, the segment selected will be automatically added to the transmission route table of this border gateway, and the Next Hop will point to the VPC attachment created in this step;</br>

For more contents, refer to [VPC Attachment Management](../Operation-Guide/Border-Gateway-Management/VPC-Attachment-Configuration.md).

###### Step 3. Create Direct Connect
Refer to [Create Direct Connection of the Same Account in the Same Region](https://docs.jdcloud.com/en/direct-connection/connect-to-the-same-account-or-region-direct-connetct).

###### Step 4. Create VPN connection, tunnel, client device and BGP
Refer to [Enterprise IDC Connects to Public Cloud](../Getting-Started/Connection-Into-On-Premise.md).

###### Step 5. Configure routing
On the client router device, for the route released to VPC in the cloud by virtue of BGP routing protocol, the Next Hop should be respectively pointed to interfaces of direct connection and VPN connection, specifying that BGP AS_PATH of direct connection should be shorter than BGP AS_PATH of VPN route in order to use direct connection route to carry traffic or use VPN route to carry traffic when the direct connection route is invalid.

###### Step 6. Test connectivity and verify route switch
a) Log in [JD Cloud & AI Virtual Machines Console](https://cns-console.jdcloud.com/host/compute/list), in the region where the service is created, create one Virtual Machines in the VPC to be interconnected to the IDC intranet segment of the enterprise, and confirm that the route properly connected to the IDC intranet segment of the enterprise exists in the route table of the Subnet of this Virtual Machines;  </br>
b) Use the Virtual Machines created in a to ping the intranet address of one instance in enterprise IDC intranet in order to verify whether the intranet communication is normal;</br>
c) On the client router, break off the BGP session of direct connection, or remove the direct connection route, or place DOWN at the port of direct connection route, and view whether the traffic is switched to VPN connection, if yes, then switch the traffic back to the direct connection route;</br>
