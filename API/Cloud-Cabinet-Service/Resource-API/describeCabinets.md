# describeCabinets


## Description
Search Cabinet List

## Request Method
GET

## Request Address
https://jdccs.jdcloud-api.com/v1/idcs/{idc}/cabinets

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**idc**|String|True| |IDC Data Center id|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False|1|page; it is 1 by default, the value range: [1,∞)|
|**pageSize**|Integer|False|20|Paging size; it is 20 by default; value range: [10, 100]|
|**filters**|Filter[]|False| |roomNo - Room number, exact match, supporting multiple numbers<br>cabinetId - Cabinet ID, exact match, supporting multiple IDs<br>|

### Filter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|True| |Name of Filter Requirements|
|**operator**|String|False| |Operator of filter requirements is eq by default|
|**values**|String[]|True| |Value of Filter Requirements|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|Request ID|

### Result
|Name|Type|Description|
|---|---|---|
|**cabinets**|Cabinet[]|Cabinet List|
|**pageNumber**|Integer|Page|
|**pageSize**|Integer|Paging Size|
|**totalCount**|Integer|Total Count|
### Cabinet
|Name|Type|Description|
|---|---|---|
|**idc**|String|English Identifier of Data Center|
|**idcName**|String|Data Center Name|
|**cabinetId**|String|Cabinet Id|
|**cabinetNo**|String|Cabinet Code|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
