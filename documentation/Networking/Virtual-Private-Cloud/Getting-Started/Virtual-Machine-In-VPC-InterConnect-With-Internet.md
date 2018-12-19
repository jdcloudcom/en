# **Intercommunication between VM and public network in VPC**

### **Overview**

Through this teaching, you can complete the deployment of a VM that can communicate with the public network in JD Cloud and obtain the following resources:

- 1 VPC
- 1 Subnet
- 1 VM
- 1 Public IP

## **Operating steps**

### **Step 1: Create VPC**

- Click Network -> VPC -> VPC on the left side menu, enter the VPC list page, click **Create**, and the configuration window pops up.
- Select a region, fill in the name, CIDR, and click Create to establish a VPC.

![](/image/Networking/Virtual-Private-Cloud/Getting-Started/Virtual-Machine-In-VPC-InterConnect-With-Internet/Step1.png)



### **Step 2: Create a Subnet**

- Click Network -> VPC -> Subnet in the menu on the left side of the menu to enter the subnet list page in sequence, click Create, and the Create Configuration window pops up.
- Select area region and choose the VPC created above, fill in the subnet name, CIDR, and associate a route table, then click Create to create 1 subnet.

![](/image/Networking/Virtual-Private-Cloud/Getting-Started/Virtual-Machine-In-VPC-InterConnect-With-Internet/Step2.png)



### **Step 3: Create a VM in This Subnet**

- Click Elastic Compute -> VM -> Instances in the menu on the left side of the menu in sequence, go to the Instance List page, click Create, and the Create Configuration window pops up.
- Find the network module on the configuration page, select the VPC and subnet created above.

![](/image/Networking/Virtual-Private-Cloud/Getting-Started/Virtual-Machine-In-VPC-InterConnect-With-Internet/Step3.png)



### **Step 4:Bond a EIP in the process of creating a VM**

- Select the bandwidth billing type and bandwidth cap on the bandwidth module part of the configuration page. The rest of the configuration can be based on the VM creation instruction. Click **Create** to get a VM with external communication.

![](/image/Networking/Virtual-Private-Cloud/Getting-Started/Virtual-Machine-In-VPC-InterConnect-With-Internet/Step4.png)