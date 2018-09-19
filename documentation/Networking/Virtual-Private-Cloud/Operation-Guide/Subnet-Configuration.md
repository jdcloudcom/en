## **Subnet Configuration**

#### **Step 1, Create a Subnet**

1. Open the console and select Networking > Subnet to enter the subnet list page;

2. Select area where creating the subnet belongs (currently open cn-north, cn-south), click the "Create" button;

3. Region Selection: In this step, you can still choose to area to create a subnet. If the selected geographic limit is full, you can increase the limit by "Open Ticket";

4. Select the VPC to which it belongs. The subnet must be created in a VPC.

5. Create a Subnet: Support to create multiple subnets at the same time, enter the subnet name, subnet CIDR, associated route table, description, and other information.

6. The CIDR of the subnet can only be the intranet segment. The optional range is 10.0.0.0 (The mask is 16~28), 172.16.0.0~172.31.0.0 (The mask is 16~28), 192.168.0.0 ( The mask is 16~28).

7. The CIDRs of multiple subnets cannot be overlapped. If the VPC to which it belongs has preset CIDR, the CIDR of the subnet cannot exceed the boundary of the VPC.

8. Set Up the Subnet Name: The name cannot be blank. Only Chinese, numbers, uppercase and lowercase letters, English underscore "_" and line-through "-" are accepted, not exceeding 32 characters;

9. Select the route table associated with the subnet, with each subnet that can be associated with a route table and must be associated with a route table.

10. Description to the Subnet Set Up: The description can be blank, only supports Chinese, numbers, capital and small letters, English underscore "_" and underscore "-", and it cannot exceed 256 characters;

11. Click **OK** to enter the "Console" to view the created subnet;

![](/image/Networking/Virtual-Private-Cloud/Operation-Guide/Subnet-Configuration/Step1.png)

![](/image/Networking/Virtual-Private-Cloud/Operation-Guide/Subnet-Configuration/Step2.png)



#### **Step 2, Replace a Route Table**

1. Open the console and select Networking > Subnet to enter the subnet list page;

2. Click on the "Change Route Table" in the action column;

3. In the pop-up route table selection page, select the route table to be replaced for the subnet, and replace other route tables in the VPC to which it belongs for the subnet;

4. Click **OK** to replace the route table for the subnet;

![](/image/Networking/Virtual-Private-Cloud/Operation-Guide/Subnet-Configuration/Step3.png)



#### **Step 3, Modify a Subnet Name/Description**

1. Open the console, select Network > Subnet, and click the subnet name to enter the subnet details page;

2. Click the Modify button after the name/description to modify the subnet name/description. For the specific name/description rules, see Subnet Creation;



#### **Step 4, View Route Table Rules, ACL Rules, and VMs in the Subnet**

Open the console, select Network > Subnet, click the subnet name to enter the subnet details page, and switch the route rules, ACL rules, and VM tabs to view.

 ![](/image/Networking/Virtual-Private-Cloud/Operation-Guide/Subnet-Configuration/Step4.png)



#### **Step 5, Delete a Subnet**

1. Open the console and select Networking > Subnet to enter the subnet list page;

2. Click on the Delete in the operation column;

3. After confirming the deletion of the subnet twice, the subnet can be deleted;

4. Restrictions on deleting subnets: The subnet on which the resource is created cannot be deleted, such as creating a VM, load balancer, and so on.

 