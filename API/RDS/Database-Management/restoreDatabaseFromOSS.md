# restoreDatabaseFromOSS


## 描述
Restore a single database from the backup file uploaded to OSS<br> - only support SQL Server

## 请求方式
POST

## 请求地址
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/databases/{dbName}:restoreDatabaseFromOSS

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**dbName**|String|True||Database name|
|**instanceId**|String|True||RDS instance ID, which uniquely identifies an RDS instance|
|**regionId**|String|True||Region code, with range detailed in [Regions and Availability Zone Comparison Table](../Enum-Definitions/Regions-AZ.md)|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**ossURL**|String|True||The inner link of the backup file uploaded by the user to object storage service, OSS|


## 返回参数
|名称|类型|描述|
|---|---|---|



## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
