# describeVersions


## Description
Search version information

## Request Method
GET

## Request Address
https://kubernetes.jdcloud-api.com/v1/regions/{regionId}/versions

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**masterVersion**|String|False| |Big version of cluster, such as 1.12.4-jcs.1|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**masterVersions**|MasterVersion[]| |
### MasterVersion
|Name|Type|Description|
|---|---|---|
|**version**|String|Cluster Version Number|
|**isDefault**|Boolean|Whether or not default version|
|**defaultNodeVersion**|String|node Version Number by Default|
|**versionStatus**|String|Version Status|
|**nodeVersions**|NodeVersion[]|Configuration of node|
### NodeVersion
|Name|Type|Description|
|---|---|---|
|**version**|String|Node Version Number|
|**imageOs**|String|Image Operating System|
|**versionStatus**|String|Version Status|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
