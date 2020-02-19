# describeIdcs


## Description
Search IDC Data Center List

## Request Method
GET

## Request Address
https://jdccs.jdcloud-api.com/v1/idcs


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False|1|Page number, xxx by default1|
|**pageSize**|Integer|False|20|Paging size, default value is20|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](describeidcs#result)| |
|**requestId**|String|Request ID|

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**idcs**|[Idc[]](describeidcs#idc)|IDC Data Center List|
|**pageNumber**|Integer|Page|
|**pageSize**|Integer|Paging Size|
|**totalCount**|Integer|Total Count|
### <div id="idc">Idc</div>
|Name|Type|Description|
|---|---|---|
|**idc**|String|English Identifier of Data Center|
|**idcName**|String|Data Center Name|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
