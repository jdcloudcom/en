# createDomain


## Description
Create VOD acceleration domain

## Request Method
POST

## Request Address
https://cdn.jdcloud-api.com/v1/domain/{domain}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**domain**|String|True| |User Domain|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**x-jdcloud-channel**|String|False|cdn|Domain source cdn/cdn, video cloud|
|**sourceType**|String|True| |Back-to-origin can be one of types among [ips,domain,oss] only|
|**cdnType**|String|True| |VOD domain can be one of types among [vod,download,web] only|
|**backSourceType**|String|True| |Back-to-origin can be one of methods among [https,http] and shall be http by default|
|**dailyBandWidth**|Long|True| |Daily Bandwidth (Mbps)|
|**quaility**|String|False| |Service quality can be one of [good,general] only and shall be good by default|
|**maxFileSize**|Long|False| | |
|**minFileSize**|Long|False| | |
|**sumFileSize**|Long|False| | |
|**avgFileSize**|Long|False| | |
|**defaultSourceHost**|String|False| | |
|**httpType**|String|True| |Can be http only. If it is set as https, the second calling of sethttptype API is required |
|**ipSource**|[IpSourceInfo[]](#ipsourceinfo)|False| | |
|**domainSource**|[DomainSourceInfo[]](#domainsourceinfo)|False| | |
|**ossSource**|String|False| | |
|**accelerateRegion**|String|False| |Acceleration Region (mainLand: Chinese mainland, nonMainLand: overseas regions, Hong Kong, Macao and Taiwan, all: the world) and shall be Chinese mainland by default|

### <div id="DomainSourceInfo">DomainSourceInfo</div>
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**priority**|Integer|True| |Priority (1-10)|
|**sourceHost**|String|False| |Back-to-origin host|
|**domain**|String|True| |Back-to-origin Domain|
### <div id="IpSourceInfo">IpSourceInfo</div>
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**master**|Integer|True| |1: Master; 2: Slave|
|**ip**|String|True| |Back-to-origin IP|
|**ratio**|Double|False| |Percentage|

## Return Parameter
|Name|Description|Type|
|---|---|---|
|**result**|Object| |
|**requestId**|String| |


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
