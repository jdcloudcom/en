# describeDomains


## Description
Get the primary domain list of the user.   
Please call this API to get related domainId and domainName before calling a domain-related API.  
For relevant concepts of primary name, please refer to<a href="https://docs.jdcloud.com/en/jd-cloud-dns/product-overview">the JD Cloud DNS document.</a>


## Request Method
GET

## Request Address
https://domainservice.jdcloud-api.com/v2/regions/{regionId}/domain

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID of Instances|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|True| |SN of each page for search by pages, the starting value is 1 and default value is 1|
|**pageSize**|Integer|True| |Rows set per page for search by pages, the default value is 10|
|**domainName**|String|False| |Keyword, match the primary domain as per the "%domainName%" mode|
|**domainId**|Integer|False| |Domain Name ID. Search the domainId domain only, if the value is not 0|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|ID of Request at this time|

### Result
|Name|Type|Description|
|---|---|---|
|**dataList**|DomainInfo[]|Domain List|
|**currentCount**|Integer|Number of Domain in Domain List on Current Page|
|**totalCount**|Integer|Number of All Matched Domain List|
|**totalPage**|Integer|Total Pages of All Matched Domain Lists Based on Paging Parameter|
### DomainInfo
|Name|Type|Description|
|---|---|---|
|**id**|Integer|Unique Domain ID|
|**domainName**|String|Domain Character String|
|**createTime**|Long|Creation time, format: Unix timestamp, time unit: millisecond|
|**expirationDate**|Long|Expiration time, format: Unix timestamp, time unit: millisecond|
|**packId**|Integer|Package Type, Free:0 Enterprise Version: 1 Advanced Enterprise Version: 2|
|**packName**|String|Package Name|
|**resolvingStatus**|String|Resolution status, No Resolution: 1, Normal Resolution: 2, Partial Resolution: 3, Suspended Resolution: 4, NS Un-modified: 5|
|**creator**|String|Creator|
|**jcloudNs**|Boolean|Whether is JD Cloud resource|
|**lockStatus**|Integer|Locking status of domain, 0: Unlocked, 1: Locked|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|BAD_REQUEST|
