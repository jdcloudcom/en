# Core Concepts
Please refer to the following the concepts and explanations used in the help documentation of JD MapReduce.

| Concept | Explanation |
| :- | :- |
| Region | JD Cloud's computer room is distributed in multiple locations around the world. These locations are called geographies. JD Cloud is completely isolated from different regions, ensuring maximum stability and fault tolerance between different regions. Users are advised to choose the region closest to you or your customers to reduce access latency and increase download speed. <br /> **Note** : The intranets in different regions are not connected to each other. |
| Availability Zone | An availability zone is a physical zone in which the infrastructure such as electricity and networks are independent of each other. A zone contains one or more availability zones, and multiple availability zones in the same zone can be connected to each other.  |
| JD MapReduce Version | Different JD MapReduce versions correspond to component versions and component content. Users can choose the appropriate version according to their business needs.  |
|High Availability | High availability is enabled. The cluster will have two masters: Active Namenode and Standby Namenode: two Namenodes form a mutual standby, one is in the Active state and is the primary Namenode, and the other is in the Standby state. Only the primary Namenode can provide read and write services. Without high availability, the cluster has a Master by default.  |
| Node Specifications | JD Cloud provides the following instance types, general-purpose: general shared, general standard, compute optimized: compute-optimized standard, memory optimized: memory-optimized standard. |





