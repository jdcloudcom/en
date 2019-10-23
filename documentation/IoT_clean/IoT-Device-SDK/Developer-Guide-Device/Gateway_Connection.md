设备类型 dev_type 说明：
		IOT_DEV_TYPE_GATEWAY 	网关设备  
		IOT_DEV_TYPE_SUBDEV 	子设备
消息类型 msg_type 说明：
    IOT_GATEWAY_POST_PROPERTY           发送网关或子设备的只读属性
    IOT_GATEWAY_BATCH_POST              批量发送子设备的数据和事件
    IOT_GATEWAY_POST_EVENT              发送网关或子设备的事件
    IOT_GATEWAY_SHADOW_REPLY            发送网关或子设备的影子响应
    IOT_GATEWAY_SERVICE_REPLY           发送网关或子设备的服务响应
    IOT_GATEWAY_DEVICE_UPDATE_SHADOW    发送网关或子设备的影子
    IOT_GATEWAY_GET_SHADOW              获取网关或子设备的影子
    IOT_GATEWAY_SUBDEV_LOGIN            网关子设备上线
    IOT_GATEWAY_SUBDEV_LOGOUT           网关子设备下线
