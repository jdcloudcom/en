# resetPassword


## Description
Reset Database Account Password. If the user forgets the password of the account, he/she can use this API to reset the specified account password. After the password is reset, the previous password will not be available and you must log in or connect to the database instance with the new password after the reset.

## Request method
POST

## Request address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/accounts/{accountName}:resetPassword

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region code, with range detailed in [Regions and Availability Zone Comparison Table](../Enum-Definitions/Regions-AZ.md)|
|**instanceId**|String|True| |RDS instance ID, which uniquely identifies an RDS instance|
|**accountName**|String|True| |Account name; in the same instance, the account name cannot be duplicated.|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**accountPassword**|String|True| |New Password, see Help Center Document: [Name and Password Restrictions](../../../documentation/Database-and-Cache-Service/RDS/Introduction/Restrictions/SQLServer-Restrictions.md) for specific rules of Password|


## Response parameter
None


## Response code
|Return code|Description|
|---|---|
|**200**|OK|

## Request Example
POST
```
public void testResetPassword() {
    ResetPasswordRequest resetPasswordRequest = new ResetPasswordRequest();
    resetPasswordRequest.setAccountName("dj_ac");
    resetPasswordRequest.setAccountPassword("123456aA");
    resetPasswordRequest.setInstanceId("mysql-wp4e9ztap2");
    resetPasswordRequest.setRegionId("cn-north-1");
    ResetPasswordResponse resetPasswordResponse = rdsClient.resetPassword(resetPasswordRequest);
    System.out.println(new Gson().toJson(resetPasswordResponse));
}

```

## Return Example
```
{
    "requestId": "bpa0adwouffbe0k4i5h82dom3ks4opnb"
}
```
