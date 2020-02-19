# describeSecret


## Description
Search details of a single secrete


## Request Method
GET

## Request Address
https://pod.jdcloud-api.com/v1/regions/{regionId}/secrets/{name}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**name**|String|True| |Secret Name|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](describesecret#result)| |
|**requestId**|String| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**secret**|[Secret](describesecret#secret)| |
### <div id="secret">Secret</div>
|Name|Type|Description|
|---|---|---|
|**name**|String|Secrets Name|
|**type**|String|Secrets Type|
|**createdAt**|String|Creation Time of Secrets|
|**data**|[DockerRegistryData](describesecret#dockerregistrydata)|Secrets Data|
### <div id="dockerregistrydata">DockerRegistryData</div>
|Name|Type|Description|
|---|---|---|
|**server**|String|registry Server Address|
|**username**|String|User Name|
|**password**|String|Password|
|**email**|String|Email Address|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
