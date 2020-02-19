# setImportFileShared


## Description
Set or cancel whether the uploaded file is shared to other instances under the same account. By default, files are only visible and can be imported on the uploaded instance. Other instances are not visible and cannot be imported. If you need this file to be imported on other instances, you can set this file to share<br>- only support SQL Server

## Request method
POST

## Request address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/importFiles/{fileName}:setShared

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region code, with range detailed in [Regions and Availability Zone Comparison Table](../Enum-Definitions/Regions-AZ.md)|
|**instanceId**|String|True| |RDS instance ID, which uniquely identifies an RDS instance|
|**fileName**|String|True| |The File Name of Cloud on Single Database|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**shared**|String|True| |Whether the file is shared<br>true: shared<br>false: not shared|


## Response parameter
None


## Response code
|Return code|Description|
|---|---|
|**200**|OK|

## Request Example
POST
```
public void testSetImportFileShared(){
    SetImportFileSharedRequest request=new SetImportFileSharedRequest();
    request.setInstanceId("sqlserver-83uqv7avy4");
    request.setRegionId("cn-north-1");
    request.setFileName("db1_1.bak");
    request.setShared("true");
    SetImportFileSharedResponse response= rdsClient.setImportFileShared(request);
    System.out.println(new Gson().toJson(response));
}

```

## Return Example
```
{
    "requestId": "bpa4mid6vo1chcv7qarhhifq0wp51ceh"
}
```
