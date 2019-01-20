# createRegistry


## Description
Create registry through parameters.


## Request Method
POST

## Request Address
https://containerregistry.jdcloud-api.com/v1/regions/{regionId}/registries

|Name|Type|Required or Not|Default|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default|Description|
|---|---|---|---|---|
|**registryName**|String|True| |Registry name defined by the user. <br> Rules for DNS compatible with registry name is as follows: <br> <br> cannot be blank, and there shall be no more than 32 characters <br> It shall be started and ended with a letter in lower case, and using letters in lower case, figures and line-through (-) are supported<br>|
|**description**|String|False| |Registry Description, <a href="https://www.jdcloud.com/help/detail/3870/isCatalog/1">refer to the public parameter specification</a>. <br>|


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
|**totalSpaceUsedMB**|Double|regsitry Total Bucket Unit Used by Registry (MB)|
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
