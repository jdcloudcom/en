# updateDomainGroup


## Description
Update domain group

## Request Method
POST

## Request Address
https://cdn.jdcloud-api.com/v1/domainGroup/{id}:update

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**id**|Long|True| |Domain Group id|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**domains**|String[]|False| |The domain in the domain group comprises a primary domain|
|**primaryDomain**|String|False| |Master domain, be sure to transmitted when enabling cache sharing|
|**shareCache**|String|False| |Share memory or not|
|**domainGroupName**|String|False| | |


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Object| |
|**requestId**|String| |


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
