# describeDatabases


## 描述
Obtain a list of all database details for the current instance

## 请求方式
GET

## 请求地址
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/databases

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**instanceId**|String|True||RDS instance ID, which uniquely identifies an RDS instance|
|**regionId**|String|True||Region code, with range detailed in [Regions and Availability Zone Comparison Table](../Enum-Definitions/Regions-AZ.md)|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**dbName**|String|False||Database Name If you do not specify a database name, return all database lists <br> -**MySQL: This field is not supported **<br>- **SQL Server: This field is supported**|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|名称|类型|描述|
|---|---|---|
|**databases**|[Database[]](##Database)||
### <a name="Database">Database</a>
|名称|类型|描述|
|---|---|---|
|**accessPrivilege**|[DBAccessPrivilege[]](##DBAccessPrivilege)|List of Database Related Account Privilege|
|**characterSetName**|String|Character set, detailed in [Enumeration Parameter Definition](../Enum-Definitions/Enum-Definitions.md)|
|**dbName**|String|Database name with specific rules detailed in the Help Center Documentation: [Name and Password Restrictions](../../../documentation/Cloud-Database-and-Cache/RDS/Introduction/Restrictions/SQLServer-Restrictions.md)|
|**dbStatus**|String|Database status, detailed in [Enumeration Parameter Definition](../Enum-Definitions/Enum-Definitions.md)- **MySQL: Not support, not return this field**- **SQL Server: return this field**|
### <a name="DBAccessPrivilege">DBAccessPrivilege</a>
|名称|类型|描述|
|---|---|---|
|**accountName**|String|Account Name|
|**privilege**|String|Privilege of account to the database with the specific definition detailed in [Enumeration Parameter Definition](../Enum-Definitions/Enum-Definitions.md)|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
