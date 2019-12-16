# importThingModel


## Description
Import Thing Model

## Request Method
PUT

## Request Address
https://iothub.jdcloud-api.com/v2/regions/{regionId}/products/{productKey}/abilities:importThingModel

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**productKey**|String|True| |Product Key|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**thingModel**|Object|True| |Thing Model JSON|


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
