# searchRR


## Description
Query the resolution record of the main domain name

## Request method
GET

## Request address
https://clouddnsservice.jdcloud-api.com/v1/regions/{regionId}/domain/{domainId}/RR

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**domainId**|String|True||Domain Name ID|
|**regionId**|String|True||Region ID to which the instance belongs|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False||Current page, starting value of 1, default value of 1|
|**pageSize**|Integer|False||Number of rows per page set during the page query, default value of 10|


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|ID of this request|
|**result**|Result||


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**currentCount**|Integer|Resolution records of current page|
|**dataList**|RR[]|List of the resolution record|
|**totalCount**|Integer|Number of all resolution records|
|**totalPage**|Integer|Pages of all resolution records|
### <a name="RR">RR</a>
|Name|Type|Description|
|---|---|---|
|**hostRecord**|String|Machine Record|
|**hostValue**|String|Value of the resolution record|
|**id**|Integer|Unique ID of the domain name resolution|
|**jcloudRes**|Boolean|JD Cloud Resource?|
|**mxPriority**|Integer|Priority, only exists in some resolution record types|
|**port**|Integer|port, only exists in some resolution record types|
|**ttl**|Integer|Life time of the resolution record|
|**type**|String|Type of the resolution record|
|**viewValue**|Integer[]|ID of the resolution line|
|**weight**|Integer|Weight of the resolution record|

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|BAD_REQUEST|
