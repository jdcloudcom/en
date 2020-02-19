# createBackupSynchronicity


## Description
Create a cross-region backup synchronization service.

## Request Method
POST

## Request Address
https://rds.jdcloud-api.com/v1/regions/{regionId}/backupSynchronicities

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region code, see the value range in [Table of Comparisons of Regions and Availability Zones](../Enum-Definitions/Regions-AZ.md)|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**instanceId**|String|True| |Source Instance ID|
|**destRegion**|String|True| |Backup the synchronized target region|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](createbackupsynchronicity#result)| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**serviceId**|String|Cross-Region Backup Synchronization Service ID|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|

## Request Example
POST
```
public void testCreateBackupSynchronicity() {
    CreateBackupSynchronicityRequest request = new CreateBackupSynchronicityRequest();
    request.setDestRegion("cn-east-2");
    request.setInstanceId("mysql-wp4e9ztap2");
    request.setRegionId("cn-north-1");
    CreateBackupSynchronicityResponse response = rdsClient.createBackupSynchronicity(request);
    System.out.println(new Gson().toJson(response));
}

```

## Return Example
```
{
    "requestId": "bpa344ech6367jbt0tfeojpe578n61a9", 
    "result": {
        "serviceId": "dbs-r1q51ene3s5d"
    }
}
```
