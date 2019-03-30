# setCCIpLimit


## Description
Set the speed limit of each Ip of instance CC defense

## Request Method
POST

## Request Address
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}:setCCIpLimit

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**instanceId**|Long|True| |Instance ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**cCSpec**|CcIpLimitSpec|True| |cc Parameter|

### CcIpLimitSpec
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**ccSpeedLimit**|Long|True| |Speed limit for each cc defense ip|
|**ccSpeedPeriod**|Long|True| |Speed limit statistic period of each cc defense ip|

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
|**code**|Integer|0: Failed to set speed limit of each IP for instance CC defense, 1: Succeeded to set speed limit of each IP for instance CC protection|
|**message**|String|Please specify reasons for failure in setting speed limit of each IP for instance CC defense|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
