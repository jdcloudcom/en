# modifyAudit


## 描述
Modify Current Audit Options. Currently available audit options are available through describeAudit, and all supported options are available through getAuditOptions. <br>- Support SQL Server Only

## 请求方式
POST

## 请求地址
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/audit:modifyAudit

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**instanceId**|String|True||RDS instance ID, which uniquely identifies an RDS instance|
|**regionId**|String|True||Region code, with range detailed in [Regions and Availability Zone Comparison Table](../Enum-Definitions/Regions-AZ.md)|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**add**|String|False||Add new audit items based on the original audit items. Multiple audit items are separated by commas, semicolons or spaces, for example, DATABASE_OBJECT_ACCESS_GROUP, ACKUP_RESTORE_GROUP|
|**drop**|String|False||Delete audit items. Multiple audit items are separated by commas, semicolons or spaces, for example, DATABASE_OBJECT_ACCESS_GROUP,ACKUP_RESTORE_GROUP<br>If all audit items are deleted, the audit is automatically disabled.|


## 返回参数
|名称|类型|描述|
|---|---|---|



## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
