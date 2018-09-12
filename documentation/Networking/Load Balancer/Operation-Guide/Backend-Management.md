# Backend service management

## Add backend service

1. Enter the backend service management page by clicking the Load balancer-Details-Backend service;

3. Click “Create a new backend service”, turn on backend service creation page;

5. Backend service setting:
	
	**Basic Information:**
	
	- Name: define backend service name;
	
	- Backend Protocol: May select http, tcp;

		Note: The listener only can be associated with backend service of corresponding Protocol type, when the Backend Protocol is http, only the listeners under the Listening Protocol of http, https type can be associated, when the Backend Protocol is tcp, only the listeners under the Listening Protocol of tcp type can be associated;

	- Port: The input range is 1-65535 and different backend services can use the same port;

	- Scheduling algorithm: Support weighted round robin algorithm, weighted least connection number and source IP;

	- Session persistence: Support configuration when Backend Protocol is http, which supports the session persistence based on cookie implant method;

	- Cookie timeout: Input the range 0-86400;

	- Get real IP: It is turned on and cannot be closed by default when Backend Protocol is http, support to pass-through client IP in proxyprotocol Protocol method when Backend Protocol is tcp, it is noted that turning on of session persistence needs to be separately set at the server when in tcp Protocol;

	- Get HTTP header field: Support multiple items such as X-Forwarded-Proto, XForwarded-Por, X-Forwarded-LBIP, X-Forwarded-Host for passing-through relevant information requested by client http;

		![ALB后端服务设置](../../../../image/Networking/ALB/ALB-028.png)

	**Health check setting:**

	- Select health check method: HTTP and TCP;

	- Set check port: input range 1-65535, if it is not filled in, the port of backend instance for receiving load balancer traffic will be the port by default;

	- Response timeout time(s): input range 2-60s, which is the maximum timeout time for health check response;

	- Health check interval(s): input range 5-300s, which is the maximum time interval for health check;

	- Unhealthy threshold: input range 1-5, which is the number of consecutive health check failures from success to failure of the backend instance;

	- Healthy threshold: input range 1-5, which is the number of consecutive health check successes from failure to success of the backend instance;

	- Normal state code: input range 2xx (equivalent to 200-299), 3xx (equivalent to 300-399), 4xx (equivalent to 400-499);

	- Check path: It only will be filled in when the health check method is HTTP, it must start with “/”, at most support 5-level contents, and cannot exceed 100 characters.

		![ALB健康检查设置](../../../../image/Networking/ALB/ALB-029.png)	

	**Add server group: **

	- Select server group type: virtual server, availability group, or it cannot be added currently;

	- Virtual server group: The system will automatically filter out the list of server groups that can be associated now, if there is no available server group, it may click ** Create a new virtual server group ** to create;

		Note: The backend instances in the optional server group must be under the same region, virtual private cloud, and availability zone as the load balancer.

	- Availability Group: The system will automatically filter out the availability groups that can be associated now, if there is no availability group, please go to the Availability Group page to create;

		Note: The backend instances in the optional availability group must be under the same region, virtual private cloud, and availability zone as the load balancer.

		![ALB添加服务器组](../../../../image/Networking/ALB/ALB-030.png)


## Backend Service Management

1. View details of backend service: Click the backend service name to enter into the backend service details, view backend service configuration information and replace the associated backend server group (refer to the text below);

1. View associated server group: Click the backend service name in the list page and view server group information and health status related to the backend service;

1. Editing backend service: Edit relevant configuration information of the backend server (refer to the text below);

1. Delete backend service: Once the backend service is successfully deleted, the backend service will be automatically disassociated with the server group, but the backend service associated to the listener cannot be deleted;

![ALB管理后端服务](../../../../image/Networking/ALB/ALB-031.png)
	
## Replace server group associated to the backend service

1. Turn on the backend service details by clicking Load balancer-Details-backend service-Details. Click **Change** to change the associated server group;

1. Turn on the backend service editing page by clicking the Load balancer-Details-Backend service-Editing and change the associated server group;

![ALB更换后端绑定的服务器组](../../../../image/Networking/ALB/ALB-032.png)
	
## Edit backend service

1. Turn on the backend service editing page by clicking the Load balancer-Details-Backend service-Editing;

1. Edit backend service configuration item, which contain the backend protocol and the port unable to be edited and the other items with editable certificates. If the listener has any associated certificate, such certificate can be modified;

![ALB编辑后端服务](../../../../image/Networking/ALB/ALB-033.png)
	


