# Create listening policy

1. Enter the listener management page by clicking the Application Application Load Balancer-Details-Listener;

2. Click Create a listener to open a listener setting page;

3. Listener setting:
	
	Frontend listening configuration:
	
	- Select Frontend Listening Protocol: http, https, tcp, tls; port: 1-65535;	
		Note: The listening port under the same Application Application Load Balancer cannot be duplicated, after creating the listener, the Listening Protocol, port cannot be allowed to modify;	
	- Idle connect timeout: input range 1-86400s;

		![ALB前端监听配置](../../../../image/Networking/ALB/ALB-022.png)

	**Backend forwarding configuration:**

	- Backend service by fault: Create or select an existed backend service, after selecting an existed backend service, relevant parameters cannot be modified;
	
	- Backend service name: define backend service name, backend services created synchronously with listeners can be viewed in the backend service list;	
	
	- Backend Protocol: Display by default, if the listening protocol is http, https, the backend protocol is http, if the listening protocol is tcp or tls, the backend protocol is tcp;
	
	- Port: Backend business forwarding port, input range 1-65535, ports for different backend services can be duplicated;
	
	- Scheduling algorithm: Weighted round robin, weighting least connection count and weighted source IP can be selected according to actual business needs;
	
	- Session persistence: Off by default, which supports cookie session persistence based on cookie implant method when Backend Protocol is http;	
	
	- cookie timeout: input range 0-86400, default value 0, representing the same life cycle as the browser;	
	
	- Get real IP: When http is used as the backend protocol, is enabled by default and cannot be disabled, the real client IP can be obtained via the X-Forwarded-For header field; when tcp is used as the backend protocol, the pass-through to the client IP via the proxy protocol is supported.
	
		Note: When tcp is used as the backend protocol, if it is enabled for obtaining the real IP, it needs to complete relevant configuration for proxy protocol at the backend server.
		
	- Obtaining HTTP header field: Used for passing through relevant information requested by client http. The following items are supported: Obtaining the Load Balancer listening protocol via the field X-Forwarded-Proto; obtaining the Load Balancer listening port via the field X-Forwarded-Port; obtaining the Load Balancer VIP address via the field X-Forwarded-LBIP; and obtaining the Load Balancer target listening destination IP (domain) and port via the field X-Forwarded-Host;

		![ALB后端转发配置](../../../../image/Networking/ALB/ALB-023.png)	

	**Health check setting:**

	- Select health check method: HTTP and TCP;
	
	- Set check port: input range 1-65535, if it is not filled in, the port of backend instance for receiving Application Application Load Balancer traffic will be the port by default;
	
	- Check domain: The domain of a Health Check. Support entering domain and IP address. When entered, the domain only supports capital and lower-case letters, figures, English line-through "-" and point "." (case-insensitive) with no more than 255 characters. If there is a null by default, it shows that the Health Check carries no domain. Only when the protocol of the Health Check is HTTP, a domain can be filled in.
	
	- Check Path: The URL path of a Health Check. Must start with "/", support up to a 5-level directory and up to 100 characters. Only when the protocol of the Health Check is HTTP, a domain can be filled in.
	
	- Response timeout time(s): input range 2-60s, which is the maximum timeout time for health check response;
	
	- Health check interval(s): input range 5-300s, which is the maximum time interval for health check;
	
	- Unhealthy threshold: input range 1-5, which is the number of consecutive health check failures from success to failure of the backend instance;
	
	- Healthy threshold: input range 1-5, which is the number of consecutive health check successes from failure to success of the backend instance;
	
	- Normal state code: input range 2xx (equivalent to 200-299), 3xx (equivalent to 300-399), 4xx (equivalent to 400-499). Only when the protocol of the Health Check is HTTP, a domain can be filled in.

		![ALB健康检查设置](../../../../image/Networking/ALB/ALB-094.png)

	**Add server group:**

	- Select server group type: Virtual Server Group/Instance Type, Virtual Server Group/IP Type, Availability Group, or do not add temporarily;
	
	- Virtual Server Group/Instance Type or Virtual Server Group/IP Type: System will automatically screen out the list of Virtual Server Group that can be bound for the time being; if no Virtual Server Group is available, you can click **Create Virtual Server Group** to create an available Virtual Server Group;	
	
		  Note: The Backend Server of Virtual Server Group/Instance Type must be at the same Virtual Private Cloud of the same territory with the Application Load Balancer.

	- Availability Group: The system will automatically filter out the availability groups that can be associated now, if there is no availability group, please go to the Availability Group page to create;
	
	       Note: The Backend Server of available Availability Group must be at the same Virtual Private Cloud of the same territory with the Application Load Balancer.

		![ALB添加服务器组](../../../../image/Networking/ALB/ALB-049.png)
