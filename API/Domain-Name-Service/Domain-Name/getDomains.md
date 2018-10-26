# getDomains


## Description
Query the list of the main domain names under the username

## Request method
GET

## Request address
https://clouddnsservice.jdcloud-api.com/v1/regions/{regionId}/domain

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID to which the instance belongs|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**domainName**|String|False| |Keyword, matching the main domain name according to the '%domainName%' pattern|
|**pageNumber**|Integer|True| |Serial number of each page that is queried during the page query. The starting value is 1, and the default is 1.|
|**pageSize**|Integer|True| |Number of rows per page set during the page query, the default is 10.|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|ID of This Request|
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**currentCount**|Integer|Number of Domain Names in the Domain Name List of the Current Page|
|**dataList**|Domain[]|Domain List|
|**totalCount**|Integer|Number of All Matched Domain Name Lists|
|**totalPage**|Integer|Pages of All Matched Domain Name Lists in Total According to the Paging Parameters                    |
### Domain
|Name|Type|Description|
|---|---|---|
|**createTime**|Integer|Creation Time, Format Unix Timestamp |
|**domainName**|String|Domain Name String|
|**expirationDate**|Integer|Expiration Time, Format Unix Timestamp|
|**id**|Integer|Unique ID of the Domain Name|
|**packId**|Integer|Package Type, 0->Free 1->Enterprise Edition 2->Advanced Edition|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|BAD_REQUEST|
