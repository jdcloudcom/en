## **Route Table Configuration**

#### **Step 1 Create a Customized Route Table**

1. Open the console and choose Networking > VPC > Route Table to enter the route table list page;

2. Select the region where the route table creates and click the **Create** button to enter the Route Table Creation page;

3. Region Selection: In this step, you can still choose the region where the route table is created;

4. Select the VPC which it belongs, and the route table must be created in a VPC.

5. Set the Name of Route Table: The name cannot be blank. Only Chinese, numbers, uppercase and lowercase letters, English underscore "_" and line-through "-" are accepted, not exceeding 32 characters;

6. Set the description of route table: The description can be null, only supports Chinese, numbers, uppercase and lowercase letters, English underscore "_", and cannot exceed 256 characters;

7. Click on **OK** to enter the Console to view the route table that have been created;

8. After the route table is created, routing rules should be configured, or you can configure it by yourself by entering the details page later;



#### **Step 2 Associate Subnet**

1. Open the console and choose Networking > VPC > Route Table to enter the route table list page;
2. Click **Associate Subnet** under the operation bar, or click **Route Table Name** to enter the details of route table, click **Associate Subnet* button of **Associate Subnet** tab:
3. In the subnet selection pop-up window, choose a subnet to be associated with this route table. Remember that the subnet and route table should be in the same VPC. 
4. Click on **OK** to associate the route table to the subnet;

```
Use Restrictions:
1) Route Table can only associate with subnets with the same attribute;
2) Subnets will have the same attribute under two circumstances: a. Standard Subnet at the same region, b. Edge Subnet associating with the same edge zone at the same region;
3) Route Table that has associated with a Standard Subnet cannot associate with an Edge Subnet; Route Table that has associated with an Edge Subnet cannot associate with a Standard Subnet or an Edge Subnet in different edge zones.
```



#### **Step 3 Modify the Name/Description**

   1. Open the console, select Networking > VPC > Route Table, and click the route table name to enter the route table’s details page;
   
   2. Click the modify button after the name/description to modify the route table’s name/description. For the specific name/description rules, refer to the Create Route Table;



#### **Step 4, Delete Route Table**

1. Open the console and choose Networking > VPC > Route Table to enter the route table list page;
  
2. Click the delete of the operation column;

3. After confirming the deletion of the route table twice, the route table can be deleted;
  
4. Restrictions on deleting route tables:

    a) The customized route table associated with the subnet cannot be deleted.
    b) The default route table cannot be deleted.



#### **Step 5, Route Rules**

1. Default route table. When creating a VPC, a default route table is created by default, which contains two default route rules, namely Local for VPC internal communication and Internet gateway for accessing public network. Local route cannot be modified or deleted, and its specific rule is [Local Local Local]. The Internet route can be modified and deleted.

2. Customized route table. The route table created by the user is a customized route table, which contains a default route rule, namely Local for the VPC internal communication that cannot be modified or deleted.

3. Communicate between subnets in the VPC to preferentially match the Local route.

4. The route rules of the route table match in a sequence from top to bottom and match exactly.



#### **Step 6, Editing route rules**

 1. Open Console, select **Network > VPC > Route Table**, click **Route Table Name** to enter the details of route table, click **Route Policy** to enter routing rules tab, click **Edit**;

2. The destination ends of the route rules cannot be null, and the destination ends of the route rules cannot be identical. The destination end input format is the CIDR of the network segment.

3. If the VPC on the route table has a preset CIDR, the destination end of the route rule cannot conflict with the CIDR of the VPC.

4. If the VPC on the route table does not have a preset CIDR, the destination of the route rule cannot conflict with the CIDR of any subnet in the VPC.

5. The next hop type supports the Internet and the VM as the next hop. If the traffic needs to access the Internet, you can select the Internet gateway or the self-built VM as the public network gateway.

 6. The Next Hop (Address) supports Internet and Virtual Machines, Border Gateway, VPC Peering, NAT Gateway, etc. as the address of Next Hop, a Virtual Machine configured with SNAT feature can be selected as Gateway of Next Hop;

 7. Click **Save** to save results of edition and modification;



#### **Step 7. Configuration of Route Transmission**

 1. Open Console, select **Network > VPC > Route Table**, click **Route Table Name** to enter the details of route table, click **Route Transmission** tab to enter route transmission rules list page;

 2. Click **Add** to fill in route transmission information. One VPC can establish route transmission relationships with several Border Gateways at the same time;

 3. In the dialog box of adding route transmission: Border Gateway, select a source Border Gateway that transmits routes to VPC;

 4. In the dialog box of adding route transmission: Route transmission range refers to the address range of routes which have the prefix CIDR and are transmitted from the Border Gateway to VPC. Support input of multiple CIDR ranges, with different CIDRs separated with English commas. After the transmission route is configured, this segment in the selected Border Gateway and route of its subnet segment will be transmitted to this Route Table. Support configuration of transmission 0.0.0.0/0 routes, it will transmit all valid routes in the selected Border Gateway;

 5. Click [OK]. When the configuration takes effect, the system will select route rules of route prefix in the transmission range from valid Route Table of Border Gateway (including static and dynamic route) and automatically add such rules to VPC Route Table. The type of next hop is Border Gateway, the next hop directs to the specified Border Gateway name in the "Route Transmission" configuration and the route type is transmission. The transmission route can be viewed but cannot be edited.

