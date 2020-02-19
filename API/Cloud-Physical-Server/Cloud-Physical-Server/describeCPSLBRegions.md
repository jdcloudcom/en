# describeCPSLBRegions


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
|**result**|[Result](describecpslbregions#result)| |
|**requestId**|String| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**regions**|[Region[]](describecpslbregions#region)| |
### <div id="region">Region</div>
|Name|Type|Description|
|---|---|---|
|**region**|String|Region Code, e.g. cn-east-1|
|**regionName**|String|Region Name, such as cn-east-1|
|**azs**|[Az[]](describecpslbregions#az)|Availability Zone List|
### <div id="az">Az</div>
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
