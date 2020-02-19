# createDatabase


## Description
Create a Database. For instance management and data restoration, RDS restricts user permissions, and users can only create databases through the console or this API.

## Request method
POST

## Request address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/databases

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region code, with range detailed in [Regions and Availability Zone Comparison Table](../Enum-Definitions/Regions-AZ.md)|
|**instanceId**|String|True| |RDS instance ID, which uniquely identifies an RDS instance|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**dbName**|String|True| |Database Name, see [Help Center Document](../../../documentation/Database-and-Cache-Service/RDS/Introduction/Restrictions/SQLServer-Restrictions.md) for restrictions of Database Name|
|**characterSetName**|String|True| |About the character set name of the database and the currently supported character set, please see[Enumeration Parameter Definition](../Enum-Definitions/Enum-Definitions.md)|


## Response parameter
None


## Response code
|Return code|Description|
|---|---|
|**200**|OK|

## Request Example
POST
```
public void testCreateDatabase() {
    CreateDatabaseRequest createDatabaseRequest = new CreateDatabaseRequest();
    createDatabaseRequest.setCharacterSetName("utf8");
    createDatabaseRequest.setDbName("test_db");
    createDatabaseRequest.setInstanceId("mysql-wp4e9ztap2");
    createDatabaseRequest.setRegionId("cn-north-1");
    CreateDatabaseResponse response = rdsClient.createDatabase(createDatabaseRequest);
    System.out.println(new Gson().toJson(response));
}

```

## Return Example
```
{
    "requestId": "bpa3ndd5dh5goirjip58obhmk1wwwhun"
}
```
