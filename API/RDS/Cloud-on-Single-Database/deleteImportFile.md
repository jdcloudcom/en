# deleteImportFile


## Description
Delete database backup file uploaded by users via the tool of Cloud on Single Database<br>- Support SQL Serve onlyr

## Request Method
DELETE

## Request Address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/importFiles/{fileName}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region code, see the value range in [Table of Comparisons of Regions and Availability Zones](../Enum-Definitions/Regions-AZ.md)|
|**instanceId**|String|True| |RDS instance ID, the unique identifier of one RDS instance|
|**fileName**|String|True| |File Name for Cloud on Single Database|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**sharedFileGid**|String|False| |The global ID of the shared file can be gotten from the uploaded file search APIs describeImportFiles. If such file is not shared, do not enter the field|


## Return Parameter
None


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|

## Request Example
DELETE
```
public void testDeleteImportFile() {
    DeleteImportFileRequest request = new DeleteImportFileRequest();
    request.setFileName("db1_1.bak");
    request.setInstanceId("sqlserver-83uqv7avy4");
    request.setSharedFileGid("fcbb66c6-e7f0-4228-b4c0-b3e5a0d452c8");
    request.setRegionId("cn-north-1");
    DeleteImportFileResponse response = rdsClient.deleteImportFile(request);
    System.out.println(new Gson().toJson(response));
}

```

## Return Example
```
{
    "requestId": "bpa4nbcb0s3t3mg4ascg2o4h3iitng53"
}
```
