# Create backend service

1. Enter the backend service management page by clicking the Application Application Load Balancer-Details-Backend service;

3. Click **Create a new backend service**, turn on backend service creation page;

5. Backend service setting:
	
	**Basic Information:**
	
	- Name: define backend service name;
	
	- Backend Protocol: May select http, tcp;

		  Note: The listener only can be associated with backend service of corresponding Protocol type, when the Backend Protocol is http, only the listeners under the Listening Protocol of http, https type can be associated, when the Backend Protocol is tcp, only the listeners under the Listening Protocol of tcp type can be associated;

	- Port: The input range is 1-65535 and ports for different backend services can be duplicated;

	- Scheduling algorithm: Support weighted round robin algorithm, weighting least connection count and weighted source IP;

	- Session persistence: Support configuration when Backend Protocol is http, which supports the session persistence based on cookie implant method;

	- cookie timeout time: input range 0-86400;

	- Get real IP: It is turned on and cannot be closed by default when Backend Protocol is http, In such case, real IP of client can be obtained via header fields of X-Forwarded-For;; support to pass-through client IP in proxyprotocol Protocol method when Backend Protocol is tcp;
	
		Note: When tcp is used as the backend protocol, if it is enabled for obtaining the real IP, it needs to complete relevant configuration for proxy protocol at the backend server.

	- Obtaining HTTP header field: Used for passing through relevant information requested by client http. The following items are supported: Obtaining the Load Balancer listening protocol via the field X-Forwarded-Proto; obtaining the Load Balancer listening port via the field X-Forwarded-Port; obtaining the Load Balancer VIP address via the field X-Forwarded-LBIP; and obtaining the Load Balancer target listening destination IP (domain) and port via the field X-Forwarded-Host;

		![ALB后端服务设置](../../../../image/Networking/ALB/ALB-028.png)

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

	**Add server group: **

	- Select server group type: Virtual Server Group/Instance Type, Virtual Server Group/IP Type, Availability Group, or do not add temporarily;
	
	- Virtual Server Group/Instance Type or Virtual Server Group/IP Type: System will automatically screen out the list of Virtual Server Group that can be bound for the time being; if no Virtual Server Group is available, you can click **Create Virtual Server Group** to create an available Virtual Server Group;	
	
		  Note: The Backend Server of Virtual Server Group/Instance Type must be at the same Virtual Private Cloud of the same territory with the Application Load Balancer.

	- Availability Group: The system will automatically filter out the availability groups that can be associated now, if there is no availability group, please go to the Availability Group page to create;
	
	      Note: The Backend Server of optional Availability Group must be at the same Virtual Private Cloud of the same territory with the Application Load Balancer.

		![ALB添加服务器组](../../../../image/Networking/ALB/ALB-049.png)


