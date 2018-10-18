# getViewTree


## Description
Query all basic cloud resolution lines

## Request method
GET

## Request address
https://clouddnsservice.jdcloud-api.com/v1/regions/{regionId}/domain/{domainId}/viewTree

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**domainId**|String|True| |Domain Name ID|
|**regionId**|String|True| |Region ID to which the instance belongs|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**loadMode**|Integer|False| |Display Mode|
|**packId**|Integer|True| |Package ID|
|**viewId**|Integer|True| |View ID, 0 by default|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|ID of This Request|
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**data**|ViewTree[]|Tree of Resolution Line|
### ViewTree
|Name|Type|Description|
|---|---|---|
|**children**|ViewTree[]| |
|**disabled**|Boolean|Whether is this resolution line disabled|
|**label**|String|Name of Resolution Line|
|**leaf**|Boolean|Whether the data is a leaf node|
|**value**|Integer|Resolution Line ID|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|BAD_REQUEST|
