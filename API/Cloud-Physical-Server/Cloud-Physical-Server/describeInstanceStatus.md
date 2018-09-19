# describeInstanceStatus


## Description
Query the Hardware Monitoring Information of a Single Cloud Physical Server

## Request method
GET

## Request address
https://cps.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}:describeInstanceStatus

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**instanceId**|String|True||Cloud Physical Server ID|
|**regionId**|String|True||Region ID, the Region and Availability Zone Supported by the Cloud Physical Servers can be Called by Calling APIs (describeRegions)|

## Request parameter
None


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String||
|**result**|Result||


### Result
|Name|Type|Description|
|---|---|---|
|**cpus**|Boolean|Whether the CPU Status is Normal|
|**disks**|Boolean|Whether the Hard Disk Status is Normal|
|**mems**|Boolean|Whether the Memory Status is Normal|
|**nics**|Boolean|Whether the Network Interface Status is Normal|

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|Bad request|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
