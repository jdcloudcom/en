##  **Border gateway connects virtual private cloud**

**Business Scenarios**

In Region cn-north-1, two VPCs have communication requirements through private IPs, details as follows:

- First VPC

  - Name: VPCforBGWA
  - ID：vpc-xxvpcforbgwaxx
  - Range: 10.0.0.0/16

- Second VPC

  - Name: VPCforBGWB
  - ID：vpc-xxvpcforbgwbxx
  - Range: 192.168.0.0/16

![](/image/Networking/Virtual-Private-Cloud/Getting-Started/Border-Gateway-Connects-VPC/Step1-1.png)

![](/image/Networking/Virtual-Private-Cloud/Getting-Started/Border-Gateway-Connects-VPC/Step1-2.png)

**Step 1: Create border gateway**

1) Login console, click **Direct Connect Service** in the Network field of Product menu, then click **Border Gateway** in Direct Connect Service menu to access Border Gateway List page.

2) Click **Create** on Border Gateway List page to open Create Border Gateway Creation window.

![](/image/Networking/Virtual-Private-Cloud/Getting-Started/Border-Gateway-Connects-VPC/Step2-1.png)

3) Input gateway name in Border Gateway Creation window, click “OK” to complete the creation.Then, the List page will display the created Border Gateway. The configuration information is shown as follows:

- Region: cn-north-1
- Border Gateway Name: BGWA-B

![](/image/Networking/Virtual-Private-Cloud/Getting-Started/Border-Gateway-Connects-VPC/Step2-2.png)

**Step 2: Configure BGW route policies for VPC to be connected**

1) Click **Edit Route Policies** on the Border Gateway List page to edit route policy information

- Configure the next hop of route pointing to VPCforBGWA
- Configure the next hop of route pointing to VPCforBGWB

![](/image/Networking/Virtual-Private-Cloud/Getting-Started/Border-Gateway-Connects-VPC/Step3-1.png)

**Step 3: Create Route Table for Virtual Private Cloud to be connected**

1) Login console, click **Virtual Private Cloud** in the Network field of Product menu, then click **Route Table** on the Virtual Private Cloud menu to access Route Table List page.

2) Click **Create** on Route Table List page to open Route Table Create window.

3) Configure basic information of route table in Route Table Creation window, click “OK” to complete configuration. displaying : **Route policies to be configured after creating route table, and it will take effect by being associated with subnet. Configure now?**, select configure now to access Route Table Details page.

The configuration information of route table is shown as below:

- Region: cn-north-1
- Virtual Private Cloud: VPCforBGWA
- Name: RTBforBGWAtoB

![](/image/Networking/Virtual-Private-Cloud/Getting-Started/Border-Gateway-Connects-VPC/Step4-1.png) 

4) Click “Route Policy” tab on Route Table Details page, then click “Edit” to enable route edit mode, click “Add a New One” for editing new route items.

5) Fill in relevant configuration in the route item, click to save and complete route table edit. Detailed configuration is shown as below:

- Fill in 192.168.0.0/16 as target end
- Select border gateway as next hop type
- Select BGWA-B as next hop
- If you need to access public network, you need to add 0.0.0.0/0 to route rule of Internet.

![](/image/Networking/Virtual-Private-Cloud/Getting-Started/Border-Gateway-Connects-VPC/Step4-2.png)

6) The configured route table shall be associated with subnets to be connected, and repeat the same operations to create and configure route table RTBforBGWBtoA in the second VPC.

![](/image/Networking/Virtual-Private-Cloud/Getting-Started/Border-Gateway-Connects-VPC/Step4-3.png) 

After completion of configuration, VPCs at both ends can establish connection through private IP. Similarly, multiple virtual private cloud in the same region can be connected through border gateway.
