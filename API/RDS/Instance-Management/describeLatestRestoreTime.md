# describeLatestRestoreTime


## Description
When recover/create the obtained SQL Server instances based on the time point, the latest time point can be recovered<br>- Support SQL Serve onlyr

## Request Method
GET

## Request Address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}:describeLatestRestoreTime

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region code, see the value range in [Table of Comparisons of Regions and Availability Zones](../Enum-Definitions/Regions-AZ.md)|
|**instanceId**|String|True| |RDS instance ID, the unique identifier of one RDS instance|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](describelatestrestoretime#result)| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**latestRestoreTime**|String|When recover instances based on the time point, the latest time point can be recovered|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|

## Request Example
GET
```
public void testDescribeLatestRestoreTime() {
    DescribeLatestRestoreTimeRequest request = new DescribeLatestRestoreTimeRequest();
    request.setInstanceId("sqlserver-83uqv7avy4");
    request.setRegionId("cn-north-1");
    DescribeLatestRestoreTimeResponse response = rdsClient.describeLatestRestoreTime(request);
    System.out.println(new Gson().toJson(response));
}

```

## Return Example
```
{
    "requestId": "bpa4ra7kttub98404upawr11a9dnf1bb", 
    "result": {
        "latestRestoreTime": "2020-01-07 17:18:26"
    }
}
```
