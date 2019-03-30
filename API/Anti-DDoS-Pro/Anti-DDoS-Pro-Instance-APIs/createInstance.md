# createInstance


## Description
Purchase or upgrade Anti-DDoS Pro instance

## Request Method
POST

## Request Address
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/instances

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**createInstanceSpec**|CreateInstanceSpec|True| |Purchase or upgrade instance request parameters|

### CreateInstanceSpec
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**id**|Long|False| |Instance Id, required in case of upgrade|
|**name**|String|False| |Instance name, required in case of purchase|
|**buyType**|Integer|True| |Purchase Type: 1 Newly Purchased  3 Upgraded|
|**carrier**|Integer|True| |Link type, 1: China Telecom, 2: China Telecom, China Unicom, 3: China Telecom, China Unicom and China Mobile|
|**ipType**|Integer|True| |ip types that can be protected, only China Telecom Line supports IPV6 ISP line at present:<br>- 0: IPV4,<br>- 1: IPV4/IPV6<br>|
|**bp**|Integer|True| |Basic bandwidth: unit: Gbps|
|**ep**|Integer|True| |Elastic bandwidth: unit: Gbps|
|**bw**|Integer|True| |Business bandwidth: unit: Mbps|
|**timeSpan**|Long|False| |Purchased protection package duration, required in case of purchase of Anti-DDoS Pro instance<br>- When timeUnit is 3, the value can be 1-9<br>- When timeUnit is 4, the value can be 1-3<br>|
|**timeUnit**|Integer|False| |Purchase duration type, required in case of purchase of Anti-DDoS Pro instance<br>- 3: month<br>- 4: year<br>|
|**returnUrl**|String|False| |The page jumped to after the payment succeeds. The field is transferred in the console interaction mode|

## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |
|**error**|Error| |

### Error
|Name|Type|Description|
|---|---|---|
|**code**|Integer|Request Error Status Code|
|**status**|String|Request Error Status Code|
|**message**|String|Request Error Notification|
### Result
|Name|Type|Description|
|---|---|---|
|**code**|Integer|0: Purchasing or upgrading instance failed, 1: Purchasing or upgrading instance succeeded|
|**message**|String|Order id is given when purchasing or upgrading instance succeeded, and reasons are specified when creating instance failed|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
