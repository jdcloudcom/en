# describeLogsets


## Description
Search log set list. Support fuzzy search by names. The results contain the information that if the log set has the log subject. Log sets saved in log subjects cannot be deleted.

## Request Method
GET

## Request Address
https://logs.jcloud.com/v1/regions/{regionId}/logsets

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region Id|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Long|False| |Current page, 1 by default|
|**pageSize**|Long|False| |Page size, 20 by default; value range [1, 100]|
|**name**|String|False| |Log Set Name|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|Requested Identifier id|

### Result
|Name|Type|Description|
|---|---|---|
|**data**|LogsetEnd[]|Log Set List|
|**numberPages**|Long|Total Number of Pages|
|**numberRecords**|Long|Number of Total Records|
|**pageNumber**|Long|Current Page Number|
|**pageSize**|Long|Paging Size|
### LogsetEnd
|Name|Type|Description|
|---|---|---|
|**uID**|String|UID|
|**createTime**|String|Creation Time|
|**description**|String|Description Information|
|**hasTopic**|Boolean|Is there a log subject|
|**lifeCycle**|Long|Saving Period|
|**name**|String|Log Set Name|
|**region**|String|Region Information|

## Return Code
|Return Code|Description|
|---|---|
|**200**|Search log set list results|
