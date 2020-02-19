# createBackup


## Description
Creating a full backup of the RDS instance can be fully backed up for the entire instance or part of the database (SQL Server supports only). At the same time, there is only be one running backup task can work<br>- Support SQL Server only

## Request method
POST

## Request address
https://rds.jdcloud-api.com/v1/regions/{regionId}/backups

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region code, with range detailed in [Regions and Availability Zone Comparison Table](../Enum-Definitions/Regions-AZ.md)|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**instanceId**|String|False| |RDS instance ID can identify an instance uniquely|
|**backupSpec**|[BackupSpec](createbackup#backupspec)|False| |Backup Specification|

### <div id="backupspec">BackupSpec</div>
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**backupName**|String|False| |Backup name with length up to 64 English characters or Chinese characters of equal length|
|**dbNames**|String[]|False| |List of Database Names to Be Backed up. If it is not filled, the whole instance will be backed up<br>- **MySQL: not support the parameter**<br>- **SQL Server: support**|

## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](createbackup#result)| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**backupId**|String|Backup Id|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|

## Request Example
POST
```
public void testCreateBackup() {
    CreateBackupRequest createBackupRequest = new CreateBackupRequest();
    createBackupRequest.setInstanceId("mysql-wp4e9ztap2");
    createBackupRequest.setRegionId("cn-north-1");
    BackupSpec backupSpec = new BackupSpec();
    backupSpec.setBackupName("dj_backup");
    createBackupRequest.setBackupSpec(backupSpec);
    CreateBackupResponse createBackupResponse = rdsClient.createBackup(createBackupRequest);
    System.out.println(new Gson().toJson(createBackupResponse));
}

```

## Return Example
```
{
    "requestId": "bpa2wfjr9bqrim7g6v93vkmnb78hf74n", 
    "result": {
        "backupId": "0313e588-44d0-4b20-b532-6eebb9d83352"
    }
}
```
