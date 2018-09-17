# describeQuota


## Description
Search resource quota and support native container and secret.


## Request method
GET

## Request address
https://nc.jdcloud-api.com/v1/regions/{regionId}/quotas

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**resourceType**|String|True||resourceType - Resource type, support many [container, secret]<br>|


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String||
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**quota**|[Quota](##Quota)||
### <a name="Quota">Quota</a>
|Name|Type|Description|
|---|---|---|
|**limit**|Integer|Quota|
|**used**|Integer|Used number|

## Return code
|Return code|Description|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**503**|Service unavailable|
|**200**|OK|
|**500**|Internal server error|
