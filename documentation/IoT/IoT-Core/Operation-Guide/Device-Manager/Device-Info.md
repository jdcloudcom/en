# Device Management

On the Device Information page, you can edit device information, and manage device attributes, events and methods

## Edit device information

1. Log in IoT management Platform.
2. Select **Device Management Center** -> **Device List** on the left navigation bar.
3. Select the device to be edited, and click the **Edit** button on the right to enter the Device Management page.

![编辑设备](../../../../../image/IoT/IoT-Core/Device-Manager/Device-Info/Edit-Device-Button.png)

4. On the Device Management page, the device information is opened by default. On this page, you can change the device name, Mac address, longitude, latitude, global device archives, archival information, and tag information.

![管理设备](../../../../../image/IoT/IoT-Core/Device-Manager/Device-Info/Edit-Device.png)

### Edit device attribute

As for the device attributes, the expected attribute value and call measurement can be edited.

#### Update Expected Value

When modifying the expected property value of a device, click the **Update Expected Value** button. If the device is online, the corresponding property value on the side of the device will change.

![编辑设备属性](../../../../../image/IoT/IoT-Core/Device-Manager/Device-Info/Edit-Device-Property.png)

#### Call Measurement
After one or multiple device properties are checked, click **Call Measurement**. The device will report the current data of the properties previously selected.

![编辑设备属性](../../../../../image/IoT/IoT-Core/Device-Manager/Device-Info/Edit-Device-Property-Call-Test.png)

### View device event list

The event list shows all the events reported by the device.

![事件列表](../../../../../image/IoT/IoT-Core/Device-Manager/Device-Info/Device-Events-List.png)

### View device method list

The method list shows all the method call records of the device.

![方法列表](../../../../../image/IoT/IoT-Core/Device-Manager/Device-Info/Device-Functions-List.png)

### View the device topology relation

If the device is a connection proxy device, there will be a topology relation button on the editing page. By virtue of device topology relation maintenance, the topology relation between a connection proxy device and an indirectly connected device can be managed, including addition and release of the proxy relationship between a proxy device and a child device. For details, please refer to [Device Topology Relation Maintenance](../../Best-Practices/Device-Gateway-Topo.md)

![方法列表](../../../../../image/IoT/IoT-Core/Device-Manager/Device-Info/Device-Topo.png)