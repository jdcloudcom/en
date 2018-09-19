## **Network ACL Configuration**

#### **Step 1 Create/Delete Network ACL**

Enter JD cloud console, click on the left navigation bar **VPC ** - **Network ACL**, and then enter the network ACL page

1. Click "Create". Popup a box for creating network ACL;

2. Select VPC, enter the name and description of network ACL, then click "OK" to complete the creation. Note: The network ACL created in a VPC can only be applied to the current VPC and cannot be used in other VPCs;

3. Delete the network ACL. Click the delete button in the corresponding operation box of the network ACL to complete the delete operation;

![](/image/Networking/Virtual-Private-Cloud/Operation-Guide/Network-ACL-Configuration/Step1.png)

![](/image/Networking/Virtual-Private-Cloud/Operation-Guide/Network-ACL-Configuration/Step2.png)



#### **Step 2 Edit Network ACL Rules**

1. On the network ACL list page, click on the name of the network ACL to which you want to add the rules and enter the network ACL details page;

2. Select the tab of inbound rule or outbound rule according to the type of rule that you want to add;

3. Click on "Edit Rule" to set the protocol type, IP, port and policy, and then click on "OK" to add the modification for completing the rules. After modification, the rules will be effective immediately;

![](/image/Networking/Virtual-Private-Cloud/Operation-Guide/Network-ACL-Configuration/Step3.png)



#### **Step 3 ACL Associate Subnet**

1. On the network ACL list page, click the **Associate** button;

2. Select the subnet that needs to be associated in the popup window. Click "OK" to associate the network ACL rule to the subnet. It takes effect immediately after the associating is completed;

Note: A network ACL can be associated to multiple subnets, but a subnet can only be associated to one network ACL.

![](/image/Networking/Virtual-Private-Cloud/Operation-Guide/Network-ACL-Configuration/Step4.png)



#### **Step 4 ACL Disassociate Subnet**

1. On the network ACL list page, click on the name of the network ACL to which you want to add the rules and enter the network ACL details page;

2. Click the **Associate** tab;

3. Click the **Disassociate** button following the subnet option that needs to be unassociated in the associated subnet list;

4. Click "OK" in the popup window;