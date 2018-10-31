# checkName


## Description
Detect Whether the Instance Name is Legal

## Request method
GET

## Request address
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/instance/checkName

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**name**|String|True| |Instance Name to be Detected|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**data**|Boolean|Detection Result, True Means Legal, False Means Illegal|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
