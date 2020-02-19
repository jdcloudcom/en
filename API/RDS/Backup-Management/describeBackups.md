# describeBackups


## Description
View the detailed information of all backups in the RDS instance. The returned backup list is sorted in descending order from start time of backup (backupStartTime). <br>- Support SQL Server Only

## Request method
GET

## Request address
https://rds.jdcloud-api.com/v1/regions/{regionId}/backups

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region code, with range detailed in [Regions and Availability Zone Comparison Table](../Enum-Definitions/Regions-AZ.md)|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**instanceId**|String|True| |RDS instance ID can identify an instance uniquely|
|**auto**|Integer|False| |Query the backup type, 0 for manual backup, 1 for automatic backup, not for all.<br>**- Test parameters, only support SQL Server, and may be replaced by other parameters later**|
|**backupTypeFilter**|String|False| |Return a list of backups with backupType equal to the specified value. Full is a full backup, and diff is an incremental backup<br>**- Test parameters, only support SQL Server, and may be replaced by other parameters later**|
|**dbNameFilter**|String|False| |Return a list of backups whose dbName is equal to the specified value. Return all if  not for all or empty<br>**- Test parameters, only support SQL Server, and may be replaced by other parameters later**|
|**backupTimeRangeStartFilter**|String|False| |Return the backup list whose start time of backup is longer than this time<br>**- Test parameters, only support SQL Server, and may be replaced by other parameters later**|
|**backupTimeRangeEndFilter**|String|False| |Return the backup list whose backup start time is shorter than or equal to this time<br>**-Test parameters, only support SQL Server, and may be replaced by other parameters later**|
|**pageNumber**|Integer|True| |Display the page number of the data. The default is 1, and the value range is [-1, ∞). When pageNumber is -1, return all data page numbers; when the total number of pages is exceeded, display the last page.|
|**pageSize**|Integer|True| |The default of the number of data displayed per page is 10, and the value range is [1,100], which can only be a multiple of 10.|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](describebackups#result)| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**backup**|[Backup[]](describebackups#backup)|Backup Set|
|**totalCount**|Integer|Total Number of Records|
### <div id="backup">Backup</div>
|Name|Type|Description|
|---|---|---|
|**backupId**|String|Backup ID|
|**backupName**|String|Backup name with length up to 64 English characters or Chinese characters of equal length|
|**instanceId**|String|Backup Instance ID|
|**backupStatus**|String|Backup Status, detailed in [Enumeration Parameter Definition](../Enum-Definitions/Enum-Definitions.md)|
|**backupStartTime**|String|Backup Start Time, Format: YYYY-MM-DD HH:mm:ss|
|**backupEndTime**|String|Backup End Time, Format: YYYY-MM-DD HH:mm:ss|
|**backupType**|String|Backup type, full backup or incremental backup, detailed in [Enumeration Parameter Definition](../Enum-Definitions/Enum-Definitions.md)<br>- **SQL Server supports****<br>- **MySQL does not support**|
|**backupMode**|String|Backup mode, automatic system backup or manual backup, detailed in [Enumeration Parameter Definition](../Enum-Definitions/Enum-Definitions.md)|
|**backupUnit**|String|Backup granularity, instance backup or multi-database backup, detailed in [Enumeration Parameter Definition](../Enum-Definitions/Enum-Definitions.md)<br>- **SQL Server supports**<br>- **MySQL does not support**|
|**backupFiles**|String[]|Backup File List<br>- **SQL Server supports**, there can be multiple backup files and the naming rules for file name are:<br>(1) Full: Database name +.bak<br>(2) Incremental: Database name +.diff<br>- **MySQL does not support**|
|**backupSizeByte**|Long|Overall backup set size, unit: Byte|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|

## Request Example
GET
```
public void testDescribeBackups() {
    DescribeBackupsRequest describeBackupsRequest = new DescribeBackupsRequest();
    describeBackupsRequest.setInstanceId("mysql-wp4e9ztap2");
    describeBackupsRequest.setRegionId("cn-north-1");
    describeBackupsRequest.setPageNumber(1);
    describeBackupsRequest.setPageSize(10);
    DescribeBackupsResponse response = rdsClient.describeBackups(describeBackupsRequest);
    System.out.println(new Gson().toJson(response));
}

```

## Return Example
```
{
    "requestId": "bpa30g4fdrqkkoe010om8t9rafn4qm43", 
    "result": {
        "backup": [
            {
                "backupId": "0313e588-44d0-4b20-b532-6eebb9d83352", 
                "backupMode": "manual", 
                "backupName": "dj_backup", 
                "backupSizeByte": 15167776, 
                "backupStartTime": "2020-01-07T15:14:07", 
                "backupStatus": "COMPLETED", 
                "instanceId": "mysql-wp4e9ztap2"
            }, 
            {
                "backupId": "dcd25cd6-a787-4fea-8e89-1451ba600591", 
                "backupMode": "auto", 
                "backupName": "916450a3", 
                "backupSizeByte": 15133149, 
                "backupStartTime": "2020-01-07T02:13:03", 
                "backupStatus": "COMPLETED", 
                "instanceId": "mysql-wp4e9ztap2"
            }
        ], 
        "totalCount": 2
    }
}
```
