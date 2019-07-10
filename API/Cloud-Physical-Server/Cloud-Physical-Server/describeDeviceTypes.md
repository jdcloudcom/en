# describeDeviceTypes


## Description
Query the instance type family of Cloud Physical Server

## Request method
GET

## Request address
https://cps.jdcloud-api.com/v1/regions/{regionId}/deviceTypes

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID, the Region and Availability Zone Supported by the Cloud Physical Servers can be Obtained by Calling API (describeRegions)|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**az**|String|False| |Availability Zone, accurate match|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**deviceTypes**|DeviceType[]| |
### DeviceType
|Name|Type|Description|
|---|---|---|
|**deviceType**|String|Instance Type Family, e.g. cps.c.normal|
|**name**|String|Name of Instance Type Family, e.g. compute standard|
|**family**|String|Type Series of instances, e.g., computing, storage, GPU|
|**region**|String|Region Code, such as cn-east-1|
|**cpuConcise**|String|CPU Summary Description|
|**cpuDetail**|String|CPU Details|
|**memConcise**|String|Memory Summary Information|
|**memDetail**|String|Memory Details|
|**ifConcise**|String|Summary Information of Network Port|
|**ifDetail**|String|Details of Network Port|
|**gpuConcise**|String|GPU Summary Information|
|**gpuDetail**|String|GPU Details|
|**systemDiskAmount**|Integer|System Disk Counts|
|**systemDiskSize**|Integer|Single System Disk Size (GB)|
|**systemDiskModel**|String|System Disk Specification|
|**dataDiskAmount**|Integer|Data Disk Counts|
|**dataDiskSize**|Integer|Single Data Disk Size (GB)|
|**dataDiskModel**|String|Data Disk Specification|
|**isSoldOut**|Boolean|Sold out status|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|Bad request|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
