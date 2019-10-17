# describeTde


## Description
View whether the current instance enables TDE

## Request Method
GET

## Request Address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/tde

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region code, see the value range in [Table of Comparisons of Regions and Availability Zones](../Enum-Definitions/Regions-AZ.md)|
|**instanceId**|String|True| |RDS Instance ID, the Unique Identifier of One RDS Instance|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**status**|String|Whether the current instance enables TDE function. If enabled, return to true; if not, return to false; if enabling, return to pending|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
