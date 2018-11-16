# Configure to deploy TCP listener

## Preparation and planning

- Networking preparation

	Plan for load balancer, and region, availability zone, virtual private cloud, etc. of VM and containers as backend server in advance, according to business deployment needs.
	
	Note: VM and containers as backend server need to be in the same region, virtual private cloud with load balancer.

- Server preparation

	It is necessary to create VM and containers for carrying business traffic in advance, and ensure that the ports needed for listening are opened, and that security groups and ACL policies are properly configured.

- Load balancer instance

	Create a load balancer instance, and set up the region, availability zone, network, security group and other configurations.

## Create a TCP listener

- Frontend listening configuration:
	
	Click **Add** to create a listener: select TCP Protocol, configure listening port, idle connection timeout.

	![ALB前端监听设置](../../../../image/Networking/ALB/ALB-052.png)

- Backend forwarding configuration: May create a new backend service or select an existing backend service, it is noted that only backend services of backend TCP type protocol can be selected.
	
	Thus, create a new backend service: configure backend service name, Protocol (TCP), port 80, scheduling algorithm selects weighted round robin, turn on to get real IP.

	![ALB后端转发设置](../../../../image/Networking/ALB/ALB-053.png)

- Configure health check: set related parameters of health check, wherein the TCP method is used here.

	![ALB健康检查设置](../../../../image/Networking/ALB/ALB-054.png)

- Add server group: Select virtual server group, availability group according to business needs.

	Select virtual server group, availability group according to business needs.

	![ALB服务器组设置](../../../../image/Networking/ALB/ALB-055.png)

- If there is no available virtual server group, click **Create new virtual server group** to create a new virtual server group. VM and containers can be selected to define the port and weight of the instance.
	
	Note: Only VM and container resources in the same virtual private cloud with load balancer can be selected.

	![ALB虚拟服务器组设置](../../../../image/Networking/ALB/ALB-056.png)

- So far, the listener based on the TCP Protocol has been created and can be viewed in the listener list.

	![ALB监听器列表页](../../../../image/Networking/ALB/ALB-057.png)
