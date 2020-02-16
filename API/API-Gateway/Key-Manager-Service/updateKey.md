# updateKey


## Description
Modify key information

## Request Method
PATCH

## Request Address
https://apigateway.jdcloud-api.com/v1/regions/{regionId}/kms

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**keyId**|String|True| |keyid|
|**keyName**|String|False| |key Name|
|**keyDesc**|String|False| | |


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
