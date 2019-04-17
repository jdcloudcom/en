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
|**filters**|Filter[]|False| |functionId - Function ID, exact match, support multiple <br>|

### Filter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|True| |Name of Filter Requirements|
|**operator**|String|False| |Operator of filter requirements is eq by default|
|**values**|String[]|True| |Value of Filter Requirements|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|This Request Id|
|**result**|Result|Search Function List Return Value|

### Result
|Name|Type|Description|
|---|---|---|
|**data**|FunctionSpec[]| |
### FunctionSpec
|Name|Type|Description|
|---|---|---|
|**createTime**|String|Function Creation Time|
|**description**|String|Function Description|
|**downloadUrl**|String|url Address Downloaded by Code Package|
|**functionId**|String|FunctionId|
|**name**|String|Function Name|
|**runtime**|String|Function Running Environment, currently there is python3|
|**updateTime**|String|Last Update Time of Function|
|**version**|String|Function Version Name|

## Return Code
|Return Code|Description|
|---|---|
|**200**|A successful response.|
