# describeCCDefaultThresholds


## Description
Query the CC Customized Default Threshold

## Request Method
GET

## Request Address
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/describeCCDefaultThresholds

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
None


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
|**data**|CCDefaultThresholds| |
### CCDefaultThresholds
|Name|Type|Description|
|---|---|---|
|**hostQps**|Integer|Protection Threshold for Each Host|
|**hostUrlQps**|Integer|Protection Threshold for Each Host + URL|
|**ipHostQps**|Integer|Protection Threshold for Host of Each Source IP|
|**ipHostUrlQps**|Integer|Protection Threshold for Host + URL of Each Source IP|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
