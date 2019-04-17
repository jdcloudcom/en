# deleteAlias


## Description
Delete Alias

## Request Method
DELETE

## Request Address
https://function.jdcloud-api.com/v1/regions/{regionId}/functions/{functionName}/aliases/{aliasName}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**aliasName**|String|True| |Alias Name|
|**functionName**|String|True| |Function Name of Alias|
|**regionId**|String|True| |Region ID|

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
