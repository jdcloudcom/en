# **Intercommunication between VM and public network in VPC**

### **Overview**

Through this teaching, you can complete the deployment of a VM that can communicate with the public network in JD Cloud and obtain the following resources:

- 1 VPC
- 1 Subnet
- 1 VM
- 1 Public IP

## **Operating steps**

### **Step 1: Create VPC**

- Click Network -> VPC -> VPC in the menu on the left side of the menu in sequence, enter the VPC list page, click Create, and the Create Configuration window pops up.
- Select the region based on your demands, fill in the name, fill in CIDR, and click Create to get a VPC.

![](/image/Networking/Virtual-Private-Cloud/Getting-Started/Virtual-Machine-In-VPC-InterConnect-With-Internet/Step1.png)



### **Step 2: Create a Subnet**

- Click Network -> VPC -> Subnet in the menu on the left side of the menu to enter the subnet list page in sequence, click Create, and the Create Configuration window pops up.
- Select the area according to the demands and select VPC created just now, fill in the subnet name, fill in the subnet CIDR, select the associated route table, and click Create to get 1 subnet.

![](/image/Networking/Virtual-Private-Cloud/Getting-Started/Virtual-Machine-In-VPC-InterConnect-With-Internet/Step2.png)



### **Step 3: Create a VM in This Subnet**

- Click Elastic Compute -> VM -> Instances in the menu on the left side of the menu in sequence, go to the Instance List page, click Create, and the Create Configuration window pops up.
- Find the network module on the configuration page created by the instance, select the VPC and subnet just created.

![](/image/Networking/Virtual-Private-Cloud/Getting-Started/Virtual-Machine-In-VPC-InterConnect-With-Internet/Step3.png)



### **Step 4: Create a EIP in the process of creating a VM**

- Find the bandwidth module on the configuration page created by the instance, select the bandwidth billing type and bandwidth cap according to the requirements. The rest of the configuration can be based on the VM creation wizard. Click Create to get a VM with external communication.

![](/image/Networking/Virtual-Private-Cloud/Getting-Started/Virtual-Machine-In-VPC-InterConnect-With-Internet/Step4.png)