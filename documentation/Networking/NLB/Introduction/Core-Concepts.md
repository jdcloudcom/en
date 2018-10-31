# Noun/Concept
See the following for the noun concepts and their interpretations used in the network load balancer (NLB) help documents.

# | Noun/Concept | Interpretation |
| :- | :- |
| Network Load Balancer (NLB) | Four-layer load balancer products provided by JD Cloud, provide TCP-based traffic listening and forwarding services |
| Load Balancer Instance | Resource instance of operation load balancer service |
| VIP | The private IP address allocated to the load balancer instance shall be the internal load balancer business access IP; if external load balancer is adopted, the EIP will be associated with the VIP, and the EIP is used as the business access IP |
| Listener | Define the protocol type (such as TCP) and port number (such as 80) for load balancer internal and external access |
|Backend Service| defines the access traffic from load balancer to backend service for forwarding protocol, algorithm, policy, etc.|
|Virtual Server Group| A group of virtual machine and container instances processing forwarding request of load balancer traffic |
|Scheduling Algorithm | The scheduling policy used for forwarding traffic from the load balancer to several backend servers is used in combination with the weights, so as to more flexibly and reasonably realize load sharing |
| Session Persistence | Also called as Sticky Sessions or Session affinity. Session persistence means a functional mechanism on the load balancer, which distributes data while guaranteeing that relevant access requests from the same client can be allocated to the same server |
| Connection Draining | Connection draining is a way for load balancer registration instances to gracefully exit the service. When a backend instance (virtual machine or container) is unregistered from the backend service, load balancer stops sending new connection requests to the exiting instance and maintains the connected service status until the connection draining timer expires |
| Idle Connection Timeout | During HTTP, HTTPS, TCP business distribution process, the load balancer will maintain two connections for each request sent by the client via the load balancer, including one connection to the client and the other one to the backend server. For managing idle connection timeout of each connection, when there are no data sent or received via the connections in the defined idle timeout period, the load balancer will shut down the two connections |
| Health Check | The load balancer will periodically and automatically detect availability of backend server, judge instances with exception, distribute business requests which are not distributed now to the instance and forward the same until the instance is recovered |
| Idle Connection Timeout | In the TCP business distribution process, the network load balancer manages the idle timeout for each request connection sent by the client through the load balancer. When there are no data sent or received via the connections in the defined idle timeout period, the load balancer will shut down the TCP connections |
| Region | JD Cloud's machine room is distributed in multiple locations around the world. These locations are called regions. JD Cloud is completely isolated from different regions, ensuring maximum stability and fault tolerance between different regions. Users are advised to choose the region closest to you or your customers to reduce access latency and increase download speed. <br />**Note**: The intranets in different regions are not connected to each other. |
| Availability Zone | Availability Zone is a physical region where power, network, and other infrastructure are independent of each other. A region contains one or more availability zones, and multiple availability zones in the same region can be connected to each other. The availability zone provides the disaster tolerance function across the machine room of different regions. The load balancer instance can be created under different availability zones to ensure load balancer’s high availability services |
| Virtual Private Cloud (VPC) | A logically isolated network space customized by users on JD Cloud. This private network space is fully controlled by users and supports custom network segmentation and routing policies. Users can create and manage multiple cloud products in the VPC, such as virtual machine, load balancer, etc., and configure resources within the network to connect to the Internet |
| Subnet | A subnet is an IP address block within the IP address range of the virtual private cloud (VPC) to which it belongs. The subnet is under the VPC. After creating a VPC, users can add subnets under the VPC. IP address blocks of subnets under the same VPC cannot overlap, and IP address blocks of subnets under different VPCs can overlap. |


## Relevant References

- [Product overview](../Introduction/Overview.md)
- [Product specification](../Introduction/Specification.md)
- [Price overview](../Pricing/Price-Overview.md)
- [Create Instance](../Getting-Started/Create-Instance.md) for specific actions.
