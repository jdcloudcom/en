# Create high availability load balancer across availability zones

## Preparation and planning

- Networking preparation

	Plan for load balancer, and region, availability zone, virtual private cloud, etc. of VM and containers as backend server in advance, according to business deployment needs.

- Server preparation

	It is necessary to create VM and containers for carrying business traffic in advance, and ensure that the ports needed for listening are opened, and that security groups and ACL policies are properly configured.

Note: Only when the available zone of the load balancer instance is created, VM and containers under the availability zone can be configured as the backend service. For example, when the load balancer is in Availability Zone A, Availability Zone B, VM and containers in Availability Zone A, Availability Zone B can be configured to conduct traffic forwarding.
	
## Create load balancer instance


1. Open the load balancer resource list page through the console menu - load balancer, and click **Create** to create a new load balancer instance.

	![ALB创建实例设置](../../../../image/Networking/ALB/ALB-067.png)


1. Select the corresponding region: cn-north-1, Availability Zone: Availability Zone A, Availability Zone B.

	![ALB选择地域设置](../../../../image/Networking/ALB/ALB-068.png)

1. Selection Virtual Private Cloud, Subnet, Security Group, Associate EIP, and select Billing Method, Bandwidth.

	![ALB网络设置](../../../../image/Networking/ALB/ALB-069.png)

1. Fill in Load Balancer Name, Description.

	![ALB基本设置](../../../../image/Networking/ALB/ALB-070.png)

- Confirm Configuration Information, Click **Purchase Now**.

	![ALB购买设置](../../../../image/Networking/ALB/ALB-071.png)

- Confirm order information and complete payment, create a load balancer instance

	![ALB支付设置](../../../../image/Networking/ALB/ALB-072.png)

- Refresh load balancer list, view the newly created load balancer instance.

	![ALB查看设置](../../../../image/Networking/ALB/ALB-073.png)

- Click **Add listener** on the right side of the list to open listener page.

	![ALB监听设置](../../../../image/Networking/ALB/ALB-074.png)

- Create an HTTP listener

	Click **Create a listener** to create a listener.

	Frontend listening configuration:

	1. Configure Listening Protocol as HTTP, Port 80;

	2. Idle connection timeout: set idle connection timeout time;

	![ALB新建监听器设置](../../../../image/Networking/ALB/ALB-075.png)

- Backend forwarding configuration:

	1. Backend service by fault: May create a new backend service or select an existing backend service;

	2. Backend service name: Define backend service name;

	3. Backend Protocol: Display the corresponding default protocol according to the Listening Protocol

	4. Port: Define backend forwarding port;

	5. Scheduling algorithm: Select according to business needs, and specify it as weighted round robin;

	6. Session persistence: Turn on; timeout: define timeout time of cookie, use default value 0, represent the same life cycle as the browser;

	7. Get real IP: Turn on by default;

	8. Get HTTP header field: Tick according to business needs.

	![ALB后端转发设置](../../../../image/Networking/ALB/ALB-076.png)

- Health check:

	Select health check method as: http

	Configure related parameters according to business needs:

	![ALB健康检查设置](../../../../image/Networking/ALB/ALB-077.png)

- Add server group:

	Select virtual server group, availability group according to business needs.

	![ALB添加服务器组设置](../../../../image/Networking/ALB/ALB-078.png)

- Add server to the virtual server group:

	If there is no available virtual server group, click “create new virtual server group" to create a new virtual server group. VM and containers can be selected to define the port and weight of the instance;

	Note: Only VM and container resources in the same Availability Zone, virtual private cloud with load balancer can be selected.

	![ALB虚拟服务器组添加成员设置](../../../../image/Networking/ALB/ALB-079.png)

	Thus, a load balancer HTTP listener configuration across the Availability Zones is completed. When A single Availability Zone (such as Availability Zone A) fails, the load balancer will forward the traffic to Availability Zone B to ensure the normal operation of business.

	
	​			
	​			
	​			
	​			
