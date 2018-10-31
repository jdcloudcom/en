# Create virtual server group

##### 1. Enter the virtual server group list page by clicking the Load balancer-Details-Virtual server group.

![虚拟服务器组列表页](../../../../image/Networking/NLB/NLB-034.png)

2. Click [Create Virtual Server Group] to create a new virtual server group;

##### 3. Select Virtual Machine, container Instance required to be added, click [Add].

- Only virtual machine, container under the same region, virtual private cloud, and availability zone as the load balancer can be added as backend server, 100 backend servers at most can be added in the virtual server, the different ports of the same server can be viewed as different servers;

- Setting port and weight: Set port and weight for the selected server; input the range of 1-65535 for the port and input the range of 1-100 for the weight; the same server port within the same virtual server group cannot be repeated; the greater the weight, the greater than request forwarding possibility of the server; and if the port is blank, the backend service port can be used for forwarding by default.	

![设置端口和权重](../../../../image/Networking/NLB/NLB-035.png)

