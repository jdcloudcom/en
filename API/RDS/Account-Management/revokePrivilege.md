# revokePrivilege


## 描述
Cancel all permissions of the account to a certain database. After the permissions are canceled, the account will not be able to access the database. Cancel the access permission of the account to a certain database without affecting the access permissions of the account to other databases<br>- only support MySQL

## 请求方式
POST

## 请求地址
https://rds.jdcloud-api.com/0.2.9/regions/{regionId}/instances/{instanceId}/accounts/{accountName}:revokePrivilege

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**accountName**|String|True| |Account name; in the same instance, the account name cannot be duplicated.|
|**instanceId**|String|True| |RDS instance ID, which uniquely identifies an RDS instance|
|**regionId**|String|True| |Region code, with range detailed in [Regions and Availability Zone Comparison Table](../Enum-Definitions/Regions-AZ.md)|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**dbNames**|String[]|True| |The Name of the Database of Which the Authorization is Cancelled is Required. After the permissions are canceled, the account will not be able to access the database|


## 返回参数
无


## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
