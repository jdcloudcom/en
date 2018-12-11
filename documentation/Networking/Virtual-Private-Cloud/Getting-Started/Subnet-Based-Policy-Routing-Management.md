## ** Subnet-based Policy Route Management **

**Step 1: Create VPC**

1. Open the JD Cloud console and select Networking > VPC to enter the VPC list page.

2. Select the region where the VPC will be created in (currently open cn-north, cn-south area), then click the **Create** button;

3. Region Selection: In this step, you can still alternate the VPC region. If the selected region quota is exhausted, you can increase the quota by submitting **Open Ticket**;

4. Set Up the VPC Name: The name cannot be null only supports Chinese, numbers, uppercase and lowercase letters, English underscore "_" and line-through "-", and cannot exceed 32 characters;

5. Set Up the CIDR of the VPC: Set up the boundary of the VPC, CIDR can only be configured in the intranet segment, the optional range is 10.0.0.0 (The mask is 16) ,172.31.0.0 (The mask is 16 to 28). The CIDR may not be preset. In this case, the boundary of the VPC will be automatically scaled along with the IP range of the subnet. It is recommended that the user who has deep understanding of the network select a VPC without a preset CIDR.

6. Fill the VPC description: The description can be null, only supports Chinese, numbers, uppercase and lowercase letters, English underscore "_", and cannot exceed 256 characters;

7. Click **OK** to enter the **Console** to view the created VPC;

![](/image/Networking/Virtual-Private-Cloud/Getting-Started/Subnet-Based-Policy-Routing-Management/Step1-1.png)

![](/image/Networking/Virtual-Private-Cloud/Getting-Started/Subnet-Based-Policy-Routing-Management/Step1-2.png)



**Step 2: Create a Subnet**

1. Open the console and select Networking > Subnet to enter the subnet list page;

2. Select region for the subnet (currently open cn-north, cn-south), click the **Create** button;

3. Region Selection: In this step, you can still alternet region for the subnet. If the quota in the selected region is exhausted, you can increase the quota by submitting **Open Ticket**;

4. Select a VPC for this subnet.A subnet must be created in a VPC.

5. Create a Subnet: Support to create multiple subnets at the same time, enter the subnet name, subnet CIDR, associated route table, description, and other information.

6. The CIDR of the subnet can only be the intranet segment. The optional range is 10.0.0.0 (The mask is 16), 172.31.0.0 (The mask is 16-28).

7. The CIDRs of multiple subnets cannot be overlapped. If the VPC has preset CIDR, the CIDR of the belonging subnets cannot exceed the boundary of the VPC.

8. Set Up the Subnet Name: The name cannot be blank. Only Chinese, numbers, uppercase and lowercase letters, English underscore "_" and line-through "-" are accepted, not exceeding 32 characters;

9. Select the route table associated with the subnet. Each subnet can be and must be associated with a route table. This route table is the policy route based on the subnet source address;

10. Set Up description of the Subnet: The description can be null, only supports Chinese, numbers, capital and small letters, English underscore "_" and underscore "-", and cannot exceed 256 characters;

11. Click **OK** to enter the **Console** to view the created subnet;

![](/image/Networking/Virtual-Private-Cloud/Getting-Started/Subnet-Based-Policy-Routing-Management/Step2-1.png)

![](/image/Networking/Virtual-Private-Cloud/Getting-Started/Subnet-Based-Policy-Routing-Management/Step2-2.png)



**Step 3: ReplaceRoute Table for Subnet**

1. Open the console and select Networking > Subnet to enter the subnet list page;

2. Click on the **Change Route Table**
3.  in the action column;

3. In the pop-up route table selection page, select a route table in this VPC to replace the current one for the subnet;

4. Click **OK** to replace the route table for the subnet;

![](/image/Networking/Virtual-Private-Cloud/Getting-Started/Subnet-Based-Policy-Routing-Management/Step3-1.png)