# Features


## Device Communication

- Provide two-way communication between devices and cloud, and devices are stable and reliable in device reporting and instruction placing

## Device Management

- Device registration: Customize a device and perform registration of a single device or batch of devices
- Device status: Available to obtain device status information in real time
- Device data collection: Report the device data through the Thing Model to the cloud, and search the device data at any time
- Device deletion: Disable or delete warning devices through the Cloud Console, deploy devices and manage devices conveniently


## Device Management

- Thing Model: Function description of device on cloud, which is used for standardizing data through a unified Thing Model and covers device telemetering data attribute, device status attribute and device control command Thing Model adopts the description in the format of JSON.
- Creation of thing type: Three thing types can be created, including directly connected device, connection proxy device and indirectly connected device
- Deletion of thing type: Delete created thing type via the Cloud Console. Note: If a device has been registered under a thing type, such thing type cannot be deleted.
- Thing Model: The functional descriptions of devices on cloud, through unified Thing Model definition and standard data, include the device telemetry data attribute, device status attribute and device control instruction. Thing Model is described with JSON format.
-- Thing Model – device telemetry data: The packet streaming data of device uplink is an observation value describing objective facts, which cannot be modified by the Cloud service or other applications.
-- Thing Model - device status attribute: Compared with packet data, the device status data, such as running status of device, is updated with lower frequency. The status attribute can be modified by the Cloud Service or other applications.
-- Thing Model – device control instruction: The control instructions of devices actively called by the Cloud service or other applications or triggered by a rule in the rule engine will not modify the device status attribute. For example, the message broadcast instruction of all devices.
- Provide equipment shadow caching mechanism and guarantee the device communication is reliable and normal in case of unstable network


- Device registration: Register a device via a customized product or pre-set thing type.

- Device group: Device groups can be created according to demands and selection of device under the parent level is supported.

## Rule Engine

- Data processing: Pre-process device data received by IoT Core and support screening and filtering by conditions.
- Data forward: Forward and dump the processed data to JD Cloud's other services, such as RDS, JCQ and ES.
- M2M scenario: Configure device-to-device communication of rule items based on rule engine to fast implement M2M scenario.

## File Management
- Add files: Corresponding files can be created based on global devices, global thing types and thing type devices
- File search: Search corresponding files globally or by type
- File edition: File types, thing type, file name, file code and other attributes and descriptions of files can be modified.
- File deletion: Selected files can be deleted.

## Related References

- [Product Overview](../Introduction/Product-Overview.md)
- [Price Overview](../Pricing/Price-Overview.md)



