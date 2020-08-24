# Backend service management

## Add backend service

1. Enter the backend service management page by clicking the Application Application Load Balancer-Details-Backend service;

3. Click "Create a new backend service", turn on backend service creation page;

5. Backend service setting:
	
	**Basic Information:**
	
	- Name: define backend service name;
	
	- Backend Protocol: May select http, tcp;

		  Note: The listener only can be associated with backend service of corresponding Protocol type, when the Backend Protocol is http, only the listeners under the Listening Protocol of http, https type can be associated, when the Backend Protocol is tcp, only the listeners under the Listening Protocol of tcp/tls type can be associated;

	- Port: The input range is 1-65535 and different backend services can use the same port;

	- Scheduling algorithm: Support weighted round robin algorithm, weighting least connection count and weighted source IP;

	- Session persistence: Support configuration when Backend Protocol is http, which supports the session persistence based on cookie implant method;

	- Cookie timeout: Input the range 0-86400;

	- Get real IP: When http is used as the backend protocol, is enabled by default and cannot be disabled, the real client IP can be obtained via the X-Forwarded-For header field; when tcp is used as the backend protocol, the pass-through to the client IP via the proxy protocol is supported.
	
		  Note: When tcp is used as the backend protocol, if it is enabled for obtaining the real IP, it needs to complete relevant configuration for proxy protocol at the backend server.

	- Get HTTP header field: Used for passing through relevant information requested by client http. The following items are supported: Obtaining the Load Balancer listening protocol via the field X-Forwarded-Proto; obtaining the Load Balancer listening port via the field X-Forwarded-Port; obtaining the Load Balancer VIP address via the field X-Forwarded-LBIP; and obtaining the Load Balancer target listening destination IP (domain) and port via the field X-Forwarded-Host;

		![ALB后端服务设置](../../../../image/Networking/ALB/ALB-028.png)

	**Health check setting:**

	- Select health check method: HTTP and TCP;

	- Set check port: input range 1-65535, if it is not filled in, the port of backend instance for receiving Application Application Load Balancer traffic will be the port by default;

	- Check domain: The domain of a Health Check. Support entering domain and IP address. When entered, the domain only supports capital and lower-case letters, figures, English line-through "-" and point "." (case-insensitive) with no more than 255 characters. If there is a null by default, it shows that the Health Check carries no domain. Only when the protocol of the Health Check is HTTP, a domain can be filled in.
	
	- Check Path: The URL path of a Health Check. Must start with "/", support up to a 5-level directory and up to 100 characters. Only when the protocol of the Health Check is HTTP, a domain can be filled in.

	- Unhealthy threshold: input range 1-5, which is the number of consecutive health check failures from success to failure of the backend instance;

	- Healthy threshold: input range 1-5, which is the number of consecutive health check successes from failure to success of the backend instance;

	- Normal state code: input range 2xx (equivalent to 200-299), 3xx (equivalent to 300-399), 4xx (equivalent to 400-499);

	- Check path: It only will be filled in when the health check method is HTTP, it must start with "/", at most support 5-level contents, and cannot exceed 100 characters.

	- Normal Status Code: Input range: 2xx (equivalent to 200-299), 3xx (equivalent to 300-399), 4xx (equivalent to 400-499). Only when the protocol of the Health Check is HTTP, a domain can be filled in.


		![ALB健康检查设置](../../../../image/Networking/ALB/ALB-094.png)	

	**Add server group: **

	- Select server group type: Virtual Server Group/Instance Type, Virtual Server Group/IP Type, Availability Group, or do not add temporarily;
	
	 
		![ALB服务器组](../../../../image/Networking/ALB/ALB-049.png)
	
	- Virtual Server Group/Instance Type or Virtual Server Group/IP Type: System will automatically screen out the list of Virtual Server Group that can be bound for the time being; if no Virtual Server Group is available, you can click **Create Virtual Server Group** to create an available Virtual Server Group;	
	
		  Note:
		    * The Backend Server of Virtual Server Group/Instance Type must be at the same Virtual Private Cloud of the same territory with the Application Load Balancer.
		    * When a Backend Server is out of VPC (e.g. a Backend Server interconnects with the Application Load Balancer via direct connection, VPC peering or VPN), please create a Virtual Server Group of IP Type.

	- Availability Group: The system will automatically filter out the availability groups that can be associated now, if there is no availability group, please go to the Availability Group page to create;
	
	       Note: The Backend Server of available Availability Group must be at the same Virtual Private Cloud of the same territory with the Application Load Balancer.         

## Backend Service Management
<div id="user-content-2"></div>

1. View details of backend service: Click the backend service name to enter into the backend service details, view backend service configuration information and replace the associated backend server group (refer to the text below);

1. View associated server group: Click the backend service name in the list page and view server group information and health status related to the backend service;

1. Edit backend services: Edit relevant configuration information of backend services;

        Note:
        * The status of Health Check switch can only be modified in the Edit Backend Services dialog box. Load Balancer detects the running state of Backend Servers by virtue of its Health Check function, and when any fault is detected in a Backend Server, Load Balancer will no longer distribute any traffic to its Backend Server for purpose of ensuring the overall availability of services. It is not suggested to close the Health Check switch.
        * After the Health Check switch is closed, the health status of Backend Server will appear to be "N/A". At this point, the Load Balancer will distribute traffic to all "running" Backend Servers in accordance with the Scheduling Algorithm.

1. Delete backend service: Once the backend service is successfully deleted, the backend service will be automatically disassociated with the server group, but the backend service associated to the listener cannot be deleted;

![ALB管理后端服务](../../../../image/Networking/ALB/ALB-031.png)
	
## Replace server group associated to the backend service
<div id="user-content-3"></div>

1. Turn on the backend service details by clicking Application Application Load Balancer-Details-backend service-Details. Click **Change** to change the associated server group;

1. Turn on the backend service editing page by clicking the Application Application Load Balancer-Details-Backend service-Editing and change the associated server group;

![ALB更换后端绑定的服务器组](../../../../image/Networking/ALB/ALB-032.png)
