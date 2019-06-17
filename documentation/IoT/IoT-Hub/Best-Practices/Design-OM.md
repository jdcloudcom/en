# Design TSL

TSL is a digital description of physical devices, including the definitions of the device telemetry data, device status and device instruction.

# Definition of TSL

A completion definition of TSL consists of the definitions of 5 types of data:

1. Device Telemetry Data

	The packet streaming data of device uplink is an observation value describing objective facts, which cannot be modified by the Sever-Side Application.

2. Device State Data

	Compared to packet data, the device status data, such as running status of device, device version number and sending frequency of device packet data, is updated with lower frequency. The status data can be modified by Server-Side Application. Such status data can have the corresponding Expected Value and Reported Value.
	To modify the Expected Value of State, the listening of Expected Value at the device end should be changed, and the corresponding device action should be triggered. For instance, to change the Expected Value of the running status of a device from "Start" to "Restart", the device end should autonomously implement the reboot operation.

3. Device Metadata

	The device metadata e.g., the grouping tags of devices are created and maintained by Sever-Side Application.

4. Events

	Based on the data of the uplink packet (or state data), the cloud or device end (e.g., Edge Node) is created after being calculated under the rules in rule engine of the cloud or device end. Or the event reported by devices actively.

5. Commands

	The control instructions of devices actively called by Server-Side Application or triggered by a rule in the rule engine will not modify the Device State Data. For example, the message broadcast instruction for all car devices.

		Note:
		* The current version doesn’t support Device Metadata and Events, and it is planned to upgrade and support them in the next version;

## How to understand the difference between Device Telemetry Data and Device State Data?
Device Telemetry Data is telemetry data reported by devices and a measured value, and cannot be changed, while Device State Data is status data of devices that can be changed by setting.
For instance, the ambient temperature read by the temperature probe of an air conditioner is Device Telemetry Data, which is an unchangeable objective fact.
The temperature setting value of the temperature controller of an air conditioner is Device State Data, which can be modified by the device or cloud application.

## TSL Example
Please refer to Attachment [OM Example](../../../../image/IoT/IoT-Hub/TempHumiditySensor-OM.json)

		Note:
		* Please edit your TSL based on the TSL example in the Attachment;
		* The follow-up version upgrading plan provides the TSL editor, in which you can more conveniently edit the TSL using online visual tools;


