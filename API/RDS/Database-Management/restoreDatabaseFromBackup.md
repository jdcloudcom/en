# restoreDatabaseFromBackup


## Description
Restore the single database from backup, and support recovery from backups of other instances (but must be instances under the same account). For example, you can restore from a backup of a database instance in a production environment to a database in a test environment. <br>- Support SQL Server Only

## Request method
POST

## Request address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/databases/{dbName}:restoreDatabaseFromBackup

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region code, with range detailed in [Regions and Availability Zone Comparison Table](../Enum-Definitions/Regions-AZ.md)|
|**instanceId**|String|True| |RDS instance ID, which uniquely identifies an RDS instance|
|**dbName**|String|True| |Database name|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**backupId**|String|True| |Backup ID, which can be obtained from the backup query API, describeBackups|
|**backupFileName**|String|True| |Specify the name of the file in the backup used to restore the database. Normally the file name (excluding the suffix) is the database name of the backup. For example, the file name is my_test_db.bak, indicating that the file is a backup of the my_test_db database.|


## Response parameter
None


## Response code
|Return code|Description|
|---|---|
|**200**|OK|

## Request Example
POST
```
public void testRestoreDatabaseFromBackup() {
    RestoreDatabaseFromBackupRequest restoreDatabaseFromBackupRequest = new RestoreDatabaseFromBackupRequest();
    restoreDatabaseFromBackupRequest.setBackupFileName("test_db.bak");
    restoreDatabaseFromBackupRequest.setBackupId("sqlserver-4eac4982-d54b-4f97-80f9-ce404209b446");
    restoreDatabaseFromBackupRequest.setDbName("test_db");
    restoreDatabaseFromBackupRequest.setInstanceId("sqlserver-83uqv7avy4");
    restoreDatabaseFromBackupRequest.setRegionId("cn-north-1");
    RestoreDatabaseFromBackupResponse response = rdsClient.restoreDatabaseFromBackup(restoreDatabaseFromBackupRequest);
    System.out.println(new Gson().toJson(response));
}

```

## Return Example
```
{
    "requestId": "bpa3sm7ujvspre1rkfbhbr50g5se8g9e"
}
```
