# describeGeoAreas


## Description
Query the protection rules of non-web service forwarding rules  Region code may be set for Geo interception

## Request Method
GET

## Request Address
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/describeGeoAreas

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
None


## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |
|**error**|Error| |

### Error
|Name|Type|Description|
|---|---|---|
|**code**|Integer|Request Error Status Code|
|**status**|String|Request Error Status Code|
|**message**|String|Request Error Notification|
### Result
|Name|Type|Description|
|---|---|---|
|**dataList**|Country[]| |
### Country
|Name|Type|Description|
|---|---|---|
|**label**|String|Country or Region Name|
|**value**|String|Country or Region Code|
|**children**|Country[]| |

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
