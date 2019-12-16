# describeCacheInstance


## Description
Search detailed information of Redis instances

## Request method
GET

## Request address
https://redis.jdcloud-api.com/v1/regions/{regionId}/cacheInstance/{cacheInstanceId}

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID of the region where the Redis instance is located. At present, there are three regions, with Region ID of cn-north-1, cn-south-1 and cn-east-2 respectively|
|**cacheInstanceId**|String|True| |Redis instance ID is the only identifier for instance access|

## Request parameter
None


## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](#Result)|Result|
|**requestId**|String|ID of This Request|

### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**cacheInstance**|[CacheInstance](#CacheInstance)|For detailed information of the instance’s|
### <a name="CacheInstance">CacheInstance</a>
|Name|Type|Description|
|---|---|---|
|**cacheInstanceId**|String|Instance ID|
|**cacheInstanceName**|String|Instance Name|
|**cacheInstanceClass**|String|specification code, please refer to https://docs.jdcloud.com/en/jcs-for-redis/specifications|
|**cacheInstanceMemoryMB**|Integer|Total Instance Memory (MB)|
|**cacheInstanceStatus**|String|Instance status: creating means that the instance is creating, running means that the instance is running, error refers to the instance error, changing means that the specification is changing, deleting means that the instance is deleting, configuring means that the parameter is modifying and restoring means that the backup is restoring|
|**cacheInstanceDescription**|String|Instance Description|
|**createTime**|String|Creation Time (UTC time of ISO 8601 standard, in format of YYYY-MM-DDTHH:mm:ssZ)|
|**azId**|[AzId](#AzId)|az Information|
|**vpcId**|String|ID of VPC|
|**subnetId**|String|ID of Subnet|
|**connectionDomain**|String|Access to the Domain Name|
|**port**|Integer|Port|
|**charge**|[Charge](#Charge)|Billing Information|
|**instanceVersion**|String|Detailed instance version number, such as x.x-x.x|
|**auth**|Boolean|If password verification is required when connecting redis instances and false refers no password is set|
|**redisVersion**|String|redis engine version selected when creating instance: At present, versions 2.8 and 4.0 are supported|
|**cacheInstanceType**|String|Instance Type Family: master-slave means the master-slave version and cluster means the cluster version|
|**ipv6On**|Integer|Whether IPv6 is supported, 0 means that it is not supported (with IPv4 available only) and 1 means it is supported|
|**tags**|[Tag[]](#Tag)|Tag Information|
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
### <a name="AzId">AzId</a>
|Name|Type|Description|
|---|---|---|
|**master**|String|Availability zone ID of the region where the master Redis instance is located|
|**slave**|String|Availability zone ID of the region where the slave Redis instance is located|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
