## **Hosted Connect**

``Before using the Hosted Connect, you shall plan the network segment in the JD Cloud Cabinet Service and the VPC to try to ensure that the network segment in the JD Cloud Cabinet Service and the network segment in the VPC will not overlap! ``

``If you use Direct Connection and Hosted Connect at the same time, please plan the network segment in IDC, JD Cloud hosted area and VPC to ensure normal communication. ``



### **Create a Hosted Connection**

1. Log in JD Cloud console.

2. Click the navigation bar on the left side, select **Hybrid Cloud Connection -> Hosted Connect ->Hosted Connection**, enter the Hosted Connection list page and click **Create**.

3. For the configuration of the hosted connection, see console page for details.

4. Click "OK". In the hosted connection list page, the status of the connection is Applying.

Auditors of JD Cloud will review your application. Under normal circumstances, it will be completed within two working days. When passing the hosted connection review, the connection status changes to Pending. At this time, you need to pay for this hosted connection. For details, please refer to the Purchase Notes.

5. Please pay according to the settlement method specified in the direct connection contract signed with JD Cloud.

6. After the hosted connection is successfully paid, the connection status changes to Under Construction. The port number of the access device is automatically allocated to access the physical link. And JD Cloud will automatically complete the laying of the hosted connection without any customer participation.

7. Finally confirm that the hosted connection is created.



### **Create a Border Gateway**

1. Log in JD Cloud console.

2. Click the navigation bar on the left side, select **Hybrid Cloud Connection** -> Border Gateway -> Border Gateway** and go to the Border Gateway list page; click **Create**.

3. Create border gateway
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

    ``Specified Subnet Segment``, semi-automatic introduction method of Border Gateway routes, meaning that the system will automatically add routes of specified segments in accessed VPC to Route Table of Border Gateway. Under the method, the route of the Border Gateway will not automatically adapt to adjustments outside the subnet specified within the VPC, for example, when adding or deleting the subnet outside the range will not cause the route change of Border Gateway; however, if the subnet within the specified range changes, when deleting the subnet within the range, it is required to delete the transmission subnet segment of VPC Attachment at first.

    ``No Transmission Segment``, full-automatic configuration method of Border Gateway route, meaning that the system will not automatically add any VPC access routes to Route Table of Border Gateway, and a user needs to manually configure static routes in BGW Route Table.

4. Click **OK**. In the VPC Attachment list, the status of the channel is configuring.

5. After the Border Gateway API is configured, the channel status is changed to available. In such case, the connection can be used for data transmission.

``Special description: When there is an overlap between the subnet in VPC connected to Border Gateway and IP segment of other channel connected to the target end, you can select "Specify Subnet Segment" when creating VPC Attachment and select the subnet segments having no overlaps with each other to avoid the overlapped VPC subnet segment from transmitting to the Border Gateway Route Table so as to satisfy the needs of application scenarios that IP address segments at multiple channel connections of the Border Gateway overlap``

### **Create Hosted Private Virtual Interface**

1. Log in JD Cloud console.

2. Click the navigation bar on the left side, select **Hybrid Cloud Connection -> Hosted Connect -> Hosted Private Virtual Interface**, enter the Hosted Private Virtual Interface list page and click **Create**.

3. For the configuration of the hosted private virtual interface, see console page for details.

4. Click "OK". In the list page of hosted private virtual interface, the status of the connection is Configuring.

5. Upon configuration, the hosted private virtual interface is available and can be used.

```
  BGP key pair parameters of Hosted Private Virtual Interface do not come into force now. Please ignore this parameter when BGP of client device is configured.
```


### **Configure the Route Table in the VPC**

1. Log in JD Cloud console.

2. Click the navigation bar on the left side, select "Virtual Private Cloud", enter the route table related to JD Cloud VPC Private Subnet required to communicate with the Intranet of JD Cloud hosted area.

3. There are two methods to configure the Route Table: Static route method refers to the automatic route transmission method.

  Static route method: If it is planned to adopt the customized route thoroughly, please adopt the static route configuration method. Click **Edit** on the "Route Policies" page in the route table to add route rules, in which the target end is the Cabinet Service business segment you expect to be accessed, the type of next hop selects Border Gateway and the next hop selects the name of Border Gateway to be connected.

  Automatic route transmission method: If you intend to simplify network configuration process, the automatic route transmission method can be adopted with the JD Cloud platform’s capacity of automatic route transmission from Border Gateway to VPC Route Table. One VPC can establish route transmission relationships with several Border Gateways at the same time. Click **Add** in the "Route Transmission" page in the Route Table and fill in route transmission information.

- - Border Gateway: Select a source Border Gateway transmitted routes to VPC

  - Route transmission range: Refer to the address range of routes which have the prefix CIDR and are transmitted from the Border Gateway to VPC. Support input of multiple CIDR ranges, with different CIDRs separated with English commas. After the transmission route is configured, this segment in the selected Border Gateway and route of its subnet segment will be transmitted to this Route Table. Support configuration of transmission 0.0.0.0/0 routes. In such case, it will transmit all routes in the selected Border Gateway.

    When the configuration takes effect, the system will select route rules of route prefix in the transmission range from valid Route Table of Border Gateway (including static and dynamic route) and automatically add such rules to VPC Route Table. The type of next hop is Border Gateway, the next hop directs to the specified Border Gateway name in the "Route Transmission" configuration and the route type is transmission. The transmission type route cannot be edited.

### **Configure the Route Table on the Border Gateway**

1. Log in JD Cloud console.

2. Click the navigation bar on the left side, and select **Hybrid Cloud Connection -> Border Gateway -> Border Gateway**, enter the details for the Border Gateway hosting the hosted connect network intercommunication.

3. Configure the route table. Two-way route is required, one way to VPC side and another to your JD Cloud hosted area side.

1) There are two ways routing to Cabinet Service: Static route method refers to the automatic route transmission method.

Automatic route transmission method:

If the Border Gateway has created a channel connected to the cabinet service (e.g. Hosted Private Virtual Interface, etc.) and has run BGP protocol to learn two-end dynamic route, the Border Gateway will automatically add the route learned through BGP to the target end of dynamic route table. The next hop is the channel connected to the cabinet service (e.g. hosted private virtual interface) and the route type is transmission. The dynamic transmission route will compare the priority of routes in Static Route Table and the route of high priority will be automatically added to the effective Route Table. Users can directly view the dynamic transmission route in Route Table without configuration, but users cannot modify or delete the dynamic transmission route.

Static route method:

If a user intends to control the route on its own, manual configuration and addition can be made by selecting "Static Route Table". As the Static Route of the same prefix route has the higher priority than the transmission route, the transmission route of the same prefix will be deleted from the valid Route Table. When a static route rule is added, the target end is the segment in your Cabinet Service. The type of next hop selects the private virtual interface and the next hop selects the private virtual interface used to host the Direct Connect network intercommunication.

2) There are two ways routing to VPC: Static route method refers to the automatic route transmission method.

Static route method:

When creating the VPC Attachment connecting Border Gateway and VPC, if "Not to Transmit Segment" is selected in the transmission of VPC segment, you need to manually configure the route reaching multiple VPCs, that is to configure all of the static route to VPC requiring interconnection item by item. To configure the static route to VPC, select "Route Table->Static Route Table" and click **Edit**. The route rule target end is the segment in VPC. Select VPC Attachment in the type of next hop. In the next hop, select the information of specific VPC Attachment to be communicated.

Automatic route transmission method:

When creating the VPC Attachment connecting Border Gateway and VPC, if "VPC All Segment" or "Specify Subnet Segment are selected in transmission of VPC segment, that is the route automatic transmission method. The Border Gateway Route Table will automatically add or delete route table entries that reach the relevant subnet based on the configured subnet scope, the route prefix is the subnet segment, and the Next Hop is the VPC Attachment connecting the specified VPC and the Border Gateway, and the route type is transmission. The dynamic transmission route will compare the priority of routes in Static Route Table and the route of high priority will be automatically added to the effective Route Table. Users can directly view the dynamic transmission route in Route Table without configuration, but users cannot modify or delete the dynamic transmission route.


### **Configure Routers in the JD Cloud Hosted Area**

Configure the route in the customer JD Cloud hosted area, including the configuration related to running BGP Protocol with JD Public Cloud, and the specific routing configuration.

For the route to the VPC, the destination is the network segment in your VPC. And the address for the nest hop is the address of BGP Peer to JD Public Cloud side, i.e., the JD Cloud side address of the hosted private virtual interface/ 30 Address.



### **Delete Hosted Private Virtual Interface**

1. Log in JD Cloud console.

2. Click the navigation bar on the left side, select **Hybrid Cloud Connection -> Hosted Connect -> Hosted Private Virtual Interface**.

3. Enter the list or details of Hosted Private Virtual Interface, and click "Delete" to delete the Hosted Private Virtual Interface.



### **Delete Hosted Connection**

1. Log in JD Cloud console.

2. Click the navigation bar on the left side, select **Hybrid Cloud Connection -> Hosted Connect -> Hosted Connection**.

3. Enter the list or details of Hosted Connection, and click "Delete". Only the Hosted Connection that has not been used to create the Hosted Private Virtual Interface can be deleted. After the Hosted Connection is deleted, if you need to use the Hosted Connect Service again, you need to apply for a new Hosted Connection.

After the Hosted Connection is deleted through the JD Cloud Console/Open API, the physical port and physical link of the JD Cloud routing device will be released immediately without your participation.