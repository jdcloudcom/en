# deleteBackup


## Description
Deletes the RDS instance backup. Only the user-generated backups are allowed to be deleted and the system automatic backups are not allow to be deleted.

## Request method
DELETE

## Request address
https://rds.jdcloud-api.com/v1/regions/{regionId}/backups/{backupId}

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region code, with range detailed in [Regions and Availability Zone Comparison Table](../Enum-Definitions/Regions-AZ.md)|
|**backupId**|String|True| |Backup ID|

## Request parameter
None


## Response parameter
None


## Response code
|Return code|Description|
|---|---|
|**200**|OK|

## Request Example
DELETE
```
public void testDeleteBackup() {
    DeleteBackupRequest request = new DeleteBackupRequest();
    request.setRegionId("cn-north-1");
    request.setBackupId("0313e588-44d0-4b20-b532-6eebb9d83352");
    DeleteBackupResponse response = rdsClient.deleteBackup(request);
    System.out.println(new Gson().toJson(response));
}

```

## Return Example
```
{
    "requestId": "bpa3243h5ev46ih8q7dr4au0021v1btg"
}
```
