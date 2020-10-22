## **Standard Subnet Configuration**

#### **Step 1. Create Standard Subnet**

1. Open the Console, select **Network** > **Subnet** and enter the Subnet List Page;

2. Select the region where the Subnet creates and click **Create**;

3. Region selection: In this step, you can still have the option to create the region of the subnet. If the quota of the selected region is full, you can increase quota by "Open Ticket";

4. Disable the designated edge zone: The designated edge zone is disabled by default and you can only create a Standard Subnet;

5. Select **VPC**. The subnet must be created in a VPC. If a Subnet supporting IPv6 needs to be created, users should select the Virtual Private Cloud supporting IPv6;

6. Create subnet: Multiple subnets can be created at the same time. Enter subnet name, CIDR, associated Route Table, description and other information;

7. The Subnet IPv4 CIDR can only be private network segments, with optional ranges of 10.0.0.0, 172.16.0.0\~172.31.0.0, 192.168.0.0 (the optional range of the netmask of the above three segments is 16 \~ 28);

8. CIDRs among multiple subnets cannot be overlapped. If the VPC has preset a CIDR, then CIDR of the subnet cannot exceed the boundary of the VPC;

9. The Subnet IPv6 CIDR should be selected in the segments of the Virtual Private Cloud. The 57th through the 64th are configurable; the optional range is 00\~ff (hexadecimal); the netmask range is fixed at 64;

10. Set subnet name: The name cannot be null; it only supports Chinese, numbers, uppercase and lowercase letters, English underline "_" and line-through "-", with at most 32 characters;

11. Select the Route Table associated with the subnet. Each subnet can and must be associated with one Route Table; the Standard Subnet cannot be associated with a Route Table that has been associated with an Edge Subnet; [Detailed Description](subnet-configuration#user-content-1)

12. Set subnet description: The description can be blank; it only supports Chinese, numbers, uppercase and lowercase letters, English underline "_" and line-through "-", with at most 256 characters;

13. Click **OK** to log in the "Console" to view the subnet created;




#### **Step 2. Change Route Table**

1. Open the Console, select **Network** > **Subnet** and enter the Subnet List Page;

2. Click **Change Route Table** in the Operation List;

3. On the popup Route Table Selection Page, select the Route Table to be changed for the subnet, you can change other Route Tables in the VPC for the subnet; the Standard Subnet cannot change a Route Table that has been associated with an Edge Subnet; [Detailed Description](subnet-configuration#user-content-1)

4. Click **OK** to change the Route Table for the subnet.



#### **Step 3. Modify Subnet Name/Description**

1. Open the Console, select **Network** > **Subnet** and click **Subnet Name** to enter the Subnet Details;

2. Click **Modify** following the name/description to modify the subnet name/description. For specific name/description rules, refer to Subnet Creation.



#### **Step 4. View Route Table Rule, ACL Rule and Virtual Machines in Subnet**

Open the Console, select **Network** > **Subnet** and click **Subnet Name** to enter the Subnet Details; you can view the route rules, ACL rules and VM by switching the tab.



#### **Step 5. Delete Subnet**

1. Open the Console, select **Network** > **Subnet** and enter the Subnet List Page;

2. Click **Delete** in the Operation List;

3. Confirm again the deletion of the subnet to delete this subnet;

4. Delete restriction on subnet: Subnets that have created resources cannot be deleted, for example, VMs, Load Balancer and others are created in this subnet.



## **Edge Subnet Configuration**

#### **Step 1, Create a Subnet**

1. Open the console and select Networking > Subnet to enter the subnet list page;

2. Select region where creating the subnet belongs (currently open cn-north, cn-south and cn-east), click the **Create** button;

3. Region Selection: In this step, you can still choose region to create a subnet. If the selected region limit is full, you can increase the limit by **Open Ticket**;

4. Enable the designated edge zone: Enable the switch and you can only create an Edge Subnet;

5. Select the edge zone associated with the Edge Subnet, single choice;

6. Select the VPC to which it belongs. The subnet must be created in a VPC;

7. Create a Subnet: Eenter the subnet name, subnet CIDR, associated route table, description, and other information.

8. The Subnet CIDR can only be private network segments, with optional ranges of 10.0.0.0, 172.16.0.0\~172.31.0.0, 192.168.0.0 (the optional range of the netmask of the above three segments is 16 \~ 28);

9. CIDR among several Subnets cannot be overlapped. If the VPC has preset the CIDR, the Subnet CIDR cannot go beyond the Virtual Private Cloud border;

10. Set Up the Subnet Name: The name cannot be null. Only Chinese, numbers, uppercase and lowercase letters, English underscore "_" and line-through "-" are accepted, not exceeding 32 characters;

11. Select the route table to associated with the subnet, with each subnet that can be associated with a route table and must be associated with a route table.

12. Description to the Subnet Set Up: The description can be null, only supports Chinese, numbers, capital and small letters, English underscore "_" and underscore "-", and it cannot exceed 256 characters;

13. Click **OK** to enter the **Console** to view the created subnet;



#### **Step 2, Replace a Route Table**

1. Open the console and select Networking > Subnet to enter the subnet list page;

2. Click on the **Change Route Table** in the action column;

3. In the pop-up route table selection page, select the route table to be replaced for the subnet, and replace other route tables in the VPC to which the subnet belongs; the Edge Subnet cannot change a Route Table that has been associated with a Standard Subnet or other Route Tables that have been associated with an Edge Subnet in edge zones; [Detailed Description](subnet-configuration#user-content-1)

4. Click **OK** to replace the route table for the subnet.



#### **Step 3, Modify a Subnet Name/Description**

1. Open the console, select Network > Subnet, and click the subnet name to enter the subnet details page;

2. Click the **Modify** button of the name/description to modify the subnet name/description. For the specific name/description rules, see Subnet Creation.



#### **Step 4, View Route Table Rules, ACL Rules, and VMs in the Subnet**

Open the console, select Network > Subnet, click the subnet name to enter the subnet details page, and switch the route rules, ACL rules, and VM tabs to view.



#### **Step 5, Delete a Subnet**

1. Open the console and select Networking > Subnet to enter the subnet list page;

2. Click on the **Delete** in the operation column;

3. After confirming the deletion of the subnet twice, the subnet can be deleted;

4. Restrictions on deleting subnets: The subnet in which the resource has created cannot be deleted, such as creating a VM, load balancer, and so on.



#### Detailed Description:
<div id="user-content-1"></div>

1) Route Table can only associate with subnets with the same attribute;

2) Subnets will have the same attribute under two circumstances:

a. Standard Subnet at the same region; </br>
b. Edge Subnet associating with the same edge zone at the same region;

3) Route Table that has associated with a Standard Subnet cannot associate with an Edge Subnet; Route Table that has associated with an Edge Subnet cannot associate with a Standard Subnet or an Edge Subnet in different edge zones.

