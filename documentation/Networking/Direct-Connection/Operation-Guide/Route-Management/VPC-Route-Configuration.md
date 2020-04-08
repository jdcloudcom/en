## VPC Route Configuration
After configuration of Physical Connection/Hosted Connection on cloud is completed, corresponding routes including Border Gateway Route Table route and VPC Route Table route shall be configured.

### Operation Steps
##### 1. Create VPC Attachment
For creation of VPC Attachment and setting of VPC transmission segment, refer to [VPC Attachment Management](../../Operation-Guide/Border-Gateway-Management/VPC-Attachment-Configuration.md).

```
  The function of VPC attachment is only released in Guangzhou and Shanghai currently.
```

##### 2. VPC route table adds route to Border Gateway
After the creation of VPC Attachment between VPC and Border Gateway, VPC route table can be set to transmit routes from Border Gateway route table to VPC route table.
a) Log in [JD Cloud & AI VPC Route Table Console](https://cns-console.jdcloud.com/host/routeTable/list);  </br>
b) Click corresponding VPC Route Table to enter VPC Route Table Details Page;</br>
c) The "Route Transmission" Tab will display route clauses learned from Border Gateway and route transmission can be added. Click **Add**, select Border Gateway with VPC Attachment created with VPCs where the route table resides, and select segment range of Border Gateway route to be transmitted to the route table. When selected, target-end routes within the range in valid route tables on Border Gateway will be transmitted to the route table automatically.

For more content related to VPC Route Table setting route transmission, refer to [VPC Route Table RouteTransmission](https://docs.jdcloud.com/en/virtual-private-cloud/route-table-features);

```
  If no VPC Attachment has been created between VPC and Border Gateway where the VPC Route Table resides, you shall create VPC Attachment at first.
```
![](../../../../../image/Networking/VPN/Operation-Guide/vpcroutetable-addroutepropagation.png)

##### (Selectable) 3. VPC Route Table adds static route to Border Gateway
a) Log in [JD Cloud & AI VPC Route Table Console](https://cns-console.jdcloud.com/host/routeTable/list);  </br>
b) Click corresponding VPC Route Table to enter VPC Route Table Details Page;</br>
c) The "Route Policies" Tab will display static route and transmission route in current VPC Route Table. Click **Edit** and select **Add One**. Target end is client segment (for example: 10.0.0.0/16). Type of Next Hop is Border Gateway and Next Hop is the Border Gateway of VPC Attachment created with among VPCs where the route table resides. Remarks can be added to the route.
"You are recommended to automatically add route by use of route transmission method."

![](../../../../../image/Networking/VPN/Operation-Guide/vpcroutetable-addroute.png)
