# queryPackageRemainder


## Description
Package balance, used for Pay-In-Advance users only

## Request Method
POST

## Request Address
https://rms.jdcloud-api.com/v2/regions/{regionId}/queryPackageRemainder

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True|cn-north-1|Region ID|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**data**|RespPackageResult|Response Data|
|**status**|Boolean|Request Status|
|**code**|String|Error Code|
|**message**|String|Error Message|
### RespPackageResult
|Name|Type|Description|
|---|---|---|
|**remainder**|Long|Remaining Entry Counts|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|INVALID_ARGUMENT|
|**500**|INTERNAL|
