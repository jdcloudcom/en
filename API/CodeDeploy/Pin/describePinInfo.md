# describePinInfo


## Description
Search the information of a pin

## Request Method
GET

## Request Address
https://deploy.jdcloud-api.com/v1/regions/{regionId}/pinInfo

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

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
|**pinInfo**|PinInfo| |
### PinInfo
|Name|Type|Description|
|---|---|---|
|**pin**|String|pin|
|**appMax**|Integer|Application Count Control|
|**appCount**|Integer|Current Count of Application(s)|
|**groupMax**|Integer|Deployment Group Count Control|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
