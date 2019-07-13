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
|**domains**|String[]|False| | |
|**sourceType**|String|False| |Back-to-origin can be one of types [ips,domain,oss] only|
|**cdnType**|String|False| |VOD domain can be one of types [vod,download,web] only|
|**backSourceType**|String|False| |Back-to-origin can be one of methods [https,http] and shall be http by default|
|**dailyBandWidth**|Long|False| |Daily Bandwidth (Mbps)|
|**quaility**|String|False| |Service quality can be one of [good,general] only and shall be good by default|
|**maxFileSize**|Long|False| | |
|**minFileSize**|Long|False| | |
|**sumFileSize**|Long|False| | |
|**avgFileSize**|Long|False| | |
|**defaultSourceHost**|String|False| | |
|**httpType**|String|False| | |
|**ipSource**|IpSourceInfo[]|False| | |
|**domainSource**|DomainSourceInfo[]|False| | |
|**ossSource**|String|False| | |

### DomainSourceInfo
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**priority**|Integer|False| | |
|**sourceHost**|String|False| | |
|**domain**|String|False| | |
### IpSourceInfo
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**master**|Integer|False| | |
|**ip**|String|False| | |
|**ratio**|Double|False| | |

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
