# Core Concepts
The following terminologies and their interpretation are used in the help documentation of JD Cloud Block Chain Data Service.

| Terminology        | Interpretation                                                         |
| --------------- | ------------------------------------------------------------ |
| Region            | Region is a collection of infrastructure services within a scope located at a close geographic position. Cloud service products in the same region can connect to each other through the internal low latency network. Businesses in different regions are independent from each other and generally connected to each other by public network. PS: The intranet in different regions are not connected |
| Availability Zone          | Availability zone is a physical region where power and network are independent of each other. In the same region, instances in the same availability zone have less network delay than instances in different availability zone. Different availability zones in the same region provide an environment for intranet to connect to each other while there is fault isolation between availability zones |
| Virtual Private Cloud (VPC) | A logically isolated network customized by users on JD Cloud. This VPC space is fully controlled by users and supports customized network segmentation and routing policies. Users can create and manage multiple cloud products in the VPC, such as Virtual Machine, and load balancer, and configure resources in the private network to connect to the Internet |
| Subnet | The CIDR of subnet is within the IP address range of the Virtual Private Cloud (VPC). After creating a VPC, users can add subnets under the VPC. The CIDR of subnets under the same VPC cannot overlap, and the CIDR of subnets under different VPCs can overlap |
|Database|A logical unit created under an instance. An instance can create several databases and these databases name are unique in the instance|
|Account|A logical unit created under an instance. An instance can create several accounts and these accounts name are unique in the instance|
|Instance|A database service process separately occupy CPU and Memory resources, by which user can create database service of different specification, disk space and type as required|
| Data Source          |A Block Chain data type needs to be synchronized. We only provide BTC and ETH currently and will provide more in the future|
