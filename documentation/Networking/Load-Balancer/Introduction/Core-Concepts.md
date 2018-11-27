# Core concept
The following concepts and interpretations used in the **Application Load Balancer** help document are listed for reference.

| Concept | Interpretation |
| :- | :- |
| Application Load Balancer | Business access Application Load Balancer service provides the 4-layer-based (TCP, TLS) and 7-layer-based (HTTP and HTTPS) traffic listening and forwarding service|
| Application Load Balancer instance | Resource instance of operation Application Load Balancer service |
| VIP | Private IP address distributed to Application Load Balancer instance by system |
|Listener| defines the access traffic from Application Load Balancer to backend service for forwarding protocol, algorithm, policy, etc. |
|Backend service| defines the access traffic from Application Load Balancer to backend service for forwarding protocol, algorithm, policy, etc.|
|Virtual server group| A group of virtual machine and container instances processing forwarding request of Application Load Balancer traffic|
|Multiple availability zone |Thanks to the disaster tolerance function of multiple availability zones across machine room, the Application Load Balancer instance can be created under different availability zones|
|High availability group|A group of virtual machine instances, with auto scaling function depending on business load conditions, being associated to Application Load Balancer backend|
|Security group|A distributed and stateful virtual firewall with package filtering function, used to realize the network identity and access management to Application Load Balancer|
|Scheduling algorithm|The scheduling policy used for forwarding traffic from the Application Load Balancer to several backend servers is used in combination with the weights, so as to more flexible and reasonably realize load sharing |
|Session persistence| Also called as sticky sessions or session affinity. Session persistence refers to a functional mechanism of the Application Load Balancer, which distributes data while guaranteeing that relevant access requests from the same client can be distributed to the same server |
|Idle connection timeout| During http, https, tcp and tls business distribution process, the Application Load Balancer will maintain two connections for each request sent by the client via the Application Load Balancer, including one connection to the client and the other one to the backend server. For managing idle connection timeout of each connection, when there are no data sent or received via the connections in the defined idle timeout period, the Application Load Balancer will shut down the two connections |
|Source IP pass-through|	A function pass through client IP to backend server, requiring corresponding configuration on the backend server in some cases|
|HTTP header field|	Information is passed through to the backend server via the HTTP header field when defining 7-layer listening|
|Health check| The Application Load Balancer will periodically and automatically detect availability of backend server, judge instances with exception, distribute business requests which are not distributed now to the instance and forward the same until the instance is recovered |

## Relevant references

- [Product overview](../Introduction/Product-Overview.md)
- [Product specification](../Introduction/Specification.md)
- [Price overview](../Pricing/Price-Overview.md)
- [Create instance](../Getting-Started/Create-Instance.md)
