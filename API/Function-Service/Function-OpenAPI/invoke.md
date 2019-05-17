# invoke


## Description
Console Test Execution Function

## Request Method
POST

## Request Address
https://function.jdcloud-api.com/v1/regions/{regionId}/functions/{functionName}/versions/{versionName}:invoke

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**functionName**|String|True| |Function Name|
|**versionName**|String|True| |Version Name|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**event**|String|True| |Input Event of Execution Function|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result|Result of Test Execution Function|
|**requestId**|String|This Request Id|

### Result
|Name|Type|Description|
|---|---|---|
|**data**|FunctionInvokeResult| |
### FunctionInvokeResult
|Name|Type|Description|
|---|---|---|
|**result**|String|Function Execution Result|
|**codeCheckSum**|String|Code Package Verification Sum|
|**invokeTime**|Float|Function Executive Time|
|**billingTime**|Number|Function Billing Time|
|**setupMem**|Number|Size of Function Setting Memory|
|**realMem**|Float|Size of Function Actual Memory Usage|
|**logStr**|String|Function Execution Time|

## Return Code
|Return Code|Description|
|---|---|
|**200**|A successful response.|
|**404**|NOT_FOUND|
