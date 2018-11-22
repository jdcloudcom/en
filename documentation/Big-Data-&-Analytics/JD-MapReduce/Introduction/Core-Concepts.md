# Core Concepts
Please refer to the following the concepts and explanations used in the help documentation of JD MapReduce.

| Concept | Explanation |
| :- | :- |
| Region | JD Cloud's computer room is distributed in multiple locations around the world. These locations are called geographies. JD Cloud is completely isolated from different regions, ensuring maximum stability and fault tolerance between different regions. Users are advised to choose the region closest to you or your customers to reduce access latency and increase download speed. <br /> **Note** : The intranets in different regions are not connected to each other. |
| Availability Zone | An availability zone is a physical zone in which the infrastructure such as electricity and networks are independent of each other. A zone contains one or more availability zones, and multiple availability zones in the same zone can be connected to each other.  |
| JD MapReduce Version | Different JD MapReduce versions correspond to component versions and component content. Users can choose the appropriate version according to their business needs.  |
|High Availability | High availability is enabled. The cluster will have two masters: Active Namenode and Standby Namenode: two Namenodes form a mutual standby, one is in the Active state and is the primary Namenode, and the other is in the Standby state. Only the primary Namenode can provide read and write services. Without high availability, the cluster has a Master by default.  |
| Node Specifications | JD Cloud provides the following instance types, general-purpose: general shared, general standard, compute optimized: compute-optimized standard, memory optimized: memory-optimized standard. |
| Virtual Private Cloud|The Virtual Private Cloud (VPC) of JD Cloud is a logically isolated network space customized on JD Public Cloud, which is similar to a traditional network set up in the data center. This virtual private cloud space is fully controlled by users and supports customized network segmentation, routing policies, etc. Users can create and manage multiple cloud products in the VPC, such as virtual machine, load balancer, etc., and configure resources within the network to connect to the Internet. In addition, you may create the IDC intranet and JD Cloud network via VPN/direct connect, realize multicloud deployment of applications and migrate applications successfully to the cloud.|
| ACL  | A stateless optional security layer in the subnet level is used for controlling the data stream coming into and out from the subnet, which can be correct to the protocol and port size and be used for controlling the traffic coming into and out of one or more subnets as the firewall. Without the Network ACL protection or Identity and Access Management policy, all network ports of servers in the subnet will be more likely to be attacked and even invaded on the Internet. The Network ACL can be used for filtering the east-west access traffic across the subnets or north-east access traffic coming into and out of the Internet. Subnets with the same network traffic control can be associated with the same Network ACL. By setting inbound and outbound permission rules, the traffic coming into and out of the subnet can be precisely controlled. |





