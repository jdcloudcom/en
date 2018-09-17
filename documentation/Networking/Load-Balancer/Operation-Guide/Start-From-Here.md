
# Create cross-region backup synchronization service

The load balancer is mainly composed of the following five parts, including load balancer instance, listener, backend service, virtual server group or availability group. When creating load balancers and their relevant components and modules, the mutual dependency exists. Thus, it needs to create and set as per the orders. Similarly, it needs to delete load balancers and their relevant components and modules as per the orders.

For specific orders, please refer to the picture below:

 ![ALB创建流程](../../../../image/Networking/ALB/ALB-013.png)

 ![ALB删除流程](../../../../image/Networking/ALB/ALB-014.png)

## Load balancer instance configuration

- Basic attribute configuration: It needs to set the name for the load balancer, for distinguishing different load balancer instances. It needs to specify availability zone, virtual private cloud and subnet of the load balancer instance.

	Notes:
	
	1. The load balancer only can distribute traffic with the backend server under the virtual private cloud;
	
	2. The load balancer only can distribute traffic via the selected backend server with the availability zone of the load balancer instance.

- Security group configuration: The associated security group shall be appointed when creating load balancer and the security group with ports opened completely is appointed by default.

- Public network/Intranet type: When creating the load balancer instance, you are entitled to associate the EIP or not; the load balancer associated with EIP is deemed as the public network type, providing traffic forward service to the public network; and the load balancer without any associated EIP or disassociated with EIP shall be deemed as the Intranet load balancer, providing traffic forward service to the Intranet.


## Listener configuration

### Listening protocol/port

- Listening protocol: At present, the listening service is provided to HTTP, HTTPS and TCP protocol only.

- Port: The load balancer instance is used for receiving the requested listening port and the instances of the same load balancer cannot be repeated.

- Backend service: For definitions of traffic scheduling policy, configuration, etc. from the load balancer to the backend server, please refer to the text below.

## Backend service

### Forwarding protocol/port

- Backend protocol: At present, the backend forwarding service is provided to the HTTP and TCP protocol only.

- Port: Refer to the backend port opened on the load balancer backend server, used for receiving requests. The same backend port can be used under different listeners.

### Scheduling algorithm

At present, the load balancer only supports 3 forwarding rules, including weighted round robin, weighted least connection number and source IP ".

- Weighted round robin: The round robin will forward requests to backend service in turn. Once the weight is configured, the traffic will be distributed as per the weight proportion. The greater the configured weight, the greater the distribution ratio of the server.

- Weighted least connection number: Once the least connection number is configured, the request will be forwarded to at least one server of the backend connection number. Once the weight is configured, the traffic will be distributed as per the weight proportion. Finally, the active connection number between the load balancer and the backend service can be guaranteed to be consistent with the weight proportion;

- Source IP forwarding: Once the source IP forwarding is configured, the customer’s requests from the same IP will be forwarded to the same backend server to ensure the continuousness of service.

### Session persistence

The load balancer supports the session persistence based on HTTP and HTTPS listening. At present, only the cookie implantation way is supported to forward access requests from the same source to the same backend server. The session persistence is turned off by default and can be turned on.

### Obtaining visitor’s actual IP

- For HTTP service, as the request is forwarded by replacing the HTTP header file, the access IP caught by the backend cloud server is the local IP of the load balancer system rather than the actual IP of the visitor. The system supports the user to obtain the visitor’s actual IP by using X-Forwarded-For. The system also turns on the 7-layer (HTTP protocol) service listening by default to “obtain the actual IP” and such service listening cannot be shut down.

- For TCP service, the client IP pass-through listened based on TCP is provided via the proxy protocol v1 protocol, which is shut down by default and can be turned on.

### Health check:

When the user enables the health check function and detects failures of one backend server, the traffic forward of such server will be automatically stopped and the traffic will be forwarded to other healthy servers. The traffic forward will be automatically recovered when the failed server is recovered.

For the HTTP service, the load balancer health check mechanism is as follows: By default, the load balancer system will initiate the http head requests to the application server configured by the server via the Intranet address of the backend server. If the check port is by default, the access will be made via the business forward port;

The user also can specify URL for health check, health check timeout, check interval, healthy threshold, unhealthy threshold, normal status recovery code, etc., for better control of health check function.

Recommended TCP/HTTP parameter configuration references are as follows:

- Response timeout time: 5000 milliseconds

- ### Health check interval: 3000 milliseconds

- Unhealthy threshold: 3 times

- Healthy threshold: 3 times

### Backend server

The backend service can be associated with the virtual server group or the availability group.

## Virtual server group

It needs to configure the virtual server group name, port and weight. The greater the weight, the more the access request distributed to the server. The setting can be made according to the actual business demand.

## Availability group

A group of virtual machine instances, supporting creation in batches and realizing auto scaling for business load, can support high availability services across availability zones and across racks in the same machine room, can be attached to the load balancer backend. The availability group uses the forwarding port of the associated backend service by default and the instances within the same group have the same weight.



