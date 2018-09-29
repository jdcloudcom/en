# describeBackups


## 描述
View Backup

## 请求方式
GET

## 请求地址
https://mongodb.jdcloud-api.com/v1/regions/{regionId}/backups

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**filters**|Filter[]|False| |instanceId - Instance ID, Accurate Matching<br>backupId - Backup ID, Accurate Matching<br>|
|**pageNumber**|Integer|False| |Page Number; Default: 1; Value range: [1, ∞)|
|**pageSize**|Integer|False| |Page Size; Default: 10; Value range: [1,100]|

### Filter
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**name**|String|True| |Name of Filter Requirements|
|**operator**|String|False| |Operator of filter requirements is eq by default|
|**values**|String[]|True| |Value of Filter Requirements|

## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |

### Result
|名称|类型|描述|
|---|---|---|
|**backups**|Backup[]| |
|**pageNumber**|Integer| |
|**totalCount**|Integer| |
### Backup
|名称|类型|描述|
|---|---|---|
|**backupEndTime**|String|Backup End Time|
|**backupId**|String|Backup ID|
|**backupMode**|String|Backup Mode, Automated (System Automatic Backup), Manual (Manual Backup)|
|**backupName**|String|Backup Name|
|**backupSizeByte**|Integer|Size of Whole Backup Set, Unit: Byte|
|**backupStartTime**|String|Backup Start Time|
|**backupStatus**|String|Backup Status, Waiting (Waiting), Running (Backing-up), Finished (Finished), Failed (Error)|
|**instanceId**|String|Backup Instance ID|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
