# asyncInvoke


## Description
Execution Function of Asynchronous Test

## Request Method
POST

## Request Address
https://function.jdcloud-api.com/v1/regions/{regionId}/functions/{functionName}/versions/{versionName}:asyncinvoke

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**functionName**|String|True| |Function Name|
|**versionName**|String|True| |Version Name|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**event**|String|True| |Enter Event of Asynchronous Execution Function|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Id of This Request|


## Return Code
|Return Code|Description|
|---|---|
|**200**|A successful response.|
|**404**|NOT_FOUND|
