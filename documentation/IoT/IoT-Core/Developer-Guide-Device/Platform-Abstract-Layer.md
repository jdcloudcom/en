# Adaption of Hardware and Platform

To fit to different hardware platforms, relevant API function definitions of the platform are abstracted with SDK. Developers are required to make adaption according to their own hardware platforms. The header file path is pal/inc and the file list and instructions are as follows:

| File Name           | Function Description           | Remark     |
| :--------------- | :----------------- | :------- |
| joylink_log.h    | Log Printing           | Required No Adaptation |
| joylink_memory.h | Memory APIs       | Adaption     |
| joylink_mqtt.h   | MQTT Client APIs | Adaption     |
| joylink_stdint.h | Definition of Integer         | Adaption     |
| joylink_stdio.h  | Standard I/O       | Adaption     |
| joylink_string.h | Character String API         | Adaption     |
| joylink_thread.h | Thread API           | Adaption     |
| joylink_time.h   | Time APIs       | Adaption     |



# MQTT Client Adaptation



API functions to be adapted to the MQTT client are defined in the pal/inc/ joylink_mqtt.h header file. At present, SDK provides adaption examples by using mosquitto. For details, please refer to the code in macro definition ```__MQTT_MOSQUITTO_PAL__`` of the file pal/src/joylink_mqtt.c.

If the hardware platform used by you has its own MQTT client, adaptation can be made as per the function API definition which is abstracted from the header file. The required adaption API function and description are as follows:

| Function                               | Description                 |
| :--------------------------------- | :------------------- |
| jl_platform_mqtt_create            | Create client           |
| jl_platform_mqtt_destory           | Destroy client           |
| jl_platform_mqtt_connect           | Connect broker           |
| jl_platform_mqtt_disconnect        | Disconnect broker   |
| jl_platform_mqtt_yield             | Looping execution function         |
| jl_platform_mqtt_subscribe         | Message subscription function         |
| jl_platform_mqtt_publish           | Message release function         |
| jl_platform_mqtt_set_cb_connect    | Set successful connection callback function |
| jl_platform_mqtt_set_cb_disconnect | Set disconnection callback function |
| jl_platform_mqtt_set_cb_message    | Set message callback function     |