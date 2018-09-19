# describeCacheInstance


## Description
The details of querying a single Redis instance

## Request method
GET

## Request address
https://redis.jdcloud-api.com/v1/regions/{regionId}/cacheInstance/{cacheInstanceId}

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**cacheInstanceId**|String|True||The ID of the Redis instance is the unique identifier to access to instance.|
|**regionId**|String|True||The Region ID of the region where the Redis instance is located. At present, the Redis has North China, South China, and East China regions, and the corresponding Region IDs are cn-north-1, cn-south-1, and cn-east-2|

## Request parameter
None


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|ID of This Query Request|
|**result**|Result|The information result of querying the cache instance list|


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**cacheInstance**|CacheInstance|The information to query the object cache instance|
### <a name="CacheInstance">CacheInstance</a>
|Name|Type|Description|
|---|---|---|
|**azId**|AzId|az Information|
|**cacheInstanceClass**|String|For instance type code, see <a href="https://www.jdcloud.com/help/detail/411/isCatalog/1">instance type code</a>|
|**cacheInstanceDescription**|String|Instance Description|
|**cacheInstanceId**|String|Instance ID|
|**cacheInstanceMemoryMB**|Integer|Capacity, in MB|
|**cacheInstanceName**|String|Instance Name|
|**cacheInstanceStatus**|String|Instance status, running: running, error: error, creating: pending, changing: changing, deleting: deleting|
|**charge**|Charge|Billing Information|
|**connectionDomain**|String|Access to the domain name|
|**createTime**|String|Creation Time|
|**instanceVersion**|String|Instance Version|
|**port**|Integer|Port|
|**subnetId**|String|ID of Subnet|
|**vpcId**|String|ID of VPC|
### <a name="AzId">AzId</a>
|Name|Type|Description|
|---|---|---|
|**master**|String|The availability zone ID of the region where the primary instance of the Redis is located|
|**slave**|String|The availability zone ID of the region where the secondary instance of the Redis is located|
### <a name="Charge">Charge</a>
|Name|Type|Description|
|---|---|---|
|**chargeExpiredTime**|String|Expiration time, i.e. the expiration time of Pay-In-Advance resource, which shall be subject to ISO8601, with the UTC time used in the format of YYYY-MM-DDTHH:mm:ssZ. Pay-As-You-Go resource field is blank.|
|**chargeMode**|String|Payment model, the value shall be prepaid_by_duration, postpaid_by_usage or postpaid_by_duration; prepaid_by_duration refers to Pay-In-Advance; postpaid_by_usage refers to Pay By Consumption and Pay-As-You-Go; postpaid_by_duration refers to Pay By Configuration and Pay-As-You-Go, and is postpaid_by_duration by default|
|**chargeRetireTime**|String|The expected release time refers to the expected release time of resources. This value is both available for the Pay-In-Advance/Pay-As-You-Go resources, conforming to the ISO8601 standard, with the UTC time used in the format of YYYY-MM-DDTHH:mm:ssZ|
|**chargeStartTime**|String|The start time of the billing shall be subject to ISO8601, with the UTC time used in the format of YYYY-MM-DDTHH:mm:ssZ|
|**chargeStatus**|String|Cost payment status, the value is respectively normal, overdue and arrear.|

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
