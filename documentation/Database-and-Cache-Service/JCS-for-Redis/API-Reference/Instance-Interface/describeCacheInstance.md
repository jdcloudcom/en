# describeCacheInstance

Description: Query JCS for Redis instance details

- Request Method
```xml 
GET https://redis.jdcloud-api.com/v1/regions/{regionId}/cacheInstance/{cacheInstanceId}
```
Name|Type|Required or not|Default|Description
---|:--:|:--:|:--:|---:
cacheInstanceId|String|True||JCS for Redis instance ID
regionId|String|True||Region ID in the region where the JCS for Redis instance is located. At present, JCS for Redis includes North China, South China, and eastern China regions. The Region ID is cn-north-1, cn-south-1 and cn-east-2 respectively.

- Request Parameter<br>
None

- Return Parameter

Name|Type|Description
---|:--:|---:
cacheInstance|CacheInstance|
requestId|String|

- CacheInstance

Name|Type|Description
---|:--:|---:
azId|AzId|Az Information
cacheInstancStatus|String|Instance status: running: running, error: error, creating: creating, changing: charging, deleting: deleting
cacheInstanceClass|String|See Instance Type Code Table for Instance Type code
cacheInstanceDescription|String|Instance Description
cacheInstanceId|String|Instance ID
cacheInstanceMemoryMB|Integer|Capacity, Unit: MB
cacheInstanceName|String|Instance Name
charge|Charge|Billing Information
connectionDomain|String|Access Domain
createTime|String|Creation Time
port|Integer|Port
subnetId|String|ID of Subnet
vpcId|String|ID of VPC

- AzId

Name|Type|Description
---|:--:|---:
master|String|Availability Zone ID in the region where the JCS for Redis primary instance is located
slave|String|Availability Zone ID in the region where the Redis instance is located

- Charge

Name|Type|Description
---|:--:|---:
chargeExpiredTime|String|Expiration time, the expiration time of Pay-In-Advance resource shall follow the standard of ISO8601 and use UTC time with the format of YYYY-MM-DDTHH:mm:ssZ, Pay-As-You-Go resource field is blank
chargeMode|String|Payment Model, the value: prepaid_by_duration，postpaid_by_usage or postpaid_by_duration, prepaid_by_duration indicates Pay-In-Advance, postpaid_by_usage indicates Pay By Consumption, postpaid_by_duration indicates Pay-As-You-Go by configuration, with the default of postpaid_by_duration
chargeStartTime|String|The start time of billing shall follow the standard of ISO8601 and use the UTC time with the format of YYYY-MM-DDTHH:mm:ssZ
chargeStatus|String|Cost Payment Status, Value: normal, overdue and arrear

- Error Code

Error Code|Description
---|---:
200|OK
404|NOT_FOUND
