# deleteVersion


## Description
Delete Version

## Request Method
DELETE

## Request Address
https://function.jdcloud-api.com/v1/regions/{regionId}/functions/{functionName}/versions/{versionName}

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
|**requestId**|String|This Request Id|


## Return Code
|Return Code|Description|
|---|---|
|**200**|A successful response.|
|**404**|NOT_FOUND|
