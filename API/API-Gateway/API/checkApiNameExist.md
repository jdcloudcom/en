# checkApiNameExist


## Description
Check if the API name is duplicated when creating an API. If it is duplicated, return to the duplicated apiId; if it isn’t, return to null

## Request Method
POST

## Request Address
https://apigateway.jdcloud-api.com/v1/regions/{regionId}/apiGroups/{apiGroupId}/revision/{revision}/apis:checkApiNameExist

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**apiGroupId**|String|True| |Group ID|
|**revision**|String|True| |Version Number|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**apiName**|String|True| |API Name|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](checkapinameexist#result)|Check if API name is duplicated|
|**requestId**|String|Request ID|

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**apiId**|String|API Name|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
