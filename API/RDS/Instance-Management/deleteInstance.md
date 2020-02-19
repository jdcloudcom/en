# deleteInstance


## Description
Delete one RDS instance or the read-only instance of MySQL/PostgreSQL. Corresponding MySQL/PostgreSQL read-only instances will also be deleted while deleting the main MySQL/PostgreSQL<br>Sensitive operation can be enabled<a href="https://docs.jdcloud.com/en/security-operation-protection/operation-protection">MFA operation protection</a>

## Request method
DELETE

## Request address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region code, with range detailed in [Regions and Availability Zone Comparison Table](../Enum-Definitions/Regions-AZ.md)|
|**instanceId**|String|True| |RDS instance ID, which uniquely identifies an RDS instance|

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
public void testDeleteInstance() {
    DeleteInstanceRequest request = new DeleteInstanceRequest();
    request.setRegionId("cn-north-1");
    request.setInstanceId("mysql-4kopy2wqc3");
    DeleteInstanceResponse response = rdsClient.deleteInstance(request);
    System.out.println(new Gson().toJson(response));
}

```

## Return Example
```
{
    "requestId": "bpa4otkbpdiwmomei1s23irbgawe6skn"
}
```
