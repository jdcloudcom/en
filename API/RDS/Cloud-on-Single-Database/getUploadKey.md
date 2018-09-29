# getUploadKey


## 描述
Obtain the required key for uploading files from Cloud on Single Database. Cloud on Single Database needs the correct key value to connect to JD Cloud<br>- only support SQL Server

## 请求方式
POST

## 请求地址
https://rds.jdcloud-api.com/0.2.9/regions/{regionId}/instances/{instanceId}/importFiles:getUploadKey

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**instanceId**|String|True| |RDS instance ID, which uniquely identifies an RDS instance|
|**regionId**|String|True| |Region code, with range detailed in [Regions and Availability Zone Comparison Table](../Enum-Definitions/Regions-AZ.md)|

## 请求参数
无


## 返回参数
|名称|类型|描述|
|---|---|---|
|**result**|Result| |

### Result
|名称|类型|描述|
|---|---|---|
|**key**|String|The Key to be used to upload the file|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
