# Core Concepts
Please refer to the following the concepts and explanations used in the help documentation of  JCS for MongoDB.

| Concept | Explanation |
| :- | :- |
| Region | JD Cloud's computer room is distributed in multiple locations around the world. These locations are called geographies. JD Cloud is completely isolated from different regions, ensuring maximum stability and fault tolerance between different regions. Users are advised to choose the region closest to you or your customers to reduce access latency and increase download speed. <br /> **Note**: The intranets in different regions are not connected to each other. |
Availability Zone | An Availability Zone is a physical zone in which the infrastructure such as electricity and networks are independent of each other. A zone contains one or more Availability Zones, and multiple Availability Zones in the same zone can be connected to each other.  |
| Virtual Private Cloud (VPC) | A logically isolated network space customized by users on JD Cloud. This virtual private cloud space is fully controlled by users and supports customized network segmentation, routing policies, etc. Users can create and manage multiple cloud products in the VPC, such as Virtual Machines, Load Balancer, etc., and configure resources within the network to connect to the Internet.  |
| Subnet | A subnet is an IP address block within the IP address range of the Virtual Private Cloud (VPC). The subnet is under the VPC. After creating a VPC, users can add subnets under the VPC. IP address blocks of subnets under the same VPC cannot overlap, and IP address blocks of subnets under different VPCs can overlap.  |
| Replica Sets | MongoDB replica sets are a set of mongoDB processes that maintain the same data set. The replica sets provide redundancy and high availability, which is the foundation for all production deployments. |
| MongoDB Instance | MongoDB Instance, or "Instance", is the basic unit for users to purchase MongoDB services. JD Cloud currently provides MongoDB instances in 3-node replica set mode by default. Each instance contains 3 physical nodes with roles of Primary, Secondary, and Hidden. | 
| Instance Specifications | Instance specifications refer to the number of CPU cores, memory capacity, maximum connections, and maximum IOPS that each node of the instance is assigned.  |
| CPU Core | The upper limit of the computing power that each node of the instance can use. One CPU has the computing power of at least 2.3GHz Hyper-Threading (Intel Xeon Series Hyper-Threading). |
| Memory | The amount of memory allocated to each node of the instance.  |
| Connections | A TCP connection between a client and a MongoDB instance. If the client uses a connection pool, the connection between the client and the MongoDB instance is a long connection. If not, it is a short connection. |
| IOPS | The maximum number of block device reading and writing operations per second in 4KB. |
| Storage Space | The disk capacity allocated to each node of the instance. |

## Related Reference

- [Product Overview](../Introduction/What-Is-MongoDB.md)
- [Specifications](../Product-Introduction/Specification.md)
- [Price Overview](../Pricing/Price-Overview.md)
- [Create Instance](../Getting-Started/Create-Instance.md)
