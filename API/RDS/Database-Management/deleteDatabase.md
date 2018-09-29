# deleteDatabase


## 描述
Delete the database from the RDS instance. For management and data restoration, RDS controls user permissions. Users can only delete databases through the console or this API.</br>敏感操作，可开启<a href="https://docs.jdcloud.com/IAM/Operation-Protection">MFA操作保护</a>

## 请求方式
DELETE

## 请求地址
https://rds.jdcloud-api.com/0.2.9/regions/{regionId}/instances/{instanceId}/databases/{dbName}

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**dbName**|String|True| |Database name|
|**instanceId**|String|True| |RDS instance ID, which uniquely identifies an RDS instance|
|**regionId**|String|True| |Region code, with range detailed in [Regions and Availability Zone Comparison Table](../Enum-Definitions/Regions-AZ.md)|

## 请求参数
无


## 返回参数
无


## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
