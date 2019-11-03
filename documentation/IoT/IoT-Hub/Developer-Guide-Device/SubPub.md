# Subscription and Message Release

After a device is activated, IoT Core will generate a corresponding topic and the device can subscribe the required topic. IoT Core releases messages to the subscribed device and the device gives response after the messages are processed.

 ![subpub](../../../../image/IoT/IoT-DeviceSDK/SubPub1.png)

## Subscribe topic  

API:

```
iot_mqtt_subscribe_router(
    void *handle,
    iot_mqtt_sub_t topic_type,
    const char * product_key,
    const char * device_id,
    iot_mqtt_event_handle_func_fpt topic_handle_func,
    void *pcontext);`
```

API description: Subscribe required topic and specify return function

Return value: packetid will be returned if succeeded, otherwise error type in iot_error_t will be returned

Parameter Description:

| **Parameter Name**        | **Parameter Type**                   | **Required** | **Description**            |
| ----------------- | ------------------------------ | -------- | ------------------- |
| handle            | iot_mc_client_pt               | Yes       | MQTT client          |
| topic_type        | iot_mqtt_sub_t                 | Yes       | Type of topic to Be Subscribed |
| product_key       | char*                          | Yes       | Product key         |
| device_id         | char*                          | Yes       | Device identifier     |
| topic_handle_func | iot_mqtt_event_handle_func_fpt | Yes       | Function Return            |
| pcontext          | void*                          | Yes       | Return Through a Return Function    |

Example Code:

```
hal_get_product_key(SMP_PRODUCT_KEY);
hal_get_device_id(SMP_DEVICE_ID);
iot_mqtt_subscribe_router(handle,MQTT_SUB_TYPE_PROPERTY_REPLY,MP_PRODUCT_KEY, SMP_DEVICE_ID, iot_subscribe_reply, NULL);
```


## Publish Messages

API:

```
int32_t iot_mqtt_publish_router(
    void *handle,
    iot_mqtt_pub_t topic_type,
    const char * product_key,
    const char * device_id,
    cJSON *payload)
```

API description: Release message

Return value: packetid will be returned if succeeded, otherwise error type in iot_error_t will be returned

Parameter Description:

| **Parameter Name**  | **Parameter Type**     | **Required** | **Description**          |
| ----------- | ---------------- | -------- | ----------------- |
| handle      | iot_mc_client_pt | Yes       | MQTT client        |
| topic_type  | iot_mqtt_pub_t   | Yes       | Push to Appointed topic |
| product_key | char*            | Yes       | Product key       |
| device_id   | char*            | Yes       | Device identifier   |
| payload     | cjson            | Yes       | Pushed Message        |

Example Code:

```
cJSON * data = iot_mqtt_build_device_shadow_update_json(rep_json,ts);
iot_mqtt_publish_router(handle,MQTT_PUB_TYPE_DEVICE_UPDATE_SHADOW,SMP_PRODUCT_KEY,SMP_DEVICE_ID,data;
```

Subscription topic Type Supported Now 

```
typedef enum {                
    MQTT_SUB_TYPE_PROPERTY_REPLY = 0,
    MQTT_SUB_TYPE_EVENT_REPLY,
    MQTT_SUB_TYPE_SERVICE,
    MQTT_SUB_TYPE_SHADOW_UPDATE,
    MQTT_SUB_TYPE_DEVICE_UPDATE_SHADOW_REPLY,
    MQTT_SUB_TYPE_GET_SHADOW_REPLY,
    MQTT_SUB_DYNAMIC_AUTH,
} iot_mqtt_sub_t;
```

Release topic Type Supported Now 

```
typedef enum {
    MQTT_PUB_TYPE_PROPERTY = 0,
    MQTT_PUB_TYPE_EVENT,
    MQTT_PUB_TYPE_SERVICE_REPLY,
    MQTT_PUB_TYPE_SHADOW_REPLY,
    MQTT_PUB_TYPE_DEVICE_UPDATE_SHADOW,
    MQTT_PUB_TYPE_GET_SHADOW,
} iot_mqtt_pub_t;
```



## Subscription Service and Response

The device end needs to subscribe hub shadow with this method and response hub commands in time

1) Subscribe service Topic:
```
iot_mqtt_subscribe_router(handle, MQTT_SUB_TYPE_SERVICE, SMP_PRODUCT_KEY, SMP_IDENTIFIER, iot_subscribe_reply, NULL);
```

 Handle is the client of mqtt and iot_subscribe_reply is the registered callback method.

2) Distribute response service command:

a) iot_subscribe_reply will receive service commands distributed by hub. Via the callback method, mqtt information can be gotten.

b) json format in payload is as follows:

```
{                                            
    "msgId ": "123",
    "version": "1.0",
    "name": "testService",         
    "data ": {                        
        "Power": "on",
        "WF":23.6
     }
}                              
```
            

c) After the device processes logics as per service names and input parameters, it will encapsulate service output parameters as the json objects, transmit the objects to the method iot_mqtt_build_service_reply_json, generate payload, call iot_mqtt_publish_router and give reply.

## Device Attribute Reporting

If a device needs to inform an event to hub, it can send the information with this method

1) Subscribed attribute reply Topic:
```
iot_mqtt_subscribe_router(handle,QTT_SUB_TYPE_PROPERTY_REPLY, SMP_PRODUCT_KEY, SMP_IDENTIFIER, iot_subscribe_reply, NULL)
```

2) Report local data:

a) Request data format:                                                             

```
{                                       
   "msgId ": "123",
   "version": "1.0",
   "data ": {
       "Power": "on",
       "WF":23.6,
   },
   "ts":1559805611390
}
```

b) Report read-only property, encapsulate attributes to be reported as json objects, transmit the objects to the method iot_mqtt_build_property_json and generate payload. Then, call iot_mqtt_publish_router and send the payload.

c) iot_subscribe_reply will receive hub and response reported by attribute.

## Device Event Reporting

If a device needs to inform an event to hub, it can send the information with this method

1) Subscribed event reporting and reply Topic:         
```
iot_mqtt_subscribe_router(handle, MQTT_SUB_TYPE_EVENT_REPLY, SMP_PRODUCT_KEY, SMP_IDENTIFIER, iot_subscribe_reply, NULL)
```
2) Report device event:

a) Request data format:

```
{
    "msgId ": "123",
    "version": "1.0",
    "name": "testEvent",
    "data ": {
        "Power": "on", 
        "WF":23.6
    },
    "ts":1559805611390
}
```

b) An event is composed of an event name and an input parameter and the input parameter is encapsulated as josn and is sent to iot_mqtt_build_event_json with the event name to generate payload. Then, call iot_mqtt_publish_router and send the payload.

c) iot_subscribe_reply will receive hub and response reported by event.

## Request Shadow 

This method can be called when a device needs to synchronize hub shadow status

1) Subscribed shadow reply Topic:
```
iot_mqtt_subscribe_router(handle, MQTT_SUB_TYPE_GET_SHADOW_REPLY, SMP_PRODUCT_KEY, SMP_IDENTIFIER, iot_subscribe_reply, NULL)
```
2) Request to get shadow:

a) Request data format:

```
{
    "msgId ": "123",
    "version": "1.0",
    "data ": {
    }
}                                       
```

b) iot_mqtt_build_shadow_acquiring_json is used for generating payload and the latter is transmitted to iot_mqtt_publish_router, so as to send request shadow.

c) iot_subscribe_reply will receive shadow value returned by hub, with the format as shown below.

```
{                                  
    "msgId ": "123",
    "code": 200,
    "data": {
        "state":{
            "desired": {// Expected Value
                "Power": "on",// Expected attribute value, null if expected value is not given
                "WF": 23.6
            },
            "reported": {// Current Value
                "Power": "off",
                "WF": 11
            }
        },
        "metadata": {
            "reported": {
                "Power": {
                    "timestamp": 1451649600512 //Update time stamp of current value, exact to millisecond
                },
                "WF": {
                    "timestamp": 1451649600512 //Update time stamp of current value, exact to millisecond
                }
            }, 
            "desired": {
                "Power": {
                    timestamp": 1451649600512 //Update time stamp of expected value, accurate to millisecond
                },
                "WF": {
                    "timestamp": 1451649600512 //Update time stamp of expected value, accurate to millisecond
                }
            }
        },
        "version": 3,// Shadow Version Number
        "timestamp": 1451649600512 //Last update time stamp of shadow, accurate to millisecond
    }
}
```



## Update and Response of Subscribed Shadow

The device end needs to subscribe hub shadow with this method and response hub commands in time

1) Subscribed shadow Topic:
```
iot_mqtt_subscribe_router(handle, MQTT_SUB_TYPE_SHADOW_UPDATE, SMP_PRODUCT_KEY, SMP_IDENTIFIER, iot_subscribe_reply, NULL);
```
2) Distribute response shadow:

a) iot_subscribe_reply will receive shadows distributed by hub. Via the callback method, mqtt information can be gotten.

b) Shadow distribution data format:

```
{
    "msgId ": "123",
    "version": "1.0",
    "data ": {
        "desired": {// Expected attribute value distributed by the cloud
            "Power": "on",
            "WF": 23.6
        },
        "version": 2,//Current version, ascending by integers
        "timestamp": 1561107827//Distribution time, accurate to millisecond
    }
}
```

`c) Corresponding logics will be processed as per `desired by encapsulating report value in the json object, transmit the same to

the method iot_mqtt_build_shadow_update_reply_json and call iot_mqtt_publish_router to reply.

## Cancel subscription

Cancel subscribed Topic:
```
int iot_mqtt_unsubscribe(void *handle, const char *topic_filter);
```
API description: Cancel subscribed topic

Return value: packetid will be returned if succeeded, otherwise error type in iot_error_t will be returned

Parameter Description:

| **Parameter Name**   | **Parameter Type**     | **Required** | **Description**        |
| ------------ | ---------------- | -------- | --------------- |
| handle       | iot_mc_client_pt | Yes       | MQTT   client    |
| topic_filter | char*            | Yes       | topic to Be Canceled |

Example Code:

```
char *fmt = get_mqtt_sub_format(MQTT_SUB_TYPE_PROPERTY_REPLY);
hal_snprintf(topic,CONFIG_MQTT_TOPIC_MAXLEN,fmt,meta_info->product_key,meta_info->device_name);
iot_mqtt_unsubscribe(handle, topic)；
```

## Related References

- [Quick Access in Device](../Developer-Guide-Device/DeviceEasyLink.md)
- [Device Authentication](../Developer-Guide-Device/AuthenticateDevices.md)
- [Establish Connection](../Developer-Guide-Device/EstablishConnection.md)
- [Network Connection and Heart Beat](../Developer-Guide-Device/HeartBeat-Reconnection.md)
- [Relevent API](../Developer-Guide-Device/API.md)
- [Glossary](../Developer-Guide-Device/Glossary.md)
