# updateLogDownloadURLInternal


## Description
Set a download link expiration time to log file, and refresh to generate a log file download link to PostgreSQL

## Request Method
POST

## Request Address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/log/{logId}:updateLogDownloadURLInternal

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region code, see the value range in [Table of Comparisons of Regions and Availability Zones](../Enum-Definitions/Regions-AZ.md)|
|**instanceId**|String|True| |RDS Instance ID, the Unique Identifier of One RDS Instance|
|**logId**|String|True| |Log File ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**seconds**|Integer|True| |Set an expiration time to link address, unit: Second, the maximum time cannot exceed the value range of 1 ~ 86400 seconds|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](updatelogdownloadurlinternal#result)| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**publicURL**|String|Public network download link|
|**internalURL**|String|Intranet download link|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|

## Request Example
POST
```
public void testUpdateLogDownloadURLInternal() {
    UpdateLogDownloadURLInternalRequest request = new UpdateLogDownloadURLInternalRequest();
    request.setInstanceId("pg-x2fyuzvwak");
    request.setLogId("postgresql-0ab4d726-b4a4-46ef-9dc4-66e37e060833");
    request.setSeconds(3600);
    request.setRegionId("cn-north-1");
    UpdateLogDownloadURLInternalResponse response = rdsClient.updateLogDownloadURLInternal(request);
    System.out.println(new Gson().toJson(response));
}

```

## Return Example
```
{
    "requestId": "bpakhjtwfufuv5abu59fc9tbp77mj0v5", 
    "result": {
        "internalURL": "http://s3.cn-north-1.jcloudcs.com/jddbpgsql/f7a5d144-fca1-4350-b3c5-1334c4d569b7/logupload/c30fc69d-48e1-43e0-b76c-3378dad25f9c/749f61ab-d4f3-4e66-946e-d8d2357a414b/postgresql-20200108_1100.log?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=11933B95E91AC3B8EB3C687BEFB3DFA3%2F20200108%2Fcn-north-1%2Fs3%2Faws4_request&X-Amz-Date=20200108T031319Z&X-Amz-Expires=3600&X-Amz-SignedHeaders=host&X-Amz-Signature=", 
        "publicURL": "http://s3.cn-north-1.jcloudcs.com/jddbpgsql/f7a5d144-fca1-4350-b3c5-1334c4d569b7/logupload/c30fc69d-48e1-43e0-b76c-3378dad25f9c/749f61ab-d4f3-4e66-946e-d8d2357a414b/postgresql-20200108_1100.log?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=11933B95E91AC3B8EB3C687BEFB3DFA3%2F20200108%2Fcn-north-1%2Fs3%2Faws4_request&X-Amz-Date=20200108T031319Z&X-Amz-Expires=3600&X-Amz-SignedHeaders=host&X-Amz-Signature="
    }
}
```
