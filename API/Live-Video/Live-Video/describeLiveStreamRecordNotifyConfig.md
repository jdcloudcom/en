# describeLiveStreamRecordNotifyConfig


## Description
Search record callback configuration

## Request Method
GET

## Request Address
https://live.jdcloud-api.com/v1/recordNotifys/{publishDomain}

|Name|Type|If Compulsory|Description|
|---|---|---|---|
|**publishDomain**|String|True|Pushing Streaming Accelerated Domain|

## Request Parameter
None


## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|requestId|

### Result
|Name|Type|Description|
|---|---|---|
|**publishDomain**|String|Your Accelerated Domain|
|**notifyUrl**|String|Callback Address|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
