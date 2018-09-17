# setInstanceName


## 描述
Modify the instance name to support Chinese. The specific rules for the instance name can be found in the Help Center document: [Name and Password Restrictions] (../../../documentation/Cloud-Database-and-Cache/RDS/Introduction /Restrictions/SQLServer-Restrictions.md)<br>-  Support SQL Server Only

## 请求方式
POST

## 请求地址
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}:setInstanceName

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**instanceId**|String|True||RDS instance ID, which uniquely identifies an RDS instance|
|**regionId**|String|True||Region code, with range detailed in [Regions and Availability Zone Comparison Table](../Enum-Definitions/Regions-AZ.md)|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**instanceName**|String|True||The instance name, which supports Chinese, and the specific rules for the instance name can be found in the Help Center documentation: [Name and Password Restrictions] (../../../documentation/Cloud-Database-and-Cache/RDS/Introduction/ Restrictions/SQLServer-Restrictions.md)|


## 返回参数
|名称|类型|描述|
|---|---|---|



## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
