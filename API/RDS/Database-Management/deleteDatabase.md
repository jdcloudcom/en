# deleteDatabase


## Description
Delete Database from RDS Instance. For management and data recovery, RDS controls the user permission, and the user only can delete Database through the Console or API<br>Sensitive Operation, enable<a href="https://docs.jdcloud.com/en/security-operation-protection/operation-protection">MFA Operation Protection</a>

## Request method
DELETE

## Request address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/databases/{dbName}

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region code, with range detailed in [Regions and Availability Zone Comparison Table](../Enum-Definitions/Regions-AZ.md)|
|**instanceId**|String|True| |RDS instance ID, which uniquely identifies an RDS instance|
|**dbName**|String|True| |Database name|

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
public void testDeleteDatabase() {
    DeleteDatabaseRequest deleteDatabaseRequest = new DeleteDatabaseRequest();
    deleteDatabaseRequest.setDbName("test_db");
    deleteDatabaseRequest.setInstanceId("mysql-wp4e9ztap2");
    deleteDatabaseRequest.setRegionId("cn-north-1");
    DeleteDatabaseResponse response = rdsClient.deleteDatabase(deleteDatabaseRequest);
    System.out.println(new Gson().toJson(response));
}

```

## Return Example
```
{
    "requestId": "bpa3ow7bae3ovbn5g0gmvbt3sgw00wda"
}
```
