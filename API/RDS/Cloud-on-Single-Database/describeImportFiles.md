# describeImportFiles


## 描述
Obtain the list of files uploaded by the user to the instance through Cloud on Single Database<br>- only support SQL Server

## 请求方式
GET

## 请求地址
https://rds.jdcloud-api.com/0.2.9/regions/{regionId}/instances/{instanceId}/importFiles

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
|**importFiles**|ImportFile[]|Collection of Imported Files|
### ImportFile
|名称|类型|描述|
|---|---|---|
|**isLocal**|String|Whether it belongs to the current instance. <br> 1: Current instance; <br>0: It does not belong to current instance, and is a shared file|
|**name**|String|File Name|
|**sharedFileGid**|String|If the file is a shared file, it has a global ID, and it is empty if it is not a shared file. This global ID is needed when the file is deleted.|
|**sizeByte**|Integer|File Size, Unit: Byte|
|**uploadTime**|String|File upload completion time, format: YYYY-MM-DD HH:mm:ss|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
