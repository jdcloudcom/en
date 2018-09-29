# describeDeviceTypes


## 描述
Query the instance type family of Cloud Physical Server

## 请求方式
GET

## 请求地址
https://cps.jdcloud-api.com/v1/regions/{regionId}/deviceTypes

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
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
|**deviceTypes**|DeviceType[]| |
### DeviceType
|名称|类型|描述|
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

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**400**|Bad request|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
