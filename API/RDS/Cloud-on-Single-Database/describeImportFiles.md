# describeImportFiles


## Description
Obtain the list of files uploaded by the user to the instance through Cloud on Single Database<br>- only support SQL Server

## Request method
GET

## Request address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/importFiles

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region code, with range detailed in [Regions and Availability Zone Comparison Table](../Enum-Definitions/Regions-AZ.md)|
|**instanceId**|String|True| |RDS instance ID, which uniquely identifies an RDS instance|

## Request parameter
None


## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](describeimportfiles#result)| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**importFiles**|[ImportFile[]](describeimportfiles#importfile)|Import File Set|
### <div id="importfile">ImportFile</div>
|Name|Type|Description|
|---|---|---|
|**name**|String|File Name|
|**sharedFileGid**|String|If the file is a shared file, it has a global ID, and it is empty if it is not a shared file. This global ID is needed when the file is deleted.|
|**sizeByte**|Integer|File Size, Unit: Byte|
|**uploadTime**|String|File upload completion time, format: YYYY-MM-DD HH:mm:ss|
|**isLocal**|String|Whether it belongs to the current instance. <br> 1: Current instance; <br>0: It does not belong to current instance, and is a shared file|
|**status**|String|File Status<br>- only support SQL Serverr|
|**importTime**|String|Import completion time, with the format: YYYY-MM-DD HH:mm:ss<br>- only support SQL Serverer|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|

## Request Example
GET
```
public void  testDescribeImportFiles(){
    DescribeImportFilesRequest describeImportFilesRequest = new DescribeImportFilesRequest();
    describeImportFilesRequest.setInstanceId("sqlserver-83uqv7avy4");
    describeImportFilesRequest.setRegionId("cn-north-1");
    DescribeImportFilesResponse response = rdsClient.describeImportFiles(describeImportFilesRequest);
    System.out.println(new Gson().toJson(response));
}

```

## Return Example
```
{
    "requestId": "bpa4kdtfsgq7t2406a0swem2010wkhd9", 
    "result": {
        "importFiles": [
            {
                "importTime": "2019-12-31 14:11:06", 
                "isLocal": "false", 
                "name": "db1.bak", 
                "sharedFileGid": "b9c74930-142b-4859-be26-cc4e0c0743a8", 
                "sizeByte": 244736, 
                "status": "ACTIVE", 
                "uploadTime": "2019-08-20 22:49:18"
            }, 
            {
                "importTime": "2020-01-07 16:22:12", 
                "isLocal": "false", 
                "name": "db1_1.bak", 
                "sharedFileGid": "fcbb66c6-e7f0-4228-b4c0-b3e5a0d452c8", 
                "sizeByte": 1593856, 
                "status": "ACTIVE", 
                "uploadTime": "2019-12-09 11:40:00"
            }
        ]
    }
}
```
