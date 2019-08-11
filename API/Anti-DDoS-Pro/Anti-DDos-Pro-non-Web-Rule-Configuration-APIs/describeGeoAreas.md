# describeGeoAreas


## Description
Query the protection rules of non-web service forwarding rules  Region code may be set for Geo interception

## Request Method
GET

## Request Address
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/describeGeoAreas

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID, Anti-DDoS Pro dose not differentiate regions, upload to cn-north-1 directly|

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
|**err**|Err| |
### Err
|Name|Type|Description|
|---|---|---|
|**code**|Long|Same as http code|
|**details**|Object| |
|**message**|String| |
|**status**|String|Specific Error|
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
