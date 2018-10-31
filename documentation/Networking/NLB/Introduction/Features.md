# Features



## Load balancer instance

### Basic Information of Load Balancer

VPC, subnet, and multiple availability zones (AZ), etc. A single AZ or multiple availability zones can be selected by the load balancer. However, to guarantee high availability of business, multiple availability zones are highly recommended.

### Elastic IP association/disassociation

The user may independently select whether to associate, disassociate EIP, free switch, flexibly set up intranet and public network load balancer to meet business demands at different scenarios. By associating public IP, the Intranet structure can be hid and system security can be improved.

## Listener

### Listening rules

At present, the protocol types and port number information to be listened only cover the TCP. The user can define several monitors in the same load balancer. Different protocol types or the same protocol type and different port number definition can be selected by the listener.


### Idle connection timeout setting

An idle connection timeout setting for listening rules. In case of connection idle timeout, the load balancer will automatically disconnect the connection between the client and the backend server.

## Backend service

### Service rules

Define protocol types and port number to be received by the backend server. When the backend service is related to the virtual machine group, if the port is defined by the registered instance (virtual machine or container) of the virtual server group, the load balancer will forward the message to the service instance with the port defined by the instance. If no port is defined by the registered instance (virtual machine or container) of the virtual server group, the load balancer will forward the message with the port number defined by the backend service to the service instance. When the backend service is related to the availability group and the port information is not defined by the service instance within the availability group, the load balancer will forward the message via the port number defined by the backend service to the service instance.

### Scheduling algorithm selection

Three scheduling algorithms are supported, including weighted round robin algorithm, weighted least connection algorithm and source IP algorithm. Appropriate algorithm can be selected based on business demand of one’s own to distribute traffic. For example, the weighted round robin algorithm can be selected of the backend machines have little performance difference, so as to evenly distribute traffic of backend machine and improve external service capacity. The source IP algorithm can be used for forwarding as well to map the client requests from the same source to the same backend server via the harsh table. At the same time, weight can be configured based on backend server performance (the weighted value can be set by registering instance with the virtual server group), which can be set to be the integer from 1 to 100. The server of high configuration can be set with high weight, to bear more access traffic. When the backend service is related to the availability group, weights of all instances in such availability group shall be the same.

### Session persistence setting

Support for session persistence based on TCP connections. The default time-out period is 1440s，which is the shortest guaranteed time of session persistence and during which time all packet with same source and destination IP will be forwarded to the same backend server no matter how NLB and backend service is elastically extended. When the session persistence duration is time out, it is not guaranteed that the packet will be forwarded to the same backend server.

### Source IP pass-through

At present, NLB can pass through the source IP originating from the client to the backend server by default, without special intervention and configuration by users.

## Connection Draining

Connection draining is a way for backend server to gracefully exit the service. When a server is removed from the "virtual server group" or the availability group (AG), the connection draining timer is started. After that, only the established TCP connection packet will continue to be forwarded to the server until the connection draining time expires. So far, the newly established TCP connection will not be forwarded to the server.

### Health Check:

The load balancer will periodically detect operation status of backend server, customize detection frequency and judge health/unhealthy conditions; once any server operation exception is detected, the traffic will not be allocated to the instances with exception, and the traffic forward will be recovered until the normal operation of such instances is detected. In this way, the service availability is guaranteed.

### Service association

At present, each backend service can be associated to one virtual server group or an availability group.

## Virtual Server Group

### Register/cancel Service Instance

The user can add service instances to the virtual server group or delete the same from the virtual server group manually. Service instances comprise two types, including the virtual machine and the container.

### Service instance port definition

If the port information is defined when registering service instance to the virtual server group, the load balancer can forward the packet to the service instance via the port defined by the instance. If no port is defined when registering the service instance, the load balancer will forward the packet to the service instance via the port number defined by the backend service.

### Service instance weight definition:

If the weight information is defined when registering service instance with the virtual server group, the load balancer will weight and forward the packet as per the scheduling algorithm + instance definition weight defined by the backend service. For example, if the virtual server group has 2 instances, with weights of 5 and 10 respectively, the backend service will select the weighted round robin algorithm and the load balancer will forward the traffic to the two service instances as per the proportion of 1:2.

### Relate AS (Auto Scaling):

The virtual server group of load balancer can realize auto scaling of the service instance by relating AS. However, the auto scaling only consider the availability zone (AZ) level resource distribution scheduling rather than the high availability in the machine room (such as across racks). For example, for guaranteeing high availability across racks, please use the availability group.

## Availability Group

The load balancer does not have the availability group function, but the availability group can be related to the backend service of the load balancer. The availability group had the auto scaling capacity and can adjust the backend service virtual machine quantity according to the business load conditions, so as to provide high-availability granularity service capacity to the across rack in the machine room.

## Monitoring Alarm

### Visual Monitoring

Network load balancer (NLB) console provides rich monitoring information, including inbound/outbound traffic, number of connections, and number of new connections. You can view the running status of the service at any time.

### Automatic alarm

You can set alarm rules based on monitoring items. When the monitoring item reaches the set threshold, the system will send you alarm information via SMS and email.

## Relevant References

- [Product overview](../Introduction/Overview.md)
- [Product specification](../Introduction/Specification.md)
- [Price overview](../Pricing/Price-Overview.md)
- [Create Instance](../Getting-Started/Create-Instance.md) for specific actions.
- [Create virtual server group](../Operation-Guide/TargetGroup-Management.md)
- [Configure listening policy](../Operation-Guide/Listener-Management.md)
- [Manage rear end service and view health status of service instance](../Operation-Guide/Backend-Management.md)
- [View monitoring information](../Operation-Guide/Monitoring.md)


