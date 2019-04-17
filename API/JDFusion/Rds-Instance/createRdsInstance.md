# createRdsInstance


## Description
Create the RDS instance according to provided information

## Request Method
POST

## Request Address
https://jdfusion.jdcloud-api.com/v1/regions/{regionId}/rds_instances

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**instance**|CreateRDSInstance|True| |Create RDS Instance|
|**x-jdcloud-fusion-cloudid**|String|True| |Cloud Registration Information ID|

### CreateRDSInstance
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**azs**|String[]|False| |ID of Availability Zone|
|**cloudID**|String|False| |Provider ID of the Cloud|
|**engine**|String|True| |Type of Instance Engine|
|**engineVersion**|String|True| |Database Version Number|
|**id**|String|False| |RDS Instance ID|
|**instanceClass**|String|True| |Instance Type|
|**instanceType**|String|False| |Instance Type Family|
|**name**|String|False| |RDS Instance Name|
|**payType**|String|True| |Billing Information, prepaid\postpaid|
|**status**|String|False| |Instance Status|
|**storageGB**|Integer|True| |Disk Size, Unit: GB|
|**subnetId**|String|True| |Subnet ID|
|**vpcId**|String|True| |VPC ID|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**task**|ResourceTFInfo| |
### ResourceTFInfo
|Name|Type|Description|
|---|---|---|
|**body**|String|Request Body|
|**cloudId**|String|cloud ID|
|**createdTime**|String|Creation Time|
|**provider**|String|cloud provider|
|**result**|String|Execution Results|
|**status**|String|Status|
|**updateTime**|String|Update Time|
|**userId**|String|user ID|
|**uuid**|String|uuid|

## Return Code
|Return Code|Description|
|---|---|
|**202**|ACCEPTED|
