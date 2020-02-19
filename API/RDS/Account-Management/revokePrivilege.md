# revokePrivilege


## Description
Cancel all permissions of the account to a certain database. After the permissions are canceled, the account will not be able to access the database. Cancel the access permission of the account to a certain database without affecting the access permissions of the account to other databases

## Request method
POST

## Request address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/accounts/{accountName}:revokePrivilege

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region code, with range detailed in [Regions and Availability Zone Comparison Table](../Enum-Definitions/Regions-AZ.md)|
|**instanceId**|String|True| |RDS instance ID, which uniquely identifies an RDS instance|
|**accountName**|String|True| |Account name; in the same instance, the account name cannot be duplicated.|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**dbNames**|String[]|True| |The Name of the Database of Which the Authorization is Cancelled is Required. After the permissions are canceled, the account will not be able to access the database|


## Response parameter
None


## Response code
|Return code|Description|
|---|---|
|**200**|OK|

## Request Example
POST
```
public void testRevokePrivilege() {
    RevokePrivilegeRequest revokePrivilegeRequest = new RevokePrivilegeRequest();
    revokePrivilegeRequest.setAccountName("dj_ac");
    revokePrivilegeRequest.setInstanceId("mysql-wp4e9ztap2");
    revokePrivilegeRequest.setRegionId("cn-north-1");
    List<String> dbNames = new ArrayList<>();
    dbNames.add("dj_db");
    revokePrivilegeRequest.setDbNames(dbNames);
    RevokePrivilegeResponse response = rdsClient.revokePrivilege(revokePrivilegeRequest);
    System.out.println(new Gson().toJson(response));
}

```

## Return Example
```
{
    "requestId": "bpa09sqv506u80guctqkucpwwi7g74q6"
}
```
