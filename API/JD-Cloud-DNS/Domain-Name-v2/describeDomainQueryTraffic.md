# describeDomainQueryTraffic


## Description
View Domain Search Traffic

## Request Method
GET

## Request Address
https://domainservice.jdcloud-api.com/v2/regions/{regionId}/domain/{domainId}/queryTraffic

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID of Instances|
|**domainId**|String|True| |Domain ID, please get it by using the describeDomains API.|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**domainName**|String|True| |Primary domain, please get it by using the describeDomains API|
|**start**|String|True| |Start time of time period, UTC time format, e.g., 2017-11-10T23:00:00Z|
|**end**|String|True| |End time of time period, UTC time format, e.g., 2017-11-10T23:00:00Z|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**time**|Long[]|Time Series|
|**unit**|String|Unit of Data Series|
|**traffic**|Double[]|Data Series Corresponding to Time Series|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|NOT_FOUND|
