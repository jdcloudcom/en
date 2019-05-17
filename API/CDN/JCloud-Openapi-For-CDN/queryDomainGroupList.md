# queryDomainGroupList


## Description
Search domain group APIs

## Request Method
GET

## Request Address
https://cdn.jdcloud-api.com/v1/domainGroup


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**shareCache**|String|False| |Filter by Shared Memory or Not|
|**pageNumber**|Integer|False|1|pageNumber|
|**pageSize**|Integer|False|10|pageSize|
|**primaryDomain**|String|False| |Fuzzy Search by Primary Domain|
|**domainGroupName**|String|False| |Fuzzy Search by Domain Group|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**totalCount**|Integer| |
|**pageSize**|Integer| |
|**pageNumber**|Integer| |
|**domainGroups**|DomainGroupItem[]| |
### DomainGroupItem
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
