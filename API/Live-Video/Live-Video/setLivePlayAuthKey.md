# setLivePlayAuthKey


## Description
Set play authentication KEY

## Request Method
POST

## Request Address
https://live.jdcloud-api.com/v1/livePlayAuthKey


## Request Parameter
|Name|Type|If Compulsory|Description|
|---|---|---|---|
|**playDomain**|String|True|Your Play Acceleration Domain|
|**authStatus**|String|False|Play Authentication Status|
|**authKey**|String|False|Play Authentication Key|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|requestId|


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
