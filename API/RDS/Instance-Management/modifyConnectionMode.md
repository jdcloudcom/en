# modifyConnectionMode


## Description
Modify the connection mode of MySQL instance: standard and high security modes.<br>- **Standard mode**: the despondence time is short, without SQL audit and interception capability. <br>- **High security mode**: has certain SQL injection interception capability (through analysis expression, key system function, etc. to implement the prevention from SQL injection attack), and SQL audit may be enabled, but the response time will be extended to a certain extent. <br>- Only Support MySQL

## Request Method
POST

## Request Address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}:modifyConnectionMode

|Name|Type|Required or Not|Default|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region code, see the value range in [Table of Comparisons of Regions and Availability Zones](../Enum-Definitions/Regions-AZ.md)|
|**instanceId**|String|True| |RDS instance ID, the unique identifier of one RDS instance|

## Request Parameter
|Name|Type|Required or Not|Default|Description|
|---|---|---|---|---|
|**connectionMode**|String|True| |Connection mode<br> - standard: standard mode (default), with short response time, but without the SQL audit and interception capability <br>- security: high security mode, with a certain SQL injection interception capability, and SQL audit may be enabled, but the response time will be extended to a certain extent|


## Return Parameter
None


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|

## Request Example
POST
```
public void testModifyConnectionMode() {
    ModifyConnectionModeRequest request = new ModifyConnectionModeRequest();
    request.setInstanceId("mysql-k67q8n46si");
    request.setRegionId("cn-north-1");
    request.setConnectionMode("security");
    ModifyConnectionModeResponse response = rdsClient.modifyConnectionMode(request);
    System.out.println(new Gson().toJson(response));
}

```

## Return Example
```
{
    "requestId": "bpa5qbifb8uqcvkpi5goe9ts978evm6o"
}
```
