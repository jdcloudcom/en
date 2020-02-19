# createInstanceByTimeInCrossRegion


## Description
Create Instance according to cross-region backup synchronization time point.

## Request Method
POST

## Request Address
https://rds.jdcloud-api.com/v1/regions/{regionId}/backupSynchronicities:createInstanceByTimeInCrossRegion

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region code, see the value range in [Table of Comparisons of Regions and Availability Zones](../Enum-Definitions/Regions-AZ.md)|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**restoreTime**|String|True| |Create New Instance Based on Which Time Point of the Source Instance|
|**serviceId**|String|True| |Cross-region Backup Synchronization Service ID|
|**instanceSpec**|[RestoredNewDBInstanceSpec](createinstancebytimeincrossregion#restorednewdbinstancespec)|True| |Create Instance Type|

### <div id="restorednewdbinstancespec">RestoredNewDBInstanceSpec</div>
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**instanceName**|String|False| |Database Instance Name, see [Help Center Document](../../../documentation/Database-and-Cache-Service/RDS/Introduction/Restrictions/SQLServer-Restrictions.md) for restrictions of Name|
|**instanceClass**|String|True| |View document [MySQL Instance Type](../Instance-Specifications/Instance-Specifications-MySQL.md) and [SQL Server Instance Type](../Instance-Specifications/Instance-Specifications-SQLServer.md) for instance type codes|
|**instanceStorageGB**|Integer|True| |Disk Size, Unit: GB|
|**azId**|String[]|True| |Availability Zone ID, the first ID must be Availability Zone where the Main Instance is located. If two Availability Zones share the same, it is required to enter two azIds|
|**vpcId**|String|True| |VPC ID|
|**subnetId**|String|True| |Subnet ID|
|**parameterGroup**|String|False| |Parameter Set ID, system will create a default parameter set by default <br>- only support MySQL|
|**chargeSpec**|[ChargeSpec](createinstancebytimeincrossregion#chargespec)|True| |Billing Specification, including Billing Type, Billing Period, etc.|
|**instanceStorageType**|String|False| |Storage Type, see [Enumeration Parameter Definitions](../Enum-Definitions/Enum-Definitions.md), the default value is: LOCAL_SSD<br>- Only support MySQL|
|**instancePort**|String|False| |The port range supported by application access port is: 1150～5999. The default value for MySQL, Percona and MariaDB is 3306; the default port number for PostgreSQL is 5432;|
|**storageEncrypted**|Boolean|False| |Instance Data Encryption (data encryption will be supported only when the storage type is Cloud Disk Service). false: no encryption, true: encryption, the default is false<br> - Only support MySQL|
|**instanceType**|String|False| |Instance Availability Architecture. standalone: single machine, cluster: architecture of master and slave machines, the default is cluster<br>- Only support SQL Server|
### <div id="chargespec">ChargeSpec</div>
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**chargeMode**|String|False|postpaid_by_duration|Billing model value is prepaid_by_duration, postpaid_by_usage or postpaid_by_duration; prepaid_by_duration means Pay-In-Advance, while postpaid_by_usage means Pay-As-You-Go By Consumption; and postpaid_by_duration means pay by configuration and is the default value. Please refer to the help documentation of specific product line to confirm the billing type supported by the production line|
|**chargeUnit**|String|False| |Billing unit of Pay-In-Advance, the Pay-In-Advance is compulsory, which is valid only when chargeMode is prepaid_by_duration, with the values of month and year and the default value of month|
|**chargeDuration**|Integer|False| |Pay-In-Advance billing hours, the Pay-In-Advance is compulsory and is valid only when the value of chargeMode is prepaid_by_duration. When chargeUnit is month, the value shall be: 1~9; when chargeUnit is year, the value shall be: 1, 2 and 3|
|**autoRenew**|Boolean|False| |True=: OPEN——Enable automatic renewal, False=CLOSE—— Disable automatic renewal, with default value of CLOSE|
|**buyScenario**|String|False| |The unified activity credential, JSON character string, for the product line needs the BASE64 code. Now, the format required before coding is {"activity":{"activityType": required field, "activityIdentifier": required field}}|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](createinstancebytimeincrossregion#result)| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**instanceId**|String|Newly Created Instance ID|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|

## Request Example
POST
```
public void testCreateInstanceByTimeInCrossRegion() {
    CreateInstanceByTimeInCrossRegionRequest request = new CreateInstanceByTimeInCrossRegionRequest();
    request.setRegionId("cn-east-2");
    request.setServiceId("dbs-r1f13hdmp566");
    request.setRestoreTime("2020-01-07 15:28:00");
    RestoredNewDBInstanceSpec instanceSpec = new RestoredNewDBInstanceSpec();
    List<String> azids = new ArrayList<String>();
    azids.add("cn-east-2a");
    instanceSpec.setAzId(azids);
    instanceSpec.setInstanceClass("db.mysql.s1.micro");
    instanceSpec.setInstanceName("create_by_time");
    instanceSpec.setInstanceStorageGB(20);
    instanceSpec.setVpcId("vpc-gnfvijg2f5");
    instanceSpec.setSubnetId("subnet-1ai6vje8yt");
    ChargeSpec chargeSpec = new ChargeSpec();
    chargeSpec.setChargeMode("postpaid_by_duration");
    chargeSpec.setChargeUnit("month");
    chargeSpec.setChargeDuration(1);
    instanceSpec.setChargeSpec(chargeSpec);
    request.setInstanceSpec(instanceSpec);
    CreateInstanceByTimeInCrossRegionResponse response = rdsClient.createInstanceByTimeInCrossRegion(request);
    System.out.println(new Gson().toJson(response));
}

```

## Return Example
```
{
    "requestId": "bpa37b69ri3q6356vmhneif9mmwi781w", 
    "result": {
        "instanceId": "mysql-61wxkpl6oo"
    }
}
```
