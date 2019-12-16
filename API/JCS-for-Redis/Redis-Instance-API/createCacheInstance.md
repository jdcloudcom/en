# createCacheInstance


## Description
Create JCS for Redis Instance of the Specified Configuration


## Request method
POST

## Request address
https://redis.jdcloud-api.com/v1/regions/{regionId}/cacheInstance

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID of the region where the Redis instance is located. At present, there are three regions, with Region ID of cn-north-1, cn-south-1 and cn-east-2 respectively|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**cacheInstance**|[CacheInstanceSpec](#CacheInstanceSpec)|True| |Information designated when instances are created|
|**charge**|[ChargeSpec](#ChargeSpec)|False| |Instance Billing Type|

### <a name="ChargeSpec">ChargeSpec</a>
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**chargeMode**|String|False|postpaid_by_duration|Billing model value is prepaid_by_duration, postpaid_by_usage or postpaid_by_duration; prepaid_by_duration means Pay-In-Advance, postpaid_by_usage means Pay-As-You-Go By Consumption and postpaid_by_duration means pay by configuration; is postpaid_by_duration by default. Please refer to the Help Documentation of specific product line to confirm the billing type supported by the production line|
|**chargeUnit**|String|False| |Billing unit of Pay-In-Advance, the Pay-In-Advance is compulsory, and valid only when chargeMode is prepaid_by_duration, and the value is month or year and month by default|
|**chargeDuration**|Integer|False| |Pay-In-Advance billing duration, the Pay-In-Advance is compulsory and valid only when the value of chargeMode is prepaid_by_duration. When chargeUnit is month, the value shall be 1~9; when chargeUnit is year, the value shall be 1, 2 or 3|
|**autoRenew**|Boolean|False| |True=: OPEN——Enable automatic renewal, False=CLOSE—— Disable automatic renewal, with default value of CLOSE|
|**buyScenario**|String|False| |The unified activity credential, JSON character string, for the product line needs the BASE64 code. Now, the format required before coding is {"activity":{"activityType": required field, "activityIdentifier": required field}}|
### <a name="CacheInstanceSpec">CacheInstanceSpec</a>
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**vpcId**|String|True| |VPC ID of Redis Instance|
|**subnetId**|String|True| |Subnet ID of Redis Instance Under VPC|
|**cacheInstanceName**|String|True| |Redis instance name must be numbers, letters, English underline and Chinese, and cannot be less than 2 characters and no more than 32 characters|
|**cacheInstanceClass**|String|True| |For Redis instance specification code, please refer to https://docs.jdcloud.com/en/jcs-for-redis/specifications|
|**password**|String|False| |The null connection password of Redis instance means that no password is required, while the password can contain letters and numbers only, with no less than 8 characters and no more than 16 characters|
|**azId**|[AzIdSpec](#AzIdSpec)|True| |Availability zone ID of the region where the Redis instance is located|
|**cacheInstanceDescription**|String|False| |Description of Redis instance cannot exceed 256 characters|
|**redisVersion**|String|False| |Master and slave version numbers of supported Redis engine: At present, Versions 2.8 and 4.0 are supported and Version 2.8 is the default|
|**ipv6On**|Integer|False| |Whether IPv6 is supported, 0 or null value means that it is not supported and 1 means IPv6 is supported. Please note that IPv6 is not supported by every region|
### <a name="AzIdSpec">AzIdSpec</a>
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**master**|String|True| |Availability zone ID of the region where the master Redis instance is located|
|**slave**|String|True| |Availability zone ID of the region where the secondary Redis instance is located|

## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](#Result)|Result|
|**requestId**|String|ID of This Request|

### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**cacheInstanceId**|String|Instance ID|
|**orderNum**|String|Order Number|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
