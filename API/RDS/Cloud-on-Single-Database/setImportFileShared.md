# setImportFileShared


## 描述
Set or cancel whether the uploaded file is shared to other instances under the same account. By default, files are only visible and can be imported on the uploaded instance. Other instances are not visible and cannot be imported. If you need this file to be imported on other instances, you can set this file to share<br>- only support SQL Server

## 请求方式
POST

## 请求地址
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/importFiles/{fileName}:setShared

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**fileName**|String|True||The File Name of Cloud on Single Database|
|**instanceId**|String|True||RDS instance ID, which uniquely identifies an RDS instance|
|**regionId**|String|True||Region code, with range detailed in [Regions and Availability Zone Comparison Table](../Enum-Definitions/Regions-AZ.md)|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**shared**|String|True||Whether the file is shared<br>true: shared<br>false: not shared|


## 返回参数
|名称|类型|描述|
|---|---|---|



## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
