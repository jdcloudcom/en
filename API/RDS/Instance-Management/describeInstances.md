# describeInstances


## Description
Get summary information of all RDS instances and MySQL/PostgreSQL read-only instances under the current account, such as instance type family, version, billing information, etc.

## Request method
GET

## Request address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region code, with range detailed in [Regions and Availability Zone Comparison Table](../Enum-Definitions/Regions-AZ.md)|

## Request parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False| |Display the page number of the data. The default is 1 and the value range is [-1, ∞). When pageNumber is -1, return all data page numbers; when the total number of pages is exceeded, display the last page;|
|**pageSize**|Integer|False| |The number of data entries displayed per page. It is 10 by default, with value range: [10, 100], and an integer multiple of 10|
|**filters**|[Filter[]](describeInstances#Filter)|False| |Filtering parameters, the relationship between filtering parameters is "and"<br>supporting filtering by the following attributes<br>instanceId, supporting operator option: eq<br>instanceName, supporting operator option: eq, like<br>engine, supporting operator option: eq<br>engineVersion, supporting operator option: eq<br>instanceStatus, supporting operator option: eq<br>vpcId, supporting operator option: eq<br>instanceType, supporting operator option: eq<br>internalDomainName, supporting operator option: eq<br>publicDomainName, supporting operator option: eq<br>|
|**tagFilters**|[TagFilter[]](describeInstances#TagFilter)|False| |Resource Tag|

### <a name="TagFilter">TagFilter</a>
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**key**|String|True| |Tag Key|
|**values**|String[]|True| |Tag Value|
### <a name="Filter">Filter</a>
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|True| |Name of Filter Requirements|
|**operator**|String|False| |Operator of filter requirements is eq by default|
|**values**|String[]|True| |Value of Filter Requirements|

## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](describeInstances#Result)| |

### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**dbInstances**|[DBInstance[]](describeInstances#DBInstance)| |
|**totalCount**|Integer| |
### <a name="DBInstance">DBInstance</a>
|Name|Type|Description|
|---|---|---|
|**instanceId**|String|Instance ID|
|**instanceName**|String|Instance Name, see Help Center Document [Name and Password Restrictions](../../../documentation/Database-and-Cache-Service/RDS/Introduction/Restrictions/SQLServer-Restrictions.md) for specific rules|
|**instanceType**|String|Instance category, such as primary instances, read-only instances, etc., detailed in [Enumeration Parameter Definition](../Enum-Definitions/Enum-Definitions.md)|
|**engine**|String|Instance engine type, such as MySQL or SQL Server, etc., detailed in [Enumeration Parameter Definition](../Enum-Definitions/Enum-Definitions.md)|
|**engineVersion**|String|Instance engine version, detailed in [Enumeration Parameter Definition](../Enum-Definitions/Enum-Definitions.md)|
|**instanceClass**|String|Instance Type Code|
|**instanceStorageGB**|Integer|Disk, Unit: GB|
|**instanceCPU**|Integer|CPU Core Number|
|**instanceMemoryMB**|Integer|Memory, Unit: MB|
|**regionId**|String|Region ID, detailed in [Regions and Availability Zone Comparison Table](../Enum-Definitions/Regions-AZ.md)|
|**azId**|String[]|AZ ID, the first is AZ for the primary instance, which is detailed in [Regions and Availability Zone Comparison Table](../Enum-Definitions/Regions-AZ.md)|
|**vpcId**|String|VPC ID|
|**subnetId**|String|Subnet ID|
|**instanceStatus**|String|Instance status, detailed in [Enumeration Parameter Definition](../Enum-Definitions/Enum-Definitions.md)|
|**publicDomainName**|String|Instance Public Network Domain<br>- Only support MySQL|
|**internalDomainName**|String|Instance Intranet Domain<br>- Only support MySQL|
|**createTime**|String|Instance Creation Time|
|**backupSynchronicity**|[BackupSynchronicityAbstract[]](describeInstances#BackupSynchronicityAbstract)|Instance Cross-region Backup Service enables relevant information|
|**charge**|[Charge](describeInstances#Charge)|Billing Configuration|
|**tags**|[Tag[]](describeInstances#Tag)|Tag Information|
|**sourceInstanceId**|String|Main Instance IDs Corresponded to MySQL and PostgreSQL Read-only Instances|
### <a name="Tag">Tag</a>
|Name|Type|Description|
|---|---|---|
|**key**|String|Tag Key|
|**value**|String|Tag Value|
### <a name="Charge">Charge</a>
|Name|Type|Description|
|---|---|---|
|**chargeMode**|String|Payment Model, the value shall be prepaid_by_duration, postpaid_by_usage or postpaid_by_duration; prepaid_by_duration refers to Pay-In-Advance; postpaid_by_usage refers to Pay By Consumption and Pay-As-You-Go; postpaid_by_duration refers to Pay By Configuration and Pay-As-You-Go, and is postpaid_by_duration by default|
|**chargeStatus**|String|Cost Payment Status, the value is respectively normal, overdue and arrear.|
|**chargeStartTime**|String|The start time of the billing shall be subject to ISO8601, with the UTC time used in the format of YYYY-MM-DDTHH:mm:ssZ|
|**chargeExpiredTime**|String|Expiration Time, i.e. the expiration time of Pay-In-Advance resource, which shall be subject to ISO8601, with the UTC time used in the format of YYYY-MM-DDTHH:mm:ssZ. Pay-As-You-Go resource field is blank.|
|**chargeRetireTime**|String|The Expected Release Time refers to the expected release time of resources. This value is both available for the Pay-In-Advance/Pay-As-You-Go resources, conforming to the ISO8601 standard, with the UTC time used in the format of YYYY-MM-DDTHH:mm:ssZ|
### <a name="BackupSynchronicityAbstract">BackupSynchronicityAbstract</a>
|Name|Type|Description|
|---|---|---|
|**serviceId**|String|Cross-region Backup Synchronization Service ID|
|**destRegion**|String|Backup the synchronized target region|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|

## Request Example
GET
```
public void testDescribeInstances() {
    DescribeInstancesRequest request = new DescribeInstancesRequest();
    Filter filter = new Filter();
    filter.setName("instanceId");
    filter.addValue("mysql-axntjxvdix");
    request.addFilter(filter);
    request.setRegionId(region);
    DescribeInstancesResponse response = rdsClient.describeInstances(request);
    Gson gson = new GsonBuilder().create();
    System.out.println(gson.toJson(response));
}

```

## Return Example
```
{
    "requestId": "bkut9ianrmv9g78aubw44j50i6mtjm0k", 
    "result": {
        "dbInstances": [
            {
                "azId": [
                    "cn-north-1a", 
                    "cn-north-1b"
                ], 
                "backupSynchronicity": [], 
                "charge": {
                    "chargeMode": "postpaid_by_duration", 
                    "chargeStartTime": "2019-09-04T13:50:51Z", 
                    "chargeStatus": "normal"
                }, 
                "createTime": "2019-09-04T21:51:06", 
                "engine": "MySQL", 
                "engineVersion": "8.0", 
                "instanceCPU": 1, 
                "instanceClass": "db.mysql.s1.micro", 
                "instanceId": "mysql-axntjxvdix", 
                "instanceMemoryMB": 1024, 
                "instanceName": "Create ms80 based on backup", 
                "instanceStatus": "RUNNING", 
                "instanceStorageGB": 40, 
                "instanceStorageType": "LOCAL_SSD", 
                "instanceType": "cluster", 
                "regionId": "cn-north-1", 
                "subnetId": "subnet-v9o64tph5i", 
                "vpcId": "vpc-da6rpb8uk9"
            }
        ], 
        "totalCount": 1
    }
}
```
