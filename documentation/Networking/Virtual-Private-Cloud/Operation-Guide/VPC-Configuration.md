## **VPC Configuration**

#### **Step 1, Create a VPC**

1. Open the console and select Networking > VPC to enter the VPC list page.

2. Select the region where creating VPC belongs to (at present, cn-north-1, cn-south-1, cn-east-1 and cn-east-2 are open), click the **Create** button;

3. Region Selection: In this step, you can still choose region to create the VPC. If the selected region limit is full, you can increase the limit by **Open Ticket**;

4. Set Up the VPC Name: The name cannot be null. Only Chinese, numbers, uppercase and lowercase letters, English underscore "_" and line-through "-" are accepted, not exceeding 32 characters;

5. Set Virtual Private Cloud CIDR: When the Virtual Private Cloud border is set, IPv4 CIDR can only be private network segments, with optional ranges of 10.0.0.0, 172.16.0.0 ~ 172.31.0.0, 192.168.0.0 (the optional range of the above three netmasks is 16 ~ 28). IPv4 CIDR may not be preset, then the VPC border will be automatically scaled along with the Subnet segment. We recommend that users with a deep understanding of network choose Virtual Private Cloud of no preset CIDR.


6. Description to VPC Setup: The description can be null, only supports Chinese, numbers, uppercase and lowercase letters, English underscore "_", and cannot exceed 256 characters;

7. Click **OK** to enter the **Console** to view the created VPC;



#### **Step 2, Modify the VPC Name/Description**

1. Open the console, select Networking > VPC, and click on the VPC name to enter the VPC details page;

2. Click the **Modify** button of the name/description to modify the VPC name/description;



#### **Step 3, View the subnet, route table, networking ACL in the VPC**

Open the console, select Networking > VPC, click the VPC name to enter the VPC details page, and switch the tab of subnet, route table, and networking ACL to view the information of the subnets, route tables, and networking ACL that have been created in the VPC.



#### **Step 4, Delete a VPC**

1. Open the console and select Networking > VPC to enter the VPC list page.

2. Click on the Delete in the operation column;

3. After confirming the deletion of the VPC twice, the VPC can be deleted;

4. Restrictions on deleting VPC: The VPC in which has created subnet cannot be deleted;

5. When the VPC is deleted, the route table, networking ACL, and security group in this VPC will be deleted synchronously.

### **Configure IPv4/IPv6 Dual Stack VPC**
JD Cloud & AI supports IPv4/IPv6 dual stack Virtual Private Cloud (currently, IPv6 is under beta. If you need to use it, please [Open Ticket](https://ticket.jdcloud.com/applyorder/submit) to apply for beta).

**Step 1: ** Log in [JD Cloud & AI Official Website](https://www.jdcloud.com/);

**Step 2: ** Click the Console on the top right corner of the page to log in JD Cloud & AI Console and then access the Console navigation page;

**Step 3: ** Click **Cloud Service**, select **Virtual Private Cloud** and access the Virtual Private Cloud List page;

**Step 4: ** Click **Create** and access the Create VPC popup;

**Step 5: ** Complete relevant information. Select **IPv6 CIDR Provided by JD Cloud & AI** for [IPv6 CIDR] field and complete relevant information, and then click **OK**;

**Step 6: ** After the above steps, the IPv4/IPv6 dual stack Virtual Private Cloud is created.
