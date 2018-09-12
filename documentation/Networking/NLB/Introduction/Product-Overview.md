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


## Network Load Balancer & Application Load Balance

Comparative items | Network Load Balancer| Application Load Balance |
:---|:--- |---: |
Performance	|Over 100 million concurrent connections and million-level new connections per second | million concurrent connections, and 10,000-level new connections per second |
Service protocol layer|	four-layer |seven/ four-layer |
Protocol type	|TCP/WebSocket |HTTP/HTTPS/TLS/WebSocket |
Auto Scaling	| ✔ | 	✔ |
High-availability deployment of multi-availability zones |	✔ |	✔ |
Scheduling algorithm	| weighted round robin, weighted least connection number and source IP	 | weighted round robin, weighted least connection number and source IP
SSL detaching and certificate management |	—— |	✔ |
Idle connection timeout |	—— |	✔ |
Health check for service instance | ✔ | ✔ |
Source IP reservation	| three-layer packet source IP reservation |	HTTP header-based X-forward-for pass-through
Session persistence	| TCP-based session persistence |	Cookie-based session persistence |
Connection draining timeout (registration cancellation timeout) |	✔	| —— |
Backend service Type |	 VM/ container/ availability group	| VM/ container/ availability group |
Load balancer for multiple ends in the same instance | ✔	| ✔ |
Internet and extranet load balancer switch	 | ✔ |	✔ |
Deletion protection | ✔ | ✔ |
Billing standard	 | relatively low rate (free during public beta) |	 relatively high rate (free during public beta)|

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

Network load balancer supports the traffic-based billing type For details, please refer to “[Billing Instructions](../Pricing/Billing-Overview.md)”.
