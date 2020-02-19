# describeInstanceRaid


## Description
Search installed RAID information of a single Distributed Cloud Physical Server, including RAID information of system disk and data disk

## Request Method
GET

## Request Address
https://edcps.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}:describeInstanceRaid

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID, calling APIs (describeEdCPSRegions) to get regions supported by Distributed Cloud Physical Server|
|**instanceId**|String|True| |Distributed Cloud Physical Server ID|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](describeinstanceraid#result)| |
|**requestId**|String| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**sysRaidTypeId**|String|System Disk RAID Type ID|
|**sysRaidType**|String|System Disk RAID Type|
|**dataRaidTypeId**|String|Data Disk RAID Type ID|
|**dataRaidType**|String|Data Disk RAID Type|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Bad request|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
