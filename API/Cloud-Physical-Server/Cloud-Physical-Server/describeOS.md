# describeOS


## Description
Query the Operating Systems Supported by the Cloud Physical Server

## Request method
GET

## Request address
https://cps.jdcloud-api.com/v1/regions/{regionId}/os

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID, the Region and Availability Zone Supported by the Cloud Physical Servers can be Obtained by Calling API (describeRegions)|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**deviceType**|String|True| |Instance Type Family, the API (describeDeviceTypes) may be called to obtain the instance type family of a specific region, such as: cps.c.normal|
|**osType**|String|False| |OS type, value range: CentOS, Ubuntu|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**oss**|Os[]| |
### Os
|Name|Type|Description|
|---|---|---|
|**osTypeId**|String|Operating System Type ID|
|**osName**|String|Operating System Name, such as Ubuntu 16.04(x86_64)|
|**osType**|String|Operating System Type Id, such as Ubuntu/Centos|
|**osVersion**|String|Operating System Version, such as 14.04/16.04|
|**deviceType**|String|Instance Type Family, e.g. cps.c.normal|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|Bad request|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
