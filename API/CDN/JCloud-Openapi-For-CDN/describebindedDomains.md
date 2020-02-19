# describebindedDomains


## Description
Search Associated Domain

## Request Method
GET

## Request Address
https://cdn.jdcloud-api.com/v1/liveDomain/{domain}:queryBindedDomains

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**domain**|String|True| |User Domain|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](#result)| |
|**requestId**|String| |

### <div id="Result">Result</div>
|Name|Type|Description|
|---|---|---|
|**relatedDomainList**|[RelatedDomains[]](#relateddomains)|List of Relevant Domains|
### <div id="RelatedDomains">RelatedDomains</div>
|Name|Type|Description|
|---|---|---|
|**domainName**|String|Domain|
|**domainType**|String|(Associated domain type) publish or play|
|**rtmpUrls**|String[]|rtmp Format of Relevant Domain|
|**flvUrls**|String[]|flv Format of Relevant Domain|
|**hlsUrls**|String[]|hls Format of Relevant Domain|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
