# describeIpResourceInfo


## Description
Search the EIP basic information

## Request method
GET

## Request address
https://baseanti.jdcloud-api.com/v1/regions/{regionId}/ipResources/{ip}

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**ip**|String|True| |EIP Address|
|**regionId**|String|True| |Belonging Region ID|

## Request parameter
None


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**data**|IpResourceInfo| |
### IpResourceInfo
|Name|Type|Description|
|---|---|---|
|**blackHoleThreshold**|Integer|Black Hole Threshold, Unit: bps|
|**cleanThresholdBps**|Integer|Traffic Rate of Trigger Cleaning, Unit: bps|
|**cleanThresholdPps**|Integer|Package Rate of Trigger Cleaning, Unit: pps|
|**ip**|String|EIP Address|
|**region**|String|Region, i.e. cn-north-1, cn-south-1, cn-east-1 and cn-east-2|
|**safeStatus**|Integer|Security Status, 0->Safe  1->Clean  2-Black Hole|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
