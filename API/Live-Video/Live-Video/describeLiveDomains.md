# describeLiveDomains


## Description
Search domain list

## Request Method
GET

## Request Address
https://live.jdcloud-api.com/v1/domains


## Request Parameter
|Name|Type|If Compulsory|Description|
|---|---|---|---|
|**pageNum**|Integer|False|page; it is 1 by default; value range [1, 100000]|
|**pageSize**|Integer|False|Segmentation size; it is 10 by default; value range[10, 100]|
|**publishDomain**|String|False|Domain|


## Examples
    {
        "pageNum": 1,
        "pageSize": 10,
        "publishDomain": "push.yourdomain.com"
    }

## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|requestId|

### Result
|Name|Type|Description|
|---|---|---|
|**pageNumber**|Integer|Current Page Number|
|**pageSize**|Integer|Number on Each Page|
|**totalCount**|Integer|Search Total Amount|
|**domainDetails**|DomainDetails[]|Domain Information Set|
### DomainDetails
|Name|Type|Description|
|---|---|---|
|**publishDomains**|PublishDomain[]|Pushing Streaming Domain Set|
|**playDomains**|PlayDomain[]|Live Domain Set|
### PlayDomain
|Name|Type|Description|
|---|---|---|
|**playDomain**|String|Playing Domain|
|**playDomainCname**|String|Playing Domain (Cname)|
|**domainStatus**|String|Live Domain Status:<br>  - online represents enable<br>  - offline represents disable<br>  - configuring represents configuring<br>  - configure_failed represents configuration failed<br>  - checking represents checking<br>  - check_failed represents check failed<br>|
|**playType**|String|Playing Domain Type:<br>  - normal  Normal Playing Domain<br>  - restart Restart Domain<br>|
|**createTime**|String|Creation Time|
|**updateTime**|String|Update Time|
### PublishDomain
|Name|Type|Description|
|---|---|---|
|**publishDomain**|String|Pushing Streaming Domain|
|**publishDomainCname**|String|Pushing Streaming Domain (Cname)|
|**domainStatus**|String|Live Domain Status:<br>  - online represents enable<br>  - offline represents disable<br>  - configuring represents configuring<br>  - configure_failed represents configuration failed<br>  - checking represents checking<br>  - check_failed represents check failed<br>|
|**createTime**|String|Creation Time|
|**updateTime**|String|Update Time|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
