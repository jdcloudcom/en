# describeLogDownloadURL


## Description
Generate log file download link according to download link expiration time of log file, only supporting PostgreSQL, MySQL, Percona and MariaDB

## Request Method
POST

## Request Address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/log/{logId}:describeLogDownloadURL

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region code, see the value range in [Table of Comparisons of Regions and Availability Zones](../Enum-Definitions/Regions-AZ.md)|
|**instanceId**|String|True| |RDS Instance ID, the Unique Identifier of One RDS Instance|
|**logId**|String|True| |Log File ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**seconds**|Integer|False| |Set an expiration time to link address, the unit is second, the default value is 300 seconds, and the maximum time cannot exceed the value range of 1 ~ 86400 seconds|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](describeLogDownloadURL#Result)| |

### <a name="Result">Result</a>
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
public void testDescribeLogDownloadURL() {
    DescribeLogDownloadURLRequest request = new DescribeLogDownloadURLRequest();
    request.setRegionId(region);
    request.instanceId("pg-xxxxxxxxxx");
    request.logId("postgresql-xxxxxxxxxxxxxxxxxxxxxxxxxxx");
    request.seconds(300);
    DescribeLogDownloadURLResponse response = rdsClient.describeLogDownloadURL(request);
    Gson gson = new GsonBuilder().create();
    System.out.println(gson.toJson(response));
}

```

## Return Example
```
{
    "requestId": "bkut6f51mkggr76oja96kh64ehtag0mi", 
    "result": {
        "internalURL": "http://s3.cn-north-1.jcloudcs.com/jddbpgsql/pg-xxxxxxxxxx/logupload/...", 
        "publicURL": "http://s3.cn-north-1.jcloudcs.com/jddbpgsql/pg-xxxxxxxxxx/logupload/..."
    }
}
```
