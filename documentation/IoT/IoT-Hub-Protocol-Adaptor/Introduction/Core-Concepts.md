# Core Concepts
See the following for the concepts and their interpretations used in the IoT Hub Protocol Adaptor Service Help Documentation.

| Concept | Interpretation |
| :- | :- |
| Region | JD Cloud's data centers are distributed in multiple locations around the world. These locations are called regions. JD Cloud is completely isolated from different regions, ensuring maximum stability and fault tolerance between different regions. Users are advised to choose the region closest to you or your customers to reduce access latency and increase download speed. <br />**Note**: The intranets in different regions are not connected to each other.|
| Availability Zone | Availability Zone is a physical region where power, network and other infrastructures are independent of each other. A region contains one or more availability zones, and multiple availability zones in the same region can be connected to each other. |
| Virtual Private Cloud (VPC) | A logically isolated network space customized by users on JD Cloud. This private network space is fully controlled by users and supports custom network segmentation and routing policies. Users can create and manage multiple cloud products in the VPC, such as virtual machine, load balancer, etc., and configure resources within the network to connect to the Internet. |
| Subnet | A subnet is an IP address block within the IP address range of the Virtual Private Cloud (VPC). The subnet is under the VPC. After creating a VPC, users can add subnets under the VPC. IP address blocks of subnets under the same VPC cannot overlap, and IP address blocks of subnets under different VPCs can overlap. |
| IoT Hub Protocol Adaptor Service Instance | IoT Hub Protocol Adaptor Service instance (“instance” for short) is the basic unit of the IoT Hub Protocol Adaptor Service purchased by a user. Users should make instances independent from one another and resources isolated, when creating the instances.| 
| JTT 808 Protocol | JT/T 808-2011 GNSS System for Operational Vehicles — General Specifications for Vehicle Terminal Communication Protocol and Data Format is the standard protocol of the Ministry of Communications. JTT 808 protocol support is built in the IoT Hub Protocol Adaptor Service.|


## Related References

- [Product Overview](../Introduction/Product-Overview.md)
- [Create instance](../Getting-Started/Create-Instance.md)
