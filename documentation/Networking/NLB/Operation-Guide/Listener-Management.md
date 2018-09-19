# Listener management

## Add listener

#### 1. Enter the listener management page by clicking the Load balancer-Details-Listener;

#### 2. Click Create a listener to open the setting page;

#### 3. Listener setting:
	
##### Frontend listening configuration:
	
- Select frontend listening protocol: tcp; port: 1~65535 **Note: The listening port under the same load balancer cannot be repeated; after creating the listener, the listening protocol and the port are not allowed to modify**;	

- Idle connect timeout: input range 1-86400s, the default is 1800s.

  ![NLB前端监听配置](../../../../image/Networking/NLB/NLB-022.png)

##### Backend forwarding configuration:

- Backend service by fault: Create or select an existed backend service, after selecting an existed backend service, relevant parameters cannot be modified;

- Backend service name: Define backend service name, and the backend services created synchronously with listeners can be viewed in the backend service list;	
	
- Backend Protocol: Display by default, if the listening protocol is tcp, the backend protocol is also tcp;
	
- Port: Backend business forwarding port, input range 1~65535, ports for different backend services can be duplicated;
	
- Scheduling algorithm: Weighted round robin algorithm, weighted least connection number and source IP can be selected according to actual business needs;

- Session persistence: it is closed by default, open to support the TCP-based session persistence, and the default time is 1440 seconds;	
	
- Connection draining: Configure the connection draining timeout period, the range is [0, 3600] seconds, and the default is 300 seconds.

  ![NLB后端转发配置](../../../../image/Networking/NLB/NLB-023.png)	

##### Health check setting:

- Select health check method: HTTP, TCP;
	
- Set check port: input range 1~65535, if it is not filled in, the port of backend instance for receiving load balancer traffic will be the port by default;
	
- Response timeout time(s): input range 2~60s, which is the maximum timeout time for health check response;
	
- Health check interval(s): input range 5~300s, which is the maximum time interval for health check;
	
- Unhealthy threshold: input range 1~5, which is the number of consecutive health check failures from success to failure of the backend instance;
	
- Healthy threshold: input range 1~5, which is the number of consecutive health check successes from failure to success of the backend instance;
	
- Normal state code: input range 2xx (equivalent to 200-299), 3xx (equivalent to 300-399), 4xx (equivalent to 400-499);
	
- Check path: It only will be filled in when the health check method is HTTP, it must start with “/”, at most support 5-level contents, and cannot exceed 100 characters.

![NLB健康检查设置](../../../../image/Networking/NLB/NLB-029.png)

##### Add server group:

- Select server group type: virtual server, availability group, or it cannot be added currently.
	
- Select virtual server group: The system will automatically filter out the virtual server group list that can be associated now, if there is no virtual server group, please click “Create Virtual Server Group” to create. **Note: The backend instances in the optional virtual server group must be under the same region, virtual private cloud and availability zone as the load balancer.** ;	

- Availability Group: The system will automatically filter out the availability groups that can be associated now, if there is no availability group, please go to the Availability Group page to create. Note: The backend instances in the optional availability group must be under the same region, virtual private cloud, and availability zone as the load balancer.

![NLB添加服务器组](../../../../image/Networking/NLB/NLB-030.png)


# Manage listener

#### 1. View listening details: Click details via the action bar in the listener list page to view the details of listener;

#### 2. Enable/disable listener: Enable/disable the listener via the listener list page-action bar;

#### 3. Edit listener: The content of listener can be edited via the listener list page-action bar (for details, refer to the text below);

#### 4. Delete listener: The listener can be deleted via the listener list page-action bar.

![NLB管理监听器](../../../../image/Networking/NLB/NLB-Listener-Mgm.png)
	
## Edit listener

#### 1. Idle connection timeout: Revisable;

#### 2. Default backend service: new backend service can be replaced **Note: Only the backend service matched the listener protocol can be selected. For instance, if the listener is tcp, the backend service with the tcp backend protocol can be selected**;

#### 3. Modification to other parameter items is not supported.

![NLB编辑监听器](../../../../image/Networking/NLB/NLB-Listener-Edit.png)
	


