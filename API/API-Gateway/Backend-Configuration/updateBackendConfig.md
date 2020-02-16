# updateBackendConfig


## Description
Modify the backend configuration

## Request Method
PATCH

## Request Address
https://apigateway.jdcloud-api.com/v1/regions/{regionId}/apiGroups/{apiGroupId}/backendConfig/{backendConfigId}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**apiGroupId**|String|True| |Group ID|
|**backendConfigId**|String|True| |backendConfigId|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**baseGroupId**|String|False| |Group ID|
|**environment**|String|True| |Environment: test, preview and online|
|**backendUrl**|String|False| |Backend Address|
|**backendServiceType**|String|True| |Backend service types: mock, HTTP/HTTPS|
|**headerParams**|[SimpleParameter[]](updatebackendconfig#simpleparameter)|False| |header parameter list|
|**queryParams**|[SimpleParameter[]](updatebackendconfig#simpleparameter)|False| |query Parameter List|
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
|**requestId**|String|Request ID|


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
