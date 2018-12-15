### **Create a VM instance In a VPC** 


## **Overview**

With this teaching you can complete a simple network deployment on JD Cloud and get the following resources:

- 1 VPC
- 1 Subnet
- 1 VM



### **Operating steps**

#### **Step 1: Create VPC**

- Click Network -> VPC -> VPC in the menu on the left side of the menu in sequence, enter the VPC list page, click Create, and the Create Configuration window pops up.
- Select the region based on your demands, fill in the name, fill in CIDR, and click Create to get a VPC.

![](/image/Networking/Virtual-Private-Cloud/Getting-Started/Create-Virtual-Machine-Instance-In-VPC/Step1.png)



#### **Step 2: Create a Subnet**

- Click Network -> VPC -> Subnet in the menu on the left side of the menu to enter the subnet list page in sequence, click Create, and the Create Configuration window pops up.
- Select the area according to the demands and select VPC created just now, fill in the subnet name, fill in the subnet CIDR, select the associated route table, and click Create to get 1 subnet.

![](/image/Networking/Virtual-Private-Cloud/Getting-Started/Create-Virtual-Machine-Instance-In-VPC/Step2.png)



#### **Step 3: Create a VM in This Subnet**

- Click Elastic Compute -> VM -> Instances in the menu on the left side of the menu in sequence, go to the Instance List page, click Create, and the Create Configuration window pops up.
- Find the network module on the configuration page created by the instance, select the VPC and subnet just created, and the rest of the configuration can be based on the VM guide. Click Create to create one VM with a specified VPC and subnet.

![](/image/Networking/Virtual-Private-Cloud/Getting-Started/Create-Virtual-Machine-Instance-In-VPC/Step3.png)