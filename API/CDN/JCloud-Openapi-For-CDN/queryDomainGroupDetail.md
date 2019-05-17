# queryDomainGroupDetail


## Description
Search details of domain groups

## Request Method
GET

## Request Address
https://cdn.jdcloud-api.com/v1/domainGroup/{id}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**id**|Long|True| |Domain Group id|

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
|**domains**|String[]|Domain Group Member|
|**primaryDomain**|String|Primary Domain|
|**shareCache**|String|Share Memory or Not|
|**domainGroupName**|String|Name of Domain Group|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
