# queryServers


## Description
Search backend server list

## Request Method
GET

## Request Address
https://cps.jdcloud-api.com/v1/regions/{regionId}/serverGroups/{serverGroupId}/servers

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID, call API (describeRegiones) to get regions supported by Cloud Physical Server|
|**serverGroupId**|String|True| |ID of Server Group|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False|1|Page number; xxx by default1|
|**pageSize**|Integer|False|20|Segmentation size; it is 20 by default; value range[20, 100]|
|**listenerId**|String|False| |Listener Id|
|**filters**|Filter[]|False| |serverId - Backend Server ID, exact matching, supporting multiple IDs<br>|

### Filter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|True| |Name of Filter Requirements|
|**operator**|String|False| |Operator of filter requirements is eq by default|
|**values**|String[]|True| |Value of Filter Requirements|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**servers**|Server[]| |
|**pageNumber**|Integer|Page Number; 1 by Default|
|**pageSize**|Integer|Segmentation size; it is 20 by default; value range[20, 100]|
|**totalCount**|Integer|Search result amount|
### Server
|Name|Type|Description|
|---|---|---|
|**serverId**|String|Server ID|
|**instanceType**|String|Resource Type|
|**instanceName**|String|Instance Name|
|**instanceId**|String|Backend Cloud Physical Server ID|
|**az**|String|Availability Zone|
|**privateIp**|String|Private Ip|
|**port**|Integer|Port|
|**weight**|Integer|Backend Cloud Physical Server Weight|
|**status**|String|Status|
|**healthyStatus**|String|Health Status|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Bad request|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
