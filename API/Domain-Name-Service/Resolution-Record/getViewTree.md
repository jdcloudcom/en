# getViewTree


## Description
Query all basic cloud resolution lines

## Request method
GET

## Request address
https://clouddnsservice.jdcloud-api.com/v1/regions/{regionId}/domain/{domainId}/viewTree

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**domainId**|String|True||Domain Name ID|
|**regionId**|String|True||Region ID to which the instance belongs|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**loadMode**|Integer|False||Display Mode|
|**packId**|Integer|True||Package ID|
|**viewId**|Integer|True||view ID, 0 in default|


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|ID of this request|
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**data**|[ViewTree[]](##ViewTree)|Tree of the resolution line|
### <a name="ViewTree">ViewTree</a>
|Name|Type|Description|
|---|---|---|
|**children**|[ViewTree[]](##ViewTree)||
|**disabled**|Boolean|Whether this resolution line is disabled|
|**label**|String|Name of the resolution line|
|**leaf**|Boolean|Whether the data is a leaf node|
|**value**|Integer|Resolution Line ID|

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|BAD_REQUEST|
