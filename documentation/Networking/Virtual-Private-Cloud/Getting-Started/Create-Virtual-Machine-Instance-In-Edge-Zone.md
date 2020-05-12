### **Create VM Instance in Edge Zone** 


## **Overview**

You can complete simple network deployment on JD Cloud & AI through this tutorial and get the following resources:

- 1 VPC
- 1 Standard Subnet
- 1 Set of Virtual Machines
- 1 Edge Elastic IP



### **Operation Steps**

#### **Step 1: Create VPC**

- Click **Network**->**VPC**->**VPC** in turn in the left menu, log in the VPC List Page and click **Create** to pop up the Create window.
- Select a region as required, fill in the name and CIDR and click **Create** to get 1 VPC.



#### **Step 2: Create Edge Subnet**

- Click **Network**->**VPC**->**Subnet** in turn in the left menu, log in the Subnet List Page and click **Create** to pop up the Create window.
- Select a region as required, enable the designated edge zone and select an edge zone; select the VPC just created, fill in the subnet name and subnet CIDR, select the associated route table, and click **Create** to get 1 edge subnet.



#### **Step 3: Create VM in this Edge Subnet**

- Click **Elastic Compute**->**Virtual Machines**->**Instance** in turn in the left menu, log in the Instance List Page and click **Create** to pop up the Create window.
- On the configuration page created by the instance, select the edge zone, find the network module, and select the VPC and edge subnet just created; complete other configurations according to the Virtual Machines guide; click **Create** to create 1 edge Virtual Machines with designated VPC and edge subnet.



#### **Step 4: Create Edge Elastic IP in Edge Zone**

- Click **VPC**->**Elastic IP** in turn in the left menu, log in the Elastic IP List Page and click **Apply** to pop up the Apply window.
- On the configuration page of applying for Public IP, select **Region**, **Edge Elastic IP Type** and **Public IP ISP Line** and click **Create** to create 1 Edge Elastic IP.
- On the Elastic IP List Page, find the corresponding Edge Elastic IP, select **Associate Resource** to associate the created Edge Elastic IP with the edge VM. After the ACL/Security Group and Route Table is correctly configured, the corresponding VM can be accessed via public network and provide external services.

