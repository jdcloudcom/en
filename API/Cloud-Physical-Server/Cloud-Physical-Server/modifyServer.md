# modifyServer


## Description
Modify backend server

## Request Method
POST

## Request Address
https://cps.jdcloud-api.com/v1/regions/{regionId}/serverGroups/{serverGroupId}/servers/{serverId}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID, call the API (describeCPSLBRegions) to get regions supported by Cloud Physical Server|
|**serverGroupId**|String|True| |ID of Server Group|
|**serverId**|String|True| |Backend Server ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**weight**|Integer|False| |Weight|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](modifyserver#result)| |
|**requestId**|String| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**serverId**|String|Backend Server ID|
|**instanceId**|String|Backend Cloud Physical Server ID|
|**privateIp**|String|Private Ip|
|**port**|Integer|Port|
|**weight**|Integer|Backend Cloud Physical Server Weight|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Bad request|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
