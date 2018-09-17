# createDatabase


## 描述
Create a Database. For instance management and data restoration, RDS restricts user permissions, and users can only create databases through the console or this interface.

## 请求方式
POST

## 请求地址
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/databases

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**instanceId**|String|True||RDS instance ID, which uniquely identifies an RDS instance|
|**regionId**|String|True||Region code, with range detailed in [Regions and Availability Zone Comparison Table](../Enum-Definitions/Regions-AZ.md)|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**characterSetName**|String|True||About the character set name of the database and the currently supported character set, please see[Enumeration Parameter Definition](../Enum-Definitions/Enum-Definitions.md)|
|**dbName**|String|True||About database name and database name restrictions, please refer to[Help Center Documentation](../../../documentation/Cloud-Database-and-Cache/RDS/Introduction/Restrictions/SQLServer-Restrictions.md)|


## 返回参数
|名称|类型|描述|
|---|---|---|



## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
