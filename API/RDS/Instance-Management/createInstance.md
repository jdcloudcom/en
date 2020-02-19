# createInstance


## Description
Create an RDS instance and the user can use the corresponding database client or application to link to the RDS instance through the domain name and port to operate.

## Request method
POST

## Request address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region code, with range detailed in [Regions and Availability Zone Comparison Table](../Enum-Definitions/Regions-AZ.md)|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**instanceSpec**|[DBInstanceSpec](createinstance#dbinstancespec)|True| |Create Instance Type|

### <div id="dbinstancespec">DBInstanceSpec</div>
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**instanceName**|String|False| |Instance Name, see Help Center Document: [Name and Password Restrictions](../../../documentation/Database-and-Cache-Service/RDS/Introduction/Restrictions/SQLServer-Restrictions.md) for specific rules|
|**engine**|String|True| |Instance engine type, detailed in [Enumeration Parameter Definition](../Enum-Definitions/Enum-Definitions.md)|
|**engineVersion**|String|True| |Instance engine version, detailed in [Enumeration Parameter Definition](../Enum-Definitions/Enum-Definitions.md)|
|**instanceClass**|String|True| |View document [MySQL instance type](../Instance-Specifications/Instance-Specifications-MySQL.md) and [SQL Server instance type](../Instance-Specifications/Instance-Specifications-SQLServer.md) for instance type code|
|**instanceStorageGB**|Integer|True| |View document [MySQL Instance Type](../Instance-Specifications/Instance-Specifications-MySQL.md) and [SQL Server Instance Type](../Instance-Specifications/Instance-Specifications-SQLServer.md) for disk size, unit GB|
|**azId**|String[]|True| |AZ ID, the first ID must be AZ where the primary instance is located. If the two AZs are the same, you also need to enter two azIds.|
|**vpcId**|String|True| |VPC ID|
|**subnetId**|String|True| |Subnet ID|
|**parameterGroup**|String|False| |Parameter Set ID, system will create a default parameter set by default <br>- only support MySQL|
|**chargeSpec**|[ChargeSpec](createinstance#chargespec)|True| |Billing Specification, including Billing Type, Billing Period, etc.|
|**instanceStorageType**|String|False| |Storage Type, see [Enumeration Parameter Definitions](../Enum-Definitions/Enum-Definitions.md), the default value is: LOCAL_SSD<br>- Only support MySQL|
|**instancePort**|String|False| |The port range supported by application access port is: 1150～5999. The default value for MySQL, Percona and MariaDB is 3306; the default value for SQL SQL Server is 1433, and 5022 is not supported; the default port number for PostgreSQL is 5432;|
|**storageEncrypted**|Boolean|False| |Instance Data Encryption (data encryption will be supported only when the storage type is Cloud Disk Service). false: no encryption, true: encryption, the default is false<br> - Only support MySQL|
|**instanceType**|String|False| |Instance Availability Architecture. standalone: single machine, cluster: architecture of master and slave machines, the default is cluster<br>- Only support SQL Server|
### <div id="chargespec">ChargeSpec</div>
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**chargeMode**|String|False|postpaid_by_duration|Billing model value is prepaid_by_duration, postpaid_by_usage or postpaid_by_duration; prepaid_by_duration means Pay-In-Advance, postpaid_by_usage means Pay-As-You-Go By Consumption and postpaid_by_duration means pay by configuration; is postpaid_by_duration by default. Please refer to the Help Documentation of specific product line to confirm the billing type supported by the production line|
|**chargeUnit**|String|False| |Billing unit of Pay-In-Advance, the Pay-In-Advance is compulsory, and valid only when chargeMode is prepaid_by_duration, and the value is month or year and month by default|
|**chargeDuration**|Integer|False| |Pay-In-Advance billing duration, the Pay-In-Advance is compulsory and valid only when the value of chargeMode is prepaid_by_duration. When chargeUnit is month, the value shall be 1~9; when chargeUnit is year, the value shall be 1, 2 or 3|
|**autoRenew**|Boolean|False| |True=: OPEN——Enable automatic renewal, False=CLOSE—— Disable automatic renewal, with default value of CLOSE|
|**buyScenario**|String|False| |The unified activity credential, JSON character string, for the product line needs the BASE64 code. Now, the format required before coding is {"activity":{"activityType": required field, "activityIdentifier": required field}}|

## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](createinstance#result)| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**instanceId**|String| |

## Response code
|Return code|Description|
|---|---|
|**200**|OK|

## Request Example
POST
```
public void testCreateInstance() {
    CreateInstanceRequest request = new CreateInstanceRequest();
    DBInstanceSpec spec = new DBInstanceSpec();
    spec.setEngine("MySQL");
    spec.setEngineVersion("5.7");
    spec.setInstanceClass("db.mysql.s1.micro");
    spec.setInstanceStorageGB(20);
    spec.addAzId("cn-north-1a");
    spec.setVpcId("vpc-c58jvzx9eq");
    spec.setSubnetId("subnet-n9v3g73e8d");
    spec.setInstanceName("test");
    ChargeSpec chargeSpec = new ChargeSpec();
    chargeSpec.setChargeMode("postpaid_by_duration");
    spec.setChargeSpec(chargeSpec);
    request.setInstanceSpec(spec);
    request.setRegionId(region);
    CreateInstanceResponse response = rdsClient.createInstance(request);
    Gson gson = new GsonBuilder().create();
    System.out.println(gson.toJson(response));
}

```

## Return Example
```
{
    "requestId": "bkut6f51mkggr76oja96kh64ehtag0mi", 
    "result": {
        "instanceId": "mysql-ocj6g73clt"
    }
}
```
