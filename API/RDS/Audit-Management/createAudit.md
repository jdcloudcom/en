# createAudit


## 描述
It enables the database audit function of SQL Server and currently supports instance-level database audit. Users can enable and disable the audit function, customize audit policies, and download audit files as needed. The audit file is a native SQL Server audit file and is saved for 6 months by default. <br>- Support SQL Server Only

## 请求方式
POST

## 请求地址
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/audit

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**instanceId**|String|True||RDS instance ID, which uniquely identifies an RDS instance|
|**regionId**|String|True||Region code, with range detailed in [Regions and Availability Zone Comparison Table](../Enum-Definitions/Regions-AZ.md)|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**enabled**|String|True||The audit options to be enable shall be separated from each other by a comma or a space, for example: DATABASE_OBJECT_ACCESS_GROUP,ACKUP_RESTORE_GROU, etc. <br>The audit options supported by each database version can be obtained via the interface [getAuditOptions](./getAuditOptions.md), and the specific meaning of each audit option can be found in the official document of Microsoft.|


## 返回参数
|名称|类型|描述|
|---|---|---|



## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
