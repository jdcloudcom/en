# describeLineTypes


## Description
Search link type list

## Request Method
GET

## Request Address
https://edcps.jdcloud-api.com/v1/regions/{regionId}/lineTypes

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID, calling APIs (describeEdCPSRegions) to get regions supported by Distributed Cloud Physical Server|

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
|**lineTypes**|[LineType[]](#linetype)| |
### <div id="LineType">LineType</div>
|Name|Type|Description|
|---|---|---|
|**lineType**|String|Link Type|
|**region**|String|Region|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Bad request|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
