## **Route Table Configuration**

#### **Step 1 Create a Customized Route Table**

1. Open the console and choose Networking > Route Table to enter the route table list page;
2. Select the area where the route table belongs (currently, cn-north and cn-south areas are opened), and then click on "Create" button;
![](/image/Networking/Virtual-Private-Cloud/Operation-Guide/Route-Table-Configuration/Step1.png)

3. Region Selection: In this step, you can still choose the area where the route table is created;
![](/image/Networking/Virtual-Private-Cloud/Operation-Guide/Route-Table-Configuration/Step2.png)

4. Select the VPC which it belongs, and the route table must be created in a VPC.
5. Set the Name of Route Table: The name cannot be blank. Only Chinese, numbers, uppercase and lowercase letters, English underscore "_" and line-through "-" are accepted, not exceeding 32 characters;
6. Set the description of route table: The description can be blank, only supports Chinese, numbers, uppercase and lowercase letters, English underscore "_", and cannot exceed 256 characters;
7. Click on **OK** to enter the "Console" to view the route table that have been created;
8. After the route table is created, routing rules can be configured, or you can configure it by yourself by entering the details page later;

#### **Step 2 Associate Subnet**

1. Open the console and choose Networking > Route Table to enter the route table list page;
2. Click on the "Associate Subnet" in the action column:
![](/image/Networking/Virtual-Private-Cloud/Operation-Guide/Route-Table-Configuration/Step3.png)

3. On the subnet selection page that is displayed, select the subnet to which the route table is to be associated, and then the route table can be associated to the subnet in the same VPC:
![](/image/Networking/Virtual-Private-Cloud/Operation-Guide/Route-Table-Configuration/Step4.png)

4. Click on **OK** to associate the route table to the subnet;


#### **Step 3 Modify the Name/Description**

   1. Open the console, select Networking > Route Table, and click the route table name to enter the route table’s details page;
   2. Click the modify button after the name/description to modify the route table’s name/description. For the specific name/description rules, refer to the Create Route Table;
![](/image/Networking/Virtual-Private-Cloud/Operation-Guide/Route-Table-Configuration/Step5.png)



#### **Step 4, Delete Route Table**

1. Open the console and choose Networking > Route Table to enter the route table list page;
2. Click the delete of the operation column;
![](/image/Networking/Virtual-Private-Cloud/Operation-Guide/Route-Table-Configuration/Step6.png)

3. After confirming the deletion of the route table twice, the route table can be deleted;
4. Restrictions on deleting route tables:
    a) The customized route table associated with the subnet cannot be deleted.
    b) The default route table cannot be deleted.



#### **Step 5, Route Rules**

1. Default route table. When creating a VPC, a default route table is created by default, which contains two default route rules, namely Local for VPC internal communication and Internet gateway for accessing public network. Local route cannot be modified or deleted, and its specific rule is [Local Local Local]. The Internet route can be modified and deleted.
2. Customized route table. The route table created by the user is a customized route table, which contains a default route rule, namely Local for the VPC internal communication that cannot be modified or deleted.
3. Communicate between subnets in the VPC to preferentially match the Local route.
4. The route rules of the route table match in a sequence from top to bottom and match exactly.
![](/image/Networking/Virtual-Private-Cloud/Operation-Guide/Route-Table-Configuration/Step7.png)




#### **Step 6, Rules for Editing Routes**

1. The destination ends of the route rules cannot be blank, and the destination ends of the route rules cannot be identical. The destination end input format is the CIDR of the network segment.
2. If the VPC on the route table has a preset CIDR, the destination end of the route rule cannot conflict with the CIDR of the VPC.
3. If the VPC on the route table does not have a preset CIDR, the destination of the route rule cannot conflict with the CIDR of any subnet in the VPC.
4. The next hop type supports the Internet and the VM as the next hop. If the traffic needs to access the Internet, you can select the Internet gateway or the self-built VM as the public network gateway.
5. The next hop (address), which supports the Internet and the VM as the next hop address, can select a VM configured with the SNAT function as the next hop gateway.
![](/image/Networking/Virtual-Private-Cloud/Operation-Guide/Route-Table-Configuration/Step8.png)