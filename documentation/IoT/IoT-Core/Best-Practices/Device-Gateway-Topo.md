# Topology Relationship Maintenance of Device

By virtual of equipment topology maintenance, topology between a connection proxy device and an indirectly connected device can be managed, including addition and release the proxy relationship between a proxy device and a child device.

## Edit proxy connection device

1. Log in IoT management Platform.
2. Select **Device Management Center** -> **Device List** on the left navigation bar.
3. Select a connection proxy device to be edited (if no connection proxy device is registered, please create a connection proxy device thing type and register it as a connection proxy device), click the **Edit** button on the right side and enter the Device Edition Page.

![编辑连接代理设备](../../../../image/IoT/IoT-Core/Best-Practices/Device-Gateway-Topo/Edit-Agent-Device-Button.png)

4. You can see that if the device type is a connection proxy device, the Topology button will be available on the Edition Page. Click the **Topology** button and enter the Topology Edition Page.

![编辑拓扑关系](../../../../image/IoT/IoT-Core/Best-Practices/Device-Gateway-Topo/Edit-Gateway-Topo.png)

### Add proxy relationship

Click the **Add Proxy Relationship** button, select a proxy device (if no device is available, please create an indirectly connected device type and create an indirectly connected device), enter the protocol attribute value (with protocol files edited in the connection proxy device type) and click **Add**. If the connected proxy device is online, it means that the proxy relationship is added.

![添加代理关系](../../../../image/IoT/IoT-Core/Best-Practices/Device-Gateway-Topo/Add-Agent-Relation.png)

![添加代理关系](../../../../image/IoT/IoT-Core/Best-Practices/Device-Gateway-Topo/Add-Agent-Relation-Info.png)

### Release Proxy Relationship

Check a device in the Topology List, click **Release Topology** and click the **Release** button on the popup box. In this way, topology between the proxy device and the child device is released.

![解除代理关系](../../../../image/IoT/IoT-Core/Best-Practices/Device-Gateway-Topo/Remove-Agent-Relation.png)

![解除代理关系](../../../../image/IoT/IoT-Core/Best-Practices/Device-Gateway-Topo/Remove-Agent-Relation-Confirm.png)