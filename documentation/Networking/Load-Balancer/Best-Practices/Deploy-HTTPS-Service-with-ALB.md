# Configure to deploy HTTP listener

## Preparation and planning

- Networking preparation

	Plan for load balancer, and region, availability zone, virtual private cloud, etc. of VM and containers as backend server in advance, according to business deployment needs.
	
	Note: VM and containers as backend server need to be in the same region, virtual private cloud with load balancer.

- Server preparation

	It is necessary to create VM and containers for carrying business traffic in advance, and ensure that the ports needed for listening are opened, and that security groups and ACL policies are properly configured.

- Load balancer instance

	Create a load balancer instance, and set up the region, availability zone, network, security group and other configurations.

##Create an HTTPS listener

- Frontend listening configuration:
	
	Click ** Add ** to create a listener: select HTTPS Protocol, configure listening port, certificate, idle connection timeout.

	![ALB后端服务设置](../../../../image/Networking/ALB/ALB-045.png)

- Click **Create a new certificate** to create a new SSL certificate.

	![ALB后端服务设置](../../../../image/Networking/ALB/ALB-046.png)

- Backend forwarding configuration: May create a new backend service or select an existing backend service, it is noted that only backend services of backend HTTP type protocol can be selected.
	
	Thus, create a new backend service: configure backend service name, Protocol (HTTP), port 80, scheduling algorithm selects weighted round robin, turn on session persistence, configure session persistence timeout time, turn on to get real IP, configure to get HTTP header field.

	![ALB后端服务设置](../../../../image/Networking/ALB/ALB-047.png)

- Configure health check: set related parameters of health check, wherein the HTTP method is used here.

	![ALB后端服务设置](../../../../image/Networking/ALB/ALB-048.png)

- Add server group: Select virtual server group, availability group according to business needs.

	![ALB后端服务设置](../../../../image/Networking/ALB/ALB-049.png)

- If there is no available virtual server group, click **Create new virtual server group** to create a new virtual server group. VM and containers can be selected to define the port and weight of the instance
	
	Note: Only VM and container resources in the same virtual private cloud with load balancer can be selected.

	![ALB后端服务设置](../../../../image/Networking/ALB/ALB-050.png)

- So far, the listener based on the HTTP Protocol has been created and can be viewed in the listener list.

	![ALB后端服务设置](../../../../image/Networking/ALB/ALB-051.png)