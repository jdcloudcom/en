# describeIps


## Description
Search Public IP list

## Request Method
GET

## Request Address
https://jdccs.jdcloud-api.com/v1/idcs/{idc}/ips

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**idc**|String|True| |IDC Data Center ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False|1|Page number, xxx by default1|
|**pageSize**|Integer|False|20|Paging size, default value is20|
|**filters**|[Filter[]](describeips#filter)|False| |ipId - Public IP Instance ID, exact match, supporting multiple IDs<br>|

### <div id="filter">Filter</div>
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|True| |Name of Filter Requirements|
|**operator**|String|False| |Operator of filter requirements is eq by default|
|**values**|String[]|True| |Value of Filter Requirements|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](describeips#result)| |
|**requestId**|String|Request ID|

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**ips**|[Ip[]](describeips#ip)|List of Public IP(s)|
|**pageNumber**|Integer|Page|
|**pageSize**|Integer|Paging Size|
|**totalCount**|Integer|Total Count|
### <div id="ip">Ip</div>
|Name|Type|Description|
|---|---|---|
|**idc**|String|English Identifier of Data Center|
|**idcName**|String|Data Center Name|
|**ipId**|String|Public IP Instance ID|
|**cidrAddr**|String|IP address field|
|**networkAddr**|String|Network address|
|**gatewayAddr**|String|Gateway address|
|**broadcastAddr**|String|Broadcast address|
|**status**|String|Status  normal: normal  abnormal: abnormal|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
