# describeInstanceName


## Description
Search name of Distributed Cloud Physical Server

## Request Method
GET

## Request Address
https://edcps.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}:describeInstanceName

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID, calling APIs (describeEdCPSRegions) to get regions supported by Distributed Cloud Physical Server|
|**instanceId**|String|True| |Distributed Cloud Physical Server ID|

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
|**name**|String|Name of Distributed Cloud Physical Server|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Bad request|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
