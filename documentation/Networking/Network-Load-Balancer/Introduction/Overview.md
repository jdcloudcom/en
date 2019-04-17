# Product Overview


Network load balancer is a self-developed product by JD Cloud, and focuses on four layers business services. It supports high performance, low latency, session persistence, etc. for over 100 million concurrent connections and millions of new connections per second.

NLB supports auto scaling, and can eliminate the cumber of user’s business planning and manual expansion; NLB supports deployment across multiple availability zones and works closely with availability group Ag to meet high availability deployment needs; in addition to the minimum resource retention fee, NLB billing is fully based on the actual user traffic, and provides the most economical and practical service usage for users.


Network load balancer (NLB) has the following features:

* High performance: Supports over 100 million concurrent connections and millions of new connections per second.

* High reliability: Supports multiple availability zones creation. The backend service can closely cooperate with the automatic cross-AZ and cross-rack fault tolerance domain allocation of the availability group (AG) to realize automatic high availability deployment of business.

* Auto scaling: service instances can be automatically adjusted in accordance with business conditions, free form the miscellanies such as user business planning and manual upgrade.

* Session persistence: NLB can perfectly achieve the session persistence in both instance expansions of NLB or backend service.

* Connection draining: NLB supports registered instances to gracefully exit according to user-defined connection draining conditions to reduce user business interruption.

* Backend richness: Support VM and native containers as backend service instances, providing flexible options for user business deployment.

* Source address pass-through: NLB can completely pass through the source IP address of the user, which is convenient for the server to perceive or count the real source information.

* Pay by consumption: In addition to the minimum resource retention fee, NLB charging is fully based on the actual user traffic, and provides the most economical and practical service usage for users.

## Relevant References

- [Product overview](../Introduction/Overview.md)
- [Core concept](../Introduction/Core-Concepts.md)
- [Product advantage](../Introduction/Benefits.md)
- [Product function](../Introduction/Functions.md)
- [Price overview](../Pricing/Price-Overview.md)
- [Billing rules](../Pricing/Billing-Rules.md)
- [Create network load balancer instance](../Getting-Started/Create-Instance.md)
- [Create availability group](../Getting-Started/Create-AvailabilityGroup.md)
- [Create virtual server group](../Operation-Guide/TargetGroup-Management.md)
- [Configure listening policy](../Operation-Guide/Listener-Management.md)
- [Manage rear end service and view health status of service instance](../Operation-Guide/Backend-Management.md)
- [View monitoring information](../Operation-Guide/Monitoring.md)
