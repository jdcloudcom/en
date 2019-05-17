# listVersion


## Description
Search Version List

## Request Method
GET

## Request Address
https://function.jdcloud-api.com/v1/regions/{regionId}/functions/{functionName}/versions

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**functionName**|String|True| |Function Name|
|**regionId**|String|True| |Region ID|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result|Search Version List Return Value|
|**requestId**|String|This Request Id|

### Result
|Name|Type|Description|
|---|---|---|
|**data**|FunctionSpec[]| |
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
