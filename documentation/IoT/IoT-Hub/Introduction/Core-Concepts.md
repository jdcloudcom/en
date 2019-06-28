# Core Concepts
See the following for the concepts and their interpretations used in the IoT Hub help documentation.

| Concept | Interpretation |
| :- | :- |
| Region | JD Cloud's data centers are distributed in multiple locations around the world. These locations are called regions. JD Cloud is completely isolated from different regions, ensuring maximum stability and fault tolerance between different regions. Users are advised to choose the region closest to you or your customers to reduce access latency and increase download speed. **Note**: The intranets in different regions are not connected to each other.|
| Availability Zone | Availability Zone is a physical region where power, network and other infrastructures are independent of each other. A region contains one or more availability zones, and multiple availability zones in the same region can be connected to each other. |
| Virtual Private Cloud (VPC) | A logically isolated network space customized by users on JD Cloud. This private network space is fully controlled by users and supports custom network segmentation and routing policies. Users can create and manage multiple cloud products in the VPC, such as virtual machine, load balancer, etc., and configure resources within the network to connect to the Internet. |
| Subnet | A subnet is an IP address block within the IP address range of the Virtual Private Cloud (VPC). The subnet is under the VPC. After creating a VPC, users can add subnets under the VPC. IP address blocks of subnets under the same VPC cannot overlap, and IP address blocks of subnets under different VPCs can overlap. |
| Instances of IoT Hub | The instances of IoT Hub is called "instance" for short, and they are the basic unit of the IoT Hub bought by the user. Users should make instances independent from one another and resources isolated, when creating the instances.| 
| MQTT | Message Queuing Telemetry Transport. The message protocol based on the release/subscription model under the ISO standard (ISO/IEC PRF 20922). It works on the TCP/IP protocol family, as an release/subscription message protocol designed for remote device of low hardware performance and poor network conditions. |
| TSL | The functional descriptions of devices on cloud include the device telemetry data attribute, device status attribute and device control instruction of the devices etc. TSL is described with JSON format. |
| TSL – Device Telemetry Data | The packet streaming data of device uplink is an observation value describing objective facts, which cannot be modified by the Cloud Service or other applications. |
| TSL – Device Control Instruction | The control instructions of devices actively called by the Cloud Service or other applications or triggered by a rule in the rule engine will not modify the device status attribute. For example, the message broadcast instruction of all devices. |
| Device Twins | Device telemetry data and device status attribute data are included. Through such two types of data, a time node can be specified to completely describe the device by digital methods. It is the digital twins of the device. For example, at 10:00 on January 1, the current device is started up; the packet transmission frequency of the device is 5 seconds/time and the current ambient temporary is 5℃. (It is under the status of starting up; the packet transmission frequency is the device status attribute data; the ambient temporary is the device telemetry data) |
| Rule Engine | Pre-process the device data received by IoT Hub and can send the processed data to JD Cloud's other services, such as RDS, JCQ and ES. |

## Related References

- [Product Overview](../Introduction/Product-Overview.md)
- [Price Overview](../Pricing/Price-Overview.md)
- [Create instance](../Getting-Started/Create-Instance.md)
