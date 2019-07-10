# describeProtectionOutline


## Description
Protection Information Summary of Protection Package

## Request Method
GET

## Request Address
https://antipro.jdcloud-api.com/v1/describeProtectionOutline


## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |
|**error**|Error| |

### Error
|Name|Type|Description|
|---|---|---|
|**err**|Err| |
### Err
|Name|Type|Description|
|---|---|---|
|**code**|Long|Same as http code|
|**details**|Object| |
|**message**|String| |
|**status**|String|Specific Error|
### Result
|Name|Type|Description|
|---|---|---|
|**data**|ProtectionOutline| |
### ProtectionOutline
|Name|Type|Description|
|---|---|---|
|**protectedDay**|Long|Protection Day|
|**protectedIpCount**|Long|Protected IP Counts|
|**weekAttackCount**|Long|7-day Attack Counts|
|**weekAttackPeak**|Double|7-day Attack Traffic Peak Value|
|**weekAttackUnit**|String|7-day Attack Traffic Unit|
|**monthAttackCount**|Long|30-day Attack Counts|
|**monthAttackPeak**|Double|30-day Attack Traffic Peak Value|
|**monthAttackUnit**|String|30-day Attack Traffic Unit|
|**currentAttackCount**|Long|Current Attack Amount|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
