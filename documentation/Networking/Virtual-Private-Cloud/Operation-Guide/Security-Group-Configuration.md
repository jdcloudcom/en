Security Group Configuration

#### **Step 1, Create a Security Group**

1. Enter JD Cloud Console, select Elastic Compute >> VM >> Security Group Page (or Elastic Compute >> Container Service >> Security Group, where this Help takes VM as an example), click **Create** to pop up the Create popup box;

![](/image/Networking/Virtual-Private-Cloud/Operation-Guide/Security-Group-Configuration/Step1.png)


2. First, you need to select the region and VPC where the security group is located, and the security group can only be applied to VM/container instances under the same VPC. You can create a new security group for the VPC you have created. You can also click the "Create VPC" button to jump to the New VPC page and create a new VPC. A maximum of 50 security groups can be created in a single VPC, and if the number of security groups in the selected VPC has reached 50, a message of "the security group quota limit for the selected VPC resource has reached 50" will be displayed, and then you need to re-select other VPC.

3. Later, enter the security group name and description to describe the additional instructions for the security group rules, such as "the port 80, 443 in the entrance direction and exit direction that have been opened"; it is recommended that you use the security group's use scenario or function as the name of the security group, for example, "Web Server Cluster Open Port 80".

4. The new security group rejects all ingress and egress traffic by default.

![](/image/Networking/Virtual-Private-Cloud/Operation-Guide/Security-Group-Configuration/Step2.png)



#### **Step 2, Associate VM/Container Instance**

1. Go to JD Cloud Console and select Elastic Compute >> VM >> Security Group Page (or Elastic Compute >> Container Service >> Security Group, and this Help takes VM as an example), enter the console security group list page, Select the **Associate VM** button to pop up the Associate VM popup window; or click the security group name to enter the security group details page, select the "VM" TAB page, click the **Add** button to pop up the Associate VM popup window;

 ![](/image/Networking/Virtual-Private-Cloud/Operation-Guide/Security-Group-Configuration/Step3.png)



2. The Associate VM popup window provides a list of all available VMs in the current VPC; you can tick one or more VMs and click the **OK** button to associate the current security group for the selected VM.

![](/image/Networking/Virtual-Private-Cloud/Operation-Guide/Security-Group-Configuration/Step4.png)



#### **Step 3, Disassociate VM/Container Instance**

1. Go to JD Cloud Console and select Elastic Compute >> VM >> Security Group Page (or Elastic Compute >> Container Service >> Security Group, where this Help takes VM as an example), click the security group name in the list to enter the details page, and select the "VM" TAB page to display the list of VMs associated to the security group;

2. In the VM list, click the **Remove** button under the operation column to disassociate the corresponding VM from the current security group.

![](/image/Networking/Virtual-Private-Cloud/Operation-Guide/Security-Group-Configuration/Step5.png)



#### **Step 4, Configure Outbound Rule**

The outbound rule is used to filter the network traffic of the VM to access the Internet or other VMs, with the settings as follows:

1. Go to JD Cloud Console and select Elastic Compute >> VM >> Security Group Page (or Elastic Compute >> Container Service >> Security Group, where this Help takes VM as an example), find the security that needs to configure outbound rules, Group, click **Modify Outbound Rule** in the "More" operation or click the security group name to skip to its details page;

![](/image/Networking/Virtual-Private-Cloud/Operation-Guide/Security-Group-Configuration/Step6.png)



2. Enter the outbound rule TAB page, click the Edit Rule button on the page to enter the outbound rule editing page;

![](/image/Networking/Virtual-Private-Cloud/Operation-Guide/Security-Group-Configuration/Step7.png)



3. Click the **Add New Rules** button at the bottom of the page to add a new outbound rule for the current security group, select the outbound rule type. The system will automatically match the corresponding protocol according to the selected outbound rule type, and then set the port in proper order (which supports a single port number, such as 80, and also supports a port range such as: 80-8080), destination IP (which supports a single IP or CIDR) to complete the configuration of an outbound rule;

4. You can also edit the security group outbound rules that have been added on the page at any time;

5. Click the **Delete** button in the operation column to delete a corresponding outbound rule;

6. After completing the outbound rule editing, click the **Save** button at the top of the page to bring the newly modified security group rule into effect automatically;

![](/image/Networking/Virtual-Private-Cloud/Operation-Guide/Security-Group-Configuration/Step8.png)



**Please note that when a security group rule is stateful, if you send a request from the VM, the response traffic of such a request will be allowed to flow out regardless of the ingress security group rule.**



#### **Step 5, Configure Inbound Rule**

The ingress rule is used to filter the network traffic for the cloud internet or other VMs to access the current VM, with the settings as follows:

1. Go into JD Cloud Console and select Elastic Computing >> VM >> Security Group Page (or Elastic Compute >> Container Service >> Security Group, where this Help takes VM as an example), find the security group that needs to configure inbound rule, click **Modify Inbound Rule** in the "More" operation or click the security group name to skip to its details page;

![](/image/Networking/Virtual-Private-Cloud/Operation-Guide/Security-Group-Configuration/Step9.png) 



2. Enter the inbound rule TAB page, click the **Edit Rules** button on the page to enter the inbound rule editing page;

![](/image/Networking/Virtual-Private-Cloud/Operation-Guide/Security-Group-Configuration/Step10.png)



3. Click the **Add New Rules** button at the bottom of the page to add an inbound rule to the current security group, select the inbound rule type so that the system will automatically match the corresponding protocol according to the selected inbound rule type, and then set the port in proper order (which supports a single port number, such as 80, and also supports a port range such as: 80-8080), the destination IP (which supports a single IP or CIDR) to complete the configuration of an inbound rule;

4. You can also edit the security group inbound rules that have been added on the page at any time;

5. Click the **Delete** button in the operation column to delete a corresponding inbound rule;

6. After completing the inbound rule editing, click the **Save** button at the top of the page to bring the newly modified security group rule into effect automatically.

![](/image/Networking/Virtual-Private-Cloud/Operation-Guide/Security-Group-Configuration/Step11.png)





#### **Step 6, Delete Security Group**

Only security groups that are not associated with a VM/container can be deleted.

Method 1: Go into JD Cloud Console and select the "Elastic Compute>>VM>>Security Group" or "Elastic Compute>>Container Service>>Security Group" page. Click the **Delete** button in the security group operation to delete the corresponding security group;

Method 2: Go into JD Cloud Console and select "Elastic Compute>>VM>>Security Group" or "Elastic Compute>>Container Service>>Security Group" page, click the security group name on the page to enter the security group details page, and click the **Delete** button at the top right of the details page to delete the corresponding security group.

 