# describeCacheInstances


## 描述
The query of Redis instance list and its instance information can be the the paging query, query the specified page number, specify the size of page and the filter conditions

## 请求方式
GET

## 请求地址
https://redis.jdcloud-api.com/v1/regions/{regionId}/cacheInstance

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True||The Region ID of the region where the Redis instance is located. At present, the Redis has North China, South China, and East China regions, and the corresponding Region IDs are cn-north-1, cn-south-1, and cn-east-2|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**filters**|[Filter[]](##Filter)|False||cacheInstanceId -cache instance Id can be matched exactly and support multiple<br>cacheInstanceName -cache instance name is matched fuzzily and support for a single<br>cacheInstanceStatus -the status of cache instance is matched exactly, and support multiple (running: run, error: error, creating: pending, changing: changing, deleting: deleting)<br>|
|**pageNumber**|Integer|False||The page number of the query cache instance is 1 by default|
|**pageSize**|Integer|False||The size of the page to query the cache instance is 20 by default and the value range is [10, 100]|
|**sorts**|[Sort[]](##Sort)|False||createTime - Create Time (asc: positive order, desc: inverted order)<br>|

### <a name="Sort">Sort</a>
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**direction**|String|False||Direction of sorting requirements|
|**name**|String|False||Name of sorting requirements|
### <a name="Filter">Filter</a>
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**name**|String|True||Name of filter requirements|
|**operator**|String|False||Operator of filter requirements is eq by default|
|**values**|String[]|True||Value of filter requirements|

## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String|ID of This Query Request|
|**result**|[Result](##Result)|The information result of querying the cache instance list|


### <a name="Result">Result</a>
|名称|类型|描述|
|---|---|---|
|**cacheInstances**|[CacheInstance[]](##CacheInstance)|The information to query the object cache instance.|
|**totalCount**|Integer|The total number of cache instances queried.|
### <a name="CacheInstance">CacheInstance</a>
|名称|类型|描述|
|---|---|---|
|**azId**|[AzId](##AzId)|az Information|
|**cacheInstanceClass**|String|实例规格代码，参见<a href="https://www.jdcloud.com/help/detail/411/isCatalog/1">实例规格代码</a>|
|**cacheInstanceDescription**|String|Instance Description|
|**cacheInstanceId**|String|Instance ID|
|**cacheInstanceMemoryMB**|Integer|Capacity, in MB|
|**cacheInstanceName**|String|Instance Name|
|**cacheInstanceStatus**|String|Instance status, running: running, error: error, creating: pending, changing: changing, deleting: deleting|
|**charge**|[Charge](##Charge)|Billing Information|
|**connectionDomain**|String|Access to the domain name|
|**createTime**|String|Creation Time|
|**instanceVersion**|String|Instance Version|
|**port**|Integer|Port|
|**subnetId**|String|ID of Subnet|
|**vpcId**|String|ID of VPC|
### <a name="AzId">AzId</a>
|名称|类型|描述|
|---|---|---|
|**master**|String|The availability zone ID of the region where the primary instance of the Redis is located|
|**slave**|String|The availability zone ID of the region where the secondary instance of the Redis is located|
### <a name="Charge">Charge</a>
|名称|类型|描述|
|---|---|---|
|**chargeExpiredTime**|String|Expiration time, i.e. the expiration time of Pay-In-Advance resource, which shall be subject to ISO8601, with the UTC time used in the format of YYYY-MM-DDTHH:mm:ssZ. Pay-As-You-Go resource field is blank.|
|**chargeMode**|String|Payment model, the value shall be prepaid_by_duration, postpaid_by_usage or postpaid_by_duration; prepaid_by_duration refers to Pay-In-Advance; postpaid_by_usage refers to Pay By Consumption and Pay-As-You-Go; postpaid_by_duration refers to Pay By Configuration and Pay-As-You-Go, and is postpaid_by_duration by default|
|**chargeRetireTime**|String|The expected release time refers to the expected release time of resources. This value is both available for the Pay-In-Advance/Pay-As-You-Go resources, conforming to the ISO8601 standard, with the UTC time used in the format of YYYY-MM-DDTHH:mm:ssZ|
|**chargeStartTime**|String|The start time of the billing shall be subject to ISO8601, with the UTC time used in the format of YYYY-MM-DDTHH:mm:ssZ|
|**chargeStatus**|String|Cost payment status, the value is respectively normal, overdue and arrear.|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
