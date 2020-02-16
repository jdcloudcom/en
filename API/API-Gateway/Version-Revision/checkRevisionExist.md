# checkRevisionExist


## Description
Check if version number is duplicated. If it is duplicated, return to the duplicated version number; if it isn’t, return to null

## Request Method
POST

## Request Address
https://apigateway.jdcloud-api.com/v1/regions/{regionId}/apiGroups/{apiGroupId}/revision:checkExist

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**apiGroupId**|String|True| |Group ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**revision**|String|True| |Version Number|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](checkrevisionexist#result)| |
|**requestId**|String|Request ID|

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**isRepeate**|Boolean|If the newly created revision number is duplicated|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
