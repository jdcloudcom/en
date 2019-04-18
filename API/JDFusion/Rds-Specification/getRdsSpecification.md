# getRdsSpecification


## Description
Get the specification of the RDS instance based on the database type

## Request Method
GET

## Request Address
https://jdfusion.jdcloud-api.com/v1/regions/{regionId}/rds_specification/{engine}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**engine**|String|True| |RDS Database Engine, which only supports mysql currently|
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
|**specifications**|RdsSpecification[]| |
### RdsSpecification
|Name|Type|Description|
|---|---|---|
|**instanceClass**|String|Specification and No.|
|**cpu**|Integer|CPU Core Number|
|**memoryGB**|Integer|Memory Size|
|**disk**|RdsSpecificationDisk| |
### RdsSpecificationDisk
|Name|Type|Description|
|---|---|---|
|**list**|Integer[]|Hard Disk Size List|
|**min**|Integer|Minimum Value of Hard Disk|
|**max**|Integer|Maximum Value of Hard Disk|

## Return Code
|Return Code|Description|
|---|---|
|**200**|ok|
