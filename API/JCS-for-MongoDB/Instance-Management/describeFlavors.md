# describeFlavors


## Description
Get type

## Request method
GET

## Request address
https://mongodb.jdcloud-api.com/v1/regions/{regionId}/flavors

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request parameter
None


## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**flavors**|Flavor[]| |
### Flavor
|Name|Type|Description|
|---|---|---|
|**cpu**|Integer|Number of CPU Cores|
|**diskStep**|Integer|Disk Step Size|
|**iops**|Integer|iops|
|**maxDisk**|Integer|Maximum Number of Disks, Unit: GB|
|**maxLink**|Integer|Maximum Connections|
|**memory**|Integer|Memory, Unit: GB|
|**minDisk**|Integer|Minimum Number of Disks, Unit: GB|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
