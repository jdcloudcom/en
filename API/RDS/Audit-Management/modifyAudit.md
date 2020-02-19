# modifyAudit


## Description
Modify Current Audit Options. Currently available audit options are available through describeAudit, and all supported options are available through getAuditOptions. <br>- Support SQL Server Only

## Request method
POST

## Request address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/audit:modifyAudit

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region code, with range detailed in [Regions and Availability Zone Comparison Table](../Enum-Definitions/Regions-AZ.md)|
|**instanceId**|String|True| |RDS instance ID, which uniquely identifies an RDS instance|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**add**|String|False| |Add new audit items based on the original audit items. Multiple audit items are separated by commas, semicolons or spaces, for example, DATABASE_OBJECT_ACCESS_GROUP, ACKUP_RESTORE_GROUP|
|**drop**|String|False| |Delete audit items. Multiple audit items are separated by commas, semicolons or spaces, for example, DATABASE_OBJECT_ACCESS_GROUP,ACKUP_RESTORE_GROUP<br>If all audit items are deleted, the audit is automatically disabled.|


## Response parameter
None


## Response code
|Return code|Description|
|---|---|
|**200**|OK|

## Request Example
POST
```
public void testModifyAudit(){
    ModifyAuditRequest request=new ModifyAuditRequest();
    request.setInstanceId("sqlserver-83uqv7avy4");
    request.setRegionId("cn-north-1");
    request.setDrop("DATABASE_OBJECT_ACCESS_GROUP");
    request.setAdd("AUDIT_CHANGE_GROUP");
    ModifyAuditResponse response= rdsClient.modifyAudit(request);
    System.out.println(new Gson().toJson(response));
}

```

## Return Example
```
{
    "requestId": "bpa2r0c5vtp69o4q3ded1gbud7h0jtmt"
}
```
