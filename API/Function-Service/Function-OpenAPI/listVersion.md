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
|**requestId**|String|This Request Id|
|**result**|Result|Search Version List Return Value|

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
