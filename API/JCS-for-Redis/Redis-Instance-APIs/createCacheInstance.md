# createCacheInstance


## Description
Create Redis Instance of the Specified Configuration
Specification Performance: The specifications for creating the Redis instance are divided into two versions: principal-subordinate version and cluster version. Each specification has the maximum number of connections, the limit of internal network bandwidth, CPU processing capacity, specification code and other information, please see: <a href="https://www.jdcloud.com/help/detail/411/ isCatalog/1">instance type code</a>
Availability Zone: Available zone is a physical zone in which the infrastructure such as power and network are independent of each other in the same region. A zone contains one or more availability zones, and multiple availability zones in the same region can be connected to each other. Detailed information on the geographical availability zone can be found: <a href="https://www.jdcloud.com/help/detail/2222/isCatalog/1">Regional availability zone details</a>
Virtual Private Cloud: referred to as VPC,which means the isolation network space with customized logic and supports for customized network segment, rout policy, etc. Specific information can be found: <a href="https://www.jdcloud.com/help/detail/1509/isCatalog/1">Virtual private cloud</a>
Subnet: The subnet is the IP address block in the range of the VPC IP address, which is subnet for short. The subnet is created under the VPC. The segment in the same VPC cannot overlap and the segments of different VPCs can overlap. Specific information can be found: <a href="https://www.jdcloud.com/help/detail/1510/isCatalog/1">subnet details</a>


## Request method
POST

## Request address
https://redis.jdcloud-api.com/v1/regions/{regionId}/cacheInstance

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True||The Region ID of the region where the Redis instance is located. At present, the Redis has North China, South China, and East China regions, and the corresponding Region IDs are cn-north-1, cn-south-1, and cn-east-2|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**cacheInstance**|CacheInstanceSpec|True||Creates a specific attribute of the cache instance, including the virtual private cloud ID (vpcId), subnet ID (subnetId), cache instance name, cache instance type, cache instance password, the description of ID information of the availability zone where the cache instance is located and cache instance.|
|**charge**|ChargeSpec|False||Billing Information Related Configuration.|

### <a name="CacheInstanceSpec">CacheInstanceSpec</a>
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**azId**|AzIdSpec|True||The ID information of the availability zone of the region where the Redis instance is located|
|**cacheInstanceClass**|String|True||For redis instance type code, see code table of instance type<a href="https://www.jdcloud.com/help/detail/411/isCatalog/1">instance type code</a>.|
|**cacheInstanceDescription**|String|False||The description of the Redis instance can not be more than 256 characters|
|**cacheInstanceName**|String|True||The name of the redis instance only supports numbers, letters, underlines, Chinese, no less than 2 characters and no more than 32 characters|
|**password**|String|False||Password contains and only supports letters and numbers with no less than 8 characters and no more than 16 characters. If the password is null, it means password-free.|
|**subnetId**|String|True||The subnet ID of the redis instance under the  virtual private cloud|
|**vpcId**|String|True||The virtual private cloud ID to which the redis instance belongs|
### <a name="AzIdSpec">AzIdSpec</a>
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**master**|String|False||The availability zone ID of the region where the primary instance of the Redis is located|
|**slave**|String|False||The availability zone ID of the region where the secondary instance of the Redis is located|
### <a name="ChargeSpec">ChargeSpec</a>
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**chargeDuration**|Integer|False||Pay-In-Advance billing duration, the Pay-In-Advance is compulsory and valid only when the value of chargeMode is prepaid_by_duration. When chargeUnit is month, the value shall be 1~9; when chargeUnit is year, the value shall be 1, 2 or 3|
|**chargeMode**|String|False|postpaid_by_duration|Billing model value is prepaid_by_duration, postpaid_by_usage or postpaid_by_duration; prepaid_by_duration means Pay-In-Advance, postpaid_by_usage means Pay-As-You-Go By Consumption and postpaid_by_duration means pay by configuration; is postpaid_by_duration by default. Please refer to the Help Documentation of specific product line to confirm the billing type supported by the production line|
|**chargeUnit**|String|False||Billing unit of Pay-In-Advance, the Pay-In-Advance is compulsory, and valid only when chargeMode is prepaid_by_duration, and the value is month or year and month by default|

## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|ID of This Query Request.|
|**result**|Result||


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**cacheInstanceId**|String|ID of the Cache Instance Created.|
|**orderNum**|String|The order number generated by creating the cache instance.|

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
