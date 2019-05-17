# setLiveDomainBackSource


## Description
Set back-to-origin information of live domain

## Request Method
POST

## Request Address
https://cdn.jdcloud-api.com/v1/liveDomain/{domain}/backSource

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**domain**|String|True| |User Domain|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**sourceType**|String|False| |Back-to-origin can be only one of types [ips,domain]|
|**backSourceType**|String|False| | |
|**defaultSourceHost**|String|False| |Default back-to-origin host|
|**domainSource**|DomainSourceInfo[]|False| | |
|**ipSource**|IpSourceInfo[]|False| | |

### IpSourceInfo
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**master**|Integer|False| | |
|**ip**|String|False| | |
|**ratio**|Double|False| | |
### DomainSourceInfo
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**priority**|Integer|False| | |
|**sourceHost**|String|False| | |
|**domain**|String|False| | |

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
