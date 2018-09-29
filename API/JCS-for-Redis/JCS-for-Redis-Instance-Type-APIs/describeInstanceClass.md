# describeInstanceClass


## Description
Query the instance list type under a certain region

## Request method
GET

## Request address
https://redis.jdcloud-api.com/v1/regions/{regionId}/instanceClass

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

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
|**instanceClasses**|InstanceClass[]| |
|**totalCount**|Integer| |
### InstanceClass
|Name|Type|Description|
|---|---|---|
|**bandwidthMbps**|Integer|Bandwidth|
|**cpu**|Integer|cpu|
|**diskGB**|Integer|Disk|
|**instanceClass**|String|For instance type code, see instance type code table|
|**maxConnetction**|Integer|Maximum Number of Links|
|**memoryMB**|Integer|Memory|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
