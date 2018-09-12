# describeBackups


## 描述
View Backup

## 请求方式
GET

## 请求地址
https://mongodb.jdcloud-api.com/v1/regions/{regionId}/backups

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**filters**|[Filter[]](##Filter)|False||instanceId - Instance ID, Accurate Matching<br>backupId - Backup ID, Accurate Matching<br>|
|**pageNumber**|Integer|False||Page number; default: 1; value range: [1, ∞)|
|**pageSize**|Integer|False||Page size; default: 10; value range: [10,100]|

### <a name="Filter">Filter</a>
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**name**|String|True||Name of filter requirements|
|**operator**|String|False||Operator of filter requirements is eq by default|
|**values**|String[]|True||Value of filter requirements|

## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String||
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|名称|类型|描述|
|---|---|---|
|**backups**|[Backup[]](##Backup)||
|**pageNumber**|Integer||
|**totalCount**|Integer||
### <a name="Backup">Backup</a>
|名称|类型|描述|
|---|---|---|
|**backupEndTime**|String|Backup End Time|
|**backupId**|String|Backup ID|
|**backupMode**|String|Backup Mode, Automated (System Automatic Backup), Manual (Manual Backup)|
|**backupName**|String|Backup Name|
|**backupSizeByte**|Integer|Size of Whole Backup Set, in Byte|
|**backupStartTime**|String|Backup Start Time|
|**backupStatus**|String|Backup Status, Waiting (Waiting), Running (Backing-up), Finished (Finished), Failed (Error)|
|**instanceId**|String|Backup Instance ID|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
