# getRdsByInstId


## Description
Search the RDS instance information with designated ID

## Request Method
GET

## Request Address
https://jdfusion.jdcloud-api.com/v1/regions/{regionId}/rds_instances/{instId}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**instId**|String|True| |RDS Instance ID|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**x-jdcloud-fusion-cloudid**|String|False| |Cloud Registration Information ID|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|Request ID|

### Result
|Name|Type|Description|
|---|---|---|
|**instance**|RdsInstanceDetailInfo| |
### RdsInstanceDetailInfo
|Name|Type|Description|
|---|---|---|
|**id**|String|RDS Instance ID|
|**name**|String|RDS Instance Name|
|**azs**|String[]|ID of Availability Zone|
|**engine**|String|Type of Instance Engine|
|**engineVersion**|String|Instance Engine Version|
|**status**|String|Instance Status|
|**payType**|String|Payment Method, Postpaid: Pay-As-You-Go; Prepaid: Pay-In-Advance|
|**storageGB**|Integer|Disk, Unit: GB|
|**memoryMB**|Double|Memory Size, Unit: MB|
|**instanceType**|String|Instance Type Family|
|**instanceClassType**|String|Instance Type|
|**connectionMode**|String|Access Mode of Instance|
|**connectionString**|String|Connection Address|
|**instanceCPU**|Integer|CPU core number|
|**port**|String|Port|
|**vpcId**|String|VPC ID|
|**subnetId**|String|subnet ID|
|**cloudID**|String|Provider ID of the Cloud|

## Return Code
|Return Code|Description|
|---|---|
|**200**|ok|
|**404**|RDS instance not found|
