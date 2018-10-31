## ** Subnet-based Policy Route Management **

**Step 1: Create VPC**

1. Open the console and select Networking > VPC to enter the VPC list page.

2. Select the area where creating VPC belongs (currently open cn-north, cn-south area) to, click the "Create" button;

3. Region Selection: In this step, you can still choose to create a local area of the VPC. If the selected geographical limit is full, you can increase the limit by "Open Ticket";

4. Set Up the VPC Name: The name cannot be blank. Only Chinese, numbers, uppercase and lowercase letters, English underscore "_" and line-through "-" are accepted, not exceeding 32 characters;

5. Set Up the CIDR of the VPC: Set up the boundary of the VPC. CIDR can only be the intranet segment. The optional range is 10.0.0.0 (The mask is 16~28), 172.16.0.0~172.31.0.0 (The mask is 16~28), 192.168.0.0. (The mask is 16~28). The CIDR may not be preset. In this case, the boundary of the vpc will be automatically scaled along with the network segment of the subnet. It is recommended that the user who has deep understanding of the network select a VPC without a preset CIDR.

6. Description to VPC Setup: The description can be blank, only supports Chinese, numbers, uppercase and lowercase letters, English underscore "_", and cannot exceed 256 characters;

7. Click **OK** to enter the "Console" to view the created VPC;

![](/image/Networking/Virtual-Private-Cloud/Getting-Started/Subnet-Based-Policy-Routing-Management/Step1-1.png)

![](/image/Networking/Virtual-Private-Cloud/Getting-Started/Subnet-Based-Policy-Routing-Management/Step1-2.png)



**Step 2: Create a Subnet**

1. Open the console and select Networking > Subnet to enter the subnet list page;

2. Select area where creating the subnet belongs (currently open cn-north, cn-south), click the "Create" button;

3. Region Selection: In this step, you can still choose to area to create a subnet. If the selected geographic limit is full, you can increase the limit by "Open Ticket";

4. Select the VPC to which it belongs. The subnet must be created in a VPC.

5. Create a Subnet: Support to create multiple subnets at the same time, enter the subnet name, subnet CIDR, associated route table, description, and other information.

6. The CIDR of the subnet can only be the intranet segment. The optional range is 10.0.0.0 (The mask is 16~28), 172.16.0.0~172.31.0.0 (The mask is 16~28), 192.168.0.0 ( The mask is 16~28).

7. The CIDRs of multiple subnets cannot be overlapped. If the VPC to which it belongs has preset CIDR, the CIDR of the subnet cannot exceed the boundary of the VPC.

8. Set Up the Subnet Name: The name cannot be blank. Only Chinese, numbers, uppercase and lowercase letters, English underscore "_" and line-through "-" are accepted, not exceeding 32 characters;

9. Select the route table associated with the subnet. Each subnet can be associated with a route table and must be associated with a route table. This is the policy route based on the subnet source address;

10. Description to the Subnet Set Up: The description can be blank, only supports Chinese, numbers, capital and small letters, English underscore "_" and underscore "-", and it cannot exceed 256 characters;

11. Click **OK** to enter the "Console" to view the created subnet;

![](/image/Networking/Virtual-Private-Cloud/Getting-Started/Subnet-Based-Policy-Routing-Management/Step2-1.png)

![](/image/Networking/Virtual-Private-Cloud/Getting-Started/Subnet-Based-Policy-Routing-Management/Step2-2.png)



**Step 3: Subnet Replacement Route Table**

1. Open the console and select Networking > Subnet to enter the subnet list page;

2. Click on the "Change Route Table" in the action column;

3. In the pop-up route table selection page, select the route table to be replaced for the subnet, and replace other route tables in the VPC to which it belongs for the subnet;

4. Click **OK** to replace the route table for the subnet;

![](/image/Networking/Virtual-Private-Cloud/Getting-Started/Subnet-Based-Policy-Routing-Management/Step3-1.png)