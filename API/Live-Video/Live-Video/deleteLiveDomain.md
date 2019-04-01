# deleteLiveDomain


## Description
Delete live domain

## Request Method
DELETE

## Request Address
https://live.jdcloud-api.com/v1/domains/{publishDomain}

|Name|Type|If Compulsory|Description|
|---|---|---|---|
|**publishDomain**|String|True|Pushing Streaming Domain|

## Request Parameter
None


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
