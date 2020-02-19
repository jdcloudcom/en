# modifyInstanceSpec


## Description
Instance Expansion, Supports Upgrading the Instance CPU, Memory and Disk.

## Request method
POST

## Request address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}:modifyInstanceSpec

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region code, with range detailed in [Regions and Availability Zone Comparison Table](../Enum-Definitions/Regions-AZ.md)|
|**instanceId**|String|True| |RDS instance ID, which uniquely identifies an RDS instance|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**newInstanceClass**|String|True| |Instance Type after Expansion|
|**newInstanceStorageGB**|Integer|True| |Instance Disk Size after Expansion|
|**newInstanceStorageType**|String|False| |If the storage type is not designated, the original instance storage type will be adopted by default|
|**storageEncrypted**|Boolean|False| |Instance Data Encryption (data encryption will be supported only when the storage type is Cloud Disk Service). false: no encryption, true: encryption. If the instance is changed from local disk to Cloud Disk Service, the default value is false. If the instance is the Cloud Disk Service, the default value and the source instance shall remain the same|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](modifyinstancespec#result)| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**orderId**|String|Generated Order Number|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|

## Request Example
POST
```
public void testModifyInstanceSpec() {
    ModifyInstanceSpecRequest modifyInstanceSpecRequest = new ModifyInstanceSpecRequest();
    modifyInstanceSpecRequest.setRegionId("cn-north-1");
    modifyInstanceSpecRequest.setInstanceId("mysql-wp4e9ztap2");
    modifyInstanceSpecRequest.setNewInstanceClass("db.mysql.s1.micro");
    modifyInstanceSpecRequest.setNewInstanceStorageGB(40);
    ModifyInstanceSpecResponse response = rdsClient.modifyInstanceSpec(modifyInstanceSpecRequest);
    System.out.println(new Gson().toJson(response));
}

```

## Return Example
```
{
    "requestId": "bpa57oaqq1hdr0hsf3uoeuim9b22awg8", 
    "result": {
        "orderId": "188341099108437755"
    }
}
```
