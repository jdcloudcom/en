# describeResourceRecord


## Description
Search resolution record of primary domain.  
Please call this interface to get list of resolution record before using interfaces related to resolution records.


## Request Method
GET

## Request Address
https://domainservice.jdcloud-api.com/v2/regions/{regionId}/domain/{domainId}/ResourceRecord

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID of Instances|
|**domainId**|String|True| |Domain ID, please get it by using the describeDomains API.|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False| |Current page number, the starting value is 1 and default value is 1|
|**pageSize**|Integer|False| |Rows set per page for search by pages, the default value is 10|
|**search**|String|False| |Keyword, matching host records of resolution record as per the mode "%search%"|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|ID of Request at this time|

### Result
|Name|Type|Description|
|---|---|---|
|**dataList**|RRInfo[]|Resolution Record List|
|**totalCount**|Integer|Number of All Resolution Record|
|**totalPage**|Integer|Page Number of All Resolution Record|
|**currentCount**|Integer|Number of Resolution Record in Current Page|
### RRInfo
|Name|Type|Description|
|---|---|---|
|**creator**|String|Creator|
|**viewName**|String|ISP Line Name|
|**id**|Integer|Unique Domain ID for Domain Resolution|
|**hostRecord**|String|Machine Record|
|**hostValue**|String|Value of Resolution Record|
|**jcloudRes**|Boolean|Whether is JD Cloud resource|
|**mxPriority**|Integer|Priority level is only existed in MX and SRV resolution record types|
|**port**|Integer|Port is only existed in SRV resolution record type|
|**ttl**|Integer|Resolution record TTL, unit: second|
|**type**|String|For resolution record type, please refer to<a href="https://docs.jdcloud.com/en/jd-cloud-dns/detailed-interpretation-of-parsed-records">detailed annotation of resolution record type</a>|
|**weight**|Integer|Weight of resolution record|
|**viewValue**|Integer[]|ID of resolution ISP Line|
|**resolvingStatus**|String|Resolution record status, normal resolution: 2, suspended resolution: 4|
|**updateTime**|Long|Resolution Record Update Time|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|BAD_REQUEST|
