# enableTde


## Description
Enable TDE function of database

## Request Method
POST

## Request Address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/tde:enableTde

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region code, see the value range in [Table of Comparisons of Regions and Availability Zones](../Enum-Definitions/Regions-AZ.md)|
|**instanceId**|String|True| |RDS Instance ID, the Unique Identifier of One RDS Instance|

## Request Parameter
None


## Return Parameter
None


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|

## Request Example
POST
```
public void testEnableTde() {
    EnableTdeRequest request = new EnableTdeRequest();
    request.setInstanceId("sqlserver-0nyjcvjxls");
    request.setRegionId("cn-north-1");
    EnableTdeResponse response = rdsClient.enableTde(request);
    System.out.println(new Gson().toJson(response));
}

```

## Return Example
```
{
    "requestId": "bpaoqk0mt49r2cc5bhh9ahq4vvivw1ie"
}
```
