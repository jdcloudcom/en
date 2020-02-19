# createLiveDomainForVideo


## Description
Create live domain

## Request Method
POST

## Request Address
https://cdn.jdcloud-api.com/v1/liveDomain:createForVideo


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**x-jdcloud-channel**|String|False|cdn|Domain source cdn/cdn, video cloud|
|**externId**|String|True| | |
|**playDomain**|String|False| |Play domain (It can only be null if siteType=1 and publishDomain is not null)|
|**publishDomain**|String|False| |Pushing streaming domain (When siteType=push, playDomain and publishDomain cannot be transmitted at the same time)|
|**sourceType**|String|False| |Back-to-origin can be only one of types [ips,domain]|
|**backHttpType**|String|False| | |
|**defaultSourceHost**|String|False| |Default back-to-origin host|
|**siteType**|String|True| |Site type 1: push (pushing streaming mode), 2: pull (pulling streaming mode), 3: mix (mix mode)|
|**backSourceType**|String|False| |Back-to-origin type, rtmp, http-flv, https-flv, http-hls and https-hls are supported and rtmp is the default|
|**playProtocol**|String[]|False| |Play protocols are rtmp, hdl and hls by default, select all|
|**forwardCustomVhost**|String|False| |Forward Pushing Address|
|**ipSource**|[IpSourceInfo[]](#ipsourceinfo)|False| |Back-to-origin IP Information|
|**domainSource**|[DomainSourceInfo[]](#domainsourceinfo)|False| |Back-to-origin Domain Information|
|**videoType**|String|False| |H.264 by default|
|**audioType**|String|False| |AAC by default|

### <div id="DomainSourceInfo">DomainSourceInfo</div>
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**priority**|Integer|True| |Priority Level (1-10)|
|**sourceHost**|String|False| |Back-to-origin host|
|**domain**|String|True| |Back-to-origin Domain|
### <div id="IpSourceInfo">IpSourceInfo</div>
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**master**|Integer|True| |1: Host; 2: Backup|
|**ip**|String|True| |Back-to-origin IP|
|**ratio**|Double|False| |Proportion|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Object| |
|**requestId**|String| |


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
