## **VPC Configuration**

#### **Step 1, Create a VPC**

1. Open the console and select Networking > VPC to enter the VPC list page.

2. Select the area where creating VPC belongs (currently open cn-north, cn-south area) to, click the "Create" button;

3. Region Selection: In this step, you can still choose to create a local area of the VPC. If the selected geographical limit is full, you can increase the limit by "Open Ticket";

4. Set Up the VPC Name: The name cannot be blank. Only Chinese, numbers, uppercase and lowercase letters, English underscore "_" and line-through "-" are accepted, not exceeding 32 characters;

5. Set Up the CIDR of the VPC: Set up the boundary of the VPC. CIDR can only be the intranet segment. The optional range is 10.0.0.0 (The mask is 16~28), 172.16.0.0~172.31.0.0 (The mask is 16~28), 192.168.0.0. (The mask is 16~28). The CIDR may not be preset. In this case, the boundary of the vpc will be automatically scaled along with the network segment of the subnet. It is recommended that the user who has deep understanding of the network select a VPC without a preset CIDR.

6. Description to VPC Setup: The description can be blank, only supports Chinese, numbers, uppercase and lowercase letters, English underscore "_", and cannot exceed 256 characters;

7. Click **OK** to enter the "Console" to view the created VPC;

![](/image/Networking/Virtual-Private-Cloud/Operation-Guide/VPC-Configuration/Step1.png)

![](/image/Networking/Virtual-Private-Cloud/Operation-Guide/VPC-Configuration/Step2.png)



#### **Step 2, Modify the VPC Name/Description**

1. Open the console, select Networking > VPC, and click on the VPC name to enter the VPC details page;

2. Click the Modify button after the name/description to modify the VPC name/description;



#### **Step 3, View the subnet, route table, networking ACL in the VPC**

Open the console, select Networking > VPC, click the VPC name to enter the VPC details page, and switch the tab of subnet, route table, and networking ACL to view the information of the subnets, route tables, and networking ACL that have been created on the VPC.

![](/image/Networking/Virtual-Private-Cloud/Operation-Guide/VPC-Configuration/Step3.png)



#### **Step 4, Delete a VPC**

1. Open the console and select Networking > VPC to enter the VPC list page.

2. Click on the Delete in the operation column;

3. After confirming the deletion of the VPC twice, the VPC can be deleted;

4. Restrictions on deleting VPC: The VPC of the created subnet cannot be deleted;

5. When the VPC is deleted, the route table, networking ACL, and security group in this VPC will be deleted synchronously.