# Core Concepts
See the following for the concepts and their interpretations used in the IoT Core Help Documentation.

| Concept | Interpretation |
| :- | :- |
| Region | JD Cloud's data centers are distributed in multiple locations around the world. These locations are called regions. JD Cloud is completely isolated from different regions, ensuring maximum stability and fault tolerance between different regions. Users are advised to choose the region closest to you or your customers to reduce access latency and increase download speed. **Note**: The Intranets in different regions are not interconnected.|
| Availability Zone | Availability Zone is a physical region where power, network and other infrastructures are independent of each other. A region contains one or more availability zones, and multiple availability zones in the same region can be connected to each other. |
| Virtual Private Cloud (VPC) | A logically isolated network space customized by users on JD Cloud. This private network space is fully controlled by users and supports custom network segmentation and routing policies. Users can create and manage multiple cloud products in the VPC, such as Virtual Machines, load balancer, etc., and configure resources within the network to connect to the Internet. |
| Subnet | A subnet is an IP address block within the IP address range of the Virtual Private Cloud (VPC). The subnet is under the VPC. After creating a VPC, users can add subnets under the VPC. IP address blocks of subnets under the same VPC cannot overlap, and IP address blocks of subnets under different VPCs can overlap. |
| IoT Core Instance | IoT Core Instance, hereinafter referred to as instance, is the basic unit when a user purchases the IoT Core. Users should make instances independent from one another and resources isolated, when creating the instances.|
| Thing Type | Attribute set of a device type, used for defining a group of devices with the same functions/attributes.|
| Device | Refer to a specific product under a product. IoT Core will issue a unique Identifier for each device. |
| Indirectly Connected Device | Child device connected to IoT Core via a gateway. |
| MQTT | Message Queuing Telemetry Transport. The message protocol based on the release/subscription model under the ISO standard (ISO/IEC PRF 20922). It works on the TCP/IP protocol family, as a release/subscription message protocol designed for remote device of low hardware performance and poor network conditions. |
| Thing Type | A thing of specific type, e.g., function description on cloud of an air conditioner (model: 001) from a manufacturer; three thing types are provided, including directly connected device, connection proxy device and indirectly connected device |
| Thing Model | Specific function description of one thing type device on cloud, including remote device telemetering attribute, device status attribute, device control command, etc. Thing Model adopts the description in the format of JSON. |
| Thing Model – Device Telemetry Data | The packet streaming data of device uplink is an observation value describing objective facts, which cannot be modified by the Cloud Service or other applications. |
| Thing Model – Device Control Instruction | The control instructions of devices actively called by the Cloud Service or other applications or triggered by a rule in the rule engine will not modify the device status attribute. For example, the message broadcast instruction of all devices. |
| Device Shadow | Comprise device status attribute data and save current status information of the device. Each device shall have a corresponding device shadow in cloud. |
| Rule Engine | Pre-process the device data received by IoT Core and can send the processed data to JD Cloud's other services, such as RDS, JCQ and ES. |
| Expected Attribute Value | With the expected attribute value function, you can set the desirable device attribute value. If a device is on-line, the attribute value will be updated in real time. If it is off-line, the expected attribute value will be cached on the cloud. When the device is on-line, the expected attribute value will be gotten and updated. |
| Attribute | Describe the real attribute and status of things. It is divided into two attributes of read-only attribute and read-write attribute, and supports reading and setting (Read-write Attribute). |
| Service | A series of instructions and methods that can be called by the external (IoT Core/Application). Compared with attribute setting, a service can provide more complex business logics. For example, execute a task. |
| Event | It refers to the information reported by the thing itself, including many messages that need to be perceived and processed in time, such as warning information and fault information. |
| Topic | Topic refers to the transmission media used for releasing/subscribing message. |
| DeviceName	| Device name, generally device mac address, SN, etc. |
| Identifier	| Global and unique identifier of device, used for information signature |
| One Machine and One Password  | A device can make verification connection via ProductKey, Identifier and DeviceSecret |


## Related References

- [Product Overview](../Introduction/Product-Overview.md)
- [Price Overview](../Pricing/Price-Overview.md)
