# Terminology

See the following terminologies and their explanations used in DRDS help documentation for reference.

| Terminology | Interpretation|
|---|---|
| Region | JD Cloud's machine room is distributed in multiple locations around the world. These locations are called regions. JD Cloud is completely isolated from different regions, ensuring maximum stability and fault tolerance between different regions. We recommend that users should select the region nearby them or their customers, which can reduce the access latency and improve downloading speed<br>Note: availability zones in the Intranet of different regions are not connected|
| Availability Zone | Availability Zone is a physical region where power, network, and other infrastructure are independent of each other. One region contains one or multiple availability zones that can connect with each other if they are in the same region.
|Multiple availability zones deployment|It can tolerate faults at machine room level. However, there is a certain network latency between availability zones, so the responsive time of single update for deployment of multiple availability zones is longer than that of single availability zone|
|Virtual Private Cloud (VPC)|A logically isolated network space customized by users on JD Public Cloud. This virtual private cloud space is fully controlled by users and supports customized network segmentation and routing policies. Users can create and manage multiple cloud products in the VPC, such as virtual machine, load balancer, etc., and configure resources within the network to connect to the Internet. |
| Subnet | A subnet is an IP address block within the IP address range of the virtual private cloud (VPC) to which it belongs. The subnet is under the VPC. After creating a VPC, users can add subnets under the VPC. IP address blocks of subnets under the same VPC cannot overlap, and IP address blocks of subnets under different VPCs can overlap. |
