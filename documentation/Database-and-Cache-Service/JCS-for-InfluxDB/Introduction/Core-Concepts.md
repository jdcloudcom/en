# Core Concepts

See the following for the concepts and their interpretations used in the Help Documentation of Time Series Database (TSDS).

| Concept            | Interpretation                                                         |
| --------------- | ------------------------------------------------------------ |
| Region            | JD Cloud's data centers are distributed in multiple locations around the world. These locations are called regions. JD Cloud is completely isolated from different regions, ensuring maximum stability and fault tolerance between different regions. Users are advised to choose the region closest to you or your customers to reduce access latency and increase download speed. <br/>**Note**: The intranets in different regions are not interconnected. |
| Availability Zone          | Availability Zone is a physical region where power, network and other infrastructures are independent of each other. A region contains one or more availability zones, and multiple availability zones in the same region can be connected to each other. |
| Virtual Private Cloud (VPC) | A logically isolated network space customized by users on JD Cloud. This private network space is fully controlled by users and supports custom network segmentation and routing policies. Users can create and manage multiple cloud products in the VPC, such as virtual machine, load balancer, etc., and configure resources within the network to connect to the Internet. |
| Subnet            | A subnet is an IP address block within the IP address range of the Virtual Private Cloud (VPC). The subnet is under the VPC. After creating a VPC, users can add subnets under the VPC. IP address blocks of subnets under the same VPC cannot overlap, and IP address blocks of subnets under different VPCs can overlap. |
| InfluxDB Instance | InfluxDB instance refers to "Instance" and is the basic unit of the InfluxDB service purchased by a user. |
| Instance Type        | The Instance Type refers to CPU core number, memory capacity, maximum connections and maximum IOPS distributed to each node of instance. |
| CPU Core           | Refer to the computing power cap applicable to each instance node. One CPU has the computing power of 2.3GHz hyper-threading (Intel Xeon Series Hyper-Threading) at least. |
| Memory            | Refer to the memory capacity assigned to each instance node.                             |
| IOPS            | Write and read operation cap per second for block device at the unit of 4KB.              |
| Connections          | TCP connections between the client and the InfluxDB instance. If a connection pool is adopted at the client, the connection between the client and the InfluxDB instance is the long connection. Otherwise, it is a short one. |
| Bucket        | Refer to the disk capacity assigned to each instance node.                             |

