# describeCacheInstances

Description: query Redis Instance List

- Request Method

```xml 
GET https://redis.jdcloud-api.com/v1/regions/{regionId}/cacheInstance
```

Name|type|required or not|default|description
---|:--:|:--:|:--:|---:
regionId|String|True||Region ID in the region where the Redis instance is located. At present, Redis includes North China, South China, and eastern China regions. The Region ID is cn-north-1, cn-south-1 and cn-east-2 respectively.

- Request Parameter

Name|type|required or not|default|description
---|:--:|:--:|:--:|---:
filters|Filter[]|False||cacheInstanceId -instanceId, accurate matching and multiple accepted; cacheInstanceName - instance name, fuzzy matching and singe accepted; cacheInstanceStatus - redis status, accurate matching and multiple accepted (running, error, creating, changing, deleting)
pageNumber|Integer|False||	page; 1 by default
pageSize|Integer|False||Page size; 20 by default; value range[10, 100]
sorts	|Sort[]	|False	||	createTime - Creation Time (asc: ascending, desc: descending)

Sort

Name|type|required or not|default|description
---|:--:|:--:|:--:|---:
direction|String|False||Direction of sorting requirements
name|String|False||Name of sorting requirements

Filter

Name|type|required or not|default|description
---|:--:|:--:|:--:|---:
name|String|	True|	|	Name of filter requirements
operator|	String	|False	||	Operator of filter requirements is eq by default
values|	String[]	|True||		Value of filter requirements

- Return Parameter

Name|Type|Description
---|:--:|---:
requestId|	String	|
result|	Result|	

Result

Name|Type|	Description
---|:--:|---:
cacheInstances|	CacheInstance[]	|
totalCount|	Integer	|

CacheInstance

Name|Type	|Description
---|:--:|---:
azId	|AzId	|az information
cacheInstancStatus|	String	|Instance status, running, error, creating, changing, deleting
cacheInstanceClass	|String	|See Instance Type Code Table for Instance Type code.
cacheInstanceDescription|	String|	Instance description
cacheInstanceId	|String|	InstanceID
cacheInstanceMemoryMB	|Integer|	Capacity, in MB
cacheInstanceName	|String	|Instance Name
charge	|Charge	|Billing Information
connectionDomain|	String	|Access Domain
createTime|	String	|Creation Time
port|	Integer	|Port
subnetId	|String	|ID of Subnet
vpcId	|String	|ID of VPC

AzId

Name|Type|Description
---|:--:|---:
master|String|Availability Zone ID in the region where primary Redis instance is located
slave	|String	|Availability Zone ID in the region where Redis instance is located

Charge

Name|Type|Description
---|:--:|---:
chargeExpiredTime	|String	|expiration time, the expiration time of Pay-In-Advance resource shall follow the standard of ISO8601 and use UTC time with the format of YYYY-MM-DDTHH:mm:ssZ, Pay-As-You-Go resource field is blank
chargeMode	|String	|Payment model, the value shall be: prepaid_by_duration，postpaid_by_usage or postpaid_by_duration, prepaid_by_duration indicates Pay-In-Advance; postpaid_by_usage indicates Pay By Consumption and postpaid_by_duration indicates  Pay-As-You-Go by configuration, with the default of postpaid_by_duration
chargeStartTime	|String	|The start time of the billing shall follow the standard of ISO8601 and use the UTC time with the format of YYYY-MM-DDTHH:mm:ssZ
chargeStatus|	String	|Cost payment status, the value is respectively normal, overdue and arrear.

- Error Code

Error Code|Description
---|---:
200|	OK
