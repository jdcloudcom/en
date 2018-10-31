# Product advantages

| Product advantages | Load balancer | Traditional hardware load balancer |
| :- | :- | :- |
|Elastic expansion|Once the JD Cloud load balancer is associated to the availability group, the backend server count can be automatically adjusted according to the business load situation, the resource can be reasonably configured and the normal operation of business can be guaranteed |	Once the business growth reaches the bottle neck of the hardware, it needs to purchase new device of better performance. However, the installation is fuzzy and even the business must be cut off|
|Availability|The JD Cloud load balancer service can be used to configure redundancy automatically, rest in multiple availability zones, and support availability; after the availability group is associated, it supports multi-dimension availability configuration between the backend service and across racks in the same machine room and availability zones to eliminate the impact on the backend service instance due to any single-point device fault.|The conventional hot standby is adopted, but the manual configuration is required, thus achieving general availability|
|Cost saving|It is not required to purchase hardware devices, and the billing method may be flexibly selected according to the business so as to significantly lower the costs for hardware devices and eliminate operation and maintenance.|Expensive hardware, equipment and professional operation and maintenance personnel are required and the material and human resource cost invested is high |
|A variety of service types| The JD Cloud load balancer can register the virtual machine and the container instance to support the business backend distribution service and has a variety of service types |	Supports backend distribution service with a physical server|
|Security guarantee| Provide DDoS protection based on EIP and guarantee business security|The security protection module needs to be separately purchased and deployed, with complex operation and not high cost performance|
|Easy operation| The JD Cloud load balancer can realize modular decoupling and highly multiplex of backend service, virtual server group and availability group and simplify configuration. For example, listeners of different protocols (providing business of HTTP and HTTPS services at the same time) can multiplex the same backend service |	The configuration is fuzzy, relatively|
|Easy maintenance|The visual interface is provided and the operation is convenient; once being related, the availability group can be linked to the monitor to realize auto scaling|The professional operation and maintenance personnel is required to make complex combination deployment, thus the labor cost is increased|

## Relevant references

- [Product overview](../Introduction/Overview.md)
- [Product specification](../Introduction/Specification.md)
- [Price overview](../Pricing/Price-Overview.md)
- [Create instance](../Getting-Started/Create-Instance.md)
- [Create virtual server group](../Operation-Guide/TargetGroup-Management.md)
- [Configure listening policy](../Operation-Guide/Listener-Management.md)
- [Manage rear end service and view health status of service instance](../Operation-Guide/Backend-Management.md)
- [View monitoring information](../Operation-Guide/Monitoring.md)

