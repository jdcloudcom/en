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
|**sourceType**|String|True| |Back-to-origin can be only one of types [ips,domain]|
|**backSourceType**|String|False| | |
|**defaultSourceHost**|String|False| |Default back-to-origin host|
|**domainSource**|[DomainSourceInfo[]](#domainsourceinfo)|False| | |
|**ipSource**|[IpSourceInfo[]](#ipsourceinfo)|False| | |

### <div id="IpSourceInfo">IpSourceInfo</div>
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**master**|Integer|True| |1: Host; 2: Backup|
|**ip**|String|True| |Back-to-origin IP|
|**ratio**|Double|False| |Proportion|
### <div id="DomainSourceInfo">DomainSourceInfo</div>
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**priority**|Integer|True| |Priority Level (1-10)|
|**sourceHost**|String|False| |Back-to-origin host|
|**domain**|String|True| |Back-to-origin Domain|

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
