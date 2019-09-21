# Product Overview

  Network load balancer is a self-developed product by JD Cloud, and focuses on four layers business services. It supports high performance, low latency, session persistence, etc. for over 100 million concurrent connections and millions of new connections per second.

  Network load balancer (NLB) has the following features:

* High performance: Supports over 100 million concurrent connections and millions of new connections per second.

* High reliability: Supports multiple availability zones creation. The backend service can closely cooperate with the automatic cross-AZ and cross-rack fault tolerance domain allocation of the availability group (AG) to realize automatic high availability deployment of business.

* Auto scaling: service instances can be automatically adjusted in accordance with business conditions, free form the miscellanies such as user business planning and manual upgrade.

* Session persistence: NLB can perfectly achieve the session persistence in both instance expansions of NLB or backend service.

* Connection draining: NLB supports registered instances to gracefully exit according to user-defined connection draining conditions to reduce user business interruption.

* Backend richness: Support VM and native containers as backend service instances, providing flexible options for user business deployment.

* Source address pass-through: NLB can completely pass through the source IP address of the user, which is convenient for the server to perceive or count the real source information.

* Pay by consumption: In addition to the minimum resource retention fee, NLB charging is fully based on the actual user traffic, and provides the most economical and practical service usage for users.


## Comparison between Application Load Balancer & Network Load Balancer & Distributed Network Load Balancer

| Comparison Item   |  Application Load Balancer | Network Load Balancer | Distributed Network Load Balancer |
|:-----|  :---- | :---- | :---- |
|Performance 	| Million Level Concurrent Connections and Hundreds of Thousands Level New Connections per Second | Hundreds of Million Level Concurrent Connections and Million Level New Connections per Second | No Forwarding Performance Bottle Neck |
|Service Protocol Layer |   Lay-4/Lay-7 | Lay-4 (stateful)| Lay-4 (Stateless)|
|Protocol Type	| HTTP, HTTPS, TLS and TCP | TCP | TCP |
|Forward based on domain and URL path| ✔ | —— | —— |
|WebSocket Support| ✔ | —— | —— |
|Backend Service Instance Auto Scaling | ✔ | ✔ | ✔ |
|High-availability deployment of multiple availability zones | ✔ | ✔ | ✔ |
|Scheduling Algorithm	| Weighted Round Robin, Weighting Least Connection Count and Weighted Source IP | Weighted Round Robin, Weighting Least Connection Count and Weighted Source IP | Weighted Source IP and Weighted Quintuple Form |
|SSL Unloading and Certificate Management | ✔ | —— | —— |
|Idle Connection Timeout | ✔ | ✔ | —— |
|Source IP Reservation	| Pass-through based on X-forward-for mechanism of HTTP Header | Pass-through of Three-layer Packet Source IP | Source IP Pass-through of Three-layer Packet |
|Session Persistence | Cookie-based Session Persistence  |  Session Persistence of TCP Connection | —— |
|Connection Draining Overtime | Support connection draining only and do not support configuration time-out period |  ✔ | —— |
|Instance Type Family of Backend Service | Virtual Machines/Native Container/Availability Group| Virtual Machines/Native Container/Availability Group | Virtual Machines/Native Container/Availability Group |
|Health Check | ✔ | ✔ | ✔ |
|Switch Between Intranet and Internet Load Balancer	 | ✔ |	✔ | ✔ |
|Deletion Protection | ✔  | ✔ | ✔ |
|Billing Standard	| Relatively-high Rate (Temporarily Free)| Relatively-low Rate (Temporarily Free) | Free |

## Common operation

- Create NLB instance
  - [Create Instance](../Getting-Started/Create-Instance.md) for specific actions.
  
- Create service instance resource (AG/ virtual server group)
  - [Create virtual server group](../Operation-Guide/TargetGroup-Management.md)
	
- Configure listening policy (including listener, backend)
  - [Configure listening policy](../Operation-Guide/Listener-Management.md)
	
- Manage backend service and view health status of service instance
  - [Back end service management and health status of service instance view](../Operation-Guide/Backend-Management.md)
	
- Operation and maintenance management
  - [View monitoring information](../Operation-Guide/Monitoring.md)
  - [Set alarm rules](../Operation-Guide/Monitoring.md)

## Billing

Network load balancer supports the traffic-based billing type For details, please refer to "[Billing Instructions](../Pricing/Billing-Rules.md)".
