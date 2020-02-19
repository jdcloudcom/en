# describeErrorLogs


## Description
Obtain error logs of SQL Server and download information<br>- only support SQL Server

## Request method
GET

## Request address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/errorLogs

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region code, with range detailed in [Regions and Availability Zone Comparison Table](../Enum-Definitions/Regions-AZ.md)|
|**instanceId**|String|True| |RDS instance ID, which uniquely identifies an RDS instance|

## Request parameter
None


## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](describeerrorlogs#result)| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**errorLogs**|[ErrorLog[]](describeerrorlogs#errorlog)|Error Logs File Set|
### <div id="errorlog">ErrorLog</div>
|Name|Type|Description|
|---|---|---|
|**name**|String|Error Log File Name|
|**sizeByte**|Long|Error Log File Size in Bytes|
|**lastUpdateTime**|String|Last Update Time of the Error Log, Format: YYYY-MM-DD HH:mm:ss|
|**uploadTime**|String|Error Log Upload Time, Format: YYYY-MM-DD HH:mm:ss|
|**publicURL**|String|Download Link of Public Network|
|**internalURL**|String|Download Link of Intranet|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|

## Request Example
GET
```
public void testDescribeErrorLogs() {
    DescribeErrorLogsRequest request = new DescribeErrorLogsRequest();
    request.setRegionId("cn-north-1");
    request.setInstanceId("sqlserver-83uqv7avy4");
    DescribeErrorLogsResponse response = rdsClient.describeErrorLogs(request);
    System.out.println(new Gson().toJson(response));
}

```

## Return Example
```
{
    "requestId": "bpa4j42ju7ouu8s8m39m0w4h1ps7kqg4", 
    "result": {
        "errorLogs": [
            {
                "internalURL": "http://oss-internal.cn-north-1.jcloudcs.com/jddbsqlserver/sqlserver-83uqv7avy4/errorlog/ERRORLOG?Expires=1593939719&AccessKey=E3136A5602E671CD26D5A7B56A05F965&Signature=TECg4lQyjLGzeU9Zm9SNoluSIds=", 
                "lastUpdateTime": "2020-01-07 16:58:22", 
                "name": "ERRORLOG", 
                "publicURL": "http://oss.cn-north-1.jcloudcs.com/jddbsqlserver/sqlserver-83uqv7avy4/errorlog/ERRORLOG?Expires=1593939719&AccessKey=E3136A5602E671CD26D5A7B56A05F965&Signature=TECg4lQyjLGzeU9Zm9SNoluSIds=", 
                "sizeByte": 45072, 
                "uploadTime": "2020-01-07 17:01:59"
            }
        ]
    }
}
```
