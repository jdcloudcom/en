# Configuration Method for CPS-VPC Private Line



## I. Background
To realize the intercommunication between the intranet of Cloud Physical Server (CPS for short) and VPC intranet of the Virtual Machine and realize business requirements better, a private line communication method between the CPS intranet and the VPC intranet of the Virtual Machine is hereby planned and configured.
Account information, network environment information, private line schedule and configuration information referred in this document are examples. The specific configuration shall be subject to the actual information.

## II. Description for Network Environment Example

Assumption:

1. VPC intranet segment of a Virtual Machine: 192.168.0.0/16, private IP address of a Virtual Machine: 192.168.0.3/32

2. CPS intranet segment of a Cloud Physical Server: 10.237.0.0/16, private IP address of a CPS physical machine: 10.237.0.2/32

3. Machine room location\machine room availability zone of Virtual Machine and Cloud Physical Server: cn-north-1\Beijing Youfu; the Virtual Machine and CPS shall be located in the same machine room and same region and have the same availability zone.

4. VPC of Virtual Machine:Xinleitest

5. Hosted Connection: test

6. Border Gateway: test_gwasa

7. Hosted Private Virtual Interface: test_channel

8. Schematic Diagram of Network Topology

![网络拓扑示意图](https://github.com/jdcloudcom/cn/blob/edit/image/Hyper-Converged-IDC/Cloud-Physical-Server/CPS-VPC-001.png)
 
## III. Configuration Method

### 3.1 Description

1. If the CPS network needs to be communicated to a VPC under the same JD Cloud account, please make configuration as per process specified in 3.2 below.

2. If the CPS network needs to be communicated to several VPCs under the same JD Cloud account, please communicate to one VPC as per process specified in 3.2 below first and then communicate to other VPC configurations on the basis of the created Border Gateway, Hosted Private Virtual Interface and Hosted Connection by adding a two-way routing, i.e. repeating the configuration methods 6.3, 6.4, 7.3, 7.4 and 7.5.

3. If the CPS network needs to be communicated to several VPCs under several JD Cloud accounts, please repeat the processes 1 and 2 above for the JD Cloud account of each VPC. In other words, set up connection to one VPC and add a two-way routing for other VPC of the same account.

### 3.2 Configuration Method

#### 1. Console Login

Log in the official website of JD Cloud (https://www.jdcloud.com), click [Login] on the upper right corner and enter the user name of JD Cloud.

![京东账号登录](https://github.com/jdcloudcom/cn/blob/edit/image/Hyper-Converged-IDC/Cloud-Physical-Server/CPS-VPC-002.png)

![登录控制台](https://github.com/jdcloudcom/cn/blob/edit/image/Hyper-Converged-IDC/Cloud-Physical-Server/CPS-VPC-003.png)

#### 2. Access to Configuration Console of Private Line

Configure the private line communication from the VPC intranet of the Virtual Machine to the CPS intranet.


#### 3. Create hosted connection

* Click Network—>Direct Connection—> Hosted Connect —> Hosted Connection—>Creation from the navigation bar on the left side.


![创建托管专线1](https://github.com/jdcloudcom/cn/blob/edit/image/Hyper-Converged-IDC/Cloud-Physical-Server/CPS-VPC-004.png)


* Log in the creation page, fill in the customized name, and select the hosted region according to the Virtual Machine or machine room location of CPS.


![创建托管专线2](https://github.com/jdcloudcom/cn/blob/edit/image/Hyper-Converged-IDC/Cloud-Physical-Server/CPS-VPC-005.png)

 
* A tooltip will pop up, informing that the application information has been received and a specific person will handle the application.


![创建托管专线3](https://github.com/jdcloudcom/cn/blob/edit/image/Hyper-Converged-IDC/Cloud-Physical-Server/CPS-VPC-006.png)


* Once being successfully created, the list page of Hosted Connection will be automatically shown. In this page, the review status of private line will be shown. Please wait for completion of review. A specific person will be responsible for review at the background. If you need help, please contact JD Cloud via 400-615-55 (7*24h). 
 
![创建托管专线4](https://github.com/jdcloudcom/cn/blob/edit/image/Hyper-Converged-IDC/Cloud-Physical-Server/CPS-VPC-007.png)


* In the review process, the status will turn to processing. In this case, the configuration operation is running.


![创建托管专线5](https://github.com/jdcloudcom/cn/blob/edit/image/Hyper-Converged-IDC/Cloud-Physical-Server/CPS-VPC-008.png)

 
* Upon completion of review, the status of available will be shown.

![创建托管专线6](https://github.com/jdcloudcom/cn/blob/edit/image/Hyper-Converged-IDC/Cloud-Physical-Server/CPS-VPC-009.png)

 
#### 4. Create border gateway

* Click **Network—>Direct Connection—>Border Gateway—>Selecting Corresponding Hosted Region—>Create** from the navigation bar on the left side.

![创建边界网关1](https://github.com/jdcloudcom/cn/blob/edit/image/Hyper-Converged-IDC/Cloud-Physical-Server/CPS-VPC-010.png)
 
* Select corresponding machine room region and fill in gateway name. The gateway will be customized.

![创建边界网关2](https://github.com/jdcloudcom/cn/blob/edit/image/Hyper-Converged-IDC/Cloud-Physical-Server/CPS-VPC-011.png)


* Confirm that the Border Gateway has been created.

![创建边界网关3](https://github.com/jdcloudcom/cn/blob/edit/image/Hyper-Converged-IDC/Cloud-Physical-Server/CPS-VPC-012.png)
 

#### 5. Create Hosted Private Virtual Interface

* Create Hosted Private Virtual Interface according to contents of the planning form. Such planning form of Hosted Private Virtual Interface will be sent to the user’s email.

Schedule:

| Client Name        | AS    |  Ctag  |  JD Cloud IP  |  CPS IP  |
| :----:         |:----: |:----:  |:----:        |:----:    |
| Jdcloud        | 65001    |  20  |  192.168.0.10/30  |  192.168.0.9/30  |
| Jdcloud        | 65001    |  20  |  192.168.0.7/30  |  192.168.0.6/30  |


* Click **Network--->Direct Connection->Hosted Connect—>Hosted Private Virtual Interface** from the navigation bar on the left side, select corresponding hosted regions and click **Create**.

![Create Hosted Private Virtual Interface 1](https://github.com/jdcloudcom/cn/blob/edit/image/Hyper-Converged-IDC/Cloud-Physical-Server/CPS-VPC-013.png)

* Create the Hosted Private Virtual Interface by using information of the planning form, test of Hosted connection (created in step 3.6) and test_gw of Border Gateway (created in step 4.3).
 
 ![Create Hosted Private Virtual Interface 2](https://github.com/jdcloudcom/cn/blob/edit/image/Hyper-Converged-IDC/Cloud-Physical-Server/CPS-VPC-014.png)
  
Note: Parameters with the red asterisk mark must be completed.

Parameter Description:

A.	Channel name: The customized channel name is completed by referring to requirements right below the box.

B.	Hosted Connection: The Hosted Connection created will be automatically displayed. If there are several Hosted Connections, please select the name of corresponding Hosted Connection by clicking the drop-down arrow.

C.	Border Gateway: The Border Gateway created will be automatically displayed. If there are several Border Gateways, please select the name of corresponding Border Gateway by clicking the drop-down arrow.

D、	Vlanid:Complete information in the column “Ctag” of the planning information form.

E.	Routing method: The default routing is BGP.

F.	BGP ASN: Complete information in the column “AS” of the planning information form.

G.	BGP key pair: The customized one can be completed by referring to requirements right below the box, which shall contain at least 6 numbers or letters.

H.	Interconnection address of routing: Include the “CPS IP” and “JD Cloud IP” in the first row of the Primary IP completion planning form and the “CPS IP” and “JD Cloud IP” in the second row of the Secondary IP completion planning form; the first row of the planning form corresponds to primaryIP; the second row corresponds to SecondaryIP; and primary\secondaryIP cannot be replaced with each other.

I.	Description: It is optional and the text description with the symbolic meaning can be filled in, such as the private line communication from CPS to VPC.

* The created channel will be in the configuration status and will be available automatically in one second.
 
 ![创建托管通道3](https://github.com/jdcloudcom/cn/blob/edit/image/Hyper-Converged-IDC/Cloud-Physical-Server/CPS-VPC-015.png)
 
 ![创建托管通道4](https://github.com/jdcloudcom/cn/blob/edit/image/Hyper-Converged-IDC/Cloud-Physical-Server/CPS-VPC-016.png)

#### 6. Routing with Configuration of Border Gateway

* View VPC name

 ![配置边界网关的路由1](https://github.com/jdcloudcom/cn/blob/edit/image/Hyper-Converged-IDC/Cloud-Physical-Server/CPS-VPC-017.png)
  
* Network —> Direct Connection —> Border Gateway —> click **Border Gateway** created
 
 ![配置边界网关的路由2](https://github.com/jdcloudcom/cn/blob/edit/image/Hyper-Converged-IDC/Cloud-Physical-Server/CPS-VPC-018.png)

* Configure the routing policy from the Border Gateway to VPC and click **Edit**.

Target end: Intranet segment of VPC of Virtual Machine (192.168.0.0/16)

Type of next hop: VPC

Next hop: xinleitest (vpc name viewed in step 6.1)

 ![配置边界网关的路由3](https://github.com/jdcloudcom/cn/blob/edit/image/Hyper-Converged-IDC/Cloud-Physical-Server/CPS-VPC-019.png)
 
* Configure the routing policy from the Border Gateway to cps. Click **ADD a New One

Target end: cps intranet segment 10.237.0.0/16

Type of Next Hop: Hosted Private Virtual Interface

Hosted Private Virtual Interface: test_channel (channel name created in step 5.3)
  
  ![配置边界网关的路由4](https://github.com/jdcloudcom/cn/blob/edit/image/Hyper-Converged-IDC/Cloud-Physical-Server/CPS-VPC-020.png)

#### 7. Configuration of Routing from VPC Intranet of Virtual Machine to CPS Intranet

* Network —> Virtual Private Cloud —> Subnet —> Click **Creation

 ![配置VPC到CPS内网的路由1](https://github.com/jdcloudcom/cn/blob/edit/image/Hyper-Converged-IDC/Cloud-Physical-Server/CPS-VPC-021.png)
 
* Machine room region—>Virtual Private Cloud (vpc name and intranet segment viewed in step 6.1)—>Subnet Name (customized)—>CIDR will automatically complete the selected VPC (make sure to keep the mask bit consistent with that of the VPC)—>Default route table.
 
![配置VPC到CPS内网的路由2](https://github.com/jdcloudcom/cn/blob/edit/image/Hyper-Converged-IDC/Cloud-Physical-Server/CPS-VPC-022.png)
 
![Configuration of Routing 3 from VPC to CPS Intranet](https://github.com/jdcloudcom/cn/blob/edit/image/Hyper-Converged-IDC/Cloud-Physical-Server/CPS-VPC-023.png)

* Network —> Virtual Private Cloud —> Route Table, clicking **default route table** (routing name created in step 7.2)

![Configuration of Routing 4 from VPC to CPS Intranet](https://github.com/jdcloudcom/cn/blob/edit/image/Hyper-Converged-IDC/Cloud-Physical-Server/CPS-VPC-024.png)
 
* Click **Routing Policy**—> Click **Edit** —> **Add a New One** in the bottom left will be displayed

![配置VPC到CPS内网的路由5](https://github.com/jdcloudcom/cn/blob/edit/image/Hyper-Converged-IDC/Cloud-Physical-Server/CPS-VPC-025.png)
 
* Click **ADD a New One** and enter information.

Target end: 10.237.0.0/16 (Intranet Segment of CPS)

Type of Next Hop: Border Gateway

Next Hop: test_gw (Border Gateway created in step 4.3)

![配置VPC到CPS内网的路由6](https://github.com/jdcloudcom/cn/blob/edit/image/Hyper-Converged-IDC/Cloud-Physical-Server/CPS-VPC-026.png)
 

#### 8. Verification to private line communication from CPS to VPC

* ping private IP of CPS from a Virtual Machine

![从云主机pingCPS的内网IP1](https://github.com/jdcloudcom/cn/blob/edit/image/Hyper-Converged-IDC/Cloud-Physical-Server/CPS-VPC-027.png)
 
* ping private IP of Virtual Machine from CPS

![从云主机pingCPS的内网IP2](https://github.com/jdcloudcom/cn/blob/edit/image/Hyper-Converged-IDC/Cloud-Physical-Server/CPS-VPC-028.png)


