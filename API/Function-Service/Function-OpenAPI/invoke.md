# testInvoke


## Description
Console Test Execution Function

## Request Method
POST

## Request Address
https://function.jdcloud-api.com/v1/regions/{regionId}/testinvoke

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**event**|String|True| |Input Event of Execution Function|
|**functionName**|String|True| |Function Name|
|**versionName**|String|True| |Version Name|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|This Request Id|
|**result**|Result|Result of Test Execution Function|

### Result
|Name|Type|Description|
|---|---|---|
|**data**|FunctionInvokeResult| |
### FunctionInvokeResult
|Name|Type|Description|
|---|---|---|
|**billingTime**|Number|Function Billing Time|
|**codeCheckSum**|String|Code Package Verification Sum|
|**invokeTime**|Float|Function Executive Time|
|**logStr**|String|Function Execution Time|
|**realMem**|Float|Size of Function Actual Memory Usage|
|**result**|String|Function Execution Result|
|**setupMem**|Number|Size of Function Setting Memory|

## Return Code
|Return Code|Description|
|---|---|
|**200**|A successful response.|
|**404**|NOT_FOUND|
