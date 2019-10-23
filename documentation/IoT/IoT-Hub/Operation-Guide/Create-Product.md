# Create product

**Product Creation** is the first operation step for using the IoT Hub. The product refers to a group of devices with the same functions/attributes.


Operation Guide

1. Log in [IoT Hub Console](https://iot-console.jdcloud.com/hub/)
2. Select **Manage** -> **Product** on the left navigation bar and click **Create Product**. Have the capacity of managing sub-devices and connecting the cloud as the sub-device agent
3. Complete required parameter information and click **OK**

![image](../../../../image/IoT/IoT-Hub/CreateProduct.png)

**Parameters on the page are set as follows:**

| Parameter                 | Description                 |
| :-------------------: | :------------------- |
|Product Name  | Name the product. A product name must be unique in an account. The name cannot be blank; it only supports Chinese, numbers, uppercase and lowercase letters, English underline "_" and line-through "-", with 3-30 characters, and must begin and end with Chinese/English/numbers. |
|Node Type  | Device Type Under Product. Device: Refer to the device cannot be attached with any sub-device. Such device can be directly connected to IoT Hub and also can be connected to the IoT platform as the gateway sub-device.  Gateway: Have the capacity of managing sub-devices and connecting the cloud as the sub-device agent. |
|Product Description  | Product description, used for describing product information. No restriction to input character type, length is limited to 0-80 characters. Optional. |

After a product is created, the page will automatically redirect to the product list page.
