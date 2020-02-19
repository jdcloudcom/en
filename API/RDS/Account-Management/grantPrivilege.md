# grantPrivilege


## Description
Grant the database access privilege to the account, i.e., the privilege the account has to the database. An account can have access to multiple databases. <br>For ease of management, RDS classifies the privileges. Currently, it provides the following two privileges<br>- ro: Read-only privilege, with which, the user can only read the data in the database, and cannot perform creation, insertion, deletion, change, etc. <br>- rw: Read-write privilege, with which, the user can perform addition, deletion, change and other operations on the database<br>-Support SQL Server Only

## Request method
POST

## Request address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/accounts/{accountName}:grantPrivilege

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region code, with range detailed in [Regions and Availability Zone Comparison Table](../Enum-Definitions/Regions-AZ.md)|
|**instanceId**|String|True| |RDS instance ID, which uniquely identifies an RDS instance|
|**accountName**|String|True| |Account name; in the same instance, the account name cannot be duplicated.|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**accountPrivileges**|[AccountPrivilege[]](grantprivilege#accountprivilege)|True| |Account Access Permission|

### <div id="accountprivilege">AccountPrivilege</div>
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**dbName**|String|False| |Database Name, see Help Center Document: [Name and Password Restrictions](../../../documentation/Database-and-Cache-Service/RDS/Introduction/Restrictions/SQLServer-Restrictions.md) for specific rules|
|**privilege**|String|False| |Privilege of account to the database with the specific definition detailed in [Enumeration Parameter Definition](../Enum-Definitions/Enum-Definitions.md)|

## Response parameter
None


## Response code
|Return code|Description|
|---|---|
|**200**|OK|

## Request Example
POST
```
public void testGrantPrivilege() {
    GrantPrivilegeRequest grantPrivilegeRequest = new GrantPrivilegeRequest();
    grantPrivilegeRequest.setAccountName("dj_ac");
    grantPrivilegeRequest.setInstanceId("mysql-wp4e9ztap2");
    grantPrivilegeRequest.setRegionId("cn-north-1");
    AccountPrivilege accountPrivilege1 = new AccountPrivilege();
    accountPrivilege1.setDbName("dj_db");
    accountPrivilege1.setPrivilege("rw");
    List<AccountPrivilege> aps = new ArrayList<AccountPrivilege>();
    aps.add(accountPrivilege1);
    grantPrivilegeRequest.setAccountPrivileges(aps);
    GrantPrivilegeResponse grantPrivilegeResponse = rdsClient.grantPrivilege(grantPrivilegeRequest);
    System.out.println(new Gson().toJson(grantPrivilegeResponse));
}

```

## Return Example
```
{
    "requestId": "bpa08gdtob57p1ok65p1wpn86k9r7i1w"
}
```
