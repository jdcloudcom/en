# Core Concepts
See the following for the concepts and their interpretations used in the IoT Hub help documentation.

| Concept          | Interpretation                                                         |
| :------------ | :----------------------------------------------------------- |
| Region          | JD Cloud's data centers are distributed in multiple locations around the world. These locations are called regions. JD Cloud is completely isolated from different regions, ensuring maximum stability and fault tolerance between different regions. Users are advised to choose the region closest to you or your customers to reduce access latency and increase download speed. **Note**: The intranets in different regions are not connected to each other.|
| Availability Zone        | Availability Zone is a physical region where power, network and other infrastructures are independent of each other. A region contains one or more availability zones, and multiple availability zones in the same region can be connected to each other. |
| Product          | Device Collection, the product is used for defining a group of devices with the same functions/attributes. IoT Hub will issue a unique ProductKey for each product. |
| Device          | Specific device under a product. IoT Hub will issue a unique Identifier and DeviceSecret for each device. |
| Sub-device        | A sub-device is connected to the IoT Hub through a gateway.                               |
| Device Key Pair      | The Device Key Pair issued by IoT Hub.                                 |
| MQTT          | Message Queuing Telemetry Transport. The message protocol based on the release/subscription model under the ISO standard (ISO/IEC PRF 20922). It works on the TCP/IP protocol family, as a release/subscription message protocol designed for remote device of low hardware performance and poor network conditions. |
| Thing Model        | Functional description of a device on cloud, comprising device attribute, service, event, etc. Thing Model is described with JSON format. |
| Device Shadow      | It comprises device status attribute data and save current status information of the device. Each device shall have a corresponding device shadow in cloud. |
| Rule Engine      | Pre-process the device data received by IoT Hub and can send the processed data to JD Cloud's other services, such as RDS, JCQ and ES. |
| Expected Attribute Value    | With the expected attribute value function, you can set the desirable device attribute value. If a device is on-line, the attribute value will be updated in real time. If it is off-line, the expected attribute value will be cached on the cloud. When the device is on-line, the expected attribute value will be gotten and updated. |
| Attribute          | Describe the real attribute and status of things. It is divided into two attributes of read-only attribute and read-write attribute, and supports reading and setting (read-write attribute). |
| Service          | A series of instructions and methods that can be called by the external (IoT Hub/Application). Compared with attribute setting, a service can provide more complex business logics. For example, execute a task. |
| Event          | It refers to the information reported by the thing itself, including many messages that need to be perceived and processed in time, such as warning information and fault information. |
| Topic         | Topic refers to the transmission media used for releasing/subscribing message.                         |
| ProductKey    | Unique identifier of product, each device belongs to one product.                     |
| ProductSecret | Product secret key, used for verifying one model and one password of user’s device                       |
| DeviceName    | Device name, generally device mac address, SN, etc.                        |
| DeviceSecret  | Device secret key, used for information signature                                     |
| Identifier    | Global and unique identifier of device, used for information signature                             |
| One Model and One Password      | A device can dynamically get Identifier and DeviceSecret for verification connection via ProductKey, ProductSecret and DeviceName. |
| One Machine and One Password      | A device can make verification connection via ProductKey, Identifier and DeviceSecret     |
| Three-element Group        | ProductKey, Identifier and DeviceSecret of device are called as the three-element group         |

## Related References

- [Product Overview](../Introduction/Product-Overview.md)
- [Price Overview](../Pricing/Price-Overview.md)
