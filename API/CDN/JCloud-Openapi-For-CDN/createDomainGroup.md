# createDomainGroup


## Description
Create domain groups

## Request Method
POST

## Request Address
https://cdn.jdcloud-api.com/v1/domainGroup:create


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**shareCache**|String|True| |Share memory or not|
|**primaryDomain**|String|False| |Master domain, be sure to transmitted when enabling cache sharing|
|**domainGroupName**|String|True| |Name of Domain Group|
|**domains**|String[]|True| |The domain in the domain group comprises a main domain|


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
