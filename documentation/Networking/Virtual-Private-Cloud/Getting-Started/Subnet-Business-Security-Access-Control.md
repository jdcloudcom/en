## **Subnet Service Security Access Control**

### **Overview**

Through this teaching, you can complete the deployment of basic network models in JD Cloud, with one responsible for the external WEB layer, one for the logic APP layer, and one for the data DB layer. Among which, the WEB layer can only intercommunicate with the public network and the APP layer, the APP layer can only intercommunicate with the WEB layer and the DB layer, and the DB layer can only intercommunicate with the APP layer. Upon completion, the following resources will be available:

- 1 VPC
- 3 Subnets
- 3 ACLs



### **Operating steps**

#### **Step 1: Create VPC**

- Click Network -> VPC -> VPC in the menu on the left side of the menu in sequence, enter the VPC list page, click Create, and the Create Configuration window pops up.
- Select the region based on your demands, fill in the name, fill in CIDR, and click Create to get a VPC.
- In this tutorial, the CIDR of this private network is set to 10.0.0.0/16.

![](/image/Networking/Virtual-Private-Cloud/Getting-Started/Subnet-Business-Security-Access-Control/Step1.png)



#### **Step 2: Create subnet WEB layer, APP layer, DB layer subnet**

- Click Network -> VPC -> Subnet in the menu on the left side of the menu to enter the subnet list page in sequence, click Create, and the Create Configuration window pops up.
- Select area according to the demands, select VPC created just, fill in the subnet name, fill in the subnet CIDR, select the associated route table, and click Create. To get 3 subnets after repeating three times.
- In this tutorial, the WEB layer subnet CIDR is set to 10.0.1.0/24, the APP layer subnet CIDR to 10.0.1.0/24, and the DB layer subnet CIDR to 10.0.2.0/24.

![](/image/Networking/Virtual-Private-Cloud/Getting-Started/Subnet-Business-Security-Access-Control/Step2.png)

![](/image/Networking/Virtual-Private-Cloud/Getting-Started/Subnet-Business-Security-Access-Control/Step2-2.png)

![](/image/Networking/Virtual-Private-Cloud/Getting-Started/Subnet-Business-Security-Access-Control/Step2-3.png)



#### **Step 3: Configure and Associate ACL**

##### Create an ACL

![](/image/Networking/Virtual-Private-Cloud/Getting-Started/Subnet-Business-Security-Access-Control/Step3-1.png)

![](/image/Networking/Virtual-Private-Cloud/Getting-Started/Subnet-Business-Security-Access-Control/Step3-2.png)

![](/image/Networking/Virtual-Private-Cloud/Getting-Started/Subnet-Business-Security-Access-Control/Step3-3.png)



##### **WEB Layer ACL Configuration**

##### Configuring Inbound Rules

- Configure the inbound permission rule between the WEB layer and the APP layer, set the priority to 200, the type to ALL traffic, the source IP to 10.0.1.0/24, and the policy to accept.
- Configure the inbound deny rule between the WEB layer and other network segments in the VPC, set the priority to 10000, the type to ALL traffic, the source IP to 10.0.0.0/16, and the policy to reject.
- Configure the inbound permission rule between the WEB layer and the public network. Set the priority to 20000, the type to ALL traffic, the source IP to 0.0.0.0/0, and the policy to Accept.

![](/image/Networking/Virtual-Private-Cloud/Getting-Started/Subnet-Business-Security-Access-Control/Step3-4.png)



##### Configure Outbound Rules

- Configure the outbound permission rule between the WEB layer and the APP layer, set the priority to 200, the type to ALL traffic, the destination IP to 10.0.1.0/24, and the policy to accept.
- Configure the outbound rejection rule between the WEB layer and other network segments in the VPC, set the priority to 10000, the type to ALL traffic, the destination IP to 10.0.0.0/16, and the policy to reject.
- Configure the outbound permission rule between the WEB layer and the public network, set the priority to 20000, the type to ALL traffic, the destination IP to 0.0.0.0/0, and the policy to accept.

![](/image/Networking/Virtual-Private-Cloud/Getting-Started/Subnet-Business-Security-Access-Control/Step3-5.png)



#### **Configure the Associated Subnet**

- Click the Associate Subnet TAB-> Associate Subnet button to open the associated subnet configuration popup.
- Select the WEB layer subnet and click OK to complete the configuration.

![](/image/Networking/Virtual-Private-Cloud/Getting-Started/Subnet-Business-Security-Access-Control/Step3-6.png)



#### **APP Layer ACL Configuration**

##### Configuring Inbound Rules

- Configure the inbound permission rule between the APP layer and the WEB layer, set the priority to 200, the type to ALL traffic, the source IP to 10.0.0.0/24, and the policy to accept.
- Configure the inbound permission rule between the APP layer and the DB layer, set the priority to 300, the type to ALL traffic, the source IP to 10.0.2.0/24, and the policy to accept.
- Configure the inbound deny rule between the APP layer and other network segments in the VPC, set the priority to 10000, the type to ALL traffic, the source IP to 10.0.0.0/16, and the policy to reject.

![](/image/Networking/Virtual-Private-Cloud/Getting-Started/Subnet-Business-Security-Access-Control/Step3-7.png)



##### Configure Outbound Rules

- Configure the outbound permission rule between the APP layer and the WEB layer, set the priority to 200, the type to ALL traffic, the destination IP to 10.0.0.0/24, and the policy to accept.
- Configure the outbound permission rule between the APP layer and the DB layer, set the priority to 300, the type to ALL traffic, the destination IP to 10.0.2.0/24, and the policy to accept.
- Configure the outbound rejection rule between the APP layer and other network segments in the VPC, set the priority to 10000, the type to ALL traffic, the destination IP to 10.0.0.0/16, and the policy to reject.

![](/image/Networking/Virtual-Private-Cloud/Getting-Started/Subnet-Business-Security-Access-Control/Step3-8.png)



#### **Configure the Associated Subnet**

- Click the Associate Subnet TAB-> Associate Subnet button to open the associated subnet configuration popup.
- Select the APP layer subnet and click OK to complete the configuration.

![](/image/Networking/Virtual-Private-Cloud/Getting-Started/Subnet-Business-Security-Access-Control/Step3-9.png)



#### **DB Layer ACL Configuration**

##### Configuring Inbound Rules

- Configure the inbound permission rule between the DB layer and the APP layer, set the priority to 200, the type to ALL traffic, the source IP to 10.0.1.0/24, and the policy to accept.
- Configure the inbound deny rule between the DB layer and other network segments in the VPC. Set the priority to 10000, the type to ALL traffic, the source IP to 10.0.0.0/16, and the policy to reject.

![](/image/Networking/Virtual-Private-Cloud/Getting-Started/Subnet-Business-Security-Access-Control/Step3-10.png)



##### Configure Outbound Rules

- Configure the outbound permission rule between the DB layer and the APP layer, set the priority to 200, the type to ALL traffic, the destination IP to 10.0.1.0/24, and the policy to accept.
- Configure the outbound rejection rule between the DB layer and other network segments in the VPC, set the priority to 10000, the type to ALL traffic, the destination IP to 10.0.0.0/16, and the policy to reject.

![](/image/Networking/Virtual-Private-Cloud/Getting-Started/Subnet-Business-Security-Access-Control/Step3-11.png)



#### **Configure the Associated Subnet**

- Click the Associate Subnet TAB-> Associate Subnet button to open the associated subnet configuration popup.
- Select the DB layer subnet and click OK to complete the configuration.

![](/image/Networking/Virtual-Private-Cloud/Getting-Started/Subnet-Business-Security-Access-Control/Step3-12.png)