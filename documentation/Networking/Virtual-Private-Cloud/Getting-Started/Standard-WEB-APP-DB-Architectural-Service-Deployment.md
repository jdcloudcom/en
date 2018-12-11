## ** Standard WEB+APP+DB Architecture Service Deployment **

### **Overview**

Through this teaching, you can complete the basic network model deployment in JD Cloud. This basic network model contains three subnets, a Web layer for external access, an APP layer for business logic, and a database layer. The resources are as follows:

- 1 VPC
- 3 Subnets



## ** Operating steps**

#### **Step 1: Create VPC**

- Click Network -> VPC -> VPC on the left side of the menu to enter the VPC list page, then click **Create**, and the Create Configuration window pops up.
- Select and fill the region, name, and CIDR, then click **Create** to create the VPC.

![](/image/Networking/Virtual-Private-Cloud/Getting-Started/Standard-WEB-APP-DB-Architectural-Service-Deployment/Step1.png)



#### **Step 2: Create subnet WEB layer, APP layer, DB layer subnet**

- Click Network -> VPC -> Subnet in the menu on the left side of the menu to enter the subnet list page in sequence, click **Create**, and the Create Configuration window pops up.
- Select a region, select the VPC created above, fill in the subnet name,the subnet CIDR,and the associated route table,then click **Create** to create a subnet. Repeat the steps above to creat another two subnets.

![](/image/Networking/Virtual-Private-Cloud/Getting-Started/Standard-WEB-APP-DB-Architectural-Service-Deployment/Step2-1.png)

![](/image/Networking/Virtual-Private-Cloud/Getting-Started/Standard-WEB-APP-DB-Architectural-Service-Deployment/Step2-2.png)

![](/image/Networking/Virtual-Private-Cloud/Getting-Started/Standard-WEB-APP-DB-Architectural-Service-Deployment/Step2-3.png)