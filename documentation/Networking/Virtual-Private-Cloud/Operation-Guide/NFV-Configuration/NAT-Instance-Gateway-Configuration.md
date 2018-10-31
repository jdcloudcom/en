## **NAT Instance Gateway Configuration**

#### **Step 1 Create a VM for NAT Gateway**

1. Enter the VM page of JD cloud console, select to create VM and then enter the VM creation process.
2. Select the CentOS 7.2 64-bit NAT Gateway image and other corresponding parameters of a machine to create the VM.
3. If the creation is successful, the related information is updated. If the creation fails, a prompt box appears. If the application fails repeatedly, please contact customer service.

![](/image/Networking/Virtual-Private-Cloud/Operation-Guide/NFV-Configuration/NAT-Mirror-Gateway-Configuration/Step1.png)



#### **Step 2 Configure Routing Rules of Route Table**

1. Enter the details page of the corresponding VPC route table of JD Cloud console and select new routing policy.
2. Add a routing policy, the destination is the public network address, the next hop type is the VM, and the next hop selects the VM created by the NAT Gateway image previously.
3. Associate the route table to the subnet whose instance needs to access Internet. Note: NAT Instance cannot be in this subnet. That is, the VM in the subnet can access the public network only through NAT instances in different subnets in the same VPC.

![](/image/Networking/Virtual-Private-Cloud/Operation-Guide/NFV-Configuration/NAT-Mirror-Gateway-Configuration/Step2.png)

![](/image/Networking/Virtual-Private-Cloud/Operation-Guide/NFV-Configuration/NAT-Mirror-Gateway-Configuration/Step3.png)