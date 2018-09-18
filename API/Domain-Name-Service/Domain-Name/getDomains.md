# getDomains


## Description
Query the list of the main domain names under the username

## Request method
GET

## Request address
https://clouddnsservice.jdcloud-api.com/v1/regions/{regionId}/domain

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True||Region ID to which the instance belongs|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**domainName**|String|False||Keyword, matching the main domain name name according to the "%domainName%" pattern|
|**pageNumber**|Integer|True||Serial number of each page that is queried during the page query. The starting value is 1, and the default is 1.|
|**pageSize**|Integer|True||Number of rows per page set during the page query, the default is 10.|


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|ID of this request|
|**result**|Result||


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**currentCount**|Integer|Number of domain names in the domain name list of the current page|
|**dataList**|Domain[]|Domain Name List|
|**totalCount**|Integer|Number of all matched domain name lists|
|**totalPage**|Integer|Pages of all matched domain name lists in total according to the paging parameters|
### <a name="Domain">Domain</a>
|Name|Type|Description|
|---|---|---|
|**createTime**|Integer|Creation time, format Unix timestamp|
|**domainName**|String|Domain Name String|
|**expirationDate**|Integer|Expiration time, format Unix timestamp|
|**id**|Integer|Unique ID of the domain name|
|**packId**|Integer|Package type, 0->free 1->Enterprise Edition 2->Advanced Edition|

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|BAD_REQUEST|
