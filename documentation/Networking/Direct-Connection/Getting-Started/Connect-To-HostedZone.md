## **Hosted Connect of the Same Account in the Same Region**

"Before using the hosted connect, you should plan the network segment in the JD Cloud & AI cabinet service and the VPC to ensure that the network segment in the JD Cloud & AI cabinet service and the network segment in the VPC will not overlap!"



### **If using the physical links to get through the cabinet service of JD Cloud & AI and the VPC on JD Cloud & AI, you need to complete the following steps:**

Step 1: Create Hosted Connection

Step 2: Create Border Gateway

Step 3: Create Hosted Private Virtual Interface

Step 4: Create VPC Attachment interconnecting Border Gateway and VPC

Step 5: Configure Route Table in VPC

Step 6: Configure Route Table on Border Gateway

Step 7: Configure route in JD Cloud & AI Cabinet Service



### **Detailed procedures are as follows:**

#### **Step 1: Create Hosted Connection**

1. Log in JD Cloud & AI Console.

2. Click the navigation bar on the left side, select **Hybrid Cloud Connection -> Hosted Connect -> Hosted Connection**, go to the Hosted Connection list page and click **Create**.

3. For the configuration of the hosted connection, see console page for details.

4. Click **OK**. In the hosted connection list page, the status of the connection is Applying.

JD Cloud & AI reviewers will review your application. Under normal circumstances, it will be completed within two working days. When passing the hosted connection review, the connection status changes to To Be Paid. At this time, you need to pay for this hosted connection. For details, please refer to the Purchase Notes.

5. Please pay according to the settlement method specified in the Direct Connection Contract signed with JD Cloud & AI.

6. After the hosted connection is successfully paid, the connection status changes to Under Construction. The port number of the access device is automatically allocated to access the physical link. And JD Cloud & AI will automatically complete the laying of the hosted connection without any customer participation.

7. Finally confirm that the hosted connection is created.



#### **Step 2: Create Border Gateway**

1. Log in JD Cloud & AI Console.

2. Click the navigation bar on the left side, select **Hybrid Cloud Connect -> Border Gateway -> Border Gateway**, go to the Border Gateway list page and click **Create**.

3. Create border gateway.
  Before the border gateway supports VPC Attachment, once the border gateway is created, all VPCs in the same region will be connected automatically.
  Where the border gateway supports release of VPC attachment, newly created border gateways won’t connect to any VPC by default, so users need to create "VPC Attachments" to interconnect specified VPC with border gateways. For border gateways already created, routes, which have already connected to VPC, in the border gateway route table are still valid and available, but no other routes to VPC can be created unless VPC attachment connected to VPC is created first.



#### **Step 3: Create Hosted Private Virtual Interface**

1. Log in JD Cloud & AI Console.

2. Click the navigation bar on the left side, select **Hybrid Cloud Connection -> Hosted Connect -> Hosted Private Virtual Interface**, go to the Hosted Private Virtual Interface list page and click **Create**.

3. For the configuration of the hosted private virtual interface, see console page for details.

Primary configuration items are as follows:

- - Hosted Connect: Physical link for VPC and cabinet service communication;
  - Border Gateway: BGP endpoint running on the JD Cloud & AI side and the cabinet service side to communicate with the VPC privately;
  - vlanId: The identifier for users to divide the business channels, and the vlan is used to isolate different services on the same physical link. Each channel has a unique vlanId on the physical link;
  - BGP ASN, Key Pair: Information required for the BGP protocol running between the router of the cabinet service and JD Cloud & AI router;
  - Routing Interconnection Address: BGP Peer Information required for the BGP protocol running between the router of the cabinet service and JD Cloud & AI router;

4. Click **OK**. In the Hosted Private Virtual Interface list page, the status of this hosted private virtual interface is Configuring.

5. Upon configuration, the hosted private virtual interface is available and can be used.



#### **Step 4: Create VPC Attachment interconnecting Border Gateway and VPC**

1. Log in JD Cloud & AI Console.

2. Click the navigation bar on the left side, select **Hybrid Cloud Connect -> Border Gateway -> VPC Attachment**, go to the VPC Attachment list page and click **Create**.

3. Configure VPC attachment, so as to establish connection and interconnection between border gateway and the selected VPC. For details, please see the Console page.

Now, VPC attachment supports interconnection between VPC and border gateway in the same region. One VPC attachment can be created for the same VPC and the same border gateway. The same VPC can create different VPC attachments with multiple different border gateways, another border gateway supports creation of different VPC attachments with multiple different VPCs.

Primary configuration items are as follows:

- - API Name: Name of API connected border gateway and VPC;

  - Border Gateway: Select border gateway to be interconnected. Border gateway can communicated with VPC internally and serve as the BGP running endpoint at the JD Cloud & AI side and the customer IDC side;
  
  - VPC: Select VPC to be interconnected;
  
  - Transmitted VPC segment:
  
    ``All VPC Segments``, full-automatic introduction method of border gateway routes, meaning that the system will automatically add Route Table entries accessing all VPC segments to route table of border gateway. All segments include segments of all current subnets of VPC, and the route table entries of the border gateway are automatically updated based on subsequent changes to the VPC subnet, for example, when adding a new subnet later, the system will automatically add routes reaching the new subnet to the border gateway route table, and when deleting the subnet, route table entries corresponding to the border gateway will be automatically deleted synchronously
    
    ``Specified Subnet Segment``, semi-automatic introduction method of Border Gateway routes, meaning that the system will automatically add routes of specified segments in accessed VPC to Route Table of Border Gateway. Under the method, the route of the border gateway will not automatically adapt to adjustments outside the subnet specified within the VPC, for example, adding or deleting the subnet outside the range will not cause the route change of border gateway; however, if the subnet within the specified range changes, when deleting the subnet within the range, relevant route of this subnet will be synchronously deleted.
    
    ``No Transmission Segment``, full-automatic configuration method of border gateway route, meaning that the system will not automatically add any VPC access routes to route table of border gateway, and a user needs to manually configure static routes in BGW Route Table.

4. Click **OK**. In the VPC Attachment list, the status of the channel is configuring.

5. After the border gateway API is configured, the channel status is changed to available. In such case, the connection can be used for data transmission.

``Special Description: When there is an overlap between the subnet segment in VPC connected to border gateway and other channel connect segments, you can select "Specify Subnet Segment" when creating VPC attachment and select the subnet segments having no overlaps with each other to avoid the overlapped VPC subnet segment from transmitting to the border gateway route table so as to satisfy the needs of some VPCs existing overlapped application scenarios``


#### **Step 5: Configure Route Table in VPC**

1. Log in JD Cloud & AI Console.

2. Click the navigation bar on the left side, select "Virtual Private Cloud", enter the route table related to JD Cloud & AI VPC Private Subnet required to communicate with the Intranet of JD Cloud & AI cabinet service.

3. There are two methods to configure the route table: Static route method refers to the automatic route transmission method.

  Static route method: If it is planned to adopt the customized route thoroughly, please adopt the static route configuration method. Click **Edit** on the "Route Policies" page in the route table to add route rules, in which the target end is the cabinet service business segment you expect to be accessed, the type of next hop selects border gateway and the next hop selects the name of border gateway to be connected.

  Automatic route transmission method: If you intend to simplify network configuration process, the automatic route transmission method can be adopted with the JD Cloud & AI platform’s capacity of automatic route transmission from border gateway to VPC route table. One VPC can establish route transmission relationships with several border gateways at the same time. Click **Add** in the "Route Transmission" page in the route table and fill in route transmission information.
  
- - Border Gateway: Select a source border gateway transmitted routes to VPC

  - Route transmission range: Refer to the address range of routes which have the prefix CIDR and are transmitted from the border gateway to VPC. Support input of multiple CIDR ranges, with different CIDRs separated with English commas. After the transmission route is configured, this segment in the selected border gateway and route of its subnet segment will be transmitted to this route table. Support configuration of transmission 0.0.0.0/0 routes. In such case, it will transmit all routes in the selected border gateway.

  When the configuration takes effect, the system will select route rules of route prefix in the transmission range from valid route table of border gateway (including static and dynamic route) and automatically add such rules to VPC route table. The type of next hop is border gateway, the next hop directs to the specified border gateway name in the "Route Transmission" configuration and the route type is transmission. The transmission type route cannot be edited.


#### **Step 5: Configure Route Table on Border Gateway**

1. Log in JD Cloud & AI Console.

2. Click the navigation bar on the left side, select **Hybrid Cloud Connection -> Border Gateway -> Border Gateway**, click the required Border Gateway ID and enter the details for the Border Gateway hosting the hosted connect network interconnection.

3. Configure the route table. Two-way route is required, one way to VPC side and another to your JD Cloud & AI cabinet service side.

1) There are two methods for routing to the Cabinet Service side: Static route method refers to the automatic route transmission method.

Automatic route transmission method:

If the border gateway has created a channel connected to the cabinet service (e.g. Hosted Private Virtual Interface, etc.) and has run BGP protocol to learn two-end dynamic route, the border gateway will automatically add the route learned through BGP to the target end of dynamic route table. The next hop is the channel connected to the cabinet service (e.g. Hosted Private Virtual Interface) and the route type is transmission. The dynamic route will compare the priority of valid routes of the route table and the route of high priority will be automatically added to the valid route table. Users can directly view the dynamic transmission route in Route Table without configuration, but users cannot modify or delete the dynamic transmission route.

Static route method:

If a user intends to control the route on its own, manual configuration and addition can be made by selecting "Static Route Table". As the static route of the same prefix route has the higher priority than the transmission route, the transmission route of the same prefix will be deleted from the valid route table. When a static route rule is added, the target end is the segment in your cabinet service. The type of next hop selects the private virtual interface and the next hop selects the private virtual interface used to host the Direct Connect network intercommunication.

2) There are two methods for routing to the VPC side: Static route method refers to the automatic route transmission method.

Static route method:

When creating the VPC attachment connecting border gateway and VPC, if "Not to Transmit Segment" is selected in the transmission of VPC segment, you need to manually configure the route reaching multiple VPCs, that is to configure all of the static route to VPC requiring interconnection item by item. To configure the static route to VPC, select "Route Table->Static Route Table" and click **Edit**. The route rule target end is the segment in VPC. Select VPC attachment in the type of next hop. In the next hop, select the information of specific VPC attachment to be communicated.

Automatic route transmission method:

When creating the VPC attachment connecting border gateway and VPC, if "VPC All Segment" or "Specify Subnet Segment are selected in transmission of VPC segment, which is the route automatic transmission method. The border gateway route table will automatically add or delete the route table items reaching relevant subnet in the dynamic route table according to the configured scope of subnet. The target segment is VPC subnet segment, the type of next hop selects VPC attachment, the next hop is the VPC attachment connected to the specified VPC and border gateway and the route type is transmission. The dynamic route will compare the priority of routes of the static route table and the route of high priority will be automatically added to the valid route table. Users can directly view the dynamic transmission route in route table without configuration, but users cannot modify and delete the dynamic transmission route.


#### **Step 6: Configure route in JD Cloud & AI Cabinet Service**

Configure the route in the customer JD Cloud & AI cabinet service, including the configuration related to running BGP protocol with JD Public Cloud, and the specific routing configuration.

For the route to the VPC, the target end is the network segment in your VPC. And the address for the Next Hop is the address of BGP Peer to JD Public Cloud side, i.e., the JD Cloud & AI side address of the hosted private virtual interface/30 Address.
