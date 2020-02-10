## VPC Attachment

``Before using interconnection and interworking among the Border Gateway, VPC, IDC and Cabinet Service, you shall plan the network segments in IDC, Cabinet Service and VPC to try to ensure that the network segments in the IDC, Cabinet Service and VPC in the VPC will not overlap! ``

```
  The function of VPC Attachment is only released in regions of cn-east-2 and cn-south-1 and release time in other regions are to be determined.
  For any region supporting no VPC Attachment, the Border Gateway will set up association relationship with all VPCs under the region by default. In such case, corresponding static route can be configured in the Border Gateway Route Table and VPC Route Table.
```

### Create Border Gateway

1. Log in JD Cloud console.

2. Click the navigation bar on the left side, select **Hybrid Cloud Connect -> Border Gateway -> Border Gateway**, go to the Border Gateway list page and click **Create**.

3. Create border gateway.
  Before the border gateway supports VPC Attachment, once the Border Gateway is created, all VPCs in the same region will be connected automatically.
  Where the Border Gateway supports release of VPC Attachment, newly created Border Gateways won’t connect to any VPC by default, so users need to create "VPC Attachments" to interconnect specified VPC with Border Gateways. For Border Gateways already created, routes, which have already connected to VPC, in the Border Gateway Route Table are still valid and available, but no other routes to VPC can be created unless VPC Attachment connected to VPC is created first.

### **Create VPC Attachment**

1. Log in JD Cloud console.

2. Click the navigation bar on the left side, select **Hybrid Cloud Connection -> Border Gateway -> VPC Attachment**, enter the VPC Attachment list page and click **Create**.

3. Configure VPC Attachment, so as to establish connection and interconnection between Border Gateway and the selected VPC. For details, please see the Console Page.

Now, VPC Attachment supports interconnection between VPC and Border Gateway in the same region. One VPC Attachment can be created for the same VPC and the same Border Gateway. The same VPC can create different VPC Attachments with multiple different Border Gateways, another Border Gateway supports creation of different VPC Attachments with multiple different VPCs.

Primary configuration items are as follows:

- - API name: Name of API connected Border Gateway and VPC;

  - Border Gateway: Select Border Gateway to be interconnected. Border Gateway can communicated with VPC internally and serve as the BGP running endpoint at the JD Cloud end and the customer IDC end;

  - VPC: Select VPC to be interconnected;

  - Transmitted VPC segment:

    ``All VPC Segments``, full-automatic introduction method of Border Gateway routes, meaning that the system will automatically add Route Table entries accessing all VPC segments to Route Table of Border Gateway. All segments include segments of all current subnets of VPC, and the route table entries of the Border Gateway are automatically upgraded based on subsequent changes to the VPC subnet-for example, when adding a new subnet later, the system will automatically add routes reaching the new subnet to the Border Gateway Route Table, when deleting the subnet, route table entries corresponding to the Border Gateway will be automatically deleted synchronously.

    ``Specified Subnet Segment``, semi-automatic introduction method of Border Gateway routes, meaning that the system will automatically add routes of specified segments in accessed VPC to Route Table of Border Gateway. Under the method, the route of the Border Gateway will not automatically adapt to adjustments outside the subnet specified within the VPC, for example, when adding or deleting the subnet outside the range will not cause the route change of Border Gateway; however, if the subnet within the specified range changes, when deleting the subnet within the range, it is required to delete the corresponding transmission subnet segment of VPC Attachment at first.

    ``No Transmission Segment``, full-automatic configuration method of Border Gateway route, meaning that the system will not automatically add any VPC access routes to Route Table of Border Gateway, and a user needs to manually configure static routes in BGW Route Table.

4. Click **OK**. In the VPC Attachment list, the status of the channel is configuring.

5. After the Border Gateway API is configured, the channel status is changed to available. In such case, the connection can be used for data transmission.

``Special description: When there is an overlap between the subnet in VPC connected to Border Gateway and IP segment of other channel connected to the target end, you can select "Specify Subnet Segment" when creating VPC Attachment and select the subnet segments having no overlaps with each other to avoid the overlapped VPC subnet segment from transmitting to the Border Gateway Route Table so as to satisfy the needs of application scenarios that IP address segments at multiple channel connections of the Border Gateway overlap``


### Configure Route Table in VPC

1. Log in JD Cloud console.

2. Click the navigation bar on the left side, select "Virtual Private Cloud", enter the route table related to JD Cloud VPC Private Subnet required to communicate with IDC Intranet.

3. There are two methods to configure the Route Table: Static route method refers to the automatic route transmission method.

  Static route method: If it is planned to adopt the customized route thoroughly, please adopt the static route configuration method. Click **Edit** on the "Route Policies" page in the route table to add route rules, in which the target end is the VPC segment you expect to be accessed, the type of next hop selects Border Gateway and the next hop selects the VPC Attachment of Border Gateway to be connected.

  Automatic route transmission method: If you intend to simplify network configuration process, the automatic route transmission method can be adopted with the JD Cloud platform’s capacity of automatic route transmission from Border Gateway to VPC Route Table. Click **Add** in the "Route Transmission" page in the Route Table and fill in route transmission information. One VPC can establish route transmission relationships with several Border Gateways at the same time.

- - Border Gateway: Select a source Border Gateway transmitted routes to VPC

  - Route transmission range: Refer to the address range of routes which have the prefix CIDR and are transmitted from the Border Gateway to VPC. Support input of multiple CIDR ranges, with different CIDRs separated with English commas. After the transmission route is configured, this segment in the selected Border Gateway and route of its subnet segment will be transmitted to this Route Table. Support configuration of transmission 0.0.0.0/0 routes. In such case, it will transmit all routes in the selected Border Gateway.

   When the configuration takes effect, the system will select route rules of route prefix in the transmission range from valid Route Table of Border Gateway (including static and dynamic route) and automatically add such rules to VPC Route Table. The type of next hop is Border Gateway, the next hop directs to the specified Border Gateway name in the "Route Transmission" configuration and the route type is transmission. The transmission type route cannot be edited.

### **Configure Route Table on the Border Gateway**

1. Log in JD Cloud console.

2. Click the navigation bar on the left side, and select **Hybrid Cloud Connection -> Border Gateway -> Border Gateway**, enter the details for the Border Gateway hosting the direct connect network intercommunication, select **Route Table** tab.

3. Configure Route Table, configure the route to the VPC side.

There are two ways routing to VPC: Static route method refers to the automatic route transmission method.

Static route method:

When creating the VPC Attachment connecting Border Gateway and VPC, if "Not to Transmit Segment" is selected in the transmission of VPC segment, you need to manually configure the route reaching multiple VPCs, that is to configure all of the static route to VPC requiring interconnection item by item. To configure the static route to VPC, select "Route Table->Static Route Table" and click **Edit**. The route rule target end is the segment in VPC. Select VPC Attachment in the type of next hop. In the next hop, select the information of specific VPC Attachment to be communicated.

Automatic route transmission method:

When creating the VPC Attachment connecting Border Gateway and VPC, if "VPC All Segment" or "Specify Subnet Segment are selected in transmission of VPC segment, that is the route automatic transmission method. The Border Gateway Route Table will automatically add or delete the route table entries reaching relevant subnet. The target segment is VPC Subnet Segment, the Type of Next Hop selects VPC Attachment, the Next Hop is the VPC Attachment connected to the specified VPC and Border Gateway and the route type is transmission. The dynamic transmission route will compare the priority of routes in Static Route Table and the route of high priority will be automatically added to the effective Route Table. Users can directly view the dynamic transmission route in route table without configuration, but users cannot modify and delete the dynamic transmission route.


### **Edit VPC Attachment**

1. Log in JD Cloud console.

2. Click the navigation bar on the left side, select **Hybrid Cloud Connect -> Border Gateway -> VPC Attachment** to view VPC Attachment List.

3. Select the VPC Attachment that is required to be modified, and click **Edit** in the **Operation**.

Primary configuration items that can be edited and modified are as follows:

- - API name: Name of API connected Border Gateway and VPC;

  - VPC: Select VPC to be interconnected;

  - Transmitted VPC segment:

    ``All VPC Segments``, full-automatic introduction method of Border Gateway routes, meaning that the system will automatically add Route Table entries accessing all VPC segments to Route Table of Border Gateway. All segments include segments of all current subnets of VPC, and the route table entries of the Border Gateway are automatically upgraded based on subsequent changes to the VPC subnet-for example, when adding a new subnet later, the system will automatically add routes reaching the new subnet to the Border Gateway Route Table, when deleting the subnet, route table entries corresponding to the Border Gateway will be automatically deleted synchronously.

    ``Specified Subnet Segment``, semi-automatic introduction method of Border Gateway routes, meaning that the system will automatically add routes of specified segments in accessed VPC to Route Table of Border Gateway. Under the method, the route of the Border Gateway will not automatically adapt to adjustments outside the subnet specified within the VPC, for example, when adding or deleting the subnet outside the range will not cause the route change of Border Gateway; however, if the subnet within the specified range changes, when deleting the subnet within the range, it is required to delete the corresponding transmission subnet segment of VPC Attachment at first.

    ``No Transmission Segment``, full-automatic configuration method of Border Gateway route, meaning that the system will not automatically add any VPC access routes to Route Table of Border Gateway, and a user needs to manually configure static routes in BGW Route Table.

4. Click **OK**. In the VPC Attachment list, the status of the channel is configuring.

5. After the Border Gateway API is configured, the channel status is changed to available. In such case, the connection can be used for data transmission.



### **Delete VPC Attachment**

1. Log in JD Cloud console.

2. Click the navigation bar on the left side, select **Hybrid Cloud Connect -> Border Gateway -> VPC Attachment** to view VPC Attachment List.

3. Select the VPC Attachment that is required to be modified, and click **Delete** in the **Operation**. Please use this operation with caution. After deleting VPC Attachment, transmission relationship of VPC Route Table, VPC and transmission route and static route corresponding to BGW shall be deleted automatically.
