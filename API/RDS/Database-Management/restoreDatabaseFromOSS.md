# restoreDatabaseFromOSS


## Description
Restore a single database from the backup file uploaded to OSS<br> - only support SQL Server

## Request method
POST

## Request address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/databases/{dbName}:restoreDatabaseFromOSS

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region code, with range detailed in [Regions and Availability Zone Comparison Table](../Enum-Definitions/Regions-AZ.md)|
|**instanceId**|String|True| |RDS instance ID, which uniquely identifies an RDS instance|
|**dbName**|String|True| |Database name|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**ossURL**|String|True| |The path where the user uploads the backup files to the Object Storage Service OSS. <br>For example, if the bucket uploaded by the user for backup is db_backup, and the file is test_server/db1.bak, then ossULR is db_backup/test_server/db1.bak. <br>**Authorization Description**You need to grant the account ID: 785455908940, read permission to this bucket. Specific steps can be viewed at [Document](https://docs.jdcloud.com/en/object-storage-service/set-bucket-policy-2).|


## Response parameter
None


## Response code
|Return code|Description|
|---|---|
|**200**|OK|

## Request Example
POST
```
public void testRestoreDatabaseFromOSS() {
    RestoreDatabaseFromOSSRequest request = new RestoreDatabaseFromOSSRequest();
    request.setInstanceId("sqlserver-83uqv7avy4");
    request.setRegionId("cn-north-1");
    request.setDbName("test_db");
    request.setOssURL("sqlserverbucket01/73ba0514-75df-41b2-9ba2-649c3609a987/backup/023c72dc-f04e-44e9-9ee4-878eac32f177/dj_db.bak?Expires=1533720053&AccessKey=85B6358FACFBA460D7C0E4A6598F29C5&Signature=UO64r6mWb5vpraR0XCifD7R3T9A=");
    RestoreDatabaseFromOSSResponse response= rdsClient.restoreDatabaseFromOSS(request);
    System.out.println(new Gson().toJson(response));
}

```

## Return Example
```
{
    "requestId": "bpa40506ppag24kw0r872h1s0dtub35m"
}
```
