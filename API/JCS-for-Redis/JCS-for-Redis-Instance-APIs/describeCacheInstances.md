# describeCacheInstances


## Description
The query of JCS for Redis instance list and its instance information can be the the paging query, query the specified page number, specify the size of page and the filter conditions

## Request method
GET

## Request address
https://redis.jdcloud-api.com/v1/regions/{regionId}/cacheInstance

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |The Region ID of the region where the JCS for Redis instance is located. At present, the JCS for Redis has North China, South China, and East China regions, and the corresponding Region IDs are cn-north-1, cn-south-1, and cn-east-2|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**filters**|Filter[]|False| |cacheInstanceId -cache instance Id can be matched exactly and support multiple<br>cacheInstanceName -cache instance name is matched fuzzily and support for a single<br>cacheInstanceStatus -the status of cache instance is matched exactly, and support multiple (running: run, error: error, creating: pending, changing: changing, deleting: deleting)<br>|
|**pageNumber**|Integer|False| |The page number of the query cache instance is 1 by default|
|**pageSize**|Integer|False| |The size of the page to query the cache instance is 20 by default and the value range is [10, 100]|
|**sorts**|Sort[]|False| |createTime - Creation Time (asc: Positive Order, desc: Inverted Order)<br>|

### Sort
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**direction**|String|False| |Direction of Sorting Requirements|
|**name**|String|False| |Name of Sorting Requirements|
### Filter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**name**|String|True| |Name of Filter Requirements|
|**operator**|String|False| |Operator of filter requirements is eq by default|
|**values**|String[]|True| |Value of Filter Requirements|

## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|ID of This Query Request|
|**result**|Result|The information result of querying the cache instance list|


### Result
|Name|Type|Description|
|---|---|---|
|**cacheInstances**|CacheInstance[]|The information to query the object cache instance.|
|**totalCount**|Integer|The total number of cache instances queried.|
### CacheInstance
|Name|Type|Description|
|---|---|---|
|**auth**|Boolean|With or Without Password|
|**azId**|AzId|Az Information|
|**cacheInstanceClass**|String|Instance specification code, refer to<a href='https://www.jdcloud.com/help/detail/411/isCatalog/1'>Instance Specification Code</a>|
|**cacheInstanceDescription**|String|Instance Description|
|**cacheInstanceId**|String|Instance ID|
|**cacheInstanceMemoryMB**|Integer|Capacity, Unit: MB|
|**cacheInstanceName**|String|Instance Name|
|**cacheInstanceStatus**|String|Instance status, running: running, error: error, creating: pending, changing: changing, deleting: deleting|
|**charge**|Charge|Billing Information|
|**connectionDomain**|String|Access to the Domain Name|
|**createTime**|String|Creation Time|
|**instanceVersion**|String|Instance Version|
|**port**|Integer|Port|
|**subnetId**|String|ID of Subnet|
|**vpcId**|String|ID of VPC|
### AzId
|Name|Type|Description|
|---|---|---|
|**master**|String|The availability zone ID of the region where the primary instance of the JCS for Redis is located|
|**slave**|String|The availability zone ID of the region where the secondary instance of the JCS for Redis is located|
### Charge
|Name|Type|Description|
|---|---|---|
|**chargeExpiredTime**|String|Expiration Time, i.e. the expiration time of Pay-In-Advance resource, which shall be subject to ISO8601, with the UTC time used in the format of YYYY-MM-DDTHH:mm:ssZ. Pay-As-You-Go resource field is blank.|
|**chargeMode**|String|Payment Model, the value shall be prepaid_by_duration, postpaid_by_usage or postpaid_by_duration; prepaid_by_duration refers to Pay-In-Advance; postpaid_by_usage refers to Pay By Consumption and Pay-As-You-Go; postpaid_by_duration refers to Pay By Configuration and Pay-As-You-Go, and is postpaid_by_duration by default|
|**chargeRetireTime**|String|The Expected Release Time refers to the expected release time of resources. This value is both available for the Pay-In-Advance/Pay-As-You-Go resources, conforming to the ISO8601 standard, with the UTC time used in the format of YYYY-MM-DDTHH:mm:ssZ|
|**chargeStartTime**|String|The start time of the billing shall be subject to ISO8601, with the UTC time used in the format of YYYY-MM-DDTHH:mm:ssZ|
|**chargeStatus**|String|Cost Payment Status, the value is respectively normal, overdue and arrear.|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
