## Multi-VPC Interconnection on Cloud
This Tutorial will guide you how to implement multiple-VPC interconnection at the same region by virtue of Border Gateway.

### Business Scenarios
When less than three VPCs are required to be interconnected in the same region, try to use "VPC Peering", which has low time delay and simple configuration; when there are large amounts of VPCs required to be interconnected, you can create Border Gateway APIs connected to different VPCs based on Border Gateway to simplify the deployment configuration.

```
  Currently, only VPCs in the same account in the same region are supported for communication via the Border Gateway.
  Before interconnecting the multiple VPCs, you shall arrange all segments in VPCs to be interconnected and try to guarantee that the segments in VPCs will not overlap. If the segment overlap is unavoidable, you need to reasonably configure the range of route transmission of VPC and Border Gateway to guarantee there has no overlap of segment in the same route table. 
```

![](../../../../image/Networking/Direct-Connect-Service/Getting-Started/multiple-vpc-interconnection.png)

### Preconditions
Before using the direct connection, please first read the relevant information [Use Restrictions](../Introduction/Restrictions.md).

### Configuration Steps
![](../../../../image/Networking/Direct-Connect-Service/Getting-Started/multiple-vpc-interconnection-step.png)

### Detailed Steps

###### Step 1. Create Border Gateway
a) Log in [JD Cloud Border Gateway Console](https://cns-console.jdcloud.com/host/borderGateway/list);  <br />
b) Select the region using the direct connection, and click **Create Border Gateway**;<br />
c) The border gateway supports running BGP routing protocol. The BGP ASN of current JD Cloud border gateway is fixed to 65000, which will be open to modify in the future;<br />

For more contents, refer to [Border Gateway Management](../Operation-Guide/Border-Gateway-Management/Border-Gateway-Configuration.md).

###### Step 2. Create VPC Attachment
a) Log in [JD Cloud VPC Attachment Console](https://cns-console.jdcloud.com/host/vpcAttachment/list);  <br />
b) Select the region using the direct connection, and click **Create VPC Attachment**;<br />
c) Select the border gateway created in Step 1, select the VPC that passes the route traffic of this border gateway, and select the VPC segment to be transmitted to this border gateway route table. After the VPC attachment is created, the segment selected will be automatically added to the transmission route table of this border gateway, and the Next Hop will point to the VPC attachment created in this step;<br />

For more contents, refer to [VPC Attachment Management](../Operation-Guide/Border-Gateway-Management/VPC-Attachment-Configuration.md).

###### Step 3. Configure Routing
After the creation of VPC Attachment between VPC and Border Gateway, VPC route table can be set to transmit routes from Border Gateway route table to VPC route table.<br />
a) Log in [JD Cloud VPC Route Table Console](https://cns-console.jdcloud.com/host/routeTable/list);  <br />
b) Click **VPC Route Table** to enter VPC Route Table Details Page;<br />
c) The "Route Transmission" Tab will display route clauses learned from border gateway and route transmission can be added. Click **Add**, select the border gateway with VPC attachment created with VPCs where the route table resides, and select segment range of border gateway route to be transmitted to the route table. When selected, target-end routes within the range in valid route tables on border gateway will be transmitted to the route table automatically.

For more contents, refer to [Border Gateway Route Configuration (../Operation-Guide/Route-Management/Border-Gateway-Route-Configuration.md) and [VPC Route Configuration](../Operation-Guide/Route-Management/VPC-Route-Configuration.md).

###### Step 4. Test Connectivity
a) Log in [JD Cloud Virtual Machines Console](https://cns-console.jdcloud.com/host/compute/list), in the region where the multiple-VPC interconnection is created, create respectively one set of Virtual Machines in the VPC to be interconnected to the intranet, and confirm that the route properly connected to other VPC intranet segment exists in the route table of the Subnet of this Virtual Machines;  <br />
b) Use the Virtual Machines created in a to ping the intranet address of one instance in other VPC to verify whether the intranet communication is normal;<br />
