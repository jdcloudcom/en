# Benefits

## Super High Performance
It adopts the all AZs distributed deployment architecture. There isn’t any Load Balancer entity. There is no case where the Load Balancer resource performance reaches the cap and the forwarding is restricted. The forwarding performance has no bottleneck.
## Free in Long Term
It adopts the free in long term policy, enabling the user to enjoy very-high performance experience while not considering the cost of Load Balancer and significantly reducing the service use cost.
## High Service Availability
The high availability of services reflects in the following aspects:

* DNLB Redundancy: DNLB has no entity and eliminates the service unavailable caused by single point failure of Load Balancer entity via the function that the network device in the region hosts the Load Balancer.

* All AZs Deployment: DNLB is deployed with all AZs. When an Availability Zone fails, the traffic will be automatically forwarded to other Availability Zones to guarantee that the Load Balancer business in the Availability Zone level will not be interrupted.

* Backend Server High Availability: As a backend server group, the virtual server group can be combined with Auto Scaling for use so as to realize auto expansion and shrinkage of Virtual Machines across Availability Zones; as a backend server group, the Availability Group supports the multi-dimensional high availability deployment of backend server across racks and across Availability Zones in the same data center. Both of the deployment methods eliminate the service unavailable caused by single point failure to the backend server.
 
## Decouple the Load Balancer service and the Session persistence to implement deployment of higher performance and more flexibility
Most of the user’s businesses are currently stateless, so the use of Distributed Network Load Balancer has a higher performance cost ratio. When the user's backend server is stable, the requirements of session persistence for unchanged business Source IP can be satisfied by configuring the scheduling policy of weighted Source IP; connect the backend server of the Distributed Network Load Balancer to cache (e.g.: Redis, MongoDB, etc.), so the Load Balancer is only responsible for distributing the business to the backend server and the cache connected to the backend server will save the session Information; it can also implement session persistence by this way.
## Rich Backend Server Types
The Virtual Machines and the container can be deployed to be backend server to provide corresponding services. The backend servers of Virtual Machines and container types can be separately or simultaneously deployed.
## Source IP Address Pass-through
DNLB can completely pass through the Source IP Address of the user, which is convenient for the server to obtain or count the real Source IP Address.
## Flexible Switching Between Intranet and Internet Services
Users can simply associate and disassociate the Elastic IP for DNLB to implement DNLB and support flexible switching between Intranet and Internet services.
## Security Guarantee
JD Cloud & AI provides the DDoS protection based on Public IP and the subnet level protection based on ACL to secure the business.
## Simple and Easy to Use
You can complete the creation of DNLB instances and related functional components in several minutes, quickly input them in business applications and shorten the workload wait time through JD Cloud & AI Console and simple API calling.
## Related References

- [Product Overview](../Introduction/Product-Overview.md)
- [Product Specifications](../Introduction/Specifications.md)
- [Product Pricing](../Pricing/Billing-Overview.md)
- [Create DNLB Instance](../Operation-Guide/Create-DNLB-Instance.md)
- [Create virtual server group](../Operation-Guide/TargetGroup-Management.md)
- [Configure listening policy](../Operation-Guide/Listener-Management.md)
- [Manage rear end service and view health status of service instance](../Operation-Guide/Backend-Management.md)
