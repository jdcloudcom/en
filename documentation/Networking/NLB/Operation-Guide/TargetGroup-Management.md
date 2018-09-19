# Virtual server group management

## Add virtual server group

#### 1. Enter the virtual server group list page by clicking the Load balancer-Details-Virtual server group.
![虚拟服务器组列表页](../../../../image/Networking/NLB/NLB-VSList.png)

#### 2. Click **Create Virtual Server Group** to create a new virtual server group.

- Select the VM, container instance needed to add, click **Add** **Note: Only VM and container under the same region, virtual private cloud, and availability zone as the load balancer can be added as backend server, 100 backend servers at most can be added in the virtual server, the different ports of the same server can be viewed as different servers.**;

- Setting port and weight: Set port and weight for the selected server; input the range of 1-65535 for the port and input the range of 1-100 for the weight; the same server port within the same virtual server group cannot be repeated; the greater the weight, the greater than request forwarding possibility of the server; and if the port is blank, the backend service port can be used for forwarding by default.	

![设置端口和权重](../../../../image/Networking/NLB/NLB-TGAddTargets.png)

## Virtual server group management

#### 1. Edit virtual server group: Edit the virtual server group via the virtual server group list page-action bar.

#### 2. Delete virtual server group: Delete the virtual server group via the virtual server group list page-action bar.

#### 3. Click the virtual server group name to view the backend server information.

![管理虚拟服务器组](../../../../image/Networking/NLB/NLB-TGDetailEntrance.png)

![查看虚拟服务器组](../../../../image/Networking/NLB/NLB-TGDetail.png)
		
## Editing virtual server group

#### 1. Open the virtual server group editing page by clicking the Load balancer-Virtual server group-Editing.

#### 2. The server group name can be modified, and the VM and container resource in the virtual server group can be added and deleted.

![修改虚拟服务器组](../../../../image/Networking/NLB/NLB-TGEditEntrance.png)

![修改虚拟服务器组](../../../../image/Networking/NLB/NLB-TGEdit.png)
		
