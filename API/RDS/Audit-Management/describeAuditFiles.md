# describeAuditFiles


## Description
Obtain the list of all the audit result files under the current instance<br>- only support SQL Server

## Request Method
GET

## Request Address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/audit:describeAuditFiles

|Name|Type|Required or Not|Default|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region code, see the value range in [Table of Comparisons of Regions and Availability Zones](../Enum-Definitions/Regions-AZ.md)|
|**instanceId**|String|True| |RDS instance ID, the unique identifier of one RDS instance|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](describeauditfiles#result)| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**auditFiles**|[AuditFile[]](describeauditfiles#auditfile)| |
### <div id="auditfile">AuditFile</div>
|Name|Type|Description|
|---|---|---|
|**name**|String|Audit log file name|
|**sizeByte**|Long|Audit log file size, unit: Byte|
|**lastUpdateTime**|String|Last update time of audit log file|
|**uploadTime**|String|Last upload time of audit log file|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|

## Request Example
GET
```
public void testDescribeAuditFiles(){
    DescribeAuditFilesRequest request = new DescribeAuditFilesRequest();
    request.setInstanceId("sqlserver-83uqv7avy4");
    request.setRegionId("cn-north-1");
    DescribeAuditFilesResponse response= rdsClient.describeAuditFiles(request);
    String result = new Gson().toJson(response);
    System.out.println(result);
}

```

## Return Example
```
{
    "requestId": "bpa2rdrg41dcqujn7k4f89ji0ocfspde", 
    "result": {
        "auditFiles": [
            {
                "lastUpdateTime": "2020-01-07 14:56:23", 
                "name": "RDSAudit_054F6E2E-01C1-41FD-ABC8-91EE34CD2AF9_0_132228536211390000.sqlaudit", 
                "sizeByte": 8704, 
                "uploadTime": "2020-01-07 14:56:24"
            }
        ]
    }
}
```
