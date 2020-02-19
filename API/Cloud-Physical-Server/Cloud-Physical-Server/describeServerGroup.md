# describeServerGroup


## Description
Search Virtual Server Group

## Request Method
GET

## Request Address
https://cps.jdcloud-api.com/v1/regions/{regionId}/serverGroups/{serverGroupId}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID, call the API (describeCPSLBRegions) to get regions supported by Cloud Physical Server|
|**serverGroupId**|String|True| |ID of Server Group|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](describeservergroup#result)| |
|**requestId**|String| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**serverGroup**|[ServerGroup](describeservergroup#servergroup)|Server Group Details|
### <div id="servergroup">ServerGroup</div>
|Name|Type|Description|
|---|---|---|
|**loadBalancerId**|String|Load Balancer ID|
|**serverGroupId**|String|Virtual Server Group ID|
|**name**|String|Virtual Server Group Name|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Bad request|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
