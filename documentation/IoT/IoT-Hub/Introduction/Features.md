# Features

## Easy to Use

### Quick Creation
Through the Console or simple calling of API, a new IoT Hub service instance can be created in several minutes.

### Elastic Expansion
Support expansion and shrinkage and JD Cloud can adjust the instance configuration as needed according to tenant business conditions to improve resource utilization rate and reduce the cost of use.

## Security Guarantee
 
### VPC (Virtual Private Cloud)
Instances are deployed in users’ customized VPC and network isolation protection is performed directly at the application layer to ensure customers’ application security and data privacy.

## Monitoring Alarm

### Visual Monitoring
The Console provides visual monitoring data indicators and you can view the status related to instance running at any time.

## Device TSL

### TSL (Thing Specification Language)
The function descriptions of devices on cloud include the device telemetry data property, device status attribute and device control instruction of the devices. TSL is described with JSON format.

### TSL – Device Telemetry Data
The packet streaming data of device uplink is an observation value describing objective facts, which cannot be modified by the Cloud Service or other applications.

### TSL – Device Status Attribute
Compared to packet data, the device status data, such as running status of device, device version number and sending frequency of device packet data, is updated with lower frequency. The status property can be modified by the Cloud Service or other applications.

### TSL – Device Control Instruction
The control instructions of devices positively called by the Cloud Service or other applications or triggered by a rule in the rule engine will not modify the device status attribute. For example, the message broadcast instruction of all devices.

## Device Twins
Device telemetry data and device status attribute data are included. Through such two types of data, a time node can be specified to completely describe the device by digital methods. It is the digital twins of the device.
For example, at 10:00 on January 1, the current device is started up; the packet transmission frequency of the device is 5 seconds/time and the current ambient temporary is 5℃. (It is under the status of starting up; the packet transmission frequency is the device status attribute data; the ambient temporary is the device telemetry data)

## Rule Engine
Pre-process the device data received by IoT Hub and can forward and store the processed data to JD Cloud's other services, such as RDS, JCQ and ES.



## Related References

- [Product Overview](../Introduction/Product-Overview.md)
- [Price Overview](../Pricing/Price-Overview.md)
- [Create instance](../Getting-Started/Create-Instance.md)


