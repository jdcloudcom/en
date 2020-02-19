# describeDeviceTypes


## Description
Search type of Distributed Cloud Physical Server Instance Type Family

## Request Method
GET

## Request Address
https://edcps.jdcloud-api.com/v1/regions/{regionId}/deviceTypes

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID, calling APIs (describeEdCPSRegions) to get regions supported by Distributed Cloud Physical Server|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**az**|String|False| |Availability Zone, accurate match|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](describedevicetypes#result)| |
|**requestId**|String| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**deviceTypes**|[DeviceType[]](describedevicetypes#devicetype)| |
### <div id="devicetype">DeviceType</div>
|Name|Type|Description|
|---|---|---|
|**deviceType**|String|Instance type family, e.g. edcps.c.normal1|
|**name**|String|Name of instance type family, e.g. Edge Compute StandardⅠ|
|**family**|String|Type series of instances, e.g., computing, storage and GPU|
|**region**|String|Region code, e.g. cn-east-tz1|
|**cpuConcise**|String|CPU Summary Description|
|**cpuDetail**|String|CPU Details|
|**memConcise**|String|Memory Summary Information|
|**memDetail**|String|Memory Details|
|**ifConcise**|String|Network Access Summary|
|**ifDetail**|String|Network Access Details|
|**gpuConcise**|String|GPU Summary|
|**gpuDetail**|String|GPU Details|
|**systemDiskAmount**|Integer|System Disk Counts|
|**systemDiskSize**|Integer|Single System Disk Size (GB)|
|**systemDiskModel**|String|System Disk Specification|
|**dataDiskAmount**|Integer|Data Disk Counts|
|**dataDiskSize**|Integer|Single Data Disk Size (GB)|
|**dataDiskModel**|String|Data Disk Specification|
|**isSoldOut**|Boolean|Sold Out Status|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Bad request|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
