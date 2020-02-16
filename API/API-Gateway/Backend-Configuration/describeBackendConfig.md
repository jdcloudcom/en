# describeBackendConfig


## Description
Search backendConfig

## Request Method
GET

## Request Address
https://apigateway.jdcloud-api.com/v1/regions/{regionId}/apiGroups/{apiGroupId}/backendConfig/{backendConfigId}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**apiGroupId**|String|True| |Group ID|
|**backendConfigId**|String|True| |backendConfigId|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](describebackendconfig#result)| |
|**requestId**|String|Request ID|

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**backendConfig**|[BackendConfig](describebackendconfig#backendconfig)| |
### <div id="backendconfig">BackendConfig</div>
|Name|Type|Description|
|---|---|---|
|**backendConfigId**|String|API ID|
|**baseGroupId**|String|Group ID|
|**environment**|String|Environment: test, preview and online|
|**backendUrl**|String|Backend Address|
|**backendServiceType**|String|Backend service types: mock, HTTP/HTTPS|
|**headerParams**|[SimpleParameter[]](describebackendconfig#simpleparameter)|header parameter list|
|**queryParams**|[SimpleParameter[]](describebackendconfig#simpleparameter)|query Parameter List|
|**description**|String|Description|
|**createTime**|Long|Release date in the format of millisecond time stamp|
|**sort**|Integer|Sort. It is the backend configuration by default when assigned to 0|
|**userSort**|Integer|Sorting for displaying|
|**jdsfId**|String|vpc Gateway id|
|**jdsfParam**|String|vpc Backend Address|
|**jdsfRegion**|String|vpc gateway subordinated region|
|**jdsfPin**|String|vpc Gateway Creator’s pin|
### <div id="simpleparameter">SimpleParameter</div>
|Name|Type|Description|
|---|---|---|
|**name**|String|Name|
|**value**|String|Value|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
