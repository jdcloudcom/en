# updateAlias


## Description
Update Alias

## Request Method
PUT

## Request Address
https://function.jdcloud-api.com/v1/regions/{regionId}/functions/{functionName}/aliases/{aliasName}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**functionName**|String|True| |Function Name of Alias|
|**aliasName**|String|True| |Alias Name|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**description**|String|True| |Description Information of Alias|
|**version**|String|True| |Alias Corresponding Version|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result|Update Alias Return Value|
|**requestId**|String|This Request Id|

### Result
|Name|Type|Description|
|---|---|---|
|**data**|Alias| |
### Alias
|Name|Type|Description|
|---|---|---|
|**aliasId**|String|Alias Id|
|**aliasName**|String|Alias Name|
|**functionName**|String|Function Name Corresponding to Alias|
|**description**|String|Description Information of Alias|
|**version**|String|Version Name Corresponding to Alias|

## Return Code
|Return Code|Description|
|---|---|
|**200**|A successful response.|
|**404**|NOT_FOUND|
