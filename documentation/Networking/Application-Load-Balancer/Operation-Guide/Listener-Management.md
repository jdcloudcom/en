# Listener management

[Add Listener](listener-management#user-content-1)

[Manage Listener](listener-management#user-content-2)

[Edit Listener](listener-management#user-content-3)

[Manage the Listener associated with Forwarding Rules Group](listener-management#user-content-4)

[Manage Certificate](listener-management#user-content-5)

## Add listener
<div id="user-content-1"></div>

1. Enter the listener management page by clicking the Application Application Load Balancer-Details-Listener;

2. Click Create a listener to open a listener setting page;

3. Listener setting:
	
	Frontend listening configuration:
	
	- Select Frontend Listening Protocol: http, https, tcp and tls; port: 1-65535;	
		Note: The listening port under the same Application Application Load Balancer cannot be duplicated, after creating the listener, the Listening Protocol, port cannot be allowed to modify;	
	- Idle connect timeout: input range 1-86400s;

		![ALB前端监听配置](../../../../image/Networking/ALB/ALB-022.png)

	**Backend forwarding configuration:**

	- Backend service by fault: Create or select an existed backend service, after selecting an existed backend service, relevant parameters cannot be modified;
	
	- Backend service name: define backend service name, backend services created synchronously with listeners can be viewed in the backend service list;	
	
	- Backend Protocol: Display by default, if the listening protocol is http, https, the backend protocol is http, if the listening protocol is tcp/tls, the backend protocol is tcp;
	
	- Port: Backend business forwarding port, input range 1-65535, ports for different backend services can be duplicated;
	
	- Scheduling algorithm: Weighted round robin, weighting least connection count and weighted source IP can be selected according to actual business needs;
	
	- Session persistence: Off by default, which supports cookie session persistence based on cookie implant method when Backend Protocol is http;	
	
	- cookie timeout: input range 0-86400, default value 0, representing the same life cycle as the browser;	
	
	- Get real IP: When http is used as the backend protocol, is enabled by default and cannot be disabled, the real client IP can be obtained via the X-Forwarded-For header field; when tcp is used as the backend protocol, the pass-through to the client IP via the proxy protocol is supported.
	
		Note: If it is gotten by turning on source IP under tcp protocol, it needs to be separately configured at the server;	
		
	- Obtaining http header field: Used for passing through relevant information requested by client http. The following items are supported: Obtaining the Load Balancer listening protocol via the field X-Forwarded-Proto; obtaining the Load Balancer listening port via the field X-Forwarded-Port; obtaining the Load Balancer VIP address via the field X-Forwarded-LBIP; and obtaining the Load Balancer target listening destination IP (domain) and port via the field X-Forwarded-Host;

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

	- Normal Status Code: Input range: 2xx (equivalent to 200-299), 3xx (equivalent to 300-399), 4xx (equivalent to 400-499). Only when the protocol of the Health Check is HTTP, a domain can be filled in.

		![ALB健康检查设置](../../../../image/Networking/ALB/ALB-094.png)

	**Add Server Group:**

	- Select server group type: Virtual Server Group/Instance Type, Virtual Server Group/IP Type, Availability Group, or do not add temporarily;
	
	 
		![ALB服务器组](../../../../image/Networking/ALB/ALB-049.png)
	
	- Virtual Server Group/Instance Type or Virtual Server Group/IP Type: System will automatically screen out the list of Virtual Server Group that can be bound for the time being; if no Virtual Server Group is available, you can click **Create Virtual Server Group** to create an available Virtual Server Group;	
	
		  Note:
		    * The Backend Server of Virtual Server Group/Instance Type must be at the same Virtual Private Cloud of the same territory with the Application Load Balancer.
		    * When a Backend Server is out of VPC (e.g. a Backend Server interconnects with the Application Load Balancer via direct connection, VPC peering or VPN), please create a Virtual Server Group of IP Type.

	- Availability Group: System will automatically screen out the Availability Groups that can be bound currently, but if there is no available Availability Group, please access the Availability Group page to create an available Availability Group;
	
	       Note: The Backend Server of available Availability Group must be at the same Virtual Private Cloud of the same territory with the Application Load Balancer.   

## Manage listener
<div id="user-content-2"></div>

1. View listening details: Click details in the listener list page-action bar to view details of listener;

2. Enable/Disable listener: Enable/disable the listener via the listener list page-action bar;

3. Edit listener: The content of listener can be edited by the listener list page-action bar (for details, refer to the text below);

4. Delete listener: The listener can be deleted by the listener list page-action bar.

![ALB管理监听器](../../../../image/Networking/ALB/ALB-026.png)
	
## Edit listener
<div id="user-content-3"></div>

1. Certificate: The certificate associated to the listener can be modified, if any;

2. Idle connection timeout: Revisable;

3. Default backend service by fault: Able to replace new backend service. Note: Only the backend service matched to the listener protocol is selected. For example, if the listening protocols are http and https, the backend service with the backend protocol of http can be selected. If the listening protocol is tcp, the backend service with the backend protocol of tcp can be selected.

4. Modification to other parameter items is not supported.

![ALB编辑监听器](../../../../image/Networking/ALB/ALB-027.png)
	
## Manage the Listener associated with Forwarding Rules Group
<div id="user-content-4"></div>

    Note: Only seven-layer (HTTP/HTTPS) listening support association of forwarding rules groups. One listener only can be associated with one forwarding rules group; multiple listeners under the same Load Balancer can be reused to associate with the same forwarding rules group.

1. Click **More** by Listener List Page - Operation Bar to pop up the dialog box of Manage Forwarding Rules Group.
2. In the dialog box of Manage Forwarding Rules Group, associate, disassociate, and replace the forwarding rules group with the Listener.

![ALB管理监听器](../../../../image/Networking/ALB/ALB-urlmap3.png)

## Manage certificate
<div id="user-content-5"></div>

1. Click **More** on the Listener List page - Operations bar to pop up the Manage Certificate dialog box.
2. In the Manage Certificate dialog box, a HTTPS/TLS listener can be configured as to bind multiple certificates. For detailed operations, please see [Certificate Management](../Operation-Guide/Certificates-Management.md).
