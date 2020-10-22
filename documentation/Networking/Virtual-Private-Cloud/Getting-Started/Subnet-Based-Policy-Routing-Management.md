## **Subnet-based Policy Route Management**

**Step 1: Create VPC**

1. Open the JD Cloud console and select Networking > VPC to enter the VPC list page.

2. Select the region where the VPC will be created in (currently open cn-north, cn-south area), then click the **Create** button;

3. Region Selection: In this step, you can still alternate the VPC region. If the selected region quota is exhausted, you can increase the quota by submitting **Open Ticket**;

4. Set Up the VPC Name: The name cannot be null only supports Chinese, numbers, uppercase and lowercase letters, English underscore "_" and line-through "-", and cannot exceed 32 characters;

5. Set Virtual Private Cloud CIDR: When the Virtual Private Cloud border is set, CIDR can only be private network segments, with optional ranges of 10.0.0.0 (netmask: 16\~28), 172.16.0.0\~172.31.0.0 (netmask: 16\~28) and 192.168.0.0 (netmask: 16\~28). CIDR may not be preset, then the VPC border will be automatically scaled along with the Subnet segment. We recommend that users with a deep understanding of network choose Virtual Private Cloud of no preset CIDR.

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

6. The Subnet CIDR can only be private network segments, with optional ranges of 10.0.0.0 (netmask: 16\~28), 172.16.0.0\~172.31.0.0 (netmask: 16\~28) and 192.168.0.0 (netmask: 16\~28).

7. The CIDRs of multiple subnets cannot be overlapped. If the VPC has preset CIDR, the CIDR of the belonging subnets cannot exceed the boundary of the VPC.

8. Set Up the Subnet Name: The name cannot be blank. Only Chinese, numbers, uppercase and lowercase letters, English underscore "_" and line-through "-" are accepted, not exceeding 32 characters;

9. Select the route table associated with the subnet. Each subnet can be and must be associated with a route table. This route table is the policy route based on the subnet source address;

10. Set Up description of the Subnet: The description can be null, only supports Chinese, numbers, capital and small letters, English underscore "_" and underscore "-", and cannot exceed 256 characters;

11. Click **OK** to enter the **Console** to view the created subnet;

![](/image/Networking/Virtual-Private-Cloud/Getting-Started/Subnet-Based-Policy-Routing-Management/Step2-1.png)

![](/image/Networking/Virtual-Private-Cloud/Getting-Started/Subnet-Based-Policy-Routing-Management/Step2-2.png)



**Step 3: ReplaceRoute Table for Subnet**

1. Open the console and select Networking > Subnet to enter the subnet list page;

2. Click on the **Change Route Table** in the action column;

3. In the pop-up route table selection page, select a route table in this VPC to replace the current one for the subnet;

4. Click **OK** to replace the route table for the subnet;

![](/image/Networking/Virtual-Private-Cloud/Getting-Started/Subnet-Based-Policy-Routing-Management/Step3-1.png)