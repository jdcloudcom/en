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
|**pageNumber**|Integer|False|1|page; it is 1 by default, the value range: [1,∞)|
|**pageSize**|Integer|False|20|Paging size; it is 20 by default; value range: [10, 100]|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|Request ID|

### Result
|Name|Type|Description|
|---|---|---|
|**idcs**|Idc[]|IDC Data Center List|
|**pageNumber**|Integer|Page|
|**pageSize**|Integer|Paging Size|
|**totalCount**|Integer|Total Count|
### Idc
|Name|Type|Description|
|---|---|---|
|**idc**|String|English Identifier of Data Center|
|**idcName**|String|Data Center Name|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
