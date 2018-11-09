# createRegistry


## Description
Create registry through parameters.


## Request Method
POST

## Request Address
https://openapi.cr.jdcloud.com/v1/regions/{regionId}/registries

|Name|Type|Required or Not|Default|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default|Description|
|---|---|---|---|---|
|**description**|String|False| |Registry Description, <a href=”https://www.jdcloud.com/help/detail/3870/isCatalog/1”>refer to the public parameter specification</a>. <br>|
|**registryName**|String|True| |Registry name defined by the user. <br> Rules for DNS compatible with registry name is as follows: <br> <br> cannot be blank, and there shall be no more than 32 characters <br> It shall be started and ended with a letter in lower case, and using letters in lower case, figures and line-through (-) are supported<br>|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**registry**|Registry| |
### Registry
|Name|Type|Description|
|---|---|---|
|**createTime**|String|rCreation Time of Registry|
|**description**|String|Registry Description, <a href=”https://www.jdcloud.com/help/detail/3870/isCatalog/1”>refer to the public parameter specification</a>.|
|**name**|String|Registry Name, <a href=”https://www.jdcloud.com/help/detail/3870/isCatalog/1”>refer to the public parameter specification</a>.|
|**registryUri**|String|registry endporint url|
|**totalSpaceUsedMB**|Integer|regsitry Total Bucket Unit Used by Registry (MB)|

## Return Code
|Return Code|Description|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**503**|Service unavailable|
|**200**|OK|
|**500**|Internal server error|
