# createAlias


## Description
Create alias

## Request Method
POST

## Request Address
https://function.jdcloud-api.com/v1/regions/{regionId}/functions/{functionName}/aliases

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**functionName**|String|True| |Function Name of Alias|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**aliasName**|String|True| |Alias Name|
|**description**|String|False| |Description Information of Alias|
|**version**|String|False| |Version Name Corresponding to Alias|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|This Request Id|
|**result**|Result|alias Response Body|

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
