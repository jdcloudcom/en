## **Multi-VPC Interconnection**

When less than three VPCs are required to be interconnected in the same region, try to use "VPC Peering" products, which has low time delay and simple configuration; when there are large amounts of VPCs required to be interconnected, you can create Border Gateway APIs connected to different VPCs based on Border Gateway to simplify the deployment configuration.

``Before interconnecting the multiple VPCs, you shall arrange all segments in VPCs to be interconnected and try to guarantee that the segments in VPCs will not overlap. If the segment overlap is unavoidable, you need to reasonably configure the range of route transmission of VPC and Border Gateway to guarantee there has no overlap of segment in the same route table. ``



### **If you use the Border Gateway to connect multiple VPCs on JD Cloud & AI, then you need to complete the following steps:**

Step 1: Create Border Gateway

Step 2: Create Border Gateway APIs

Step 3: Configure Route Table in VPC

Step 4: Configure Route Table on Border Gateway



### **Detailed procedures are as follows:**


#### **Step 1: Create Border Gateway**

1. Log in JD Cloud & AI console.

2. Click the navigation bar on the left side, select "Direct Connection Service -> Border Gateway".

3. When a new Border Gateway is created, the new Border Gateway will not connect to any VPC or channel and you need to configure the creation of Border Gateway APIs or private virtual interfaces and other connection channels.



**Step 2: Create VPC Attachment of Border Gateway**

1. Log in JD Cloud & AI console.

2. Click the navigation bar on the left side, select **Direct Connection -> Border Gateway -> VPC Attachment ->Create**.

3. Configure VPC Attachment, so as to establish connection and interconnection between Border Gateway and the selected VPC. For details, please see the Console Page.

Now, VPC Attachment supports interconnection between VPC and Border Gateway in the same region. One VPC Attachment can be created for the same VPC and the same Border Gateway. The same VPC can create different VPC Attachments with multiple different Border Gateways, another Border Gateway supports creation of different VPC Attachments with multiple different VPCs.

Primary configuration items are as follows:

- - API name: Name of API connected Border Gateway and VPC;

  - Border Gateway: Select Border Gateway to be interconnected. Border Gateway can communicated with VPC internally and serve as the BGP running endpoint at the JD Cloud & AI end and the customer IDC end;
  
  - VPC: Select VPC to be interconnected;
  
  - Transmitted VPC segment:
  
    ``All VPC Segments``, full-automatic introduction method of Border Gateway routes, meaning that the system will automatically add Route Table entries accessing all VPC segments to Route Table of Border Gateway. All segments include segments of all current subnets of VPC, and the Route Table entries of the Border Gateway are automatically updated based on subsequent changes to the VPC subnet, for example, when adding a new subnet later, the system will automatically add routes reaching the new subnet to the Border Gateway Route Table, and when deleting the subnet, Route Table entries corresponding to the Border Gateway will be automatically deleted synchronously
    
    ``Specified Subnet Segment``, semi-automatic introduction method of Border Gateway routes, meaning that the system will automatically add routes of specified segments in accessed VPC to Route Table of Border Gateway. Under the method, the route of the Border Gateway will not automatically adapt to adjustments outside the subnet specified within the VPC, for example, when adding or deleting the subnet outside the range will not cause the route change of Border Gateway; however, if the subnet within the specified range changes, when deleting the subnet within the range, it is required to delete the transmission subnet segment of VPC Attachment at first.
    
    ``No Transmission Segment``, full-automatic configuration method of Border Gateway route, meaning that the system will not automatically add any VPC access routes to Route Table of Border Gateway, and a user needs to manually configure static routes in BGW Route Table.

4. Click **OK**. In the VPC Attachment list, the status of the channel is configuring.

5. After the Border Gateway API is configured, the channel status is changed to available. In such case, the connection can be used for data transmission.

``Special description: When there is an overlap between the subnet segment in Border Gateway VPC connected and other channel connection segments, you can select "Specify Subnet Segment" when creating VPC Attachment and select the subnet segments having no overlaps with each other to avoid the overlapped VPC subnet segment from transmitting to the Border Gateway Route Table so as to satisfy the needs of some VPCs for overlapped application scenarios``


#### **Step 3: Configure Route Table in VPC**

1. Log in JD Cloud & AI console.

2. Click the navigation bar on the left side, select **Virtual Private Cloud**, enter the Route Table related to JD Cloud & AI VPC Private Subnet required to communicate with other VPCs in the same region.

3. There are two methods to configure the Route Table: Static route method refers to the automatic route transmission method.

  Static route method:
  
  If it is planned to adopt the customized route thoroughly, please adopt the static route configuration method. Click **Edit** on the "Route Policies" page in the route table to add route rules, in which the target end is the VPC segment you expect to be accessed, the type of next hop selects Border Gateway and the next hop selects the VPC Attachment of Border Gateway to be connected.

  Automatic route transmission method:
  
  If you intend to simplify network configuration process, the automatic route transmission method can be adopted with the JD Cloud & AI platform’s capacity of automatic route transmission from Border Gateway to VPC Route Table. Click **Add** in the "Route Transmission" page in the Route Table and fill in route transmission information. One VPC can establish route transmission relationships with several Border Gateways at the same time.
  
- - Border Gateway: Select a source Border Gateway transmitted routes to VPC

  - Route transmission range: Refer to the address range of routes which have the prefix CIDR and are transmitted from the Border Gateway to VPC. Support input of multiple CIDR ranges, with different CIDRs separated with English commas. After the transmission route is configured, this segment in the selected Border Gateway and route of its subnet segment will be transmitted to this Route Table. Support configuration of transmission 0.0.0.0/0 routes. In such case, it will transmit all routes in the selected Border Gateway.

      When the configuration takes effect, the system will select route rules of route prefix in the transmission range from valid Route Table of Border Gateway (including static and dynamic route) and automatically add such rules to VPC Route Table. The type of next hop is Border Gateway, the next hop directs to the specified Border Gateway name in the "Route Transmission" configuration and the route type is transmission. The transmission type route cannot be edited.

#### **Step 4: Configure Route Table on Border Gateway**

1. Log in JD Cloud & AI console.

2. Click the navigation bar on the left side, and select "Direct Connection Service -> Border Gateway", enter the details for the border gateway hosting the direct connection network intercommunication.

3. Configure route table, there are two ways routing to the route table item of every VPC: Static route method refers to the automatic route transmission method.

Static route method:

When creating the VPC Attachment connecting Border Gateway and VPC, if "Not to Transmit Segment" is selected in the transmission of VPC segment, you need to manually configure the route reaching multiple VPCs, that is to configure all of the static route to VPC requiring interconnection item by item. To configure the static route to VPC, select "Route Table->Static Route Table" and click **Edit**. The route rule target end is the segment in VPC. Select VPC Attachment in the type of next hop. In the next hop, select the information of specific VPC Attachment to be communicated.

Automatic route transmission method:

When creating the VPC Attachment connecting Border Gateway and VPC, if "VPC All Segment" or "Specify Subnet Segment are selected in transmission of VPC segment, that is the route automatic transmission method. The Border Gateway route table will automatically add or delete the route table items reaching relevant subnet in the dynamic route table according to the configured scope of subnet. The target segment is VPC subnet segment, the type of next hop selects VPC Attachment, the next hop is the VPC Attachment connected to the specified VPC and Border Gateway and the route type is transmission. The dynamic transmission route will compare the priority of routes in Static Route Table and the route of high priority will be automatically added to the effective Route Table. Users can directly view the dynamic transmission route in route table without configuration, but users cannot modify and delete the dynamic transmission route.





