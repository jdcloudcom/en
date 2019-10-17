# queryCPSLBRegions


## Description
Search Load Balancer region list

## Request Method
GET

## Request Address
https://cps.jdcloud-api.com/v1/cpslbRegions


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
|**regions**|Region[]| |
### Region
|Name|Type|Description|
|---|---|---|
|**region**|String|Region Code, e.g. cn-east-1|
|**regionName**|String|Region Name, such as cn-east-1|
|**azs**|Az[]|Availability Zone List|
### Az
|Name|Type|Description|
|---|---|---|
|**region**|String|Region Code, e.g. cn-east-1|
|**az**|String|Availability Zone Code, such as cn-east-1a|
|**azName**|String|Availability zone name|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Bad request|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
