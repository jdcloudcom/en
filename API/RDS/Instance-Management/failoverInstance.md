# failoverInstance


## Description
Perform a RDS Instance Failover. <br>Note: If the instance is being backed up, the failover will terminate the backup operation. You can view the start time of backup in the backup policy to see whether a backup is running. If you need to perform the failover during the instance backup, you are advised to perform a full instance backup manually<br>for SQL Server, within 30 minutes of failover, restore/create by time point is not supported. For example, the user performs the failover at 10:05, then the time period from 10:05 to 10:35 cannot be restored/created. <br>- Support SQL Server Only

## Request method
POST

## Request address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}:failoverInstance

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
POST
```
public void testFailoverInstance(){
    FailoverInstanceRequest request=new FailoverInstanceRequest();
    request.setRegionId("cn-north-1");
    request.setInstanceId("sqlserver-83uqv7avy4");
    FailoverInstanceResponse response= rdsClient.failoverInstance(request);
    System.out.println(new Gson().toJson(response));
}

```

## Return Example
```
{
    "requestId": "bpa4v9q21m5v70qm4i9kw699dpi8ctv9"
}
```
