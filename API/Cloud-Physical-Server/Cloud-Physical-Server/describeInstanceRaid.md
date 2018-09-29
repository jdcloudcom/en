# describeInstanceRaid


## Description
Query the installed RAID information of a single Cloud Physical Server, including the system disk RAID information and data disk RAID information

## Request method
GET

## Request address
https://cps.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}:describeInstanceRaid

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**instanceId**|String|True| |Cloud Physical Server ID|
|**regionId**|String|True| |Region ID, the Region and Availability Zone Supported by the Cloud Physical Servers can be Called by Calling APIs (describeRegions)|

## Request parameter
None


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**dataRaidType**|String|Data Disk RAID Type ID|
|**dataRaidTypeId**|String|Data Disk RAID Type ID|
|**sysRaidType**|String|System Disk RAID Type|
|**sysRaidTypeId**|String|System Disk RAID Type ID|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|Bad request|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
