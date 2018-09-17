# deleteAccount


## 描述
Delete the database account. After the account is deleted, it cannot be restored and the user cannot use this account to log in the RDS instance.

## 请求方式
DELETE

## 请求地址
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/accounts/{accountName}

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**accountName**|String|True||Account name; in the same instance, the account name cannot be duplicated.|
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
