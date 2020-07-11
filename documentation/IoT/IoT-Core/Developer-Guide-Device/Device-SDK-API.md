# Brief of SDK API
External header documents and functions provided by SDK are as follows:

| File Name | Instruction |
| :-----| :----- |
| joylink.h | Relevant definitions of return value |
| joylink_protocol.h | Definition of Message Structure and Definitions of Some APIs |
| joylink_sdk.h | Definition of external main process API |



API functions provided by SDK and their function descriptions are as follows:

| Function Name | Description |
| :-----| :----- |
| joylink_sdk_config_create | Create SDK configuration information |
| joylink_sdk_config_destory | Destroy SDK configuration information |
| joylink_sdk_create | Create SDK |
| joylink_sdk_destory | Destroy SDK |
| joylink_sdk_initialise | SDK Initialization |
| joylink_sdk_connect | Connect IoT Management Platform |
| joylink_sdk_main_loop | Enter the main loop and block |
| joylink_sdk_get_messageId | Obtain message Id |
| joylink_sdk_set_dev_cb_connect | Set device callback function: successful connection |
| joylink_sdk_set_dev_cb_disconnect | Set device callback function: disconnection |
| joylink_sdk_prop_version_check | Test request versions while setting attributes |
| joylink_sdk_set_dev_cb_prop_set | Set device callback function: attribute setting |
| joylink_sdk_dev_prop_set_response | Send attribute setting response |
| joylink_sdk_set_dev_cb_prop_get | Set device callback function: attribute obtaining |
| joylink_sdk_dev_prop_get_response | Send attribute obtaining response |
| joylink_sdk_dev_prop_post | Device attribute report |
| joylink_sdk_set_dev_cb_func_call | Set device callback function: method calling |
| joylink_sdk_dev_func_call_response | Send method calling response |
| joylink_sdk_dev_evt_online_status_post | Report online status of directly connected device |
| joylink_sdk_dev_evt_post | Device incident report |
| joylink_sdk_dev_reg_request | Automatic device registration request |
| joylink_sdk_set_dev_cb_reg_res | Set device callback function: automatic registration response |
| joylink_sdk_dev_thing_model_post | Report Thing Model of directly connected device |
| joylink_sdk_set_dev_cb_thmd_post_res | Set device callback function: Thing Model report response |
|  |  |
| joylink_proto_keyvalue_parse_bool | Resolve bool value |
| joylink_proto_keyvalue_pack_bool | Pack bool value |
| joylink_proto_keyvalue_parse_int32 | Resolve int32 |
| joylink_proto_keyvalue_pack_int32 | Pack int32 |
| joylink_proto_keyvalue_parse_double | Resolve double |
| joylink_proto_keyvalue_pack_double | Pack double |
| joylink_proto_keyvalue_parse_string | Resolve character string |
| joylink_proto_keyvalue_pack_string | Pack character string |