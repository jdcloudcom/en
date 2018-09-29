# describeDeviceRaids


## 描述
Query the RAID types supported by the Cloud Physical Server of a certain instance type family, may query the system disk RAID type and data disk RAID type

## 请求方式
GET

## 请求地址
https://cps.jdcloud-api.com/v1/regions/{regionId}/raids

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID, the Region and Availability Zone Supported by the Cloud Physical Servers can be Called by Calling APIs (describeRegions)|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**deviceType**|String|True| |Instance Type Family, the (describeDeviceTypes) APIs may be called to obtain the instance type family of a specific region, such as: cps.c.normal|
|**volumeType**|String|False| |Disk Type, value range: system, data|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |

### Result
|名称|类型|描述|
|---|---|---|
|**raids**|Raid[]| |
### Raid
|名称|类型|描述|
|---|---|---|
|**description**|String|RAID Type Description|
|**deviceType**|String|Type of Cloud Physical Server, such as cps.c.normal|
|**raidType**|String|RAID Type, such as NORAID, RAID0, and RAID1|
|**raidTypeId**|String|RAID Type ID|
|**volumeDetail**|String|Device Details|
|**volumeType**|String|Disk Type, such as System/Data|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**400**|Bad request|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
