# deleteBackup


## 描述
Deletes the RDS instance backup. Only the user-generated backups are allowed to be deleted and the system automatic backups are not allow to be deleted.

## 请求方式
DELETE

## 请求地址
https://rds.jdcloud-api.com/v1/regions/{regionId}/backups/{backupId}

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**backupId**|String|True||Backup ID|
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
