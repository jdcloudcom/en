# setCleanThreshold


## Description
Set the EIP cleaning threshold

## Request method
POST

## Request address
https://baseanti.jdcloud-api.com/v1/regions/{regionId}/ipResources/{ip}:setCleanThreshold

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**ip**|String|True| |EIP Address|
|**regionId**|String|True| |Belonging Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**cleanThresholdSpec**|CleanThresholdSpec|True| |cc Parameter|

### CleanThresholdSpec
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**cleanThresholdBps**|Integer|False| |Traffic Rate of Trigger Cleaning, Unit: bps, Ranging from 10000000 to 300000000|
|**cleanThresholdPps**|Integer|False| |Package Rate of Trigger Cleaning, Unit: pps, Ranging from 2000 to 70000|

## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |



## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
