# describeLiveDomains


## Description
Search domain list

## Request Method
GET

## Request Address
https://live.jdcloud-api.com/v1/domains


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNum**|Integer|False| |page; it is 1 by default; value range [1, 100000]|
|**pageSize**|Integer|False| |Segmentation size; it is 10 by default; value range[10, 100]|
|**publishDomain**|String|False| |Domain|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|ruquestId|
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**domainDetails**|DomainDetails[]|Domain Information Set|
|**pageNumber**|Integer|Current Page Number|
|**pageSize**|Integer|Number on Each Page|
|**totalCount**|Number|Search Total Amount|
### DomainDetails
|Name|Type|Description|
|---|---|---|
|**playDomains**|PlayDomain[]|Live Domain Set|
|**publishDomains**|PublishDomain[]|Pushing Streaming Domain Set|
### PlayDomain
|Name|Type|Description|
|---|---|---|
|**createTime**|String|Creation Time|
|**domainStatus**|String|Live Domain Status|
|**playDomain**|String|Playing Domain|
|**playDomainCname**|String|Playing Domain (Cname)|
|**updateTime**|String|Update Time|
### PublishDomain
|Name|Type|Description|
|---|---|---|
|**createTime**|String|Creation Time|
|**domainStatus**|String|Live Domain Status|
|**publishDomain**|String|Pushing Streaming Domain|
|**publishDomainCname**|String|Pushing Streaming Domain (Cname)|
|**updateTime**|String|Update Time|

## Return Code
|Return Code|Description|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**503**|Service unavailable|
|**200**|OK|
|**500**|Internal server error|
