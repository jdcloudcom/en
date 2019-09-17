## **Direct Connection of the Same Account in the Same Region**

``Before using the Direct Connection, the network segments in the IDC and the VPC should be planned to ensure that the network segments in the IDC and the network segments in the VPC do not overlap. ``



### **If using the physical links to get through the customer IDC and the VPC on JD Cloud, you need to complete the following steps: **

Step 1: Create a physical connection

Step 2: Create a border gateway

Step 3: Create a private virtual interface

Step 4: Create VPC Attachment interconnecting Border Gateway and VPC

Step 5: Configure Route Table in VPC

Step 6: Configure Route Table on Border Gateway

Step 7: Configure route in customer’s IDC



### **Detailed procedures are as follows: **

#### **Step 1: Create a physical connection**

1. Log in JD Cloud console.

2. Click the navigation bar on the left side, select "Hybrid Cloud Connection -> Direct Connection -> Physical Connection".

3. For the creation of physical connection, you can directly contact with the Direct Connection partner of JD Cloud. Our partner will provide you one-stop service. For the specific partners, see JD Cloud Marketplace. You can also choose self-service application, as the Document indicates.

4. Configure physical connection, see console page for details.

Primary configuration items are as follows:

- - Port type, supporting the following types of line port access: gigabit cable port, gigabit single-mode optical port (10KM), 10-gigabit cable port, and 10-gigabit single-mode optical port (10KM); 

5. Click "OK". In the physical connection list page, the status of the connection is Applying.

Auditors of JD Cloud will review your application. Under normal circumstances, it will be completed within two working days. When passing the physical connection review, the connection status changes to Pending. At this time, you need to pay for this physical connection. For details, please refer to the Purchase Notes.

6. Please pay according to the settlement method specified in the Direct Connection Contract Service signed with JD Cloud.

7. After the physical connection is successfully paid, the connection status changes to under Construction. The port number of the access device is automatically allocated to access the physical link.

8. Synchronize the port information to the operator of your choice to check the resources and route the line. The operation and maintenance personnel of JD Cloud machine room will cooperate to complete the line to the home. If you need the operator to complete the line entry in person, please provide relevant personnel information in advance. JD Cloud will complete the entry reservation for your operator in advance, and give you the contact information of the receptionist of the machine room on the same day.

9. Finally confirm that the physical connection is created.



#### **Step 2: Create a border gateway**

1. Log in JD Cloud console.

2. Click the navigation bar on the left side, select **Hybrid Cloud Connect -> Border Gateway -> Border Gateway**, go to the Border Gateway list page and click **Create**.

3. Create border gateway.
  Before the border gateway supports VPC Attachment, once the Border Gateway is created, all VPCs in the same region will be connected automatically.
  Where the Border Gateway supports release of VPC Attachment, newly created Border Gateways won’t connect to any VPC by default, so users need to create "VPC Attachments" to interconnect specified VPC with Border Gateways. For Border Gateways already created, routes, which have already connected to VPC, in the Border Gateway Route Table are still valid and available, but no other routes to VPC can be created unless VPC Attachment connected to VPC is created first.


**Step 3: Create a private virtual interface**

1. Log in JD Cloud console.

2. Click the navigation bar on the left side, select **Hybrid Cloud Connection -> Direct Connection ->Private Virtual Interface**, go to the Private Virtual Interface Connection List Page and click **Create**.

3. Configure private virtual interface, see console page for details.

Primary configuration items are as follows:

- - Physical connection: physical link for VPC and IDC communication;
  - Border gateway: the BGP endpoint running on the JD Cloud side and the client IDC side to communicate with the VPC privately;
  - vlanId: the identity for users to divide the service channels, and the vlan is used to isolate different services on the same physical link. Each channel has a unique vlanId on the physical link.
  - BGP ASN, Key Pair: information required for the BGP protocol running between customer IDC router and JD Cloud router.
  - Router connection address: BGP Peer information required for the BGP protocol running between customer IDC router and JD Cloud router.

4. Click "OK". In the list page of private virtual interface, the status of the connection is configuring.

5. Upon configuration, the private virtual interface is available and can be used.

**Step 4: Create VPC Attachment**

1. Log in JD Cloud console.

2. Click the navigation bar on the left side, select **Hybrid Cloud Connection -> Border Gateway -> VPC Attachment**, go to the VPC Attachment list page; click **Create**.

3. Configure VPC Attachment, so as to establish connection and interconnection between Border Gateway and the selected VPC. For details, please see the Console Page.

Now, VPC Attachment supports interconnection between VPC and Border Gateway in the same region. One VPC Attachment can be created for the same VPC and the same Border Gateway. The same VPC can create different VPC Attachments with multiple different Border Gateways, another Border Gateway supports creation of different VPC Attachments with multiple different VPCs.

Primary configuration items are as follows:

- - API name: Name of API connected Border Gateway and VPC;

  - Border Gateway: Select Border Gateway to be interconnected. Border Gateway can communicated with VPC internally and serve as the BGP running endpoint at the JD Cloud end and the customer IDC end;
  
  - VPC: Select VPC to be interconnected;
  
  - Transmitted VPC segment:
  
    ``All VPC Segments``, full-automatic introduction method of Border Gateway routes, meaning that the system will automatically add Route Table entries accessing all VPC segments to Route Table of Border Gateway. All segments include segments of all current subnets of VPC, and the Route Table entries of the Border Gateway are automatically updated based on subsequent changes to the VPC subnet, for example, when adding a new subnet later, the system will automatically add routes reaching the new subnet to the Border Gateway Route Table, and when deleting the subnet, Route Table entries corresponding to the Border Gateway will be automatically deleted synchronously
    
    ``Specified Subnet Segment``, semi-automatic introduction method of Border Gateway routes, meaning that the system will automatically add routes of specified segments in accessed VPC to Route Table of Border Gateway. Under the method, the route of the Border Gateway will not automatically adapt to adjustments outside the subnet specified within the VPC, for example, adding or deleting the subnet outside the range will not cause the route change of Border Gateway; however, if the subnet within the specified range changes, when deleting the subnet within the range, relevant route of this subnet will be synchronously deleted.
    
    ``No Transmission Segment``, full-automatic configuration method of Border Gateway route, meaning that the system will not automatically add any VPC access routes to Route Table of Border Gateway, and a user needs to manually configure static routes in BGW Route Table.

4. Click **OK**. In the VPC Attachment list, the status of the channel is configuring.

5. After the Border Gateway API is configured, the channel status is changed to available. In such case, the connection can be used for data transmission.

``Special description: When there is an overlap between the subnet segment in Border Gateway VPC connected and other channel connection segments, you can select "Specify Subnet Segment" when creating VPC Attachment and select the subnet segments having no overlaps with each other to avoid the overlapped VPC subnet segment from transmitting to the Border Gateway Route Table so as to satisfy the needs of some VPCs for overlapped application scenarios``


#### **Step 5: Configure Route Table in VPC**

1. Log in JD Cloud console.

2. Click the navigation bar on the left side, select **Virtual Private Cloud -> Route Table**, enter the route table related to JD Cloud VPC Subnet required to communicate with IDC Intranet.

3. There are two methods to configure the Route Table: Static route method refers to the automatic route transmission method.

  Static route method:
  
  If it is planned to adopt the customized route thoroughly, please adopt the static route configuration method. Click **Edit** on the "Route Policies" page in the Route Table to add route rules, in which the target end is the IDC business segment you expect to be accessed. Select Border Gateway as the type of next hop and select name of the interconnected Border Gateway for the next hop.

  Automatic route transmission method:
  
  If you intend to simplify network configuration process, the automatic route transmission method can be adopted with the JD Cloud platform’s capacity of automatic route transmission from Border Gateway to VPC Route Table. Click **Add** in the "Route Transmission" page in the Route Table and fill in route transmission information. One VPC can establish route transmission relationships with several Border Gateways at the same time.
  
- - Border Gateway: Select a source Border Gateway transmitted routes to VPC

  - Route transmission range: Refer to the address range of routes which have the prefix CIDR and are transmitted from the Border Gateway to VPC. Support input of multiple CIDR ranges, with different CIDRs separated with English commas. After the transmission route is configured, this segment in the selected Border Gateway and route of its subnet segment will be transmitted to this Route Table. Support configuration of transmission 0.0.0.0/0 routes. In such case, it will transmit all routes in the selected Border Gateway.

    When the configuration takes effect, the system will select route rules of route prefix in the transmission range from valid Route Table of Border Gateway (including static and dynamic route) and automatically add such rules to VPC Route Table. The type of next hop is Border Gateway, the next hop directs to the specified Border Gateway name in the "Route Transmission" configuration and the route type is transmission. The transmission type route cannot be edited.

#### **Step 6: Configure Route Table on Border Gateway**

1. Log in JD Cloud console.

2. Click the navigation bar on the left side, and select **Hybrid Cloud Connection -> Border Gateway -> Border Gateway**, enter the Border Gateway Details carrying network interconnection of Direct Connection.

3. Configure the route table. Two-way route is required, one way to VPC side and another to your IDC side.

1) There are two methods for routing to the IDC side: Static route method refers to the automatic route transmission method.

Automatic route transmission method:

If the Border Gateway has created a channel interconnected to the Cabinet Service (e.g. Private Virtual Interface, etc.) and has run BGP protocol to learn two-end dynamic route, the Border Gateway will automatically add the route learned through BGP to the target end of Dynamic Route Table. The next hop is the channel interconnected to the Direct Connection (e.g. Private Virtual Interface) and the route type is transmission. The dynamic transmission route will compare the priority of routes in Static Route Table and the route of high priority will be automatically added to the effective Route Table. Users can directly view the dynamic transmission route in Route Table without configuration, but users cannot modify or delete the dynamic transmission route.


Static route method:

If a user intends to control the route on its own, manual configuration and addition can be made by selecting "Static Route Table". As the Static Route of the same prefix route has the higher priority than the transmission route, the transmission route of the same prefix will be deleted from the valid Route Table. When a static route rule is added, the target end is the segment in your IDC. Please select Private Virtual Interface as the type of next hop and select Private Virtual Interface carrying network interconnection of Direct Connection as the next hop.

2) There are two ways routing to VPC: Static route method refers to the automatic route transmission method.

Static route method:

When creating the VPC Attachment connecting Border Gateway and VPC, if "Not to Transmit Segment" is selected in the transmission of VPC segment, you need to manually configure the route reaching multiple VPCs, that is to configure all of the static route to VPC requiring interconnection item by item. To configure the static route to VPC, select "Route Table->Static Route Table" and click **Edit**. The route rule target end is the segment in VPC. Select VPC Attachment in the type of next hop. In the next hop, select the information of specific VPC Attachment to be communicated.

Automatic route transmission method:

When creating the VPC Attachment connecting Border Gateway and VPC, if "VPC All Segment" or "Specify Subnet Segment are selected in transmission of VPC segment, that is the route automatic transmission method. The Border Gateway route table will automatically add or delete the route table items reaching relevant subnet in the dynamic route table according to the configured scope of subnet. The target segment is VPC subnet segment, the type of next hop selects VPC Attachment, the next hop is the VPC Attachment connected to the specified VPC and Border Gateway and the route type is transmission. The dynamic transmission route will compare the priority of routes in Static Route Table and the route of high priority will be automatically added to the effective Route Table. Users can directly view the dynamic transmission route in route table without configuration, but users cannot modify and delete the dynamic transmission route.


#### **Step 7: Configure route in customer’s IDC**

Configure the route in the customer IDC, including the configuration related to running BGP Protocol with JD Cloud, and the specific routing configuration.

For the route to the VPC, the destination is the network segment in your VPC. And the address for the nest hop is the address of BGP Peer to JD Public Cloud side, i.e., the JD Cloud side address of the private virtual interface/ 30 Address.