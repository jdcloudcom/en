# describeCacheInstances


## Description
Search Redis instance list, with available functions such as paging, ranking, search and filter

## Request method
GET

## Request address
https://redis.jdcloud-api.com/v1/regions/{regionId}/cacheInstance

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID of the region where the Redis instance is located. At present, there are three regions, with Region ID of cn-north-1, cn-south-1 and cn-east-2 respectively|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False| |Page: The value range is [1,∞) and the default value is 1|
|**pageSize**|Integer|False| |Paging size: The value range is [10, 100] and the default value is 10|
|**filters**|Filter[]|False| |Filter attribute: <br>cacheInstanceId - Instance Id, exact match, with multiple instance Ids selectable<br>cacheInstanceName - Instance name, fuzzy match<br>cacheInstanceStatus - Instance status, exact match, with several statuses selectable (running: instance is running, error: the instance is wrong, creating: the instance is creating, changing: configuration is changing, configuring: parameter is modifying, restoring: backup is restoring, deleting: instance is deleting)<br>redisVersion - redis engine version, exact match, with versions 2.8 and 4.0 available<br>instanceType - Instance Type Family, exact match (redis means the master-slave version and redis_cluster means the cluster version)<br>chargeMode - Billing type, exact match (prepaid_by_duration means Pay-In-Advance of Monthly Package, while postpaid_by_duration means Pay-As-You-Go by configuration)<br>|
|**sorts**|Sort[]|False| |Ranking attribute: <br>createTime - Rank according to creation time (asc means the ascending order, while desc means the descending order)<br>|
|**tagFilters**|TagFilter[]|False| |Tag Filter Requirements|

### TagFilter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**key**|String|True| |Tag Key|
|**values**|String[]|True| |Tag Value|
### Sort
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**name**|String|False| |Name of Sorting Requirements|
|**direction**|String|False| |Direction of Sorting Requirements|
### Filter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**name**|String|True| |Name of Filter Requirements|
|**operator**|String|False| |Operator of filter requirements is eq by default|
|**values**|String[]|True| |Value of Filter Requirements|

## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result|Result|
|**requestId**|String|ID of This Request|

### Result
|Name|Type|Description|
|---|---|---|
|**cacheInstances**|CacheInstance[]|Instance List After Paging|
|**totalCount**|Integer|Total Instance Count|
### CacheInstance
|Name|Type|Description|
|---|---|---|
|**cacheInstanceId**|String|Instance ID|
|**cacheInstanceName**|String|Instance Name|
|**cacheInstanceClass**|String|specification code, please refer to https://docs.jdcloud.com/en/jcs-for-redis/specifications|
|**cacheInstanceMemoryMB**|Integer|Total Instance Memory (MB)|
|**cacheInstanceStatus**|String|Instance status: creating means that the instance is creating, running means that the instance is running, error refers to the instance error, changing means that the specification is changing, deleting means that the instance is deleting, configuring means that the parameter is modifying and restoring means that the backup is restoring|
|**cacheInstanceDescription**|String|Instance Description|
|**createTime**|String|Creation Time (UTC time of ISO 8601 standard, in format of YYYY-MM-DDTHH:mm:ssZ)|
|**azId**|AzId|Az Information|
|**vpcId**|String|ID of VPC|
|**subnetId**|String|ID of Subnet|
|**connectionDomain**|String|Access to the Domain Name|
|**port**|Integer|Port|
|**charge**|Charge|Billing Information|
|**instanceVersion**|String|Detailed instance version number, such as x.x-x.x|
|**auth**|Boolean|If password verification is required when connecting redis instances and false refers no password is set|
|**redisVersion**|String|redis engine version selected when creating instance: At present, versions 2.8 and 4.0 are supported|
|**cacheInstanceType**|String|Instance Type Family: master-slave means the master-slave version and cluster means the cluster version|
|**ipv6On**|Integer|Whether IPv6 is supported, 0 means that it is not supported (with IPv4 available only) and 1 means it is supported|
|**tags**|Tag[]|Tag Information|
### Tag
|Name|Type|Description|
|---|---|---|
|**key**|String|Tag Key|
|**value**|String|Tag Value|
### Charge
|Name|Type|Description|
|---|---|---|
|**chargeMode**|String|Payment Model, the value shall be prepaid_by_duration, postpaid_by_usage or postpaid_by_duration; prepaid_by_duration refers to Pay-In-Advance; postpaid_by_usage refers to Pay By Consumption and Pay-As-You-Go; postpaid_by_duration refers to Pay By Configuration and Pay-As-You-Go, and is postpaid_by_duration by default|
|**chargeStatus**|String|Cost Payment Status, the value is respectively normal, overdue and arrear.|
|**chargeStartTime**|String|The start time of the billing shall be subject to ISO8601, with the UTC time used in the format of YYYY-MM-DDTHH:mm:ssZ|
|**chargeExpiredTime**|String|Expiration Time, i.e. the expiration time of Pay-In-Advance resource, which shall be subject to ISO8601, with the UTC time used in the format of YYYY-MM-DDTHH:mm:ssZ. Pay-As-You-Go resource field is blank.|
|**chargeRetireTime**|String|The Expected Release Time refers to the expected release time of resources. This value is both available for the Pay-In-Advance/Pay-As-You-Go resources, conforming to the ISO8601 standard, with the UTC time used in the format of YYYY-MM-DDTHH:mm:ssZ|
### AzId
|Name|Type|Description|
|---|---|---|
|**master**|String|Availability zone ID of the region where the master Redis instance is located|
|**slave**|String|Availability zone ID of the region where the slave Redis instance is located|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
