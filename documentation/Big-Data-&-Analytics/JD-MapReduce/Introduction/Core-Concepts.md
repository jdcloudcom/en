# Core Concepts
Please refer to the following the concepts and explanations used in the help documentation of JD MapReduce.

| Concept | Explanation |
| :- | :- |
| Region | JD Cloud's computer room is distributed in multiple locations around the world. These locations are called geographies. JD Cloud is completely isolated from different regions, ensuring maximum stability and fault tolerance between different regions. Users are advised to choose the region closest to you or your customers to reduce access latency and increase download speed. <br /> ** Note **: The intranets in different regions are not connected to each other. |
Availability Zone | An Availability Zone is a physical zone in which the infrastructure such as electricity and networks are independent of each other. A zone contains one or more Availability Zones, and multiple Availability Zones in the same zone can be connected to each other.  |
| JD MapReduce version | Different JD MapReduce versions correspond to component versions and component content. Users can choose the appropriate version according to their business needs.  |
High Availability | High availability is enabled. The cluster will have two masters: Active Namenode and Standby Namenode: two Namenodes form a mutual standby, one is in the Active state and is the primary Namenode, and the other is in the Standby state. Only the primary Namenode can provide read and write services. Without high availability, the cluster has a Master by default.  |
| Node Specifications | JD Cloud provides the following instance types, general-purpose: general shared, general standard, compute optimized: compute-optimized standard, memory optimized: memory-optimized standard. |
| Virtual Private Cloud (VPC) | A MongoDB instance, referred to as an "instance", is the basic unit for users to purchase MongoDB services. JD Cloud currently provides MongoDB instances in 3-node replica set mode by default. Each instance contains 3 physical nodes with roles of Primary, Secondary, and Hidden. | 
| Security Group | An instance specification refers to the number of CPU cores, memory capacity, maximum connections, and maximum IOPS that each node of an instance is assigned.  |
| Object Storage Service | The upper limit of computing power that each node of an instance can use. One CPU has the computing power of at least 2.3GHz Hyper-Threading (Intel Xeon Series Hyper-Threading). |
| Network ACL | The amount of memory allocated to each node of the instance.  |
| Capacity | TCP connection between the client and the MongoDB instance. If the client uses a connection pool, the connection between the client and the MongoDB instance is a long connection, and vice versa. |
| Execution History | The upper limit of block device read and write operations per second in 4KB units. |
| Remote Connect | The disk capacity allocated to each node of the instance. |
| Configure Job | The disk capacity allocated to each node of the instance. |
| Deploy Job | The disk capacity allocated to each node of the instance. |


