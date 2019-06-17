# Add Device

You can add devices through the Console or API of the IoT Hub Service. This document introduces how to add a device through the Console.


## Preconditions
- JD Cloud account registration is done and real-name verification is completed. If you have no accounts, please [Register](https://accounts.jdcloud.com/p/regPage?source=jdcloud%26ReturnUrl=%2f%2fuc.jdcloud.com%2fpassport%2fcomplete%3freturnUrl%3dhttp%3A%2F%2Fuc.jdcloud.com%2Fredirect%2FloginRouter%3FreturnUrl%3Dhttps%253A%252F%252Fwww.jdcloud.com%252Fhelp%252Fdetail%252F734%252FisCatalog%252F1), or make [Real-name Verification](https://uc.jdcloud.com/account/certify).
- The instance of IoT Hub Service has been created.


## Operation Steps
1. Log in [IoT Hub Service Console](https://iot-console.jdcloud.com/iothub).
2. On the "Device Management" page, you can conduct the Add Device operation.

	
	
3. In the drop-down list of the instance list, select one IoT Hub Service instance.

![实例列表](../../../../../image/IoT/IoT-Hub/iothub-004.png)


5. On the pop-up Add Device page, click **Download TSL Template**.
6. Edit the TSL template in your own computer to generate the TSL file you need to access the device. You can edit your own TSL file with reference to the TSL example of temperature and humidity sensor in the Attachment. [Temperature and Humidity Sensor TSL Example](https://docs-iot-downloads.s3.cn-north-1.jdcloud-oss.com/TempHumiditySensor-OM.json? AWSAccessKeyId=9B860A13DA12A42DCB34BE2ECBE4384D&Expires=1616583586&Signature=xGDR%2FHppBwW7iHtpoOViVXyJhgs%3D)
7. After editing the TSL template, click **Upload TSL** to upload your TSL.
8. On the pop-up Add Device page, click **Download Device Registration Template**.
9. Edit the device registration template in your own computer to generate the device registration file you need to access.
10. After editing the device registration file, click **Upload Device Registration Template** to upload your device registration file.
11. On the firmware of your modified device, modify the server communication address of MQTT client to the public network domain of the IoT Hub instance created by you and the device ID sent at the time when the device and the IoT Hub service establish the communication. (i.e. the value of DeviceName Field in the device registration file)
    
	

## Related References
- [Design TSL](../../Best-Practices/Design-OM.md)
- [Instance List](../../Getting-Started/List-Instance.md)
- [Billing Rules](../../Pricing/Billing-Rules.md)

