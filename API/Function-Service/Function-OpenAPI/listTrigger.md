# listTrigger


## Description
Search Trigger List

## Request Method
GET

## Request Address
https://function.jdcloud-api.com/v1/regions/{regionId}/functions/{functionName}/versions/{versionName}:innerlisttriggers

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**functionName**|String|True| |Function Name|
|**regionId**|String|True| |Region ID|
|**versionName**|String|True| |Version Name|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|This RequestId|
|**result**|Result|Search Trigger List Return Value|

### Result
|Name|Type|Description|
|---|---|---|
|**data**|Trigger[]| |
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
