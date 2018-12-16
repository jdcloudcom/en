### **Create a VM instance In a VPC** 


## **Overview**

With this teaching you can complete a simple network deployment on JD Cloud and get the following resources:

- 1 VPC
- 1 Subnet
- 1 VM



### **Operating steps**

#### **Step 1: Create VPC**

- Click Network -> VPC -> VPC in the menu on the left side, to enter the VPC list page click **Create**, thenthe Create Configuration window pops up.
- Select a region based on your demands, fill in the name, fill in CIDR, and click “Create” to establish a VPC.

![](/image/Networking/Virtual-Private-Cloud/Getting-Started/Create-Virtual-Machine-Instance-In-VPC/Step1.png)



#### **Step 2: Create a Subnet**

- Click Network -> VPC -> Subnet in the menu on the left side to enter the subnet list page, click **Create**, then the Create Configuration window pops up.


- Select a region according to the demands and select the VPC created above, then fill in the subnet name and the subnet CIDR, select the associated route table, and click **Create** to creat a subnet.
![](/image/Networking/Virtual-Private-Cloud/Getting-Started/Create-Virtual-Machine-Instance-In-VPC/Step2.png)



#### **Step 3: Create a VM in This Subnet**

- Click Elastic Compute -> VM -> Instances in the menu on the left side to the Instance List page, click Create, then the Create Configuration window pops up.
- Find the network module on the of VM instance creating configuration, select the VPC and the subnet created above, and the rest of the configuration can be deployed based on the VM guide. Then Click **Create** to create a VM in a specified VPC and subnet.

![](/image/Networking/Virtual-Private-Cloud/Getting-Started/Create-Virtual-Machine-Instance-In-VPC/Step3.png)