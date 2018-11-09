# Features

## Physical Dispersion across Availability Zones and Fault Domains

**Availability Zone** (AZ) is a data center located in different locations within a single region, with independent network, power supply, heat dissipation and physical security, and interconnected through the internal low-latency, high-bandwidth network of JD Cloud. At present, there are two Availability Zones in JD Cloud cn-north-1 and cn-east-2, the second Availability Zone of cn-south-1 is under construction and will be delivered for use. Deployment across Availability Zones improves the overall disaster tolerance of the system. When one Availability Zone fails, the resource of another Availability Zone can still serve normally (at least one instance per Availability Zone).

**Fault Domain** (FD) refers to the maximum impact of a single point of failure caused by a network switch or power equipment failure in a single computer room, which can be understood as a rack or a set of racks. Host computers in different FD are connected to different network switches and PDU to ensure physical fault isolation between FD. If one FD has a network problem, internal instances in other FD can still be served until the network resumes access (at least two FDs have instances, that is, there are at least two instances).

Availability Groups support configuring single or multiple Availability Zones, and it is recommended to configure multiple Availability Groups for higher business availability. The Availability Group corresponds to at least 5 fault domains (FD1-5) in a single Availability Zone. If an Availability Group configures multiple Availability Zones, the instances in the Availability Group are looped over multiple Availability Zones, and the instances belonging to the same Availability Zone are evenly distributed over 5 fault domains.

For example, an Availability Group with Availability Zone A and Availability Zone B is created in cn-north-1. When 15 new instances are created into the Availability Group, the first instance is located in the first Availability Zone. For example, FD1 of Availability Zone A, FD1 of Availability Zone B for the second instance, FD2 of Available Zone A for the third instance...as shown in the following figure.

![](../../../../image/ag/function.png)

If the Availability Group needs to be added with 1 instance, the 16 instance will be located in the FD3 of the Availability Zone B.

## Auto-scaling based on business load

Physical decentralization across availability zone and Fault Domain ensures that services deployed with Availability Groups can still function normally in the face of unpredictable failures. In addition, the number of instances in the Availability Group can be automatically adjusted by turning on the auto-scaling function of the Availability Group to cope with the fluctuation of the business load. For business peaks, automatic scaling strategy can be set to ensure business service capacity, and for business troughs, automatic scaling strategy can be set to save costs.

**Alarm Strategy** is an automatic scaling strategy based on monitoring metrics (such as CPU, memory utilization) for scenarios where business load fluctuations cannot be predicted.

**Timing Strategy** is an automated scaling strategy that is executed after the predetermined time, and is suitable for scenarios where business load fluctuations can be predicted, such as 618 promotion.

