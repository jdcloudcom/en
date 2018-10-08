# createCacheInstance

Description: Create a JCS for Redis instance with specified configuration

- Request Method

```xml 
POST https://redis.jdcloud-api.com/v1/regions/{regionId}/cacheInstance
``` 

Name|Type|Required or not |Default| Description
---|:--:|:--:|:--:|---:
regionId|String|True||Region ID in the region where the JCS for Redis instance is located. At present, JCS for Redis includes North China, South China, and eastern China regions. The Region ID is cn-north-1, cn-south-1 and cn-east-2 respectively.

- Request Parameter

Name|Type|Required or not|Default|Description
---|:--:|:--:|:--:|---:
cacheInstance|CacheInstanceSpec|True||
charge|ChargeSpec|False||


CacheInstanceSpec

Name|Type|Required or not|Default|Description
---|:--:|:--:|:--:|---:
azId|AzIdSpec|True||Availability Zone ID information in the region where the JCS for Redis instance is located
cacheInstanceClass|String|True||See Instance Type Code Table for Instance Type code.
cacheInstanceDescription|String|False||JCS for Redis Instance Description
cacheInstanceName|String|True||Instance name can only be numbers, letters, English underline and Chinese, and shall not be less than 2 characters or more than 32 characters
password|String|True||Password must include and can only be letters and numbers, and shall not be less than 8 characters and not more than 16 characters.
subnetId|String|True||ID of subnet
vpcId|String|True||ID of VPC

AzIdSpec

Name|Type|Required or not|Default|Description
---|:--:|:--:|:--:|---:
master|String|False||Availability Zone ID in the region where primary JCS for Redis instance is located
slave|String|False||Availability Zone ID in the region where JCS for Redis secondary instance is located

ChargeSpec

Name|Type|Required or not|Default|Description
---|:--:|:--:|:--:|---:
chargeDuration|Integer|False||Pay-In-Advance billing hours, when chargeMode is taken with prepaid_by_duration, it is valid. When chargeUnit is month, the value shall be taken as: 1~9; when chargeUnit is year, the value shall be taken as: 1, 2 and 3
chargeMode|String|False|postpaid_by_duration|Billing model, the value shall be: prepaid_by_duration, postpaid_by_usage or postpaid_by_duration, prepaid_by_duration indicates Pay-In-Advance; postpaid_by_usage indicates Pay By Configuration and Pay-As-You-Go, with the default of postpaid_by_duration
chargeUnit|String|False||Pay-In-Advance billing unit, it is valid when chargeMode is prepaid_by_duration; the value is month, year, with the default of month

- Return Parameter

Name|Type|Description
---|:--:|---:
requestId|String|
result|Result|

Result

Name|Type|Description
---|:--:|---:
cacheInstanceId|String|
orderNum|String|

Error Code

Error Code|Description
---|---:
200|OK
