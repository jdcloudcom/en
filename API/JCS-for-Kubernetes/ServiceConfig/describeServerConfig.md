# describeServerConfig


## Description
Search (k8s cluster) service configuration information

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
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**serverConfig**|ServerConfig| |
### ServerConfig
|Name|Type|Description|
|---|---|---|
|**validMasterVersions**|String[]|Supported Version of kubernetes master|
|**defaultMasterVersion**|String|Default Version of kubernetes master|
|**validNodeConfig**|ValidNodeConfig[]|Configuration of node|
### ValidNodeConfig
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
