# Device Registration

1. Log in the IoT Management Platform
2. Select **Device Management Center** -> **Device List** on the left navigation bar**
3. Click **Register Device** on the upper right corner of the page.**

![注册设备](../../../../../image/IoT/IoT-Core/Device-Manager/Create-Device/Create-Device.png)

4. Fill in basic device information, file information of global device, file information, tag information, etc.

![注册设备1](../../../../../image/IoT/IoT-Core/Device-Manager/Create-Device/Create-Device1.png)

**Basic Information**

- Name: Device name only supports Chinese characters, English letters, numbers, underline (_), line-through (-), dot (.) and space, which is no more than 30 characters.
- Thing type: Select the Thing Model of device and optional thing types can be viewed or added via **Device Management Center** -> **Thing Type List**.
- Thing Model version: Select a released Thing Model version among the selected thing types.
- Mac address: Please separate Mac address with colons (:), but such colons are not required.
- Physical ID of device: Only support the Chinese character, English letter, number, underline (_) or line-through (-), which is within 30 characters.
- Longitude: Describe device longitude, but not required.
- Altitude: Describe device altitude, but not required.

**Global Device File**

Conduct information maintenance for all devices, e.g., device area, access time/initialization time, etc. Global device files can be managed via **File Management** -> **File List**. If no global device files are available in the file list, no information will be displayed here.

**File Information**

Maintainable information of this device, e.g., device area, access time/initialization time, etc., which is not required to be completed in this stage.

**Tag Information**

Tags can be added to devices.

**Device Management**

 After device registration, the **Device Management** Page will be automatically redirected. For device management details, please refer to [Device Information](../Device-Manager/Device-Info.md)

 ## Device Deletion

Click the **Delete Device** button corresponding to device to be deleted on the Device List Page and click **Delete** on the deletion confirmation popup box.

![删除设备](../../../../../image/IoT/IoT-Core/Device-Manager/Create-Device/Delete-Device.png)

 ## Certificate Download

Click the **Certificate Download** button corresponding to the device requiring certificate download on the Device List Page and start to download a certificate.

 ![证书下载](../../../../../image/IoT/IoT-Core/Device-Manager/Create-Device/Device-Certificate.png)