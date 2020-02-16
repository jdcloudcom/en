# queryAccessAuth


## Description
Search a single access authorization

## Request Method
GET

## Request Address
https://apigateway.jdcloud-api.com/v1/regions/{regionId}/accessAuths/{accessAuthId}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**accessAuthId**|String|True| |Access Authorization ID|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](queryaccessauth#result)| |
|**requestId**|String| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**accessAuth**|[AccessAuth](queryaccessauth#accessauth)| |
### <div id="accessauth">AccessAuth</div>
|Name|Type|Description|
|---|---|---|
|**accessAuthId**|String|Access Authorization ID|
|**authUserType**|String|Authorized User Type|
|**accessKey**|String|Access Key|
|**description**|String|Description|
|**bindGroups**|String|Associated group, separated by English comma|
|**appId**|String|appid of api Caller|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
