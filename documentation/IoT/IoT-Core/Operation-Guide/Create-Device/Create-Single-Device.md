# Create a single device

After a product is created, a device shall be created. There are two device creation methods, i.e., creating a single device and creating devices in batches. The document specifies the method of creating a single device.

**Operation Steps**

1. Log in [IoT Core Console](https://iot-console.jdcloud.com/core/)
2. Select **Management** -> **Device** from the left navigation bar**
3. Click **Add Device** on the top of the page**
4. Enter relevant device information in the dialog box of adding device and click **OK** 

![CreateSingleDevice](../../../../../image/IoT/IoT-Engine/CreateSingleDevice.png)

**Parameters on the page are set as follows:**

| Parameter                  | Description                 |
| :-------------------: | :------------------- |
|Select product  | Select a created product. Created devices will pass on functions and features defined by this product. If no product is created, please click **Create New Product** |
|Device Name  | The device name is used for naming a device, which supports English letters, numbers, underline "_" and line-through "-", must begin and end with English letters and numbers and contains 3-30 characters. Required! Unique for a product. Cannot be modified. | 
|Device Manufacturer| The device manufacturer name is used for completing device model information, which supports Chinese characters, English letters, numbers, underline "_", line-through "-", must begin and end with Chinese characters, English letters and numbers and contains 0-30 characters. Optional! | 
|Device Model  | The device model is used for completing device model information, which supports Chinese characters, English letters, numbers, underline "_", line-through "-", must begin and end with Chinese characters, English letters and numbers and contains 0-30 characters. Optional! | 
|Device Description  | Device description is used for describing device information. No restriction to input character type, length is limited to 0-80 characters. Optional!| 

**Device certificate information:**

Once a device is created, a pop-up to view device certificate will be automatically popped up. Then, you can view and replicate device certificate information. The device certificate, consisting of device productKey, identifier and secret, is the important identity authentication for communication between the device and IoT Core. Please appropriately keep it.

| Parameter                  | Description                 |
| :-------------------: | :------------------- |
|productKey  | Unique Identifier of Product. | 
|identifier  | The equipment identifier is unique. The identifier and the device productKey of its product, serving as the device identification, are used for device connection verification and communication. | 
|secret  | Device secret key is used for verification encryption. | 


Then, you can click the device name in the device list to view the device information in the Device Details.
