# getTrigger


## Description
Obtaining Trigger Details

## Request Method
GET

## Request Address
https://function.jdcloud-api.com/v1/regions/{regionId}/functions/{functionName}/versions/{versionName}:gettrigger

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**functionName**|String|True| |Function Name|
|**regionId**|String|True| |Region ID|
|**versionName**|String|True| |Version Name|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**triggerId**|String|True| |TriggerId|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|This RequestId|
|**result**|Result|Obtaining Return Value of Trigger Details|

### Result
|Name|Type|Description|
|---|---|---|
|**data**|Trigger| |
### Trigger
|Name|Type|Description|
|---|---|---|
|**createTime**|String|Creation Time of Trigger|
|**eventSource**|String|Event source types corresponding to the trigger include oss and apigateway now.|
|**eventSourceId**|String|Corresponding Event Source of TriggerId|
|**functionName**|String|Function Name of Trigger|
|**triggerId**|String|TriggerId|
|**updateTime**|String|Last Modification Time of Trigger|
|**versionName**|String|Function Version Name of Trigger|

## Return Code
|Return Code|Description|
|---|---|
|**200**|A successful response.|
|**404**|NOT_FOUND|
