# Features

## Application Load Balancer instance

- Basic information of Application Load Balancer: VPC, Subnet, multiple availability zones (AZ), etc. A single AZ or multiple availability zones can be selected by the Application Load Balancer. However, to guarantee high availability of business, multiple availability zones are highly recommended.

- Elastic IP association/disassociation: The user may independently select whether to associate, disassociate EIP, free switch, flexibly set up Intranet and public network Application Load Balancer to meet business demands at different scenarios. By associating public IP, the Intranet structure can be hid and system security can be improved.

- Application Load Balancer security configuration: Relate and modify rules of security groups. Requests from the client is matched to the input rules of the Application Load Balancer security group, while the requests distributed to the backend server by the Application Load Balancer are matched to the output rules of the Application Load Balancer security group.

## Listener

- Listening rules: At present, the protocol types and port number information to be monitored only cover three protocol types, including HTTPS/HTTP/TCP/TLS. The user can define several monitors in the same Application Load Balancer. Different protocol types or the same protocol type and different port number definition can be selected by the listener.

- SSL certificate: if the HTTPS/TLS protocol is used as the listening protocol, a SSL certificate shall be configured when creating a listener. After created, a listener can be configured with multiple SSL certificates so that the requests under different access domains will return different SSL certificates.

- Idle connection timeout setting: An idle connection timeout setting for listening rules. In case of connection idle timeout, the Application Load Balancer will automatically disconnect the client and the Application Load Balancer as well as the two-end connection between the Application Load Balancer and the backend server.

## Forwarding Rules Group

- Forwarding Rule: Forwarding Rule can distribute traffic to different backend services or redirect traffic to specified URLs for processing in accordance with the domain and URL path of an access request. In a Forwarding Rule, the domain, the URL path and executed action matching a request can be defined.

- Domain: Domain and IP Address for matching seven-layer access traffic. The domain supports exact match and wildcard match.

- URL Path: URL path for matching seven-layer access traffic. URL path supports exact match and prefix match.

- Action: The action executed after a Forwarding Rule is matched, its values include forwarding and redirection. Forwarding means to forward access requests to specified backend services for processing; Redirecting means to redirect access requests to specified URLs.

## Backend service

- Service rules: Define protocol types and port number to be received by the backend server. When the backend service is related to the virtual machine group, if the port is defined by the registered instance (virtual machine or container) of the virtual server group, the Application Load Balancer will forward the message to the service instance with the port defined by the instance. If no port is defined by the registered instance (virtual machine or container) of the virtual server group, the Application Load Balancer will forward the message with the port number defined by the backend service to the service instance. When the backend service is related to the availability group and the port information is not defined by the service instance within the availability group, the Application Load Balancer will forward the message via the port number defined by the backend service to the service instance.

- Selection of scheduling algorithm: Support three scheduling algorithms, namely weighted round robin algorithm, weighted least connection and weighted source IP. Appropriate algorithm can be selected based on business demand of one’s own to distribute traffic. For example, the weighted round robin algorithm can be selected if the backend machines have little performance difference, so as to evenly distribute traffic of backend machines and improve external service capacity. The weighted source IP algorithm can be used for forwarding as well mapping the client requests from the same source to the same backend server via the harsh table. At the same time, weight can be configured based on backend server performance (the weighted value can be set by registering instance with the virtual server group), which can be set to be the integer from 0 to 100. The server of high configuration can be set with high weight, to bear more access traffic. When the backend service is related to the availability group, weights of all instances in such availability group shall be the same.

- Session persistence setting: Support session persistence for HTTPS/HTTP. The Application Load Balancer can forward the requests from the same resource to the same backend server for processing by inserting cookies in the HTTP response message header of the Application Load Balancer (backend server reply). For specific principles, please refer to contents in "session persistence principle" in the "basic architecture".

- Source IP pass-through: Source IP pass-through can be set for HTTPS/HTTP/TCP/TLS protocol, to pass through the visiting client IP to the backend server. IV. The seven-layer protocol uses a different implementation principle. The HTTP/HTTPS seven-layer protocol carries the source IP information to the server by inserting x-forward-for field in http head, while the TCP four-layer protocol carries the source IP information to the server by expanding proxy protocol.

- Health check: The Application Load Balancer will periodically detect operation status of backend server, customize detection frequency and judge health/unhealthy conditions; once any server operation exception is detected, the traffic will not be distributed to the instances with exception, and the traffic forward will be recovered until the normal operation of such instances is detected. In this way, the service availability is guaranteed.

- Service association: At present, each backend service can be associated to one virtual server group or an availability group.

## Virtual server group

- Register/cancel service instance: The user can add service instances to the virtual server group or delete the same from the virtual server group manually. Service instances comprise two types, including the virtual machine and the container.

- Definition of Backend Server's port: When registering a Backend Server in Virtual Server Group, the Application Load Balancer will use the defined port, if any, to forward a requested packet to the backend server; If no port is defined when registering a Backend Server, the Application Load Balancer will use the port number defined by the backend service to forward a requested packet to the backend server.

- Definition of Backend Server's weight: When registering a Backend Server in Virtual Server Group, the Application Load Balancer will forward the weight of requested packet in accordance with the Scheduling Algorithm defined by backend service and the defined weight (if any). For example, there are 2 Backend Servers in Virtual Server Group with their weight of 5 and 10, respectively; if the backend service selects the weighted round robin, the Application Load Balancer will forward the traffic to two Backend Servers at a ratio of 1:2.

- Relate AS (Auto Scaling): The virtual server group of Application Load Balancer can realize auto scaling of the service instance by relating AS. However, the auto scaling only consider the availability zone (AZ) level resource distribution scheduling rather than the high availability in the machine room (such as across racks). For example, for guaranteeing high availability across racks, please use the availability group.

## Availability group

The Application Load Balancer does not have the availability group function, but the availability group can be related to the backend service of the Application Load Balancer. The availability group had the auto scaling capacity and can adjust the backend service virtual machine quantity according to the business load conditions, so as to provide high-availability granularity service capacity to the across rack in the machine room.


## Relevant references

- [Product overview](../Introduction/Product-Overview.md)
- [Product specification](../Introduction/Specification.md)
- [Price overview](../Pricing/Price-Overview.md)
- [Create instance](../Getting-Started/Create-Instance.md)
- [Virtual Server Group Management](../Operation-Guide/TargetGroup-Management.md)
- [Listener Management](../Operation-Guide/Listener-Management.md)
- [Manage rear end service and view health status of service instance](../Operation-Guide/Backend-Management.md)
- [View monitoring information](../Operation-Guide/Monitoring.md)


