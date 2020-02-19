# describeBackupSynchronicities


## Description
Search the Cross-Region Backup Synchronization Service List.

## Request Method
GET

## Request Address
https://rds.jdcloud-api.com/v1/regions/{regionId}/backupSynchronicities

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region code, see the value range in [Table of Comparisons of Regions and Availability Zones](../Enum-Definitions/Regions-AZ.md)|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False| |Page displaying the data; it is 1 by default, the value range: [1,∞); when the pages exceed total pages, show the last page, for searching the list interface|
|**pageSize**|Integer|False| |The data entries displayed on each page, which is 10 by default, with value range: 10, 20, 30, 50, 100|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](describebackupsynchronicities#result)| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**backupSynchronicities**|[BackupSynchronicity[]](describebackupsynchronicities#backupsynchronicity)| |
|**totalCount**|Integer| |
### <div id="backupsynchronicity">BackupSynchronicity</div>
|Name|Type|Description|
|---|---|---|
|**serviceId**|String|Cross-Region Backup Synchronization Service ID|
|**instanceId**|String|RDS Instance ID|
|**serviceStatus**|String|Cross-region backup synchronization service status, normal, running; Error, error|
|**srcRegion**|String|Source Instance Region|
|**destRegion**|String|Backup the synchronized target region|
|**engine**|String|Database Type|
|**engineVersion**|String|Database Version|
|**createTime**|String|Creation Time|
|**newestDataTime**|String|Latest data time point of cross-region backup|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|

## Request Example
GET
```
public void testDescribeBackupSynchronicities() {
    DescribeBackupSynchronicitiesRequest request = new DescribeBackupSynchronicitiesRequest();
    request.setPageNumber(1);
    request.setPageSize(10);
    request.setRegionId("cn-east-2");
    DescribeBackupSynchronicitiesResponse response = rdsClient.describeBackupSynchronicities(request);
    System.out.println(new Gson().toJson(response));
}

```

## Return Example
```
{
    "requestId": "bpa34rjhhaak7vqv10dw79t2ok13c566", 
    "result": {
        "backupSynchronicities": [
            {
                "createTime": "2020-01-07 15:24:06", 
                "destRegion": "cn-east-2", 
                "engine": "mssjstack", 
                "engineVersion": "5.7", 
                "instanceId": "mysql-wp4e9ztap2", 
                "newestDataTime": "", 
                "serviceId": "dbs-r1q51ene3s5d", 
                "serviceStatus": "RUNNING", 
                "srcRegion": "cn-north-1"
            }
        ], 
        "totalCount": 1
    }
}
```
