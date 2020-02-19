# describeServerConfig


## Description
Search service configuration information of JCS for Kubernetes

## Request Method
GET

## Request Address
https://kubernetes.jdcloud-api.com/v1/regions/{regionId}/serverConfig

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](describeserverconfig#result)| |
|**requestId**|String| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**serverConfig**|[ServerConfig](describeserverconfig#serverconfig)| |
### <div id="serverconfig">ServerConfig</div>
|Name|Type|Description|
|---|---|---|
|**validMasterVersions**|String[]|Supported Version of kubernetes master|
|**defaultMasterVersion**|String|Default Version of kubernetes master|
|**validNodeConfig**|[ValidNodeConfig[]](describeserverconfig#validnodeconfig)|Configuration of node|
### <div id="validnodeconfig">ValidNodeConfig</div>
|Name|Type|Description|
|---|---|---|
|**nodeVersion**|String|Version of kubernetes node|
|**imageId**|String[]|Image id|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**429**|Quota exceeded|
|**500**|Internal server error|
|**503**|Service unavailable|
