# createRegistry


## Description
Create registry through parameters.


## Request method
POST

## Request address
https://containerregistry.jdcloud-api.com/v1/regions/{regionId}/registries

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**registryName**|String|True| |Registry name defined by the user. <br> Rules for DNS compatible with registry name is as follows: <br> <br> cannot be blank, and there shall be no more than 32 characters <br> It shall be started and ended with a letter in lower case, and using letters in lower case, figures and line-through (-) are supported<br>|
|**description**|String|False| |Registry Description, <a href="https://www.jdcloud.com/help/detail/3870/isCatalog/1">refer to the public parameter specification</a>. <br>|


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
