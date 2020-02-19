# modifyInstanceAz


## Description
Modify the availability zone of an instance. For example, adjust the availability zone of the instance from a single availability zone to a multi-availability zone

## Request Method
POST

## Request Address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}:modifyInstanceAz

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region code, see the value range in [Table of Comparisons of Regions and Availability Zones](../Enum-Definitions/Regions-AZ.md)|
|**instanceId**|String|True| |RDS Instance ID, the Unique Identifier of One RDS Instance|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**newAzId**|String[]|True| |ID of a new availability zone. For a single-machine instance, only enter one availability zone; for master and standby instances, must enter two availability zone IDs, with the first primary node in the availability zone and the second standby node in the availability zone. The master and standby availability zones can be the same or different|


## Return Parameter
None


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|

## Request Example
POST
```
public void testModifyInstanceAz() {
    ModifyInstanceAzRequest request = new ModifyInstanceAzRequest();
    request.setInstanceId("sqlserver-83uqv7avy4");
    request.addNewAzId("cn-north-1c");
    request.setRegionId("cn-north-1");
    ModifyInstanceAzResponse response = rdsClient.modifyInstanceAz(request);
    System.out.println(new Gson().toJson(response));
}

```

## Return Example
```
{
    "requestId": "bpa64i0ghn4iucr83987ud3nhwdu7c7e"
}
```
