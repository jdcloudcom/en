# Product advantages

## High performance

JD Cloud network load balancer (NLB) can provide high-performance service capabilities of four-layer business with over 100 million concurrent connections and millions of new connections per second.

## Auto Scaling

JD Cloud NLB can monitor the business traffic. When page views increase rapidly, it extends the NLB service instance automatically, and automatically extends NLB service instances and increase processing power to scale to over 100 million concurrent requests; when page views decrease, it automatically contracts NLB service instances and reduces resource consumption. The whole scaling course is performed automatically and smoothly, providing insensible and smooth user services.

## High service availability

JD Cloud NLB Service supports independent selection of redundant configuration, multiple availability zone deployment and high availability. Associate availability group AG to support multi-dimensional high availability deployment of backend service instance spanning rack in the same machine room and spanning availability zone and to eliminate the impacts of backend service instance caused by single-point device failure.

## Session persistence

While supporting auto scaling (regardless of NLB or instance extensions of backend services), NLB can provide session persistence capabilities perfectly, reducing user application development considerations for session persistence and R&D investment.

## Connection draining

Network load balancer (NLB) supports registered instances to gracefully exit according to user-defined connection draining conditions to reduce user business interruption.

## Source address pass-through

NLB can completely pass through the source IP address of the user, which is convenient for the server to perceive or count the real source information.

## Flexible switching between private and public services

Users can simply associate and disassociate the Elastic IP for the NLB to implement network load balancer to support flexible switching between private and public services.

## Diversified backend service

JD Cloud features load balance and supports a wide variety of services. It can be used to register VMs and container instances to support back-end distribution services.

## Security

JD Cloud provides DDoS protection based on EIP to ensure business security. For other non-DDOS attacks, NLB will automatically discard requests from non-listening ports to prevent NLB server from being attacked by packet outside the service port.

## Cost saving

With virtual NLB, there is no need to purchase hardware device. At the same time, NLB adopts the minimum base instance retention fee plus the actual traffic fee, so as to flexibly billing according to the actual usage of the business, and greatly reduce the service usage cost.

## Ease of use

You can complete the creation of NLB instances and relevant functional components in several minutes, quickly input them in business applications and shorten the workload wait time through JD Cloud console and simple API calling.

## Convenient operation and maintenance
The console provides rich visual monitoring data Indicators; each data is clear at a glance. Automatic alarm rules can be set anytime and anywhere to master the operation of the instances.

## Relevant References

- [Product overview](../Introduction/Overview.md)
- [Product specification](../Introduction/Specification.md)
- [Price overview](../Pricing/Price-Overview.md)
- [Create Instance](../Getting-Started/Create-Instance.md) for specific actions.
- [Create virtual server group](../Operation-Guide/TargetGroup-Management.md)
- [Configure listening policy](../Operation-Guide/Listener-Management.md)
- [Manage rear end service and view health status of service instance](../Operation-Guide/Backend-Management.md)
- [View monitoring information](../Operation-Guide/Monitoring.md)

