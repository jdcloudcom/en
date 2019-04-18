# describeLiveServiceStatus


## Description
Search Service Enabling Status

## Request Method
GET

## Request Address
https://live.jdcloud-api.com/v1/users:status


## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|ruquestId|

### Result
|Name|Type|Description|
|---|---|---|
|**openStatus**|Boolean|Service Enabling Status|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
