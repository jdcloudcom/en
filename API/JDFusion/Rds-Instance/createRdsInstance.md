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
|**x-jdcloud-fusion-cloudid**|String|True| |Cloud Registration Information ID|
|**instance**|CreateRDSInstance|True| |Create RDS Instance|

### CreateRDSInstance
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**id**|String|False| |RDS Instance ID|
|**name**|String|False| |RDS Instance Name|
|**payType**|String|True| |Billing Information, prepaid\postpaid|
|**azs**|String[]|False| |ID of Availability Zone|
|**engine**|String|True| |Type of Instance Engine|
|**status**|String|False| |Instance Status|
|**instanceType**|String|False| |Instance Type Family|
|**cloudID**|String|False| |Provider ID of the Cloud|
|**engineVersion**|String|True| |Database Version Number|
|**instanceClass**|String|True| |Instance Type|
|**storageGB**|Integer|True| |Disk Size, Unit: GB|
|**vpcId**|String|True| |VPC ID|
|**subnetId**|String|True| |Subnet ID|
|**createTime**|String|False| |Creation Time|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|Request ID|

### Result
|Name|Type|Description|
|---|---|---|
|**task**|ResourceTFInfo| |
### ResourceTFInfo
|Name|Type|Description|
|---|---|---|
|**uuid**|String|uuid|
|**body**|String|Request Body|
|**status**|String|Status|
|**result**|String|Execution Results|
|**createdTime**|String|Creation Time|
|**updateTime**|String|Update Time|
|**provider**|String|cloud provider|
|**cloudId**|String|cloud ID|
|**userId**|String|user ID|

## Return Code
|Return Code|Description|
|---|---|
|**202**|ACCEPTED|
