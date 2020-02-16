# updateApi


## Description
Modify api

## Request Method
PUT

## Request Address
https://apigateway.jdcloud-api.com/v1/regions/{regionId}/apiGroups/{apiGroupId}/revision/{revision}/apis/{apiId}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**apiGroupId**|String|True| |Group ID|
|**revision**|String|True| |Version Number|
|**apiId**|String|True| |API ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**api**|[CreateApi](updateapi#createapi)|False| |api|

### <div id="createapi">CreateApi</div>
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**apiGroupId**|String|True| |Group ID|
|**apiName**|String|True| |Name|
|**action**|String|True| |Action|
|**path**|String|True| |Request Path|
|**matchType**|String|True| |Matching Mode: 1. "absolute" (absolute match); 2. "prefix" (prefix match);|
|**description**|String|False| |Description|
|**reqParams**|[Parameter[]](updateapi#parameter)|False| |Request Parameter List|
|**reqBody**|String|False| |Request Format|
|**resBody**|String|False| |Return format|
|**reqBodyType**|Integer|True| |Request format type, 1: application/json, 2: text/xml, 3: others|
|**resBodyType**|Integer|False| |Return format type, 1: application/json, 2: text/xml, 3: others|
|**apiBackendConfig**|[ApiBackendConfig](updateapi#apibackendconfig)|False| |api Backend Configuration|
|**backServiceType**|String|False| |Backend service type, such as HTTP/HTTPS, mock and funcion|
|**backServicePath**|String|False| |Backend service address, such as backend service address and funtion path|
|**backServiceId**|String|False| |Backend service ID, such as function ID|
|**backServiceName**|String|False| |Backend service name, such as function name|
|**backUrl**|String|False| |Backend Address|
|**backServiceConfig**|Boolean|True| |When the backend service configuration is true, the configuration unified with a group shall be adopted; when initially creating an api, please set it to be True.|
|**backServiceVersion**|String|False| |Backend service version, such as function version name|
|**hufuAppTypeId**|Integer|False| |Application type ID for JD YunDing business line only|
|**editableReqBodyType**|String|False| |Request format type, which shall be used when reqBodyType is equal to 3|
|**editableResBodyType**|String|False| |Response format type, which shall be used when reqBodyType is equal to 3|
### <div id="apibackendconfig">ApiBackendConfig</div>
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**backendPath**|String|False| |Backend Path|
|**backendAction**|String|False| |Backend Request Method|
|**backendParams**|[BackendParameter[]](updateapi#backendparameter)|False| |Backend Parameter List|
|**backendConstParams**|[Parameter[]](updateapi#parameter)|False| |Backend constant parameter list|
### <div id="parameter">Parameter</div>
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|False| |Name|
|**description**|String|False| |Description|
|**paramLocation**|String|False| |Parameter Location|
|**paramType**|String|False| |Parameter type|
|**defaultValue**|String|False| |Default|
|**isRequired**|Boolean|False| |Default|
### <div id="backendparameter">BackendParameter</div>
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**backendName**|String|False| |Backend Parameter Name|
|**backendParamLocation**|String|False| |Backend Parameter Location|
|**name**|String|False| |Input Parameter Name|
|**paramLocation**|String|False| |Input Parameter Location|
|**paramType**|String|False| |Input Parameter Type|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](updateapi#result)| |
|**requestId**|String| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**apiId**|String|apiId|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
