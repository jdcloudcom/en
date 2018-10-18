# modifyInstance


## Description
Modify some information of Cloud Physical Server, including name, description

## Request method
POST

## Request address
https://cps.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}:modifyInstance

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**instanceId**|String|True| |Cloud Physical Server ID|
|**regionId**|String|True| |Region ID, the Region and Availability Zone Supported by the Cloud Physical Servers can be Obtained by Calling API (describeRegions)|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**description**|String|False| |Description of Cloud Physical Server|
|**name**|String|False| |Name of Cloud Physical Server|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**description**|String|Description of Cloud Physical Server|
|**name**|String|Name of Cloud Physical Server|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|Bad request|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
