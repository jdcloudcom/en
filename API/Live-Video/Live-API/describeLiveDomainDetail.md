# describeLiveDomainDetail


## Description
Search the relevant information of specified domain

## Request Method
GET

## Request Address
https://live.jdcloud-api.com/v1/domains/{publishDomain}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**publishDomain**|String|True| |Pushing Streaming Domain|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|ruquestId|
|**result**|Result| |

### Result
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
