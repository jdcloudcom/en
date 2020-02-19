# describeInstanceAttributes


## Description
Search detailed information of RDS instances (MySQL, SQL Server, etc.) as well as information of MySQL/PostgreSQL real-only instance

## Request method
GET

## Request address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region code, with range detailed in [Regions and Availability Zone Comparison Table](../Enum-Definitions/Regions-AZ.md)|
|**instanceId**|String|True| |RDS instance ID, which uniquely identifies an RDS instance|

## Request parameter
None


## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](describeinstanceattributes#result)| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**dbInstanceAttributes**|[DBInstanceAttribute](describeinstanceattributes#dbinstanceattribute)| |
### <div id="dbinstanceattribute">DBInstanceAttribute</div>
|Name|Type|Description|
|---|---|---|
|**instanceId**|String|Instance ID|
|**instanceName**|String|Instance Name, see Help Center Document [Name and Password Restrictions](../../../documentation/Database-and-Cache-Service/RDS/Introduction/Restrictions/SQLServer-Restrictions.md) for specific rules|
|**instanceType**|String|Instance type, such as primary instances, read-only instances, etc., detailed in [Enumeration Parameter Definition](../Enum-Definitions/Enum-Definitions.md)|
|**engine**|String|Instance engine type, such as MySQL or SQL Server, etc., detailed in [Enumeration Parameter Definition](../Enum-Definitions/Enum-Definitions.md)|
|**engineVersion**|String|Instance engine version, detailed in [Enumeration Parameter Definition](../Enum-Definitions/Enum-Definitions.md)|
|**instanceClass**|String|Instance Type Code|
|**instanceStorageType**|String|Storage Type, see [Enumeration Parameter Definitions](../Enum-Definitions/Enum-Definitions.md)|
|**storageEncrypted**|Boolean|Instance Data Encryption. false: no encryption; true: encryption|
|**instanceStorageGB**|Integer|Disk, Unit: GB|
|**instanceCPU**|Integer|Number of CPU Cores|
|**instanceMemoryMB**|Integer|Memory Size, Unit: MB|
|**regionId**|String|Region ID, detailed in [Regions and Availability Zone Comparison Table](../Enum-Definitions/Regions-AZ.md)|
|**azId**|String[]|AZ ID, the first is AZ for the primary instance, which is detailed in [Regions and Availability Zone Comparison Table](../Enum-Definitions/Regions-AZ.md)|
|**vpcId**|String|VPC ID|
|**subnetId**|String|Subnet ID|
|**parameterGroupId**|String|ID of parameter set<br>- Only support MySQL|
|**parameterGroupName**|String|Parameter Set Name<br>- Only support MySQL|
|**parameterStatus**|String|Status of parameters, see [Enumeration Parameter Definition](../Enum-Definitions/Enum-Definitions.md)<br>- Only support MySQL|
|**internalDomainName**|String|Intranet Domain of Instance|
|**publicDomainName**|String|Internet Domain of Instance|
|**instancePort**|String|Application Access Port|
|**connectionMode**|String|Access mode, see [Enumeration Parameter Definition](../Enum-Definitions/Enum-Definitions.md)<br>- Only support MySQL|
|**auditStatus**|String|Auditing status, see [Enumeration Parameter Definition](../Enum-Definitions/Enum-Definitions.md)<br>- Only support MySQL|
|**instanceStatus**|String|Instance status, detailed in [Enumeration Parameter Definition](../Enum-Definitions/Enum-Definitions.md)|
|**createTime**|String|Instance Creation Time|
|**charge**|[Charge](describeinstanceattributes#charge)|Billing Configuration|
|**sourceInstanceId**|String|Main Instance ID Corresponded To MySQL Read-only Instance<br>- Only support MySQL|
|**roInstanceIds**|String[]|Read-only Instance ID List<br>- Only support MySQL|
|**primaryNode**|[DBInstanceNode](describeinstanceattributes#dbinstancenode)|Information of primary node in high availability cluster<br>- Only support SQL Server|
|**secondaryNode**|[DBInstanceNode](describeinstanceattributes#dbinstancenode)|Information of secondary node in high availability cluster<br>- only support SQL Server|
|**tags**|[Tag[]](describeinstanceattributes#tag)|Tag Information|
### <div id="tag">Tag</div>
|Name|Type|Description|
|---|---|---|
|**key**|String|Tag Key|
|**value**|String|Tag Value|
### <div id="dbinstancenode">DBInstanceNode</div>
|Name|Type|Description|
|---|---|---|
|**id**|String|Nodeid|
|**name**|String|Node Name|
|**status**|String|Node Status|
### <div id="charge">Charge</div>
|Name|Type|Description|
|---|---|---|
|**chargeMode**|String|Payment Model, the value shall be prepaid_by_duration, postpaid_by_usage or postpaid_by_duration; prepaid_by_duration refers to Pay-In-Advance; postpaid_by_usage refers to Pay By Consumption and Pay-As-You-Go; postpaid_by_duration refers to Pay By Configuration and Pay-As-You-Go, and is postpaid_by_duration by default|
|**chargeStatus**|String|Cost Payment Status, the value is respectively normal, overdue and arrear.|
|**chargeStartTime**|String|The start time of the billing shall be subject to ISO8601, with the UTC time used in the format of YYYY-MM-DDTHH:mm:ssZ|
|**chargeExpiredTime**|String|Expiration Time, i.e. the expiration time of Pay-In-Advance resource, which shall be subject to ISO8601, with the UTC time used in the format of YYYY-MM-DDTHH:mm:ssZ. Pay-As-You-Go resource field is blank.|
|**chargeRetireTime**|String|The Expected Release Time refers to the expected release time of resources. This value is both available for the Pay-In-Advance/Pay-As-You-Go resources, conforming to the ISO8601 standard, with the UTC time used in the format of YYYY-MM-DDTHH:mm:ssZ|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|

## Request Example
GET
```
public void testDescribeInstanceAttributes() {
    DescribeInstanceAttributesRequest request = new DescribeInstanceAttributesRequest();
    request.setRegionId("cn-north-1");
    request.setInstanceId("mysql-wp4e9ztap2");
    DescribeInstanceAttributesResponse response = rdsClient.describeInstanceAttributes(request);
    System.out.println(new Gson().toJson(response));
}

```

## Return Example
```
{
    "requestId": "bpa4ph6u278ofownjgc0ittjvh3se4p1", 
    "result": {
        "dbInstanceAttributes": {
            "auditStatus": "on", 
            "azId": [
                "cn-north-1a", 
                "cn-north-1b"
            ], 
            "charge": {
                "chargeExpiredTime": "2020-01-31T15:59:59Z", 
                "chargeMode": "prepaid_by_duration", 
                "chargeStartTime": "2019-12-31T06:18:52Z", 
                "chargeStatus": "normal"
            }, 
            "connectionMode": "standard", 
            "createTime": "2019-12-31T14:18:52", 
            "engine": "MySQL", 
            "engineVersion": "5.7", 
            "instanceCPU": 1, 
            "instanceClass": "db.mysql.s1.micro", 
            "instanceId": "mysql-wp4e9ztap2", 
            "instanceMemoryMB": 1024, 
            "instanceName": "hdj_test", 
            "instancePort": "3306", 
            "instanceStatus": "RUNNING", 
            "instanceStorageGB": 20, 
            "instanceStorageType": "LOCAL_SSD", 
            "instanceType": "cluster", 
            "internalDomainName": "mysql-cn-north-1-c1ce20704a60487d.rds.jdcloud.com", 
            "parameterGroupId": "mysql-pg-3udygiyups", 
            "parameterGroupName": "lh_pg", 
            "parameterStatus": "VALID", 
            "publicDomainName": "", 
            "regionId": "cn-north-1", 
            "storageEncrypted": false, 
            "subnetId": "subnet-820lwf1mlp", 
            "tags": [], 
            "vpcId": "vpc-yn4dblxgeb"
        }
    }
}
```
