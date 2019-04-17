# getRdsInstances


## Description
Search corresponding RDS instance information according to the cloud providers

## Request Method
GET

## Request Address
https://jdfusion.jdcloud-api.com/v1/regions/{regionId}/rds_instances

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**x-jdcloud-fusion-cloudid**|String|False| |Cloud Registration Information ID|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**instances**|RdsInstanceDetailInfo[]| |
### RdsInstanceDetailInfo
|Name|Type|Description|
|---|---|---|
|**azs**|String[]|ID of Availability Zone|
|**cloudID**|String|Provider ID of the Cloud|
|**connectionMode**|String|Access Mode of Instance|
|**connectionString**|String|Connection Address|
|**engine**|String|Type of Instance Engine|
|**engineVersion**|String|Instance Engine Version|
|**id**|String|RDS Instance ID|
|**instanceCPU**|Integer|CPU core number|
|**instanceClassType**|String|Instance Type|
|**instanceType**|String|Instance Type Family|
|**memoryMB**|Double|Memory Size, Unit: MB|
|**name**|String|RDS Instance Name|
|**payType**|String|Payment Method, Postpaid: Pay-As-You-Go; Prepaid: Pay-In-Advance|
|**port**|String|Port|
|**status**|String|Instance Status|
|**storageGB**|Integer|Disk, Unit: GB|
|**subnetId**|String|subnet ID|
|**vpcId**|String|VPC ID|

## Return Code
|Return Code|Description|
|---|---|
|**200**|ok|
