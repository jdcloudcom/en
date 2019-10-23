# Device SDK Introduction

## Overview

IoT Device SDK of JD Cloud is provided to device manufacturers for integration on device and for management of safe connection to JD Cloud IoT Core or IoT Hub via SDK. Device SDK can be applicable only when the device supports the TCP/IP protocol. Other devices, those based on non-standard MQTT protocol, can be accessed to IoT Core or IoT Hub through the gateway, edge node and IoT Hub Protocol Adaptor.

IoT Device SDK of JD Cloud is open for MQTT C language developers. The document specifies guidance for rapid access of JDCloud_IOT_DEVICE_SDK by developers and provides definitions and specific descriptions for each API. Now, SDK supports the linux system environment only.

To fit to different operating systems, tool chains and clipping by device manufacturer, IoT Device SDK is provided externally with the open source code method.

## Get SDK
Now, IoT Device SDK of JD Cloud provides C programming language SDK. Please click to download:
[jdcloud-iot-device-sdk-c.zip](https://iotsdk-public.s3.cn-north-1.jdcloud-oss.com/device-sdk/linux-c/jdcloud-iot-device-sdk-c.zip)


## Architecture

Relationships between application business logics, SDK and HAL are as shown in the figure below:

![SDK产品框架](../../../../image/IoT/IoT-DeviceSDK/Framework.png)

The application only needs to pay attention to the SDK API combination business logics rather than communication details. A user needs to adapt to the HAL layer according to its own OS and device information, and SDK provides HAL layer adapter for linux.

## Related References

- [Quick Access in Device](../Developer-Guide-Device/DeviceEasyLink.md)
- [Device Authentication](../Developer-Guide-Device/AuthenticateDevices.md)
- [Establish Connection](../Developer-Guide-Device/EstablishConnection.md)
- [Subscribe and Publish Messages](../Developer-Guide-Device/SubPub.md)
- [Network Connection and Heart Beat](../Developer-Guide-Device/HeartBeat-Reconnection.md)
- [Relevent API](../Developer-Guide-Device/API.md)
- [Glossary](../Developer-Guide-Device/Glossary.md)



