# queryAllUserDomainGroups


## Description
Search all domain groups of a user

## Request Method
GET

## Request Address
https://cdn.jdcloud-api.com/v1/domainGroup:listAll


## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](#result)| |
|**requestId**|String| |

### <div id="Result">Result</div>
|Name|Type|Description|
|---|---|---|
|**groups**|[SimpleGroupItem[]](#simplegroupitem)| |
### <div id="SimpleGroupItem">SimpleGroupItem</div>
|Name|Type|Description|
|---|---|---|
|**name**|String| |
|**id**|Long| |

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
