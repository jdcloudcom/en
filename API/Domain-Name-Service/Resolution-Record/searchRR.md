# searchRR


## Description
Query the Resolution Record of the main domain name

## Request method
GET

## Request address
https://clouddnsservice.jdcloud-api.com/v1/regions/{regionId}/domain/{domainId}/RR

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**domainId**|String|True| |Domain Name ID|
|**regionId**|String|True| |Region ID to which the instance belongs|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False| |Current page, starting value is 1, default value is 1|
|**pageSize**|Integer|False| |Number of rows per page set during the page query, default value is 10|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|ID of This Request|
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**currentCount**|Integer|Resolution Records of Current Page|
|**dataList**|RR[]|List of Resolution Records|
|**totalCount**|Integer|Number of All Resolution Records|
|**totalPage**|Integer|Pages of All Resolution Records|
### RR
|Name|Type|Description|
|---|---|---|
|**hostRecord**|String|Machine Record|
|**hostValue**|String|Value of Resolution Record|
|**id**|Integer|Unique ID of the Domain Name Resolution|
|**jcloudRes**|Boolean|JD Cloud Resource?|
|**mxPriority**|Integer|Priority, only exists in some resolution record types|
|**port**|Integer|Port, only exists in some resolution record types|
|**ttl**|Integer|Life Time of Resolution Record|
|**type**|String|Type of Resolution Record|
|**viewValue**|Integer[]|ID of Resolution Line|
|**weight**|Integer|Weight of Resolution Record|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|BAD_REQUEST|
