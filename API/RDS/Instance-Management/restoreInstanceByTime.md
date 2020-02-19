# restoreInstanceByTime


## Description
Select a single table to recover the current instance base on the point in time<br>- Only support MySQL

## Request Method
POST

## Request Address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}:restoreInstanceByTime

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region code, see the value range in [Table of Comparisons of Regions and Availability Zones](../Enum-Definitions/Regions-AZ.md)|
|**instanceId**|String|True| |RDS Instance ID, the Unique Identifier of One RDS Instance|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**restoreTime**|String|True| |Create New Instance Based on Which Time Point of the Source Instance|
|**restoreSchema**|[Schema[]](restoreinstancebytime#schema)|True| |Require the summary information to conduct single base and single table recovery|

### <div id="schema">Schema</div>
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**dbName**|String|True| |Original database name|
|**newDBName**|String|True| |New database name|
|**tableName**|String|False| |Original database table name|
|**newTableName**|String|False| |New database table name|

## Return Parameter
None


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|

## Request Example
POST
```
public void testRestoreInstanceByTime() {
    RestoreInstanceByTimeRequest request = new RestoreInstanceByTimeRequest();
    request.setRestoreTime("2020-01-07 19:26:00");
    request.setInstanceId("mysql-k67q8n46si");
    Schema schema = new Schema();
    schema.setNewDBName("dj_db2");
    schema.setDbName("dj_db");
    request.addRestoreSchema(schema);
    request.setRegionId("cn-north-1");
    RestoreInstanceByTimeResponse response = rdsClient.restoreInstanceByTime(request);
    System.out.println(new Gson().toJson(response));
}

```

## Return Example
```
{
    "requestId": "bpa6nm64sevg65kkghfkgma6hqjg8bmf"
}
```
