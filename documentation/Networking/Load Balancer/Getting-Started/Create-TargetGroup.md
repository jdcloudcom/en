# Create virtual server group

1. Enter the virtual server group list page by clicking the Load balancer-Details-Virtual server group;

	![虚拟服务器组列表页](../../../../image/Networking/ALB/ALB-034.png)

1. Click **Create a new virtual server group** to create a new virtual server group;

1. Select Virtual Machine, container Instance required to be added, click **Add**;

	Note: Only virtual machine, container under the same region, virtual private cloud, and availability zone as the load balancer can be added as backend server, 100 backend servers at most can be added in the virtual server, the different ports of the same server can be viewed as different servers;

	Set port and weight: set port and weight for the selected server, port input range 1-65535, weight input range 1-100, the same server port within the same virtual server group cannot be duplicated, if the server has the higher weight, the more likely it will be forwarded to the request, if port is blank, use port of the backend service for forwarding by default.	

	![设置端口和权重](../../../../image/Networking/ALB/ALB-035.png)

