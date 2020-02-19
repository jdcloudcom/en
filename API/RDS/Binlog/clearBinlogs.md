# clearBinlogs


## Description
Clear local binlog and release spaces. The system will only clear binlog backed up to the memory, without any influence to backup recovery of MySQL instances<br>- Support MySQL only

## Request Method
POST

## Request Address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/binlogs:clearBinlogs

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region code, see the value range in [Table of Comparisons of Regions and Availability Zones](../Enum-Definitions/Regions-AZ.md)|
|**instanceId**|String|True| |RDS instance ID, the unique identifier of one RDS instance|

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
public void testClearBinlogs() {
    ClearBinlogsRequest request = new ClearBinlogsRequest();
    request.setInstanceId("mysql-wp4e9ztap2");
    request.setRegionId("cn-north-1");
    ClearBinlogsResponse response = rdsClient.clearBinlogs(request);
    System.out.println(new Gson().toJson(response));
}

```

## Return Example
```
{
    "requestId": "bpa3bcofkik62ocnf5794sti5fnmnufj"
}
```
