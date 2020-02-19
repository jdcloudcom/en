# describeEdCPSRegions


## Description
Search region list of Distributed Cloud Physical Server

## Request Method
GET

## Request Address
https://edcps.jdcloud-api.com/v1/edgeRegions


## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](describeedcpsregions#result)| |
|**requestId**|String| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**regions**|[Region[]](describeedcpsregions#region)| |
### <div id="region">Region</div>
|Name|Type|Description|
|---|---|---|
|**region**|String|Region code, e.g. cn-east-tz1|
|**regionName**|String|Region name, cn-east-tz1|
|**azs**|[Az[]](describeedcpsregions#az)|Availability Zone List|
### <div id="az">Az</div>
|Name|Type|Description|
|---|---|---|
|**region**|String|Region code, e.g. cn-east-tz1|
|**az**|String|Availability zone, e.g. cn-east-tz1a|
|**azName**|String|Availability zone name|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Bad request|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
