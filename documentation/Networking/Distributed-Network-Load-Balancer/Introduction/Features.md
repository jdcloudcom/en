# Features
## Distributed Network Load Balancer Instance
Distributed Network Load Balancer Instance is the logic entity of Load Balancer produced by JD Cloud & AI which is used for providing distributed, four-layer, stateless Load Balancer services. Users can associate instance or disassociate EIP according to the scenario needs to freely switch the Load Balancer of private network or public network. Instances providing Load Balancer services by associating EIP can hide intranet structure and enhance system security.
## Sound Monitor
Protocol types (currently only support TCP protocol) and port numbers are taken as the listening rules. Only client service requests matching the protocol listening rules can be distributed to the backend server via the Distributed Network Load Balancer. Users can define several listeners in the same Distributed Network Load Balancer. Different listeners can select different protocol types and different port numbers or the same protocol type and different port numbers.
## Backend Service
### Service Rules
Define protocol types and port numbers used to receive service request by backend server. This port number is the global port number taking effect on all backend servers under backend services.

* When the backend service is related to the virtual server group, if the backend server (Virtual Machines or container instance) registered in the virtual server group has defined a port number, the Distributed Network Load Balancer will forward a packet to it by using the port number defined by the backend server; if not, the Distributed Network Load Balancer will forward a packet to the backend server in the group by using the port number defined by the backend service.

* When the backend service is related to the Availability Group, the backend server in such Availability Group will not allow defining a port number, so the Distributed Network Load Balancer will forward a packet to the backend server in the group by using the port number defined by the backend service.

### Scheduling Algorithm
Two scheduling algorithms, i.e. Weighted Source IP and Weighted Quintuple Form are supported. Users can distribute traffic by selecting an appropriate algorithm according to their own business needs. At the same time, weight can be configured based on backend server performance (the weighted value can be set by registering instance with the virtual server group). The server of high configuration can be set with high weight, to carry more access traffic. When the backend service is related to the Availability Group, weights of all instances in such Availability Group shall be the same.
### Source IP Pass-through
At present, Distributed Network Load Balancer can pass through the source IP originating from the client to the backend server by default, without special intervention and configuration by users.
### Health Check
Distributed Network Load Balancer will periodically detect running status of backend server through health check and customize detection frequency and judge health/unhealthy conditions. After health check is enabled, if the backend server running is abnormal, the Distributed Network Load Balancer will stop distributing traffic to it but to other backend servers normally running. When the abnormal backend server is restored, the Distributed Network Load Balancer will then continue to distributing traffic to it.
### Service Association
At present, each backend service can be associated to one virtual server group or an availability group.
## Virtual Server Group
### Register/Cancel Registration of Backend Server
Users can manually add virtual server group to backend server or delete the same from the virtual server group. Backend server consists of VM Instance and container instance.
### Port Definition of Backend Server
When the backend server is registered with the virtual server group, if the backend server has defined a port number, the Distributed Network Load Balancer will forward a packet to it by using the port defined by the backend server; if not, the Distributed Network Load Balancer will forward a packet to the backend server by using the port number defined by the backend service.
### Weight Definition of Backend Server
When the backend server is registered with the virtual server group, if the weight is defined, the Distributed Network Load Balancer will weight and forward the packet as per the scheduling algorithm + instance definition weight defined by the backend service.
### Relate to AS (Auto Scaling)
The virtual server group of Load Balancer can implement Auto Scaling of backend service by relating to AS. The Auto Scaling of AS is the Availability Zone (AZ) level resource assignment and scheduling, without regard to the high availability in the data center (such as across racks).
## Availability Group
The Load Balancer does not have the Availability Group function, but the Availability Group can be related to the backend service of the Load Balancer. The Availability Group has the Auto Scaling capacity and can automatically adjust the backend server quantity according to the business load conditions, so as to provide high-availability granularity service capacity across AZ and across racks in the data center.
## Related References

- [Product Overview](../Introduction/Product-Overview.md)
- [Product Specifications](../Introduction/Specifications.md)
- [Product Pricing](../Pricing/Billing-Overview.md)
- [Create DNLB Instance](../Getting-Started/Create-Instance.md)
- [Create virtual server group](../Operation-Guide/TargetGroup-Management.md)
- [Configure listening policy](../Operation-Guide/Listener-Management.md)
- [Manage rear end service and view health status of service instance](../Operation-Guide/Backend-Management.md)

