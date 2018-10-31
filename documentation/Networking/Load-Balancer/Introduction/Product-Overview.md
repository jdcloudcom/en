# Product introduction

The load balancer can distribute large concurrent traffic to several backend instances, adjust resource utilization, eliminate influence to systems by fault of single device, improve system availability and expand system serviceability.

Virtual private cloud deployment of JD Cloud:

![VPC基础架构](../../../../image/Networking/ALB/ALB-001.png)

## Load balancer upgrade description

JD Cloud has launched the upgraded load balancer product in South China region on June 28, 2018. The upgraded product can be totally compatible to functions of load balancers of old versions. The load balancer and its configuration, created by the user before, will be smoothly upgraded to the load balancer product with new architecture. The user can continue to make use of relevant functions and services without any operation or modification.

The upgraded load balancer mainly covers two changes:

- Function enhancement: Add availability groups and containers and use the same as the business distribution objects; increase idle timeout configuration management; increase health check result exhibition functions for backend service instance; and improve HTTP request header field support capacities (support HTTP header fields as X-Forwarded-For, X-Forwarded-Proto, X- Forwarded-Port, X-Forwarded-LBIP and X-Forwarded-Host, among which the X-Forwarded-For is turned on by default and cannot be shut down; and the others are shut down by default and can be turned on via setting).

- Structure adjustment: The original listening rules can be broke into a listener module and a backend service module, so as to provide the clear structure and multiplex the backend service. The listener is used for defining the protocol type and business request distinguishing rules of the port and other clients; the backend service module is used for defining the protocol type and ports of the server and mounting availability groups or virtual server groups. Besides the use of virtual machine registration, the virtual server group also can be used for registering container instance (the virtual machine and the container instance can survive in the same virtual server group).

## Provide high-availability service with multiple guarantees

## JD Cloud load balancer can realize high availability of multi-mechanism guarantee service:

- High availability of load balancer:

	- Multiple availability zone deployment: For the region supporting multiple availability zones, the load balancer instances can be deployed under several availability zones according to the business demand. Once the machine room of the availability zone fails or the resource under the availability zone fails, the traffic can be automatically forwarded to other availability zones, to realize the high availability of availability zones;


	- Resource redundancy mechanism: As the load balancer adopts the cluster deployment, it can provide the active-active mode (at least 2 resource instances are provided under a single availability zone). For example, in one load balancer service fails, the traffic can be automatically forwarded to another load balancer, without being detected by the business side.

- High availability of backend server:

	The load balancer can be associated to the availability group and dynamically adjust server count depending on business traffic and device load situation, so as to realize reasonable distribution of resources and guarantee normal operation of business.

![高可用服务](../../../../image/Networking/ALB/ALB-008.png)

## Main functions of load balancer

- Traffic distribution: By setting VIP, the backend instances (virtual machine/container) under the same VPC will be a virtual service pool by the load balancer, the access traffic of frontend customer will be distributed to the backend instance resource pool for processing as per specified rules and the external serviceability of the user can be improved.

- Multi-protocol listening: The load balancer supports the listening service to different ports under multiple protocols as TCP/HTTP/HTTPS, so as to support a variety of client service accesses and traffic distribution.

- Automatic health check: The load balancer service will check the health status of instances in the backend service resource pool, automatically isolate and attach service instances provided by the backend, eliminate single point fault of device and guarantee normal operation of business.

- Automatic adjustment of backend instance count: The load balancer backend can be associated to the specified availability group. By setting auto scaling policy, the backend service instance count can be automatically adjusted and resources can be reasonably configured.

- Anti-DDos attack: The anti-DDoS attack ability based on Public IP is provided to improve service security performance.

- Session persistence: The load balancer supports the session persistence function based on the HTTP/HTTPS protocol type.

- Idle connection timeout: The load balancer supports the idle connection timeout based on the TCP/HTTP/HTTPS protocol.

- Source IP pass-through: The load balancer supports the client IP pass-through function based on the TCP/HTTP/HTTPS protocol.

## Relevant references

- [Core concept](../Introduction/Core-Concepts.md)
- [Product advantage](../Introduction/Benefits.md)
- [Product function](../Introduction/Features.md)
- [Price overview](../Pricing/Price-Overview.md)
- [Billing rules](../Pricing/Billing-Rules.md)
- [Create load balancer instance](../Getting-Started/Create-Instance.md)
- [Create availability group](../Getting-Started/Create-AvailabilityGroup.md)
- [Create virtual server group](../Operation-Guide/TargetGroup-Management.md)
- [Configure listening policy](../Operation-Guide/Listener-Management.md)
- [Manage rear end service and view health status of service instance](../Operation-Guide/Backend-Management.md)
- [View monitoring information](../Operation-Guide/Monitoring.md)