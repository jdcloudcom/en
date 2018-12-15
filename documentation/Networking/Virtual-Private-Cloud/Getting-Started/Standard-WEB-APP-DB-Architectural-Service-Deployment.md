## **Standard WEB+APP+DB Architecture Service Deployment**

### **Overview**

Through this teaching, you can complete the basic network model deployment in JD Cloud, one is responsible for WEB layer externally, one is responsible for logic APP layer, and another is responsible for the database layer of data, and acquired following resources:

- 1 VPC
- 3 Subnets



### **Operating steps**

#### **Step 1: Create VPC**

- Click Network -> VPC -> VPC in the menu on the left side of the menu in sequence, enter the VPC list page, click Create, and the Create Configuration window pops up.
- Select the region based on your demands, fill in the name, fill in CIDR, and click Create to get a VPC.

![](/image/Networking/Virtual-Private-Cloud/Getting-Started/Standard-WEB-APP-DB-Architectural-Service-Deployment/Step1.png)



#### **Step 2: Create subnet WEB layer, APP layer, DB layer subnet**

- Click Network -> VPC -> Subnet in the menu on the left side of the menu to enter the subnet list page in sequence, click Create, and the Create Configuration window pops up.
- Select area according to the demands, select VPC created just, fill in the subnet name, fill in the subnet CIDR, select the associated route table, and click Create. To get 3 subnets after repeating three times.

![](/image/Networking/Virtual-Private-Cloud/Getting-Started/Standard-WEB-APP-DB-Architectural-Service-Deployment/Step2-1.png)

![](/image/Networking/Virtual-Private-Cloud/Getting-Started/Standard-WEB-APP-DB-Architectural-Service-Deployment/Step2-2.png)

![](/image/Networking/Virtual-Private-Cloud/Getting-Started/Standard-WEB-APP-DB-Architectural-Service-Deployment/Step2-3.png)