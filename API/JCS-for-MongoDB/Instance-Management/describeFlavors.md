# describeFlavors


## Description
Get Type

## Request method
GET

## Request address
https://mongodb.jdcloud-api.com/v1/regions/{regionId}/flavors

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## Request parameter
None


## Return parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result||


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**flavors**|Flavor[]||
### <a name="Flavor">Flavor</a>
|Name|Type|Description|
|---|---|---|
|**cpu**|Integer|Number of CPU Cores|
|**diskStep**|Integer|Disk Step Size|
|**iops**|Integer|iops|
|**maxDisk**|Integer|Maximum Number of Disks, in GB|
|**maxLink**|Integer|Maximum Connections|
|**memory**|Integer|Memory, in GB|
|**minDisk**|Integer|Minimum Number of Disks, in GB|

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
