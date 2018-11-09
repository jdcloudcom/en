
# Create a high-availability network load balancer service

  The load balancer is mainly composed of the following five parts, including load balancer instance, listener, backend service, virtual server group or availability group. When creating load balancers and their relevant components and modules, the mutual dependency exists. Thus, it needs to create and set as per the orders. Similarly, it needs to delete load balancers and their relevant components and modules as per the orders.

  For specific orders, please refer to the picture below:

 ![NLB创建流程](../../../../image/Networking/NLB/NLB-013.png)

 ![NLB删除流程](../../../../image/Networking/NLB/NLB-014.png)

## Load balancer instance configuration

###  Basic Attribute Configuration
  
  Need to set the name for the load balancer, for distinguishing different load balancer instances; and to specify availability zone, virtual private cloud and subnet of the load balancer instance.
  Notes:
  The load balancer can only distribute traffic with the backend server under the virtual private cloud;
  The load balancer can only distribute traffic via the selected backend server with the availability zone of the load balancer instance.

### Security Group Configuration

  The associated security group shall be appointed when creating load balancer and the security group with ports completely opened is appointed by default.

### Public/Intranet Type Configuration
  
  When creating the load balancer instance, you are entitled to associate the EIP or not; the load balancer associated with EIP is deemed as the public network type, providing traffic forward service to the public network; and the load balancer without any associated EIP or disassociated with EIP shall be deemed as the Intranet load balancer, providing traffic forward service to the Intranet.

## Listener configuration

### Listening protocol/port

- Listening protocol: At present, the listening service under TCP protocol is provided.

- Port: The load balancer instance is used for receiving the requested listening port and the instances of the same load balancer cannot be repeated.

- Idle connect timeout: input range 1-86400s, the default is 1800s.

- Backend service: For definitions of traffic scheduling policy, configuration, etc. from the load balancer to the backend server, please refer to the text below.

## Backend service

### Forwarding protocol/port

- Backend protocol: At present, the backend forwarding service under TCP protocol is provided.

- Port: Refer to the backend port opened on the load balancer backend server, used for receiving requests. The same backend port can be used under different listeners.

### Scheduling algorithm

  At present, the load balancer only supports 3 forwarding rules, including weighted round robin, weighted least connection number and source IP ".

- Weighted round robin: The round robin will forward requests to backend service in turn. Once the weight is configured, the traffic will be distributed as per the weight proportion. The greater the configured weight, the greater the distribution ratio of the server.

- Weighted least connection number: Once the least connection number is configured, the request will be forwarded to at least one server of the backend connection number. Once the weight is configured, the traffic will be distributed as per the weight proportion. Finally, the active connection number between the load balancer and the backend service can be guaranteed to be consistent with the weight proportion.

- Source IP forwarding: Once the source IP forwarding is configured, the customer’s requests from the same IP will be forwarded to the same backend server to ensure the continuousness of service.

### Session persistence setting
  
  Support for session persistence based on TCP connections. The default time-out period is 1440s，which is the shortest guaranteed time of session persistence and during which time all packet with same source and destination IP will be forwarded to the same backend server no matter how NLB and backend service is elastically extended. When the session persistence duration is time out, it is not guaranteed that the packet will be forwarded to the same backend server.

### Source IP pass-through
 
 At present, NLB can pass through the source IP originating from the client to the backend server by default, without special intervention and configuration by users.

## Connection Draining

  Connection draining is a way for backend server to gracefully exit the service. When a server is removed from the "virtual server group" or the availability group (AG), the connection draining timer is started. After that, only the established TCP connection packet will continue to be forwarded to the server until the connection draining time expires. So far, the newly established TCP connection will not be forwarded to the server. - The range of the connection draining time of network load balancer is **0, 3600** seconds, and the default is 300 seconds.

### Health Check:

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

## Virtual Server Group

  It needs to configure the virtual server group name, port and weight. The greater the weight, the more the access request distributed to the server. The setting can be made according to the actual business demand.

## Availability Group

  A group of virtual machine instances, supporting creation in batches and realizing auto scaling for business load, can support high availability services across availability zones and across racks in the same machine room, can be attached to the load balancer backend. The availability group uses the forwarding port of the associated backend service by default and the instances within the same group have the same weight.



