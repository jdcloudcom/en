# batchCreateLiveDomainForVideo


## Description
Create live domain

## Request Method
POST

## Request Address
https://cdn.jdcloud-api.com/v1/liveDomain:batchCreateForVideo


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**x-jdcloud-channel**|String|False|cdn|Domain source cdn/cdn, video cloud|
|**externId**|String|True| | |
|**playDomain**|String|True| |Playing Domain|
|**publishDomain**|String|False| |Be sure to transmit the pushing streaming domain when creating the same|
|**sourceType**|String|True| |Back-to-origin can be only one of types [ips,domain]|
|**backHttpType**|String|False| | |
|**defaultSourceHost**|String|False| |Default back-to-origin host|
|**siteType**|String|True| |Site type includes pull (pulling streaming) and push (pushing streaming)|
|**backSourceType**|String|False| |Back-to-origin type, being rtmp only now|
|**ipSource**|[IpSourceInfo[]](#ipsourceinfo)|False| | |
|**domainSource**|[DomainSourceInfo[]](#domainsourceinfo)|False| | |
|**accelerateRegion**|String|False| |Acceleration Region (mainLand: Mainland China, nonMainLand: overseas regions, Hong Kong, Macao and Taiwan, all: the World) the default value is mainLand|

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
