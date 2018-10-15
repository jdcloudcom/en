# describeCCDefaultThresholds


## Description
Query the CC Customized Default Threshold

## Request method
GET

## Request address
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/instance/describeCCDefaultThresholds

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
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
|**data**|CCDefaultThresholds| |
### CCDefaultThresholds
|Name|Type|Description|
|---|---|---|
|**hostQps**|Integer|Protection Threshold for Each Host|
|**hostUrlQps**|Integer|Protection Threshold for Each Host + URL|
|**ipHostQps**|Integer|Protection Threshold for Host of Each Source IP|
|**ipHostUrlQps**|Integer|Protection Threshold for Host + URL of Each Source IP|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
