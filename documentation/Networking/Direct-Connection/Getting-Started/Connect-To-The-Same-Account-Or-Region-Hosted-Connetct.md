## **Hosted Connect of the Same Account in the Same Region**

``Before using the Hosted Connect, you should plan the network segment in the JD Cloud hosted area and the VPC to ensure that the network segment in the JD Cloud hosted area and the network segment in the VPC will not overlap! ``



### **If using the physical links to get through the hosted area of JD Cloud and the VPC on JD Cloud, you need to complete the following steps: **

Step 1: Create a hosted connection

Step 2: Create a border gateway

Step 3: Create a hosted private virtual interface

Step 4: Create VPC Attachment interconnecting Border Gateway and VPC

Step 5: Configure Route Table in VPC

Step 6: Configure Route Table on Border Gateway

Step 7: Configure route in JD Cloud Cabinet Service



### **Detailed procedures are as follows: **

#### **Step 1: Create a hosted connection**

1. Log in JD Cloud console.

2. Click the navigation bar on the left side, select **Hybrid Cloud Connection -> Hosted Connect ->Hosted Connection**, enter the Hosted Connection list page and click **Create**.

3. For the configuration of the hosted connection, see console page for details.

4. Click "OK". In the hosted connection list page, the status of the connection is Applying.

Auditors of JD Cloud will review your application. Under normal circumstances, it will be completed within two working days. When passing the hosted connection review, the connection status changes to Pending. At this time, you need to pay for this hosted connection. For details, please refer to the Purchase Notes.

5. Please pay according to the settlement method specified in the direct connection contract signed with JD Cloud.

6. After the hosted connection is successfully paid, the connection status changes to Under Construction. The port number of the access device is automatically allocated to access the physical link. And JD Cloud will automatically complete the laying of the hosted connection without any customer participation.

7. Finally confirm that the hosted connection is created.



#### **Step 2: Create a border gateway**

1. Log in JD Cloud console.

2. Click the navigation bar on the left side, select **Hybrid Cloud Connect -> Border Gateway -> Border Gateway**, go to the Border Gateway list page and click **Create**.

3. Create border gateway.
  Before the border gateway supports VPC Attachment, once the Border Gateway is created, all VPCs in the same region will be connected automatically.
  Where the Border Gateway supports release of VPC Attachment, newly created Border Gateways won’t connect to any VPC by default, so users need to create "VPC Attachments" to interconnect specified VPC with Border Gateways. For Border Gateways already created, routes, which have already connected to VPC, in the Border Gateway Route Table are still valid and available, but no other routes to VPC can be created unless VPC Attachment connected to VPC is created first.



#### **Step 3: Create a hosted private virtual interface**

1. Log in JD Cloud console.

2. Click the navigation bar on the left side, select **Hybrid Cloud Connection -> Hosted Connect -> Hosted Private Virtual Interface**, enter the Hosted Private Virtual Interface list page and click **Create**.

3. For the configuration of the hosted private virtual interface, see console page for details.

Primary configuration items are as follows:

- - Hosted Connect: physical link for VPC and hosted area communication;
  - Border gateway: the BGP endpoint running on the JD Cloud side and the hosted area side to communicate with the VPC privately;
  - vlanId: the identity for users to divide the service channels, and the vlan is used to isolate different services on the same physical link. Each channel has a unique vlanId on the physical link.
  - BGP ASN, Key Pair: information required for the BGP protocol running between the router of the hosted area and JD Cloud router.
  - Router connection address: BGP Peer information required for the BGP protocol running between the router of the hosted area and JD Cloud router.

4. Click "OK". In the list page of hosted private virtual interface, the status of the connection is Configuring.

5. Upon configuration, the hosted private virtual interface is available and can be used.



#### **Step 4: Create VPC Attachment interconnecting Border Gateway and VPC**
```
  The function of VPC Attachment is only released in regions of cn-east-2 and cn-south-1 and release time in other regions are to be determined.
  For any region supporting no VPC Attachment, the Border Gateway will set up association relationship with all VPCs under the region by default. In such case, corresponding static route can be configured in the Border Gateway Route Table and VPC Route Table.
```

1. Log in JD Cloud console.

2. Click the navigation bar on the left side, select **Hybrid Cloud Connection -> Border Gateway -> VPC Attachment**, enter the VPC Attachment list page and click **Create**.

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

``Special description: When there is an overlap between the subnet segment in VPC connected to Border Gateway and other channel connect segments, you can select "Specify Subnet Segment" when creating VPC Attachment and select the subnet segments having no overlaps with each other to avoid the overlapped VPC subnet segment from transmitting to the Border Gateway route table so as to satisfy the needs of some VPCs existing overlapped application scenarios``


#### **Step 5: Configure Route Table in VPC**

1. Log in JD Cloud console.

2. Click the navigation bar on the left side, select "Virtual Private Cloud", enter the route table related to JD Cloud VPC Private Subnet required to communicate with the Intranet of JD Cloud hosted area.

3. There are two methods to configure the Route Table: Static route method refers to the automatic route transmission method.

  Static route method: If it is planned to adopt the customized route thoroughly, please adopt the static route configuration method. Click **Edit** on the "Route Policies" page in the route table to add route rules, in which the target end is the Cabinet Service business segment you expect to be accessed, the type of next hop selects Border Gateway and the next hop selects the name of Border Gateway to be connected.

  Automatic route transmission method: If you intend to simplify network configuration process, the automatic route transmission method can be adopted with the JD Cloud platform’s capacity of automatic route transmission from Border Gateway to VPC Route Table. One VPC can establish route transmission relationships with several Border Gateways at the same time. Click **Add** in the "Route Transmission" page in the Route Table and fill in route transmission information.

- - Border Gateway: Select a source Border Gateway transmitted routes to VPC

  - Route transmission range: Refer to the address range of routes which have the prefix CIDR and are transmitted from the Border Gateway to VPC. Support input of multiple CIDR ranges, with different CIDRs separated with English commas. After the transmission route is configured, this segment in the selected Border Gateway and route of its subnet segment will be transmitted to this Route Table. Support configuration of transmission 0.0.0.0/0 routes. In such case, it will transmit all routes in the selected Border Gateway.

  When the configuration takes effect, the system will select route rules of route prefix in the transmission range from valid Route Table of Border Gateway (including static and dynamic route) and automatically add such rules to VPC Route Table. The type of next hop is Border Gateway, the next hop directs to the specified Border Gateway name in the "Route Transmission" configuration and the route type is transmission. The transmission type route cannot be edited.


#### **Step 5: Configure the route Table on the border gateway**

1. Log in JD Cloud console.

2. Click the navigation bar on the left side, select **Hybrid Cloud Connection -> Border Gateway -> Border Gateway**, click the required Border Gateway ID and enter the details for the Border Gateway hosting the Hosted Connect network interconnection.

3. Configure the route table. Two-way route is required, one way to VPC side and another to your JD Cloud hosted area side.

1) There are two ways routing to Cabinet Service: Static route method refers to the automatic route transmission method.

Automatic route transmission method:

If the Border Gateway has created a channel connected to the Cabinet Service (e.g. Hosted Private Virtual Interface, etc.) and has run BGP protocol to learn two-end dynamic route, the Border Gateway will automatically add the route learned through BGP to the target end of dynamic route table. The next hop is the channel connected to the Cabinet Service (e.g. Hosted Private Virtual Interface) and the route type is transmission. The dynamic route will compare the priority of valid routes of the route table and the route of high priority will be automatically added to the valid route table. Users can directly view the dynamic transmission route in Route Table without configuration, but users cannot modify or delete the dynamic transmission route.

Static route method:

If a user intends to control the route on its own, manual configuration and addition can be made by selecting "Static Route Table". As the Static Route of the same prefix route has the higher priority than the transmission route, the transmission route of the same prefix will be deleted from the valid Route Table. When a static route rule is added, the target end is the segment in your Cabinet Service. The type of next hop selects the private virtual interface and the next hop selects the private virtual interface used to host the Direct Connect network intercommunication.

2) There are two ways routing to VPC: Static route method refers to the automatic route transmission method.

Static route method:

When creating the VPC Attachment connecting Border Gateway and VPC, if "Not to Transmit Segment" is selected in the transmission of VPC segment, you need to manually configure the route reaching multiple VPCs, that is to configure all of the static route to VPC requiring interconnection item by item. To configure the static route to VPC, select "Route Table->Static Route Table" and click **Edit**. The route rule target end is the segment in VPC. Select VPC Attachment in the type of next hop. In the next hop, select the information of specific VPC Attachment to be communicated.

Automatic route transmission method:

When creating the VPC Attachment connecting Border Gateway and VPC, if "VPC All Segment" or "Specify Subnet Segment are selected in transmission of VPC segment, that is the route automatic transmission method. The Border Gateway route table will automatically add or delete the route table items reaching relevant subnet in the dynamic route table according to the configured scope of subnet. The target segment is VPC subnet segment, the type of next hop selects VPC Attachment, the next hop is the VPC Attachment connected to the specified VPC and Border Gateway and the route type is transmission. The dynamic route will compare the priority of routes of the static route table and the route of high priority will be automatically added to the valid route table. Users can directly view the dynamic transmission route in route table without configuration, but users cannot modify and delete the dynamic transmission route.


#### **Step 6: Configure routers in the JD Cloud hosted area**

Configure the route in the customer JD Cloud hosted area, including the configuration related to running BGP Protocol with JD Public Cloud, and the specific routing configuration.

For the route to the VPC, the destination is the network segment in your VPC. And the address for the nest hop is the address of BGP Peer to JD Public Cloud side, i.e., the JD Cloud side address of the hosted private virtual interface/ 30 Address.