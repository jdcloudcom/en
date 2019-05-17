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
|**versionName**|String|True| |Version Name|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**triggerId**|String|True| |TriggerId|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result|Obtaining Return Value of Trigger Details|
|**requestId**|String|This RequestId|

### Result
|Name|Type|Description|
|---|---|---|
|**data**|Trigger| |
### Trigger
|Name|Type|Description|
|---|---|---|
|**triggerId**|String|TriggerId|
|**functionName**|String|Function Name of Trigger|
|**versionName**|String|Function Version Name of Trigger|
|**eventSource**|String|Event source types corresponding to the trigger include oss and apigateway now.|
|**eventSourceId**|String|Corresponding Event Source of TriggerId|
|**createTime**|String|Creation Time of Trigger|
|**updateTime**|String|Last Modification Time of Trigger|

## Return Code
|Return Code|Description|
|---|---|
|**200**|A successful response.|
|**404**|NOT_FOUND|
