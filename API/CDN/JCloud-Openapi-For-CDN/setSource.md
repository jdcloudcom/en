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
|**sourceType**|String|True| |Back-to-origin can be one of types [ips,domain,oss] only|
|**backSourceType**|String|True| |Back-to-origin can be one of methods [https,http] and shall be http by default|
|**ipSource**|[IpSourceInfo[]](setsource#ipsourceinfo)|False| | |
|**domainSource**|[DomainSourceInfo[]](setsource#domainsourceinfo)|False| | |
|**ossSource**|String|False| |oss Back-to-origin Domain|
|**defaultSourceHost**|String|False| |Default back-to-origin host|

### <div id="domainsourceinfo">DomainSourceInfo</div>
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**priority**|Integer|True| |Priority Level (1-10)|
|**sourceHost**|String|False| |Back-to-origin host|
|**domain**|String|True| |Back-to-origin Domain|
### <div id="ipsourceinfo">IpSourceInfo</div>
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**master**|Integer|True| |1: Host; 2: Backup|
|**ip**|String|True| |Back-to-origin IP|
|**ratio**|Double|False| |Proportion|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](setsource#result)| |
|**requestId**|String| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**taskId**|String|Task id|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|