# queryDomainsNotInGroup


## Description
Search un-grouped domain

## Request Method
GET

## Request Address
https://cdn.jdcloud-api.com/v1/domainGroup:notInGroup


## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](querydomainsnotingroup#result)| |
|**requestId**|String| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**domains**|String[]| |

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|