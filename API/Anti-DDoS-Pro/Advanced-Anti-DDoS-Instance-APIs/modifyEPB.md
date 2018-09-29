# modifyEPB


## Description
Update the Instance Elastic Protection Bandwidth

## Request method
POST

## Request address
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}:modifyEPB

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**instanceId**|String|True| |Instance ID|
|**regionId**|String|True| |Belonging Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**ePBSpec**|EPBSpec|True| |Update the Request Parameter of Elastic Protection Bandwidth|

### EPBSpec
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**ePB**|Integer|False| |Elastic Protective Bandwidth|

## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |



## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
