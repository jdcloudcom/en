# getRegionsAvailableZones


## Description
Search available region list information

## Request Method
GET

## Request Address
https://jdfusion.jdcloud-api.com/v1/regions/{regionId}/regions_availableZones/{region}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**region**|String|True| |Region ID|
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
|**azs**|AzInfo[]| |
### AzInfo
|Name|Type|Description|
|---|---|---|
|**zoneId**|String|Available Region ID|
|**localName**|String|Name|

## Return Code
|Return Code|Description|
|---|---|
|**200**|ok|
