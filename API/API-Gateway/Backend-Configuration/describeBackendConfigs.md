# describeBackendConfigs


## Description
Search all backend configurations under the assigned circumstance

## Request Method
GET

## Request Address
https://apigateway.jdcloud-api.com/v1/regions/{regionId}/apiGroups/{apiGroupId}/environment/{environment}/backendConfigs

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**apiGroupId**|String|True| |Group ID|
|**environment**|String|True| |Environment: test, preview and online|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False|1|page; it is 1 by default, the value range: [1,∞)|
|**pageSize**|Integer|False|20|Paging size; it is 20 by default; value range: [10, 100]|
|**filters**|[Filter[]](describebackendconfigs#filter)|False| |sort - sorting of routings. It is the backend configuration by default when assigned to 0<br>|

### <div id="filter">Filter</div>
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|True| |Name of Filter Requirements|
|**operator**|String|False| |Operator of filter requirements is eq by default|
|**values**|String[]|True| |Value of Filter Requirements|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](describebackendconfigs#result)|Search Result Set|
|**requestId**|String|Request ID|

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**backendConfigs**|[BackendConfig[]](describebackendconfigs#backendconfig)|Search the revision details list|
|**totalCount**|Integer|Total Results|
### <div id="backendconfig">BackendConfig</div>
|Name|Type|Description|
|---|---|---|
|**backendConfigId**|String|API ID|
|**baseGroupId**|String|Group ID|
|**environment**|String|Environment: test, preview and online|
|**backendUrl**|String|Backend Address|
|**backendServiceType**|String|Backend service types: mock, HTTP/HTTPS|
|**headerParams**|[SimpleParameter[]](describebackendconfigs#simpleparameter)|header parameter list|
|**queryParams**|[SimpleParameter[]](describebackendconfigs#simpleparameter)|query Parameter List|
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
|**500**|Internal server error|
|**503**|Service unavailable|
