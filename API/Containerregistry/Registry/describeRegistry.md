# describeRegistry


## Description
Query details of a registry under the specified user.


## Request method
GET

## Request address
https://containerregistry.jdcloud-api.com/v1/regions/{regionId}/registries/{registryName}

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**registryName**|String|True| |Registry Name|

## Request parameter
None


## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**registry**|Registry| |
### Registry
|Name|Type|Description|
|---|---|---|
|**name**|String|Registry Name, <a href="https://www.jdcloud.com/help/detail/3870/isCatalog/1">refer to the public parameter specification</a>.|
|**registryUri**|String|registry endporint url|
|**description**|String|Registry Description, <a href="https://www.jdcloud.com/help/detail/3870/isCatalog/1">refer to the public parameter specification</a>.|
|**totalSpaceUsedMB**|Double|reTotal Bucket Used by gsitry, unit: (MB)|
|**createTime**|String|rCreation Time of Registry|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
