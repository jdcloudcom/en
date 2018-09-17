# setCleanThreshold


## Description
Set the EIP cleaning threshold

## Request method
POST

## Request address
https://baseanti.jdcloud-api.com/v1/regions/{regionId}/ipResources/{ip}:setCleanThreshold

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**ip**|String|True||EIP address|
|**regionId**|String|True||Belonging region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**cleanThresholdSpec**|[CleanThresholdSpec](##CleanThresholdSpec)|True||cc parameter|

### <a name="CleanThresholdSpec">CleanThresholdSpec</a>
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**cleanThresholdBps**|Integer|False||Traffic rate of trigger cleaning, unit: bps, with the range from 10000000 to 300000000|
|**cleanThresholdPps**|Integer|False||Package rate of trigger cleaning, unit: pps, with the range from 2000 to 70000|

## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String||



## Return code
|Return code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
