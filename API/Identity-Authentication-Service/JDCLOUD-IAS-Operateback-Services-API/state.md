# state


## Description
Get application status through running the background

## Request Method
GET

## Request Address
https://ias.jdcloud-api.com/v1/regions/{regionId}/operate_backend/state

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| | |

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**states**|State[]| |
### State
|Name|Type|Description|
|---|---|---|
|**label**|String|label|
|**value**|String|value|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
