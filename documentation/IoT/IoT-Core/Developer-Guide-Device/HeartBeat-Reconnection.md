# Network Connection and Heart Beat

The device app shall periodically send heart beats to IoT Core and get reply, so as to confirm the network connection is normal. Meanwhile, message request released by IoT Core to a device shall be checked and gotten

 ![心跳重连](../../../../image/IoT/IoT-DeviceSDK/Heartbeat.png)

## Maintenance Network Connection and Heart Beat

API:

​	int iot_mqtt_yield(void *handle, int timeout_ms);

API description: Check network status, execution of reconnection, sending of heart beat and data reception  in appointed time

Return value: code in iot_error_t

Parameter Description:

| **Parameter Name** | **Parameter Type**     | **Required** | **Description**   |
| ---------- | ---------------- | -------- | ---------- |
| handle     | iot_mc_client_pt | Yes       | MQTT client |
| timeout_ms | int              | Yes       | Execution Period for Operation of a Processing Network  |

 

Heart beat interval and value range of heart beat (unit: second) at MQTT client can be adjusted by setting the macro `CONFIG_MQTT_KEEPALIVE_INTERAL` in iot_mqtt_api.h. Calling interval of the iot_mqtt_yield function shall be shorter than the heart beat interval.

 

## Detect network status

API:

​	int iot_mqtt_check_state_normal(void *handle);

API description: Detect network connection is normal or not

Return value: code in iot_error_t

Parameter Description:

| **Parameter Name** | **Parameter Type**     | **Required** | **Description**     |
| ---------- | ---------------- | -------- | ------------ |
| handle     | iot_mc_client_pt | Yes       | MQTT   client |

Example Code:

```
Res = iot_mqtt_check_state_normal(handle);
If(Res){                       
// MQTT client in normal state
}else{
//MQTT client in abnormal state
}
```
## Related References
- [Quick Access in Device](../Developer-Guide-Device/DeviceEasyLink.md)
- [Device Authentication](../Developer-Guide-Device/AuthenticateDevices.md)
- [Establish Connection](../Developer-Guide-Device/EstablishConnection.md)
- [Subscribe and Publish Messages](../Developer-Guide-Device/SubPub.md)
- [Relevent API](../Developer-Guide-Device/API.md)
- [Glossary](../Developer-Guide-Device/Glossary.md)
