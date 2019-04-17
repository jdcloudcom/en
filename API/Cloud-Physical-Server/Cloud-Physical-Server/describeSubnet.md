# describeSubnet


## Description
Query Subnet

## Request method
GET

## Request address
https://cps.jdcloud-api.com/v1/regions/{regionId}/subnet

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID, the Region and Availability Zone Supported by the Cloud Physical Servers can be Obtained by Calling APIs (describeRegions)|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**az**|String|True| |Availability Zone, as cn-east-1a; the availability zones supported by the Cloud Physical Servers in the region can be obtained by calling API (describeRegions)|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**subnet**|Subnet|Subnet Details|
### Subnet
|Name|Type|Description|
|---|---|---|
|**region**|String|Region Code, such as cn-east-1|
|**az**|String|Availability Zone, such as cn-east-1a|
|**cidr**|String|Subnet CIDR|
|**subnetId**|String|Subnet ID|
|**networkType**|String|Network Type|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|Bad request|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
