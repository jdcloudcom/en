# setCcIpLimit


## Description
Set the speed limit of each Ip of instance CC defense

## Request method
POST

## Request address
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}:setCcIpLimit

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**instanceId**|String|True| |Instance ID|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**cCSpec**|CcIpLimitSpec|True| |cc Parameter|

### CcIpLimitSpec
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**ccSpeedLimit**|Integer|False| |Speed Limit of Each CC Defense IP|
|**ccSpeedPeriod**|Integer|False| |Speed Limit Statistic Period of Each CC Defense IP|

## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |



## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
