# deleteInstance


## 描述
Delete an RDS Instance or a read-only instance of MySQL. When the primary instance of MySQL is deleted, the corresponding read-only instance of MySQL is also deleted</br>敏感操作，可开启<a href="https://www.jdcloud.com/help/detail/3786/isCatalog/1">MFA操作保护</a>

## 请求方式
DELETE

## 请求地址
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**instanceId**|String|True||RDS instance ID, which uniquely identifies an RDS instance|
|**regionId**|String|True||Region code, with range detailed in [Regions and Availability Zone Comparison Table](../Enum-Definitions/Regions-AZ.md)|

## 请求参数
无


## 返回参数
|名称|类型|描述|
|---|---|---|



## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
