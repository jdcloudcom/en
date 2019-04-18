# getRegions


## Description
Search region list information

## Request Method
GET

## Request Address
https://jdfusion.jdcloud-api.com/v1/regions/{regionId}/regions

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**x-jdcloud-fusion-cloudid**|String|False| |Cloud Registration Information ID|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|Request ID|

### Result
|Name|Type|Description|
|---|---|---|
|**regions**|RegionInfo[]| |
### RegionInfo
|Name|Type|Description|
|---|---|---|
|**regionId**|String|Region ID|
|**localName**|String|Region Name|
|**vendor**|String|Supplier|

## Return Code
|Return Code|Description|
|---|---|
|**200**|ok|
