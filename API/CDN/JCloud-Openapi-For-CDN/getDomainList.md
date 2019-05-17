# getDomainList


## Description
Search accelerated domain APIs

## Request Method
GET

## Request Address
https://cdn.jdcloud-api.com/v1/domain


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**keyWord**|String|False| |Fuzzy Matching by Keywords|
|**pageNumber**|Integer|False|1|pageNumber|
|**pageSize**|Integer|False|20|pageSize|
|**status**|String|False| |Search by domain status, value: [offline, online, configuring, auditing, audit_reject]|
|**type**|String|False| |type|


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
|**domains**|ListDomainItem[]| |
### ListDomainItem
|Name|Type|Description|
|---|---|---|
|**cname**|String| |
|**description**|String| |
|**domain**|String| |
|**created**|String| |
|**modified**|String| |
|**status**|String| |
|**type**|String| |
|**auditStatus**|String| |

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
