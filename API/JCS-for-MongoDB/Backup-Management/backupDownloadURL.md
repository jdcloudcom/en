# backupDownloadURL


## 描述
Get Backup Download Link

## 请求方式
GET

## 请求地址
https://mongodb.jdcloud-api.com/v1/regions/{regionId}/backups/{backupId}/downloadURL

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**backupId**|String|True||backup ID|
|**regionId**|String|True||Region ID|

## 请求参数
无


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String||
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|名称|类型|描述|
|---|---|---|
|**backupDownloadURL**|[BackupDownloadURL](##BackupDownloadURL)||
### <a name="BackupDownloadURL">BackupDownloadURL</a>
|名称|类型|描述|
|---|---|---|
|**backupInternetDownloadURL**|String|Address of Public Network Download Link|
|**backupIntranetDownloadURL**|String|Address of Intranet Download Link|
|**backupName**|String|Backup Name|
|**linkExpiredTime**|String|Expiration Time of Public Network and Intranet Download Link|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
