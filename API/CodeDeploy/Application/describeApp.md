# describeApp


## Description
Search the information of one application

## Request Method
GET

## Request Address
https://deploy.jdcloud-api.com/v1/regions/{regionId}/app/{appId}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**appId**|String|True| |App Id|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**app**|App| |
### App
|Name|Type|Description|
|---|---|---|
|**appId**|String|Application ID|
|**appName**|String|Application Name|
|**regionId**|String|Region|
|**platform**|Integer|Deployment Platform: 1Virtual Machines,2Native Containers|
|**jdsfEnabled**|Integer|Use JD Distributed Service Framework: 0not used,1used|
|**desc**|String|Description|
|**lastDeployTime**|Integer|Last Deployment Time|
|**createTime**|Integer|Creation Time|
|**updateTime**|Integer|Update Time|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
