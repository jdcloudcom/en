# checkPin


## Description
Verify whether pin exists

## Request Method
POST

## Request Address
https://apigateway.jdcloud-api.com/v1/regions/{regionId}/pins/{pin}:checkPin

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pin**|String|True| |JD Cloud pin|
|**regionId**|String|True| |Region ID|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication falied|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
