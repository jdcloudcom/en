# describeDeviceRaids


## Description
Query the RAID Types Supported by the Cloud Physical Server of a Certain Instance Type Family, May Query the System Disk RAID Type and Data Disk RAID Type

## Request method
GET

## Request address
https://cps.jdcloud-api.com/v1/regions/{regionId}/raids

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True||Region ID, the Region and Availability Zone Supported by the Cloud Physical Servers can be Called by Calling APIs (describeRegions)|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**deviceType**|String|True||Instance Type Family, the (describeDeviceTypes) APIs May Be Called to Obtain the Instance Type Family of the Specific Region, such as: cps.c.normal|
|**volumeType**|String|False||Disk Type, Value Range: System, Data|


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String||
|**result**|Result||


### Result
|Name|Type|Description|
|---|---|---|
|**raids**|Raid[]||
### Raid
|Name|Type|Description|
|---|---|---|
|**description**|String|RAID Type Description|
|**deviceType**|String|Type of Cloud Physical Server, such as cps.c.normal|
|**raidType**|String|RAID Type, such as NORAID, RAID0, and RAID1|
|**raidTypeId**|String|RAID Type ID|
|**volumeDetail**|String|Device Details|
|**volumeType**|String|Disk Type, such as System/Data|

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|Bad request|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
