# deleteBackupSynchronicity


## Description
Delete a cross-region backup synchronization service.

## Request Method
DELETE

## Request Address
https://rds.jdcloud-api.com/v1/regions/{regionId}/backupSynchronicities/{serviceId}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region code, see the value range in [Table of Comparisons of Regions and Availability Zones](../Enum-Definitions/Regions-AZ.md)|
|**serviceId**|String|True| |Cross-Region Backup Synchronization Service ID|

## Request Parameter
None


## Return Parameter
None


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|

## Request Example
DELETE
```
public void testDeleteBackupSynchronicity() {
    DeleteBackupSynchronicityRequest request = new DeleteBackupSynchronicityRequest();
    request.setRegionId("cn-east-2");
    request.setServiceId("dbs-r1q51ene3s5d");
    DeleteBackupSynchronicityResponse response = rdsClient.deleteBackupSynchronicity(request);
    System.out.println(new Gson().toJson(response));
}

```

## Return Example
```
{
    "requestId": "bpa35r3b7jni1rj6krrfbprsr68vpb38"
}
```
