# checkGroupNameExist


## Description
Check if group name is duplicated. If it is duplicated, return to the duplicated apiGroupId; if it isn’t, return to null

## Request Method
POST

## Request Address
https://apigateway.jdcloud-api.com/v1/regions/{regionId}/apiGroups:checkGroupNameExist

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**groupName**|String|True| |Group Name|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](checkgroupnameexist#result)|Search the details of API group|
|**requestId**|String|Request ID|

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**apiGroupId**|String|Group id|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
