# describeBackupPolicy


## Description
View RDS instance backup policy. The supported backup policies differ based on different database type. See the detailed instructions in return parameters

## Request Method
GET

## Request Address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}:describeBackupPolicy

|Name|Type|Required or Not|Default|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region code, see the value range in [Table of Comparisons of Regions and Availability Zones](../Enum-Definitions/Regions-AZ.md)|
|**instanceId**|String|True| |RDS instance ID, the unique identifier of one RDS instance|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](describebackuppolicy#result)| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**startWindow**|String|Automatic backup start time window, with the range of 00:00-23:59, with the time range tolerance shall not be less than 30 minutes. <br>For instance: 00:00-01:00, representing that the database is backed up automatically from 00:00 to 01:00, and the backup completion time is related to the instance size, which is not certainly within the time range|
|**retentionPeriod**|Integer|Automatic backup reservation period, unit: days, the default is 7 days, with the range of 7-730|
|**cycleMode**|Integer|Automatic backup loop mode<br>1: means full backup every day<br>2: means automatic backup in the full, incremental, incremental mode, such as full backup for the first day, incremental backup for the second and third day; full backup again for the fourth day by analogy.<br>- Only support SQL Server|
|**backupBinlog**|String|Backup binlog or not<br>true: Yes<br>false: No<br> - **Only support MySQL, Percona and MariaDB|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|

## Request Example
GET
```
public void testDescribeBackupPolicy() {
    DescribeBackupPolicyRequest request = new DescribeBackupPolicyRequest();
    request.setInstanceId("mysql-wp4e9ztap2");
    request.setRegionId("cn-north-1");
    DescribeBackupPolicyResponse response = rdsClient.describeBackupPolicy(request);
    System.out.println(new Gson().toJson(response));
}

```

## Return Example
```
{
    "requestId": "bpa4rp0pwo23umuub3f3h6knwma27787", 
    "result": {
        "backupBinlog": "true", 
        "retentionPeriod": 7, 
        "startWindow": "02:00-03:00"
    }
}
```
