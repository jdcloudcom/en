# exportThingModel


## Description
Export Thing Model

## Request Method
GET

## Request Address
https://iothub.jdcloud-api.com/v2/regions/{regionId}/products/{productKey}/abilities:exportThingModel

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**productKey**|String|True| |Product Key|

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
|**thingModel**|Object| |

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
