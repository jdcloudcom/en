# Core Concepts
See the following for the concepts and their interpretations used in the DNLB Help Documentation.

| Noun/Concept | Interpretations |
| :- | :- |
| Distributed Network Load Balancer Instance | The logic entity of Load Balancer produced by JD Cloud & AI is used for providing distributed, four-layer, stateless Load Balancer services|
| VIP | The system is the service IP Address assigned by Load Balancer. When it is Intranet Load Balancer, this IP is the business access entrance IP; when it is Internet Load Balancer, you need to associate elastic IP with VIP and the elastic IP is the business access entrance IP|
| Listener | Listening requires business request of Load Balancer by matching protocol or port numbers, etc.|
| Backend Service | Defines the access traffic from Load Balancer to backend server for forwarding protocol, scheduling algorithm, policy, etc.|
| Virtual Server Group |A set of instances processing business requests distributed by Load Balancer, including Virtual Machines and Native Container|
|Availability Group|A set of VM Instances processing business requests distributed by Load Balancer and the instances in the Group can implement auto elastic expansion according to business loads|
| Health Check | Load Balancer will periodically and automatically detect availability of backend server and will not distribute business requests to the backend server that is abnormal in the detection until such server is restored|
| Region | JD Cloud & AI's data centers are distributed in multiple locations around the world. These locations are called regions. JD Cloud & AI is completely isolated from different regions, ensuring maximum stability and fault tolerance between different regions. Users are advised to choose the region closest to you or your customers to reduce access latency and increase download speed. <br /> **Note**: Intranets in different regions are not connected to each other|
| Availability Zone | Availability Zone is a physical region where power, network and other infrastructures are independent of each other. One region contains one or multiple Availability Zones that can connect with each other if they are in the same region. Availability Zones provide disaster tolerance functions at the same region and across data centers. Distributed Network Load Balancer is deployed in all AZs|
| Virtual Private Cloud (VPC) | A logically isolated network space customized by users on JD Cloud & AI. This private network space is fully controlled by users and supports custom network segmentation and routing policies. Users can create and manage multiple cloud products in the VPC, such as Virtual Machines, load balancer, etc., and configure resources within the network to connect to the Internet |
| Subnet | A subnet is an IP address block within the IP address range of VPC. Cloud resources in the current VPC (e.g. Virtual Machines, container, Load Balancer, etc.) are deployed in Subnet|


## Related References

- [Product Overview](../Introduction/Product-Overview.md)
- [Product Specifications](../Introduction/Specifications.md)
- [Product Pricing](../Pricing/Billing-Overview.md)
- [Create DNLB Instance](../Getting-Started/Create-Instance.md)

