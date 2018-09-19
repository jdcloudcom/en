# Create backend service

##### 1. Enter the backend service management page by clicking the Load balancer-Details-Backend service;

##### 2. Click **Create a new backend service**, turn on backend service creation page;

##### 3. Backend service setting:
	
###### Basic Information:
	
- Name: define backend service name;
	
- Backend protocol: TCP optional; Note: the listener only can be associated with backend service of corresponding Protocol type; when the Backend Protocol is tcp, only the listeners under the Listening Protocol of tcp type can be associated;

- Port: The input range is 1-65535 and ports for different backend services can be duplicated;

- Scheduling algorithm: Support weighted round robin algorithm, weighted least connection number and source IP;

- Session persistence: Session persistence enabling and disabling; the duration is 1440s after it is enabled;
	
- Connection draining: set the duration of connection draining in the range of **0, 3600**s, and the default is 300s.

![NLB后端服务设置](../../../../image/Networking/NLB/NLB-028.png)

###### Health check setting:

- Select health check method: HTTP, TCP;

- Set check port: input range 1~65535, if it is not filled in, the port of backend instance for receiving load balancer traffic will be the port by default;

- Response timeout time(s): input range 2~60s, which is the maximum timeout time for health check response;

- Health check interval(s): input range 5~300s, which is the maximum time interval for health check;

- Unhealthy threshold: input range 1~5, which is the number of consecutive health check failures from success to failure of the backend instance;

- Healthy threshold: input range 1~5, which is the number of consecutive health check successes from failure to success of the backend instance;

- Normal state code: input range 2xx (equivalent to 200-299), 3xx (equivalent to 300-399), 4xx (equivalent to 400-499);

- Check path: It only will be filled in when the health check method is HTTP, it must start with “/”, at most support 5-level contents, and cannot exceed 100 characters.

![NLB健康检查设置](../../../../image/Networking/NLB/NLB-BackHealth.png)	

###### Add server group:

- Select server group type: virtual server, availability group, or it cannot be added currently.

- Virtual server group: The system will automatically filter out the list of server groups that can be associated now, if there is no available server group, it may click **Create a new virtual server group** to create;
**Note: The backend instances in the optional availability group must be in the same region and virtual private cloud as the load balancer, which is not applicable to availability zone**;

- Availability Group: The system will automatically filter out the availability groups that can be associated now, if there is no availability group, please go to the Availability Group page to create;
**Note: The backend instances in the optional availability group must be in the same region and virtual private cloud as the load balancer, which is not applicable to availability zone**;

![NLB添加服务器组](../../../../image/Networking/NLB/NLB-BackVS.png)


