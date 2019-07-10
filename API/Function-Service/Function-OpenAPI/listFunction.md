# listFunction


## Description
Search Function List

## Request Method
GET

## Request Address
https://function.jdcloud-api.com/v1/regions/{regionId}/functions

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**listAll**|Boolean|True| |Whether all functions are returned|
|**pageNumber**|Integer|False| |Page|
|**pageSize**|Integer|False| |Paging Size|
|**filters**|Filter[]|False| |functionId -FunctionID, Exact Match, Support Multiple<br>functionName  - Function Name, Fuzzy Match, Support Single<br>|

### Filter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|True| |Name of Filter Requirements|
|**operator**|String|False| |Operator of filter requirements is eq by default|
|**values**|String[]|True| |Value of Filter Requirements|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result|Search Function List Return Value|
|**requestId**|String|This Request Id|

### Result
|Name|Type|Description|
|---|---|---|
|**data**|ListFunctionResult| |
### ListFunctionResult
|Name|Type|Description|
|---|---|---|
|**functions**|FunctionSpec[]|Function List|
|**totalCount**|Integer|Total Number of Functions|
### FunctionSpec
|Name|Type|Description|
|---|---|---|
|**functionId**|String|FunctionId|
|**name**|String|Function Name|
|**description**|String|Function Description|
|**runtime**|String|Function Running Environment, currently there is python3|
|**createTime**|String|Function Creation Time|
|**updateTime**|String|Last Update Time of Function|
|**version**|String|Function Version Name|
|**downloadUrl**|String|url Address Downloaded by Code Package|

## Return Code
|Return Code|Description|
|---|---|
|**200**|A successful response.|
