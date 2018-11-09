# Quickly deploy multiple listeners based on the same business

If your business needs to support multiple listeners at the same time, you can reuse backend services for quick deployment.
For example, if you need both HTTP and HTTPS services simultaneously when deploying the website by the backend services, you can create HTTP and HTTPS listeners that reuse the same backend services.

## Preparation and planning

- Networking preparation

	Plan for load balancer, and region, availability zone, virtual private cloud, etc. of VM and containers as backend server in advance, according to business deployment needs.
	
	Note: VM and containers as backend server need to be in the same region, virtual private cloud with load balancer.

- Server preparation

	It is necessary to create VM and containers for carrying business traffic in advance, and ensure that the ports needed for listening are opened, and that security groups and ACL policies are properly configured.

- Load balancer instance

	Create a load balancer instance, and set up the region, availability zone, network, security group and other configurations.

## Create a listener of HTTP Protocol

- Frontend listening configuration:
	
	1. Configure Listening Protocol as HTTP, Port 80;

	2. Idle connection timeout: set idle connection timeout time;

	![ALB前端监听设置](../../../../image/Networking/ALB/ALB-080.png)

- Backend forwarding configuration:
	
	1. Backend service by fault: Select to create a new backend service;

	2. Backend service name: define backend service name; name it as “backend1”;

	3. Backend Protocol: Display the corresponding default protocol according to the Listening Protocol

	4. Port: Define backend forwarding port;

	5. Scheduling algorithm: Select according to business needs, and specify it as weighted round robin here;

	6. Session persistence: turn on;

	  timeout: define timeout time of cookie, use default value 0, represent the same life cycle as the browser;

	7. Get real IP: Turn on by default;

	8. Get HTTP header field: Tick according to business needs.

	![ALB后端转发设置](../../../../image/Networking/ALB/ALB-081.png)

- Configure health check: Select health check method as: http

	![ALB健康检查设置](../../../../image/Networking/ALB/ALB-082.png)

- Add server group: Select virtual server group, availability group according to business needs.

	![ALB服务器组设置](../../../../image/Networking/ALB/ALB-083.png)

- If there is no available virtual server group, click **Create new virtual server group** to create a new virtual server group. VM and containers can be selected to define the port and weight of the instance.
	
	Note: Only VM and container resources in the same virtual private cloud with load balancer can be selected.

	![ALB虚拟服务器组设置](../../../../image/Networking/ALB/ALB-084.png)

- So far, the listener based on the TCP Protocol has been created and can be viewed in the listener list.

	![ALB监听器列表页](../../../../image/Networking/ALB/ALB-085.png)

- At this point, a resource named "backend1" has been created synchronously in the backend service list.

	![ALB监听器列表页](../../../../image/Networking/ALB/ALB-086.png)

## Reuse backend service to create HTTPS listener

- Frontend listening configuration:

	1. Configure frontend Listening Protocol as HTTPS, Port 443;

	2. Select encryption certificate, if no certificate is available, click “Create a new certificate" to upload;

	3. Set idle connection timeout time;

	![ALB监听器列表页](../../../../image/Networking/ALB/ALB-087.png)

- Backend service forwarding;

	Select to use an existed backend service: backend1;
	
	Note: Use relevant information of the already existed backend directly and reuse the same backend service configuration, health check, and server group same as the previous HTTP listener.

	![ALB监听器列表页](../../../../image/Networking/ALB/ALB-088.png)

	![ALB监听器列表页](../../../../image/Networking/ALB/ALB-089.png)

	![ALB监听器列表页](../../../../image/Networking/ALB/ALB-090.png)

- Multiple listeners that reuse the same backend services can be quickly created and reused through this method.

	Note: Please confirm that the business scenario can reuse all configurations of the backend services, such as the same backend forwarding port, etc.

	![ALB监听器列表页](../../../../image/Networking/ALB/ALB-091.png)
