# restoreDatabaseFromFile


## 描述
Restore a single database from the backup file uploaded by the user to the cloud through the cloud on single database<br>- only support SQL Server

## 请求方式
POST

## 请求地址
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/databases/{dbName}:restoreDatabaseFromFile

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**dbName**|String|True||Database name|
|**instanceId**|String|True||RDS instance ID, which uniquely identifies an RDS instance|
|**regionId**|String|True||Region code, with range detailed in [Regions and Availability Zone Comparison Table](../Enum-Definitions/Regions-AZ.md)|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**fileName**|String|True||The name of the backup file uploaded by the user (including suffix name of the file ), for example, mydb1.bak|
|**sharedFileGid**|String|False||The global ID of the shared file can be obtained from the query interface to upload file [describeImportFiles](../import/describeImportFiles.md); if the file is not a shared file, you do not need to enter this parameter|


## 返回参数
|名称|类型|描述|
|---|---|---|



## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
