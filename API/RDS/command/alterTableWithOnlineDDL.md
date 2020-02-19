# alterTableWithOnlineDDL


## Description
Process DDL commands by PT-OSC Service to avoid lock tables. This API is temporarily opened to some users

## Request Method
POST

## Request Address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}:alterTableWithOnlineDDL

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region code, see the value range in [Table of Comparisons of Regions and Availability Zones](../Enum-Definitions/Regions-AZ.md)|
|**instanceId**|String|True| |RDS Instance ID, the Unique Identifier of One RDS Instance|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**database**|String|True| |Database name modified by DDL commands|
|**table**|String|True| |List name modified by DDL commands|
|**command**|String|True| |DDL commands required to be executed|


## Return Parameter
None


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|

## Request Example
POST
```
public void testAlterTableWithOnlineDDL() {
    AlterTableWithOnlineDDLRequest request = new AlterTableWithOnlineDDLRequest();
    request.setCommand("add column x int");
    request.setDatabase("dj_db");
    request.setTable("dj_db");
    request.setInstanceId("mysql-wp4e9ztap2");
    request.setRegionId("cn-north-1");
    AlterTableWithOnlineDDLResponse response = rdsClient.alterTableWithOnlineDDL(request);
    System.out.println(new Gson().toJson(response));
}

```

## Return Example
```
{
    "requestId": "bpa3hn82be6twg4dwk033s2o0i3j9bmh"
}
```
