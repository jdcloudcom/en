# Features


## Device Communication

- Provide two-way communication between devices and cloud, and devices are stable and reliable in device reporting and instruction placing

## Device Management

- Device registration: Customize a device and perform registration of a single device or batch of devices
- Device status: Available to obtain device status information in real time
- Device data collection: Report the device data through the Thing Model to the cloud, and search the device data at any time
- Device deletion: Disable or delete warning devices through the Cloud Console, deploy devices and manage devices conveniently

## Device Shadow

- Provide cache mechanism of device shadow to ensure devices communicates reliably and normally under unstable network

## Product Management

- Product creation: Customize products or create products by presetting template.
- Dynamic registration of device: Set the verification method for all devices under the products.
    - Disable dynamic registration: All devices shall adopt the one machine and one password verification method.
    - Enable dynamic registration: All devices shall adopt the one model and one password verification method.
- Production deletion: Delete the created product through the Cloud Console. Note: If a device has been registered under the product, the product cannot be deleted!
 
## Product Thing Model

- Thing Model: The functional descriptions of devices on cloud, through unified Thing Model definition and standard data, include the device telemetry data attribute, device status attribute and device control instruction. Thing Model is described with JSON format.

- Thing Model – device telemetry data: The packet streaming data of device uplink is an observation value describing objective facts, which cannot be modified by the Cloud service or other applications.

- Thing Model - device status attribute: Compared with packet data, the device status data, such as running status of device, is updated with lower frequency. The status attribute can be modified by the Cloud Service or other applications.

- Thing Model – device control instruction: The control instructions of devices actively called by the Cloud service or other applications or triggered by a rule in the rule engine will not modify the device status attribute. For example, the message broadcast instruction of all devices.


## Rule Engine

- Data processing: Pre-process device data received by IoT Core and support screening and filtering by conditions.
- Data forward: Forward and dump the processed data to JD Cloud's other services, such as RDS, JCQ and ES.
- M2M scenario: Configure device-to-device communication of rule items based on rule engine to fast implement M2M scenario.

## Security Guarantee
 
- VPC (Virtual Private Cloud): Instances are deployed in users’ customized VPC (Virtual Private Cloud) and network isolation protection is performed directly at the application layer to ensure customers’ application security and data privacy.

## Monitoring Alarm

- Visual monitoring: The Console provides visual monitoring data indicators and you can view the status related to instance running at any time.


## Related References

- [Product Overview](../Introduction/Product-Overview.md)
- [Price Overview](../Pricing/Price-Overview.md)
- [Device Authentication](../Developer-Guide-Device/AuthenticateDevices.md)



