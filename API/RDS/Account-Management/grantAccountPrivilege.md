# grantAccountPrivilege


## Description
Grant fine-grained permission to access the database account - Only support MySQL, Percona, and MariaDB

## Request Method
POST

## Request Address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/accounts/{accountName}:grantAccountPrivilege

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region code, see the value range in [Table of Comparisons of Regions and Availability Zones](../Enum-Definitions/Regions-AZ.md)|
|**instanceId**|String|True| |RDS Instance ID, the Unique Identifier of One RDS Instance|
|**accountName**|String|True| |For Account Name, in the same instance, the Account Name cannot be repeated|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**databasePrivileges**|[DatabasePrivilege[]](grantaccountprivilege#databaseprivilege)|False| |Set content for fine-grained permission to database|
|**globalPrivileges**|String[]|False| |To set global permission, please refer to [Enumeration Parameter Definitions](../Enum-Definitions/Enum-Definitions.md) to get details|

### <div id="databaseprivilege">DatabasePrivilege</div>
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**dbName**|String|False| |Database Name|
|**privileges**|String[]|False| |For fine-grained permission that the account possesses to the database, please refer to [Enumeration Parameter Definitions](../Enum-Definitions/Enum-Definitions.md) to get details|
|**tablePrivileges**|[TablePrivilege[]](grantaccountprivilege#tableprivilege)|False| |Fine-grained permission content for database table|
### <div id="tableprivilege">TablePrivilege</div>
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**tableName**|String|False| |Database table name|
|**privileges**|String[]|False| |For fine-grained permission that the account possesses to the database table, please refer to [Enumeration Parameter Definitions](../Enum-Definitions/Enum-Definitions.md) to get details|

## Return Parameter
None


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|

## Request Example
POST
```
public void testGrantAccountPrivilege() {
    GrantAccountPrivilegeRequest request = new GrantAccountPrivilegeRequest();
    request.setAccountName("dj_ac");
    request.setInstanceId("mysql-wp4e9ztap2");
    request.setRegionId("cn-north-1");
    request.addGlobalPrivilege("PROCESS");
    DatabasePrivilege dp = new DatabasePrivilege();
    dp.setDbName("dj_db");
    dp.addPrivilege("DROP");
    request.addDatabasePrivilege(dp);
    GrantAccountPrivilegeResponse response = rdsClient.grantAccountPrivilege(request);
    System.out.println(new Gson().toJson(response));
}

```

## Return Example
```
{
    "requestId": "bpa2je0t7kr5fgmmqujuj8o7167t8dom"
}
```
