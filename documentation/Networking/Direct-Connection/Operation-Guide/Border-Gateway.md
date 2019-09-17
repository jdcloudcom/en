## Border Gateway

As the Border Gateway of VPC, BGW mainly meets the network exchange demand that VPC access to the private network outside the Internet, supports the interconnection among VPCs, among VPC and Private Virtual Interface and Hosted Private Virtual Interface; users can create interconnection APIs and channels by themselves based on demands and realize interconnection among different business ends through configuration of Route Table.


### Create Border Gateway

1. Log in JD Cloud console.

2. Click the navigation bar on the left side, select **Hybrid Cloud Connection** -> Border Gateway -> Border Gateway** and go to the Border Gateway list page; click **Create**.

3. Create border gateway.
  Before the border gateway supports VPC Attachment, once the Border Gateway is created, all VPCs in the same region will be connected automatically.
  Where the Border Gateway supports release of VPC Attachment, newly created Border Gateways won’t connect to any VPC by default, so users need to create "VPC Attachments" to interconnect specified VPC with Border Gateways. For Border Gateways already created, routes, which have already connected to VPC, in the Border Gateway Route Table are still valid and available, but no other routes to VPC can be created unless VPC Attachment connected to VPC is created first.

### **Create VPC Attachment of Border Gateway**

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
    
    ``Specified Subnet Segment``, semi-automatic introduction method of Border Gateway routes, meaning that the system will automatically add routes of specified segments in accessed VPC to Route Table of Border Gateway. Under the method, the route of the Border Gateway will not automatically adapt to adjustments outside the subnet specified within the VPC, for example, when adding or deleting the subnet outside the range will not cause the route change of Border Gateway; however, if the subnet within the specified range changes, when deleting the subnet within the range, it is required to delete the specified subnet segment of VPC Attachment at first.
    
    ``No Transmission Segment``, full-automatic configuration method of Border Gateway route, meaning that the system will not automatically add any VPC access routes to Route Table of Border Gateway, and a user needs to manually configure static routes in BGW Route Table.

4. Click **OK**. In the VPC Attachment list, the status of the channel is configuring.

5. After the Border Gateway API is configured, the channel status is changed to available. In such case, the connection can be used for data transmission.

``Special description: When there is an overlap between the subnet in VPC connected to Border Gateway and IP segment of other channel connected to the target end, you can select "Specify Subnet Segment" when creating VPC Attachment and select the subnet segments having no overlaps with each other to avoid the overlapped VPC subnet segment from transmitting to the Border Gateway Route Table so as to satisfy the needs of application scenarios that IP address segments at multiple channel connections of the Border Gateway overlap``


### **Create Private Virtual Interface**

1. Log in JD Cloud console.

2. Click the navigation bar on the left side, select **Hybrid Cloud Connection -> Direct Connection ->Private Virtual Interface**, go to the Private Virtual Interface Connection List Page and click **Create**.

3. Configure private virtual interface, see console page for details.

4. Click "OK". In the list page of private virtual interface, the status of the connection is Configuring.

5. Upon configuration, the private virtual interface is available and can be used.


### **Configure Route Table on the Border Gateway**

1. Log in JD Cloud console.

2. Click the navigation bar on the left side, and select **Direct Connection ->Border Gateway**, enter the details for the Border Gateway list page, click **Border Gateway ID** to enter the details, select **Route Table** tab.

3. Configure the route table. Two-way route is required, one way to VPC side and another to your IDC side.

1) There are two methods for routing to the IDC side: Static route method refers to the automatic route transmission method.

Automatic route transmission method:

If the Border Gateway has created a channel connected to the cabinet service (e.g. Hosted Private Virtual Interface, etc.) and has run BGP protocol to learn two-end dynamic route, the Border Gateway will automatically add the route learned through BGP to the target end of dynamic route table. The next hop is the channel connected to the cabinet service (e.g. hosted private virtual interface) and the route type is transmission. The dynamic transmission route will compare the priority of routes in Static Route Table and the route of high priority will be automatically added to the effective Route Table. Users can directly view the dynamic transmission route in Route Table without configuration, but users cannot modify or delete the dynamic transmission route.

Static route method:

If a user intends to control the route on its own, manual configuration and addition can be made by selecting "Static Route Table". As the Static Route of the same prefix route has the higher priority than the transmission route, the transmission route of the same prefix will be deleted from the valid Route Table. When a static route rule is added, the target end is the segment in your IDC. Please select Private Virtual Interface as the type of next hop and select Private Virtual Interface carrying network interconnection of Direct Connection as the next hop.

2) There are two ways routing to VPC: Static route method refers to the automatic route transmission method.

Static route method:

When creating the VPC Attachment connecting Border Gateway and VPC, if "Not to Transmit Segment" is selected in the transmission of VPC segment, you need to manually configure the route reaching multiple VPCs, that is to configure all of the static route to VPC requiring interconnection item by item. To configure the static route to VPC, select "Route Table->Static Route Table" and click **Edit**. The route rule target end is the segment in VPC. Select VPC Attachment in the type of next hop. In the next hop, select the information of specific VPC Attachment to be communicated.

Automatic route transmission method:

When creating the VPC Attachment connecting Border Gateway and VPC, if "VPC All Segment" or "Specify Subnet Segment are selected in transmission of VPC segment, that is the route automatic transmission method. The Border Gateway Route Table will automatically add or delete the route table entries reaching relevant subnet. The target segment is VPC Subnet Segment, the Type of Next Hop selects VPC Attachment, the Next Hop is the VPC Attachment connected to the specified VPC and Border Gateway and the route type is transmission. The dynamic route will compare the priority of valid routes of the route table and the route of high priority will be automatically added to the valid route table. Users can directly view the dynamic transmission route in route table without configuration, but users cannot modify and delete the dynamic transmission route.




### **Delete Private Virtual Interface**

1. Log in JD Cloud console.

2. Click the navigation bar on the left side, select **Hybrid Cloud Connection -> Direct Connect -> Private Virtual Interface** and go to the Private Virtual Interface list page; click **Delete** under the Actions.

3. Enter the list or details of Private Virtual Interface, and click "Delete" to delete the Private Virtual Interface. After deleting API/channel, the route transmitted to the Border Gateway will be removed synchronously.


### **Delete VPC Attachment of Border Gateway**

1. Log in JD Cloud console.

2. Click the navigation bar on the left side, and select **Hybrid Cloud Connection ->Border Gateway ->VPC Attachment**, select **Delete** at the operation bar of VPC Attachment list page; or select Border Gateway ID at **Hybrid Cloud Connection ->Border Gateway ->Border Gateway** to enter **API/Channel** tab of the details, click **Delete** under the operation bar.

3. **Delete VPC Attachment of Border Gateway. After deleting VPC Attachment, transmission relationship of VPC Route Table, VPC and transmission route and static route corresponding to BGW shall be deleted automatically.

