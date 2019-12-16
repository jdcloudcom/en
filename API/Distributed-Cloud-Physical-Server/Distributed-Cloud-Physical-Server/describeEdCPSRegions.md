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
|**result**|[Result](#result)| |
|**requestId**|String| |

### <div id="Result">Result</div>
|Name|Type|Description|
|---|---|---|
|**regions**|[Region[]](#region)| |
### <div id="Region">Region</div>
|Name|Type|Description|
|---|---|---|
|**region**|String|Region code, e.g. cn-east-tz1|
|**regionName**|String|Region name, cn-east-tz1|
|**azs**|[Az[]](#az)|Availability Zone List|
### <div id="Az">Az</div>
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
