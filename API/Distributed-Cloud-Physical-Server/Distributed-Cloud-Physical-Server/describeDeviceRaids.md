# describeDeviceRaids


## Description
Search the RAID types supported by the Distributed Cloud Physical Server of a certain instance type family, with RAID types of system disk and data disk available for search

## Request Method
GET

## Request Address
https://edcps.jdcloud-api.com/v1/regions/{regionId}/raids

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID, calling APIs (describeEdCPSRegions) to get regions supported by Distributed Cloud Physical Server|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**deviceType**|String|True| |Instance type family, the instance type family (e.g. edcps.c.normal1) of designated region can be obtained by calling the API (describeDeviceTypes)|
|**volumeType**|String|False| |Disk type, value range: system, data|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](describedeviceraids#result)| |
|**requestId**|String| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**raids**|[Raid[]](describedeviceraids#raid)| |
### <div id="raid">Raid</div>
|Name|Type|Description|
|---|---|---|
|**volumeType**|String|Disk Type, such as system/data|
|**volumeDetail**|String|Equipment Details|
|**raidTypeId**|String|RAID Type ID|
|**raidType**|String|RAID Type, such as NORAID, RAID0 and RAID1|
|**deviceType**|String|Type of Cloud Physical Server, such as edcps.c.normal1|
|**description**|String|RAID Type Description|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Bad request|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
