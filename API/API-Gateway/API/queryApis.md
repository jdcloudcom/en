# queryApis


## Description
Search api list

## Request Method
GET

## Request Address
https://apigateway.jdcloud-api.com/v1/regions/{regionId}/apiGroups/{apiGroupId}/revision/{revision}/apis

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**apiGroupId**|String|True| |Group ID|
|**revision**|String|True| |Version Number|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False|1|page; it is 1 by default, the value range: [1,∞)|
|**pageSize**|Integer|False|20|Paging size; it is 20 by default; value range: [10, 100]|
|**filters**|[Filter[]](queryapis#filter)|False| |apiName - API name, fuzzy matching, supporting a single API name<br>action - Action, exact matching, supporting multiple actions<br>backServiceType- Backend service type, exact matching, supporting multiple backend service types<br>path - Path, exact matching, supporting a single path<br>description - Description, exact matching, supporting a single description<br>isApiProduct - If it is an API product, exact matching, with 1 for yes<br>|

### <div id="filter">Filter</div>
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|True| |Name of Filter Requirements|
|**operator**|String|False| |Operator of filter requirements is eq by default|
|**values**|String[]|True| |Value of Filter Requirements|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](queryapis#result)| |
|**requestId**|String| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**apis**|[Api[]](queryapis#api)|api Details|
|**totalCount**|Integer|Searched Counts|
### <div id="api">Api</div>
|Name|Type|Description|
|---|---|---|
|**apiId**|String|apiId|
|**apiGroupId**|String|Group ID|
|**apiName**|String|Name|
|**action**|String|Action|
|**path**|String|Request Path|
|**matchType**|String|Matching Mode: 1. "absolute" (absolute match); 2. "prefix" (prefix match);|
|**backServiceType**|String|Backend type shall be shown as unset on the frontend when it is null|
|**description**|String|Description|
|**reqParams**|[Parameter[]](queryapis#parameter)|Request Parameter List|
|**reqBody**|String|Request Format|
|**resBody**|String|Return format|
|**reqBodyType**|Integer|Request format type, 1: application/json, 2: text/xml, 3: others|
|**resBodyType**|Integer|Return format type, 1: application/json, 2: text/xml, 3: others|
|**apiBackendConfig**|[ApiBackendConfig](queryapis#apibackendconfig)|api Backend Configuration|
|**hufuAppTypeId**|Integer|Application type ID for JD YunDing business line only|
|**deploymentEnvironment**|String[]|The environment information in which the current group version is released|
|**editableReqBodyType**|String|Request format type, which shall be used when reqBodyType is equal to 3|
|**editableResBodyType**|String|Response format type, which shall be used when reqBodyType is equal to 3|
|**wafStatus**|String|waf status, such as: observe, deny and off|
### <div id="apibackendconfig">ApiBackendConfig</div>
|Name|Type|Description|
|---|---|---|
|**backendPath**|String|Backend Path|
|**backendAction**|String|Backend Request Method|
|**backendParams**|[BackendParameter[]](queryapis#backendparameter)|Backend Parameter List|
|**backendConstParams**|[Parameter[]](queryapis#parameter)|Backend constant parameter list|
### <div id="parameter">Parameter</div>
|Name|Type|Description|
|---|---|---|
|**name**|String|Name|
|**description**|String|Description|
|**paramLocation**|String|Parameter Location|
|**paramType**|String|Parameter type|
|**defaultValue**|String|Default|
|**isRequired**|Boolean|Default|
### <div id="backendparameter">BackendParameter</div>
|Name|Type|Description|
|---|---|---|
|**backendName**|String|Backend Parameter Name|
|**backendParamLocation**|String|Backend Parameter Location|
|**name**|String|Input Parameter Name|
|**paramLocation**|String|Input Parameter Location|
|**paramType**|String|Input Parameter Type|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
