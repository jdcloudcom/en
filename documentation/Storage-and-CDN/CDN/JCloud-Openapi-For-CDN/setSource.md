# setSource


## Description
Set the origin server information

## Request mode
POST

## Request address
https://cdn.jdcloud-api.com/v1/domain/{domain}/source

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**domain**|String|True| |User domain|

## Request parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**sourceType**|String|True| |The back-to-origin type can only be one of [ips,domain,oss]|
|**backSourceType**|String|True| |Back-to-origin can be one of methods among [https,http] and shall be http by default|
|**ipSource**|[IpSourceInfo[]](setsource#ipsourceinfo)|False| | |
|**domainSource**|[DomainSourceInfo[]](setsource#domainsourceinfo)|False| | |
|**ossSource**|String|False| |oss back-to-origin domain|
|**defaultSourceHost**|String|False| |Default back-to-origin host|

### <div id="domainsourceinfo">DomainSourceInfo</div>
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**priority**|Integer|True| |Priority (1-10)|
|**sourceHost**|String|False| |The configuration of back-to-origin host is not supported in the acceleration outside China/on a global scale|
|**domain**|String|True| |Back-to-origin Domain|
### <div id="ipsourceinfo">IpSourceInfo</div>
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**master**|Integer|True| |1: primary; 2: backup|
|**ip**|String|True| |back-to-origin IP|
|**ratio**|Double|False| |Percentage|

## Return parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](setsource#result)| |
|**requestId**|String| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**taskId**|String|Task id|

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
