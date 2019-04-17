# describeLivePlayAuthKey


## Description
Search play authentication KEY

## Request Method
GET

## Request Address
https://live.jdcloud-api.com/v1/livePlayAuthKey


## Request Parameter
|Name|Type|If Compulsory|Description|
|---|---|---|---|
|**playDomain**|String|True|Your Play Acceleration Domain|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|requestId|

### Result
|Name|Type|Description|
|---|---|---|
|**playDomain**|String|Playing Domain|
|**authStatus**|String|Play Authentication Status|
|**authKey**|String|Play Authentication Key|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
