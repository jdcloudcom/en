# describeBinlogDownloadURL


## Description
Obtain the binlog download link of MySQL instance<br>- Only support MySQL, Percona and MariaDB

## Request Method
GET

## Request Address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/binlogs/{binlogBackupId}:describeBinlogDownloadURL

|Name|Type|Required or Not|Default|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region code, see the value range in [Table of Comparisons of Regions and Availability Zones](../Enum-Definitions/Regions-AZ.md)|
|**instanceId**|String|True| |RDS instance ID, the unique identifier of one RDS instance|
|**binlogBackupId**|String|True| |Backup ID of binlog, which may be obtained through describeBinlogs|

## Request Parameter
|Name|Type|Required or Not|Default|Description|
|---|---|---|---|---|
|**seconds**|Integer|False| |Set an expiration time to link address, the unit is second, the default value is 300 seconds, and the maximum time cannot exceed the value range of 1 ~ 86400 seconds|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](describebinlogdownloadurl#result)| |

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
GET
```
public void testDescribeBinlogDownloadURL() {
    DescribeBinlogDownloadURLRequest request = new DescribeBinlogDownloadURLRequest();
    request.setInstanceId("mysql-wp4e9ztap2");
    request.setRegionId("cn-north-1");
    request.setBinlogBackupId("bceed098-0c5d-48a1-9625-4126e32bed29");
    DescribeBinlogDownloadURLResponse response = rdsClient.describeBinlogDownloadURL(request);
    System.out.println(new Gson().toJson(response));
}

```

## Return Example
```
{
    "requestId": "bpa3akbft13hi67hperu73atrj3smqun", 
    "result": {
        "internalURL": "http://oss-internal.cn-north-1.jcloudcs.com/trove-online-hb/233f1965-3a30-4d8c-a618-25c6f286a96e/binlog/mysql-bin.002009.gz.enc_time_20200107141350?Expires=1578382973&AccessKey=872DED479C1C41757FDCC3A7542BE694&Signature=B6t66Cz5v+XsVUNdRRkXJGBfZ1w=", 
        "publicURL": "http://oss.cn-north-1.jcloudcs.com/trove-online-hb/233f1965-3a30-4d8c-a618-25c6f286a96e/binlog/mysql-bin.002009.gz.enc_time_20200107141350?Expires=1578382973&AccessKey=872DED479C1C41757FDCC3A7542BE694&Signature=B6t66Cz5v+XsVUNdRRkXJGBfZ1w="
    }
}
```
