# describeBinlogs


## Description
Obtain the binlog detailed information in MySQL instance<br>- Only support MySQL, Percona and MariaDB

## Request Method
GET

## Request Address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/binlogs

|Name|Type|Required or Not|Default|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region code, see the value range in [Table of Comparisons of Regions and Availability Zones](../Enum-Definitions/Regions-AZ.md)|
|**instanceId**|String|True| |RDS instance ID, the unique identifier of one RDS instance|

## Request Parameter
|Name|Type|Required or Not|Default|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False| |The page displaying the data, which is 1 by default, with value range: [-1,∞). When the pageNumber is -1, all data pages are returned; when it exceeds the total pages, the last page is displayed.|
|**pageSize**|Integer|False| |The data entries displayed on each page, which is 10 by default, with value range: 10, 20, 30, 50, 100|
|**startTime**|String|False| |Query the start time, with the format as: YYYY-MM-DD HH:mm:ss, the duration from the start time to the end time is no more than three days|
|**endTime**|String|False| |Query the end time, with the format as: YYYY-MM-DD HH:mm:ss, the duration from the start time to the end time is no more than three days|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](describebinlogs#result)| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**totalCount**|Integer|Number of Total Records|
|**binlogs**|[Binlog[]](describebinlogs#binlog)|Backup Set|
### <div id="binlog">Binlog</div>
|Name|Type|Description|
|---|---|---|
|**binlogBackupId**|String|binlog log backup ID|
|**binlogName**|String|binlog log name|
|**binlogSizeKB**|Long|binlog log size, unitKB|
|**binlogStartTime**|String|binlogStart time, with the format as: YYYY-MM-DD HH:mm:ss|
|**binlogEndTime**|String|binlog end time, with the format as: YYYY-MM-DD HH:mm:ss|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|

## Request Example
GET
```
public void testDescribeBinlogs() {
    DescribeBinlogsRequest request = new DescribeBinlogsRequest();
    request.setInstanceId("mysql-wp4e9ztap2");
    request.setRegionId("cn-north-1");
    request.setStartTime("2020-01-07 14:08:00");
    request.setEndTime("2020-01-07 14:09:00");
    DescribeBinlogsResponse response = rdsClient.describeBinlogs(request);
    System.out.println(new Gson().toJson(response));
}

```

## Return Example
```
{
    "requestId": "bpa39u79di4knqu1cp5nhwt2nnuui5d8", 
    "result": {
        "binlogs": [
            {
                "binlogBackupId": "bceed098-0c5d-48a1-9625-4126e32bed29", 
                "binlogEndTime": "2020-01-07T14:13:50", 
                "binlogName": "mysql-bin.002009", 
                "binlogSizeKB": 281, 
                "binlogStartTime": "2020-01-07T14:08:49"
            }, 
            {
                "binlogBackupId": "200a08e4-d9ca-47ac-9347-6f442d8acfb5", 
                "binlogEndTime": "2020-01-07T14:08:49", 
                "binlogName": "mysql-bin.002008", 
                "binlogSizeKB": 281, 
                "binlogStartTime": "2020-01-07T14:03:48"
            }
        ], 
        "totalCount": 2
    }
}
```
