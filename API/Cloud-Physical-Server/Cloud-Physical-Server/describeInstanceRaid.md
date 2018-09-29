# describeInstanceRaid


## 描述
Query the installed RAID information of a single Cloud Physical Server, including the system disk RAID information and data disk RAID information

## 请求方式
GET

## 请求地址
https://cps.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}:describeInstanceRaid

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**instanceId**|String|True| |Cloud Physical Server ID|
|**regionId**|String|True| |Region ID, the Region and Availability Zone Supported by the Cloud Physical Servers can be Called by Calling APIs (describeRegions)|

## 请求参数
无


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |

### Result
|名称|类型|描述|
|---|---|---|
|**dataRaidType**|String|Data Disk RAID Type ID|
|**dataRaidTypeId**|String|Data Disk RAID Type ID|
|**sysRaidType**|String|System Disk RAID Type|
|**sysRaidTypeId**|String|System Disk RAID Type ID|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**400**|Bad request|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
