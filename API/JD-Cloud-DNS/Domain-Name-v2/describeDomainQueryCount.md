# describeDomainQueryCount


## Description
View resolution times of primary domain

## Request Method
GET

## Request Address
https://domainservice.jdcloud-api.com/v2/regions/{regionId}/domain/{domainId}/queryCount

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID of Instances|
|**domainId**|String|True| |Domain ID, please get it by using the describeDomains API.|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**domainName**|String|True| |Searched primary domain, please get it by using the describeDomains API|
|**start**|String|True| |Start time of search period, UTC time format, e.g., 2017-11-10T23:00:00Z|
|**end**|String|True| |End time of search period, UTC time format, e.g., 2017-11-10T23:00:00Z|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|ID of Request at this time|

### Result
|Name|Type|Description|
|---|---|---|
|**time**|Long[]|Time Series|
|**traffic**|Long[]|Data Series Corresponding to Time Series, Unit: times|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|NOT_FOUND|
