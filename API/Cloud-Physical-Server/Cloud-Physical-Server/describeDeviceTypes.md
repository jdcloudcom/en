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
None


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**deviceTypes**|DeviceType[]| |
### DeviceType
|Name|Type|Description|
|---|---|---|
|**cpuConcise**|String|CPU Summary Description|
|**cpuDetail**|String|CPU Details|
|**dataDiskConcise**|String|Summary Information of Data Disk|
|**dataDiskDetail**|String|Details of Data Disk|
|**gpuConcise**|String|GPU Summary Information|
|**gpuDetail**|String|GPU Details|
|**ifConcise**|String|Summary Information of Network Port|
|**ifDetail**|String|Details of Network Port|
|**memConcise**|String|Memory Summary Information|
|**memDetail**|String|Memory Details|
|**nameEN**|String|English Name of Instance Type Family, such as cps.c.normal|
|**nameZH**|String|Chinese Name of Instance Type Family, such as 计算型|
|**region**|String|Region Code, such as cn-east-1|
|**systemDiskConcise**|String|Summary Information of System Disk|
|**systemDiskDetail**|String|Details of System Disk|
|**useTypeEN**|String|English Description of Image Type, such as Standard|
|**useTypeZH**|String|Chinese Description of Image Type, such as 标准型|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|Bad request|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
