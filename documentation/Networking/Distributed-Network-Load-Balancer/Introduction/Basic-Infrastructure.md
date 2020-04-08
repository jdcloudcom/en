# Basic Architecture

Distributed Network Load Balancer splits the Load Balancer services into multiple independent function modules by taking advantage of the unified and flexible architecture of JD Cloud & AI's Load Balancer product in order to meet the needs of different scenarios and make user operation more flexible, convenient and fast.

  ![DNLB组成架构](../../../../image/Networking/Distributed-Network-Load-Balancer/DNLB-002.png)
Function Module Definition

#### Load Balancer Instance

Before using the Load Balancer service, it needs to create a Load Balancer instance. One Load Balancer instance can be set up with multiple listeners, multiple backend services, multiple virtual server groups and Availability Groups. The Distributed Network Load Balancer instance is used for providing distributed, four-layer, stateless Load Balancer services.
#### Sound Monitor

It is used to listen to business requests requiring Load Balancer services. Each Load Balancer instance shall at least set one listener and designate listening protocol and port etc.
#### Backend Service

It is used for providing management module for forwarding, scheduling policy from Load Balancer to backend server, including forwarding protocol/port, scheduling algorithm, backend server group and health check, etc.
#### Virtual Server Group

A set of Virtual Machines or container instance resources receiving business request distributed by Load Balancer, where the instance is managed by the virtual server group. The virtual server group can be combined with Auto Scaling for use so as to realize auto expansion and shrinkage of Virtual Machines. However, the dispersion capacity of the Virtual Machines of AS is relatively weak, paying no attention to high availability dispersion mechanism across rack dimensions.
#### Availability Group

Availability Group is a logic set of Virtual Machines provided by JD Cloud & AI, which may support Auto Scaling of Virtual Machines across racks, across AZ according to the business load so as to distribute Virtual Machines in dispersion to the physical resources separately isolated. When hardware or power failure occurs, only the Virtual Machines in Availability Group can be affected in order to guarantee the normal use of user business.

## High Reusability Architecture Description

The Load Balancer product of JD Cloud & AI has a unified and flexible architecture which can implement the reuse of function module. Users may flexibly reuse each function module according to the business demands in different scenarios thus to simplify the user configuration.

* Listeners with multiple same protocol types but different port numbers can be set under the same Load Balancer to listen multiple business requests.
* Multiple listeners under the same load balancer can be reused to associate with the same backend service.
* Multiple backend services under the same Load Balancer can be reused to associate with the same virtual server group/Availability Group.
* The same virtual server (Virtual Machines/containers) can be registered to different virtual server groups.
* The same availability group can be attached to backend services of multiple load balancers.

## Related References

- [Product Advantage](../Introduction/Benefits.md)
- [Product Function](../Introduction/Features.md)
- [Product Pricing](../Pricing/Billing-Overview.md)
- [Create DNLB Instance](../Operation-Guide/Create-DNLB-Instance.md)
- [Create virtual server group](../Operation-Guide/TargetGroup-Management.md)
- [Configure listening policy](../Operation-Guide/Listener-Management.md)
- [Manage rear end service and view health status of service instance](../Operation-Guide/Backend-Management.md)


