# createBackendConfig


## Description
Enable backend configuration

## Request Method
POST

## Request Address
https://apigateway.jdcloud-api.com/v1/regions/{regionId}/apiGroups/{apiGroupId}/backendConfig

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**apiGroupId**|String|True| |Group ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**backendConfigId**|String|False| |API ID|
|**baseGroupId**|String|False| |Group ID|
|**environment**|String|True| |Environment: test, preview and online|
|**backendUrl**|String|False| |Backend Address|
|**backendServiceType**|String|True| |Backend service types: mock, HTTP/HTTPS|
|**headerParams**|[SimpleParameter[]](createbackendconfig#simpleparameter)|False| |header parameter list|
|**queryParams**|[SimpleParameter[]](createbackendconfig#simpleparameter)|False| |query Parameter List|
|**description**|String|False| |Description|
|**createTime**|Long|False| |Release date in the format of millisecond time stamp|
|**sort**|Integer|True| |Sort. It is the backend configuration by default when assigned to 0|
|**userSort**|Integer|False| |Sorting for displaying|
|**jdsfId**|String|False| |vpc Gateway id|
|**jdsfParam**|String|False| |vpc Backend Address|
|**jdsfRegion**|String|False| |vpc gateway subordinated region|
|**jdsfPin**|String|False| |vpc Gateway Creator’s pin|

### <div id="simpleparameter">SimpleParameter</div>
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|False| |Name|
|**value**|String|False| |Value|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](createbackendconfig#result)| |
|**requestId**|String| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**backendConfigId**|String|Primary Key Id|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
