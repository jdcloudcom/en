# batchCreate


## Description
Create VOD acceleration domain

## Request Method
POST

## Request Address
https://cdn.jdcloud-api.com/v1/domain:batchCreate


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**x-jdcloud-channel**|String|False|cdn|Domain source cdn/cdn, video cloud|
|**domains**|String[]|True| | |
|**sourceType**|String|True| |Back-to-origin can be one of types [ips,domain,oss] only|
|**cdnType**|String|True| |VOD domain can be one of types [vod,download,web] only|
|**backSourceType**|String|True| |Back-to-origin can be one of methods [https,http] and shall be http by default|
|**dailyBandWidth**|Long|True| |Daily Bandwidth (Mbps)|
|**quaility**|String|False| |Service quality can be one of [good,general] only and shall be good by default|
|**maxFileSize**|Long|False| | |
|**minFileSize**|Long|False| | |
|**sumFileSize**|Long|False| | |
|**avgFileSize**|Long|False| | |
|**defaultSourceHost**|String|False| | |
|**httpType**|String|False| | |
|**ipSource**|[IpSourceInfo[]](#ipsourceinfo)|False| | |
|**domainSource**|[DomainSourceInfo[]](#domainsourceinfo)|False| | |
|**ossSource**|String|False| | |
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
