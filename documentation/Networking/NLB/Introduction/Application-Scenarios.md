# Application scenario

The applicable scenarios for Network Load Balancer (NLB) are described as below.

## Billion level concurrent, one million new connections per second, and auto scaling business
JD Cloud self-developed network load balancer (NLB) is exclusively used in providing four layers of over 100 million level high-concurrency connections and millions of new connections per second business distribution services, which is capable of perceiving the changes of the user’s business volume and need-based auto scaling, so as to support the changes of the user’s business visits in a smooth and dynamic way. While supporting automatic scaling, JD Cloud NLB also provides strong conversation maintaining ability, capable of effectively reducing the consideration and R&D workload of conversation maintaining in the user’s business development process, improving the R&D efficiency and accelerating the business listing pace. NLB is suitable for high-concurrency service demands (e.g. game and e-commerce). At the same time, it is also applicable to those dynamic service scenarios with quick increase and decrease of traffic, such as sec-killing.
![高并发、自动弹性伸缩业务](../../../../image/Networking/NLB/NLB-AutoScaling.png)


## High-availability business deployment

JD Cloud NLB Server supports independent selection of redundant configuration, multiple availability zone deployment and high availability. Bind high AG to support multi-dimensional high availability deployment of rear-end server spanning rack in the same machine room and spanning availability zone and to eliminate the impacts of rear-end service instance caused by single-point equipment failure. Availability group also supports the auto scaling capability of service instance for automatic high availability distribution according to the appointed template, realizing perfect match with load balancer, providing high availability and auto scaling service. The high availability business deployment structure of NLB+AG is applicable to all business scenarios needing stable and high fault-tolerant capability, such as government affairs service, enterprise application and Internet application.

![高可用业务场景](../../../../image/Networking/NLB/NLB-HA.png)

## Large-scale IoT application

With the development of and the increasingly mature Internet of Things, more and more IoT applications have been applied in business service. In these applications, lots of IoT terminals need quick connection. Under some circumstances, the terminal needs to keep long TCP connection with the application server for the purpose of fast and continuous data transmission or dynamic interaction. Such IoT application has put forward definite requirements for large-scale TCP concurrent connection and scaled new connections. NLB can make easy and perfect response to the challenges under this category of scenarios.

![高可用业务场景](../../../../image/Networking/NLB/NLB-IOT.png)

## Relevant References

- [Product advantage](../Introduction/Benefits.md)
- [Product function](../Introduction/Functions.md)
- [Price overview](../Pricing/Price-Overview.md)
- [Billing rules](../Pricing/Billing-Rules.md)
- [Create Instance](../Getting-Started/Create-Instance.md) for specific actions.
