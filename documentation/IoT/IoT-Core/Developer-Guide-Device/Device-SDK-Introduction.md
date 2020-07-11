# Overview

The device SDK is provided to device manufacturer for integrating with the device and safely connecting such device to the IoT Management Platform for management. SDK can be used by a device only when such device supports the TCP/IP protocol, while other non-IP devices and devices passing the non-standard MQTT protocol can be accessed to the IoT Management Platform via a gateway.
SDK is open for MQTT C language developers. The document is used for guiding quick access by developers who can know SDK details by referring to the User Development Manual. At present, SDK only supports the linux system environment.

# Obtain SDK development kit
At present, SDK provides C language development kit. Please click here to unload: ******

Developers may refer to the section **Best Practices-Device Access** for quick device access via SDK.



# Product Framework
Relations between application scenarios, SDK and PAL are as shown in the figure below:

![产品框架图](../../../../image/IoT/IoT-Core/Developer-Guide-Device/Introduction-产品框架图.png)

Applications only need to concern use of combined business logics of SDK API rather than communication details. The PAL layer requires users to conduct adaption according to their own OS and device information. SDK provides the PAL layer adaption for linux.

For adaption of MQTT, SDK provides adaption examples of mosquito and developers can adapt MQTT of the hardware platform itself according to examples.

