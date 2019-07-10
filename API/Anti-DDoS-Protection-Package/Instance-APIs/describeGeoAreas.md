# describeGeoAreas


## Description
Search protection rule  Geo  Intercept settable regions

## Request Method
GET

## Request Address
https://antipro.jdcloud-api.com/v1/describeGeoAreas


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
