# describeBackups


## 描述
View the detailed information of all backups in the RDS instance. The returned backup list is sorted in descending order from start time of backup (backupStartTime). <br>- Support SQL Server Only

## 请求方式
GET

## 请求地址
https://rds.jdcloud-api.com/v1/regions/{regionId}/backups

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True||Region code, with range detailed in [Regions and Availability Zone Comparison Table](../Enum-Definitions/Regions-AZ.md)|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**auto**|Integer|False||Query the backup type, 0 for manual backup, 1 for automatic backup, not for all.<br>**- Test parameters, only support SQL Server, and may be replaced by other parameters later**|
|**backupTimeRangeEndFilter**|String|False||Return the backup list whose backup start time is shorter than or equal to this time<br>**-Test parameters, only support SQL Server, and may be replaced by other parameters later**|
|**backupTimeRangeStartFilter**|String|False||Return the backup list whose start time of backup is longer than this time<br>**- Test parameters, only support SQL Server, and may be replaced by other parameters later**|
|**backupTypeFilter**|String|False||Return a list of backups with backupType equal to the specified value. Full is a full backup, and diff is an incremental backup<br>**- Test parameters, only support SQL Server, and may be replaced by other parameters later**|
|**dbNameFilter**|String|False||Return a list of backups whose dbName is equal to the specified value. Return all if  not for all or empty<br>**- Test parameters, only support SQL Server, and may be replaced by other parameters later**|
|**instanceId**|String|True||RDS instance ID can identify an instance uniquely|
|**pageNumber**|Integer|True||Display the page number of the data. The default is 1, and the value range is [-1, ∞). When pageNumber is -1, return all data page numbers; when the total number of pages is exceeded, display the last page.|
|**pageSize**|Integer|True||The default of the number of data displayed per page is 10, and the value range is [1,100], which can only be a multiple of 10.|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|名称|类型|描述|
|---|---|---|
|**backup**|[Backup[]](##Backup)|Backup Collection|
|**totalCount**|Integer|Total Number of Records|
### <a name="Backup">Backup</a>
|名称|类型|描述|
|---|---|---|
|**backupEndTime**|String|Backup end time, format: YYYY-MM-DD HH:mm:ss|
|**backupFiles**|String[]|Backup File List<br>- **SQL Server supports**, there can be multiple backup files and the naming rules for file name are:<br>(1) Full: Database name +.bak<br>(2) Incremental: Database name +.diff<br>- **MySQL does not support**|
|**backupId**|String|Backup ID|
|**backupMode**|String|Backup mode, automatic system backup or manual backup, detailed in [Enumeration Parameter Definition](../Enum-Definitions/Enum-Definitions.md)|
|**backupName**|String|Backup name with length up to 64 English characters or Chinese characters of equal length|
|**backupSizeByte**|Integer|Size of Whole Backup Set, in Byte|
|**backupStartTime**|String|Backup start time, format: YYYY-MM-DD HH:mm:ss|
|**backupStatus**|String|Backup status, detailed in [Enumeration Parameter Definition](../Enum-Definitions/Enum-Definitions.md)|
|**backupType**|String|Backup type, full backup or incremental backup, detailed in [Enumeration Parameter Definition](../Enum-Definitions/Enum-Definitions.md)<br>- **SQL Server supports****<br>- **MySQL does not support**|
|**backupUnit**|String|Backup granularity, instance backup or multi-database backup,  detailed in [Enumeration Parameter Definition](../Enum-Definitions/Enum-Definitions.md)<br>- **SQL Server supports**<br>- **MySQL does not support**|
|**instanceId**|String|Backup Instance ID|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
