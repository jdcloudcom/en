# getAlias


## Description
Search Alias Details

## Request Method
GET

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
|**result**|Result|Alias Details Return Value|

### Result
|Name|Type|Description|
|---|---|---|
|**data**|Alias| |
### Alias
|Name|Type|Description|
|---|---|---|
|**aliasId**|String|Alias Id|
|**aliasName**|String|Alias Name|
|**description**|String|Description Information of Alias|
|**functionName**|String|Function Name Corresponding to Alias|
|**version**|String|Version Name Corresponding to Alias|

## Return Code
|Return Code|Description|
|---|---|
|**200**|A successful response.|
|**404**|NOT_FOUND|
