# describeWebRuleWhiteListGeoAreas


## Description
In searching whitelist of Geo mode of web service forwarding rules, the region code can be set

## Request Method
GET

## Request Address
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/describeWebRuleWhiteListGeoAreas

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID, Anti-DDoS Pro dose not differentiate regions, upload to cn-north-1 directly|

## Request Parameter
None


## Return Parameter
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
