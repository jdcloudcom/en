# getDomainQueryTraffic


## Description
View query traffic of domain names

## Request method
GET

## Request address
https://clouddnsservice.jdcloud-api.com/v1/regions/{regionId}/domain/{domainId}/queryTraffic

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**domainId**|String|True| |Domain Name ID, please get it by using getDomains interface.|
|**regionId**|String|True| |Region ID to which the instance belongs|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**domainName**|String|True| |Domain Name|
|**end**|String|True| |Termination Time, UTC time, for example, 2017-11-10T23:00:00Z|
|**start**|String|True| |Start Time, UTC time, for example, 2017-11-10T23:00:00Z|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**time**|Long[]|Time Series|
|**traffic**|Double[]|Data Series Corresponding to Time Series|
|**unit**|String|Unit of Data Series|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|NOT_FOUND|
