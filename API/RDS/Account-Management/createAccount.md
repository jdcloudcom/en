# createAccount


## Description
Create a database account. The user can use the client, application, etc. to log in to the RDS database instance through the account and password. <br>For ease of management and recovery, RDS restricts accounts. Database accounts can only be created, deleted, and authorized by the console or OpenAPI. Users cannot perform related operations on accounts through SQL statements.

## Request method
POST

## Request address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/accounts

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region code, with range detailed in [Regions and Availability Zone Comparison Table](../Enum-Definitions/Regions-AZ.md)|
|**instanceId**|String|True| |RDS instance ID, which uniquely identifies an RDS instance|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**accountName**|String|True| |For Account Name, in the same RDS instance, the Account Name cannot be repeated. See Help Center Document: [Name and Password Restrictions](../../../documentation/Database-and-Cache-Service/RDS/Introduction/Restrictions/SQLServer-Restrictions.md) for specific rules of Account Name|
|**accountPassword**|String|True| |Password, see Help Center Document: [Name and Password Restrictions](../../../documentation/Database-and-Cache-Service/RDS/Introduction/Restrictions/SQLServer-Restrictions.md) for specific rules of Password|
|**notes**|String|False| |Description information, only supports PostgreSQL|


## Response parameter
None


## Response code
|Return code|Description|
|---|---|
|**200**|OK|

## Request Example
POST
```
public void testCreateAccount() {
    CreateAccountRequest createAccountRequest = new CreateAccountRequest();
    createAccountRequest.setAccountName("dj_ac");
    createAccountRequest.setAccountPassword("123456aA");
    createAccountRequest.setInstanceId("mysql-wp4e9ztap2");
    createAccountRequest.setRegionId("cn-north-1");
    CreateAccountResponse createAccountResponse = rdsClient.createAccount(createAccountRequest);
    System.out.println(new Gson().toJson(createAccountResponse));
}

```

## Return Example
```
{
    "requestId": "bpa02f1veq58ctu9j1too76nbckvrp2m"
}
```
