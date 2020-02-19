# describeAudit


## Description
View the audit options of the current instance that have been enabled. If no audit option is enabled for the current instance, it returns an empty array<br>- Support SQL Server Only

## Request method
GET

## Request address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/audit

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region code, with range detailed in [Regions and Availability Zone Comparison Table](../Enum-Definitions/Regions-AZ.md)|
|**instanceId**|String|True| |RDS instance ID, which uniquely identifies an RDS instance|

## Request parameter
None


## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](describeaudit#result)| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**enabled**|String[]| |

## Response code
|Return code|Description|
|---|---|
|**200**|OK|

## Request Example
GET
```
public void testDescribeAudit(){
    DescribeAuditRequest request=new DescribeAuditRequest();
    request.setInstanceId("sqlserver-83uqv7avy4");
    request.setRegionId("cn-north-1");
    DescribeAuditResponse response= rdsClient.describeAudit(request);
    System.out.println(new Gson().toJson(response));
}

```

## Return Example
```
{
    "requestId": "bpa2nb742v05wneqcdwrgbvu6pae5djf", 
    "result": {
        "enabled": [
            "DATABASE_OBJECT_ACCESS_GROUP"
        ]
    }
}
```
