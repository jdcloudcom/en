# Secondary API

## Generate message ID

msgid will be generated every time when a device sends a message and will be transmitted back when a hub gives a response for judging a message pair.
```
uint32_t iot_mqtt_generate_msgid();
```
API description: generate msgid in json, used for judging message pair
Return value: Return generated msgid
Parameter description: none

| **Parameter Name** | **Parameter Type** | **Required** | **Description** |
| ---------- | ------------ | -------- | -------- |
| none       | none         |          | none     |

Public data format in message body:
```
{
"msgId ": 123
"version":1.0
"code": 200,
"message": "request parameter error",
"data": {}
}
```
  Msgid is used for judging the uplink and downlink messages and judging existing protocol version Code for Version   Application status code type is iot_mqtt_reply_code_t;
  Message is used for describing error information

## Judge topic type

When the distributed message is received, this method can be used for judging if this message is the topic of service
```
int32_t iot_mqtt_is_service_topic(const char *topic);
```
API description: Judge if this topic is the service topic
Return value: 1 stands for service  topic, 0 standards for non-service topic
Parameter description: none

| **Parameter Name** | **Parameter Type** | **Required** | **Description**    |
| ---------- | ------------ | -------- | ----------- |
| topic      | char*        | Yes       | topic character string |

 

Similar API
```
int32_t iot_mqtt_is_event_topic(const char *topic);
int32_t iot_mqtt_is_shadow_get_reply_topic(const char *topic);
int32_t iot_mqtt_is_shadow_get_reply_topic(const char *topic)
int32_t iot_mqtt_is_shadow_get_reply_topic(const char *topic);
```
## Build JSON data responding to the device

API:
```
cJSON * iot_mqtt_build_service_reply_json(cJSON * req, cJSON * service_data, int64_t ts, iot_mqtt_reply_code_t code, char *errMsg);
```
API description: Build jison data replying to service request distributed by the cloud; users only need to concern about update value in data, because other fields such as msgeid, timestamp and version will be automatically generated.
Return value: cjosn object built will be returned if succeeded and null will be returned if failed
Parameter Description:

| **Parameter Name**   | **Parameter Type**          | **Required** | **Description**             |
| ------------ | --------------------- | -------- | -------------------- |
| Req          | cJson*                | Yes       | json object distributed by server |
| Service_data | cJson*                | Yes        | data object in Json     |
| Ts           | Int64_t               | Yes       | Time Stamp               |
| Code         | iot_mqtt_reply_code_t | Yes       | Status Code               |
| ErrMsg       | Char   *              | Yes       | Error Information Description         |

Similar API
```
cJSON * iot_mqtt_build_shadow_update_reply_json(cJSON * req, cJSON * current, int64_t ts, iot_mqtt_reply_code_t code, char *errMsg)
```
## Build JSON data sent to cloud
API:
```
cJSON * iot_mqtt_build_property_json(cJSON * data, int64_t ts)；
```
API description: When a device report attributes, json data of requests can be generated with this method.
Return value: cjosn object built will be returned if succeeded and null will be returned if failed
Parameter Description:

| **Parameter Name** | **Parameter Type** | **Required** | **Description**         |
| ---------- | ------------ | -------- | ---------------- |
| Data       | cJson*       | Yes        | data object in Json |
| Ts         | cJson*       | Yes       | Time Stamp           |

Similar API:
```
cJSON * iot_mqtt_build_shadow_acquiring_json(cJSON * data, int64_t ts)；
cJSON * iot_mqtt_build_device_shadow_update_json(cJSON * current, int64_t ts)；
```
## Registration Callback

API:
```
void (*iot_mqtt_event_handle_func_fpt)(void *pcontext, void *pclient, iot_mqtt_event_msg_pt msg);
```
To apply this method, please register while subscribing. This method will be called in case of data interaction with the cloud.
Return value: void
Parameter Description:

| **Parameter Name** | **Parameter Type**          | **Required** | **Description**               |
| ---------- | --------------------- | -------- | ---------------------- |
| Pcontext   | void*                 | Yes       | Return Value Transmitted by a Device at the Time of Subscription |
| Pclient    | void*                 | Yes       | Mqtt Instance               |
| Msg        | iot_mqtt_event_msg_pt | Yes       | Message Body                 |

 
