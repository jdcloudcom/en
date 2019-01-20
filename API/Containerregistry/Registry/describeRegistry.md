# describeRegistry


## Description
Query details of a registry under the specified user.


## Request Method
GET

## Request Address
https://containerregistry.jdcloud-api.com/v1/regions/{regionId}/registries/{registryName}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**registryName**|String|True| |Registry Name|
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
|**registry**|Registry| |
### Registry
|Name|Type|Description|
|---|---|---|
|**description**|String|Registry Description, <a href="https://www.jdcloud.com/help/detail/3870/isCatalog/1">refer to the public parameter specification</a>.|
|**registryUri**|String|registry endporint url|
|**createTime**|String|rCreation Time of Registry|
|**totalSpaceUsedMB**|Double|reTotal Bucket Used by gsitry, unit: (MB)|
|**name**|String|Registry Name, <a href="https://www.jdcloud.com/help/detail/3870/isCatalog/1">refer to the public parameter specification</a>.|

## Return Code
|Return Code|Description|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**503**|Service unavailable|
|**200**|OK|
|**500**|Internal server error|
