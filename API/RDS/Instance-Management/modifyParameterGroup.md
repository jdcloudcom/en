# modifyParameterGroup


## Description
Modify RDS instance<br>- Only support MySQL

## Request Method
PUT

## Request Address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}:modifyParameterGroup

|Name|Type|Required or not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region code, see [Table of Comparisons of Regions and Availability Zones](../Enum-Definitions/Regions-AZ.md) for value range|
|**instanceId**|String|True| |RDS instance ID, which identifies a RDS instance uniquely|

## Request Parameters
|Name|Type|Required or not|Default Value|Description|
|---|---|---|---|---|
|**parameterGroupId**|String|True| |Parameter Group ID|


## Returned Parameters
None


## Return Code
|Return Code|Descripton|
|---|---|
|**200**|OK|

## Request Example
PUT
```
public void testModifyParameterGroup() {
    ModifyParameterGroupRequest request = new ModifyParameterGroupRequest();
    request.setInstanceId("mysql-k67q8n46si");
    request.setParameterGroupId("mysql-pg-mpzspoh243");
    request.setRegionId("cn-north-1");
    ModifyParameterGroupResponse response = rdsClient.modifyParameterGroup(request);
    System.out.println(new Gson().toJson(response));
}

```

## Return Example
```
{
    "requestId": "bpa619fvrs7hr0ummene90284de7nq66"
}
```
