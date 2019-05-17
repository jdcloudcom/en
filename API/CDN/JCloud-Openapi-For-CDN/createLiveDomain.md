# createLiveDomain


## Description
Create live domain

## Request Method
POST

## Request Address
https://cdn.jdcloud-api.com/v1/liveDomain:batchCreate


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**playDomain**|String|False| |Playing Domain|
|**publishDomain**|String|False| |Be sure to transmit the pushing streaming domain when creating the same|
|**sourceType**|String|False| |Back-to-origin can be only one of types [ips,domain]|
|**backHttpType**|String|False| | |
|**defaultSourceHost**|String|False| |Default back-to-origin host|
|**siteType**|String|False| |Site type includes pull (pulling streaming) and push (pushing streaming)|
|**backSourceType**|String|False| |Back-to-origin type, being rtmp only now|
|**ipSource**|IpSourceInfo[]|False| | |
|**domainSource**|DomainSourceInfo[]|False| | |

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
