# setSource


## Description
Source origin server information

## Request Method
POST

## Request Address
https://cdn.jdcloud-api.com/v1/domain/{domain}/source

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**domain**|String|True| |User Domain|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**sourceType**|String|False| |Back-to-origin can be one of types [ips,domain,oss] only|
|**backSourceType**|String|False| |Back-to-origin can be one of methods [https,http] and shall be http by default|
|**ipSource**|IpSourceInfo[]|False| | |
|**domainSource**|DomainSourceInfo[]|False| | |
|**ossSource**|String|False| |oss Back-to-origin Domain|
|**defaultSourceHost**|String|False| |Default back-to-origin host|

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
