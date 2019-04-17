# describeAzs


## Description
View availability zones supported by various RDS databases in specified regions. The availability zones supported by RDS of different types are different

## Request Method
GET

## Request Address
https://rds.jdcloud-api.com/v1/regions/{regionId}/azs

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region code, see the value range in [Table of Comparisons of Regions and Availability Zones](../Enum-Definitions/Regions-AZ.md)|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**engine**|String|True| |For RDS engine types, please refer to [Enumeration Parameter Definition](../Enum-Definitions/Enum-Definitions.md)|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**azs**|String[]|List of Availability Zone ID|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
