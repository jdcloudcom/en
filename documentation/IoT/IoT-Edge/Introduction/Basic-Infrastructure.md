# Basic Architecture

IoT Edge comprises core functions including device access, core service, edge application, and communication service.

## Business Architecture

Business architecture is shown as in the following figure:
![](../../../../image/IoT/IoT-Edge/EdgeArch-New.png)

| Name     | Description                                                         |
| -------- | ------------------------------------------------------------ |
| Core Service | Provide basic running environment to the entire edge computing system and provide data management, scheduling management, log monitoring, notification, storage and other services. |
| Device Access | Provide APIs to underlayer hardware and operating system connection capability and data parsing service.                   |
| Edge Application | Deploy the application on edge nodes to complete local computing of device data protocol, AI inference and other businesses. Multiple edge applications can be deployed under one edge node. |
| Communication Service | Connect IoT Core and JD Cloud Service with standard protocols (MQTT and HTTP), providing data uplink and data downlink functions.                               |


## Related References

- [Product Advantage](../Introduction/Benefits.md)
- [Product Function](../Introduction/Features.md)
- [Create Edge Computing Node](../Getting-Started/Create-Edgenode.md)
- [Install Edge System](../Getting-Started/Install-Edge-System.md)
