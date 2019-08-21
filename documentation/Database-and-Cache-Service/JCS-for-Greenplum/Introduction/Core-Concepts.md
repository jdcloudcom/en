# Core Concepts

Refer to the following for the concepts and their interpretations used in the data repository help documentation.

| Concept            | Interpretation                                                         |
| :-------------- | :----------------------------------------------------------- |
| Region            | JD Cloud's data centers are distributed in multiple locations around the world. These locations are called regions. JD Cloud is completely isolated from different regions, ensuring maximum stability and fault tolerance between different regions. Users are advised to choose the region closest to you or your customers to reduce access latency and increase download speed. **Note**: The intranets in different regions are not connected to each other. |
| Availability Zone          | Availability Zone is a physical region where power, network and other infrastructures are independent of each other. A region contains one or more availability zones, and multiple availability zones in the same region can be connected to each other. |
| Virtual Private Cloud (VPC) | A logically isolated network space customized by users on JD Cloud. This private network space is fully controlled by users and supports custom network segmentation and routing policies. Users can create and manage multiple cloud products in the VPC, such as virtual machine, load balancer, etc., and configure resources within the network to connect to the Internet. |
| Subnet            | A subnet is an IP address block within the IP address range of the Virtual Private Cloud (VPC). The subnet is under the VPC. After creating a VPC, users can add subnets under the VPC. IP address blocks of subnets under the same VPC cannot overlap, and IP address blocks of subnets under different VPCs can overlap. |
| Master          | Master is the entry of the Greenplum database system and the database node where users connect and submit SQL statements. |
| Segment         | Segment is used to store and process data. Through the network layer of the Greenplum database, Segments interconnect to each other and communicate with the primary station. |
| Node Specification        | The node specification refers to the CPU core count, memory capacity and disk capacity assigned for each Segment Host of instances. |
| Node Count        | The node count means the Segment Host count.                               |

