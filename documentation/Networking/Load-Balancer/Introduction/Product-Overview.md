# Product introduction

The Application Application Load Balancer can distribute large concurrent traffic to several backend instances, adjust resource utilization, eliminate influence to systems by fault of single device, improve system availability and expand system serviceability.

Virtual private cloud deployment of JD Cloud:

![VPC基础架构](../../../../image/Networking/ALB/ALB-001.png)

## Application Application Load Balancer upgrade description

JD Cloud Application Application Load Balancer can realize high availability of multi-mechanism guarantee service:

- High availability of Application Application Load Balancer:

	- Multiple availability zone deployment: For the region supporting multiple availability zones, the Application Application Load Balancer instances can be deployed under several availability zones according to the business demand. Once the machine room of the availability zone fails or the resource under the availability zone fails, the traffic can be automatically forwarded to other availability zones, to realize the high availability of availability zones;


	- Resource redundancy mechanism: As the Application Application Load Balancer adopts the cluster deployment, it can provide the active-active mode (at least 2 resource instances are provided under a single availability zone). For example, in one Application Application Load Balancer service fails, the traffic can be automatically forwarded to another Application Application Load Balancer, without being detected by the business side.

- High availability of backend server:

	The Application Application Load Balancer can be associated to the availability group and dynamically adjust server count depending on business traffic and device load situation, so as to realize reasonable distribution of resources and guarantee normal operation of business.

![高可用服务](../../../../image/Networking/ALB/ALB-008.png)

## Main functions of Application Application Load Balancer

- Traffic distribution: By setting VIP, the backend instances (virtual machine/container) under the same VPC will be a virtual service pool by the Application Application Load Balancer, the access traffic of frontend customer will be distributed to the backend instance resource pool for processing as per specified rules and the external serviceability of the user can be improved.

- Multi-protocol listening: The Application Application Load Balancer supports the listening service to different ports under multiple protocols as TCP/TLS/HTTP/HTTPS, so as to support a variety of client service accesses and traffic distribution.

- Automatic health check: The Application Application Load Balancer service will check the health status of instances in the backend service resource pool, automatically isolate and attach service instances provided by the backend, eliminate single point fault of device and guarantee normal operation of business.

- Automatic adjustment of backend instance count: The Application Application Load Balancer backend can be associated to the specified availability group. By setting auto scaling policy, the backend service instance count can be automatically adjusted and resources can be reasonably configured.

- Anti-DDoS Basic: JD Cloud will provide the Application Load Balancer with the EIP-based Anti-DDoS Basic for free, supporting maximum 2G Anti-DDoS attack capacity and improving service security performance. For details, refer to [Anti-DDoS Basic](https://docs.jdcloud.com/anti-ddos-basic/product-overview). If you need mass-traffic attack protection, please buy the [Anti-DDoS Protection Package].(https://www.jdcloud.com/products/anti-ddos-protection-package)。

- Session persistence: The Application Application Load Balancer supports the session persistence function based on the HTTP/HTTPS protocol type.

- Idle connection timeout: The Application Application Load Balancer supports the idle connection timeout based on the TCP/TLS/HTTP/HTTPS protocol.

- Source IP pass-through: The Application Application Load Balancer supports the client IP pass-through function based on the TCP/TLS/HTTP/HTTPS protocol.

- WebSocket support: WebSocket provides a two-way communication channel both to the client and the server, better saving server resources and bandwidth and ensuring communication timeliness.

## Relevant references

- [Core concept](../Introduction/Core-Concepts.md)
- [Product advantage](../Introduction/Benefits.md)
- [Product function](../Introduction/Features.md)
- [Price overview](../Pricing/Price-Overview.md)
- [Billing rules](../Pricing/Billing-Rules.md)
- [Create Application Application Load Balancer instance](../Getting-Started/Create-Instance.md)
- [Create availability group](../Getting-Started/Create-AvailabilityGroup.md)
- [Create virtual server group](../Operation-Guide/TargetGroup-Management.md)
- [Configure listening policy](../Operation-Guide/Listener-Management.md)
- [Manage rear end service and view health status of service instance](../Operation-Guide/Backend-Management.md)
- [View monitoring information](../Operation-Guide/Monitoring.md)