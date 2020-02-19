# modifyInstance


## Description
Modify partial information of Distributed Cloud Physical Server, including name and description

## Request Method
POST

## Request Address
https://edcps.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}:modifyInstance

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID, calling APIs (describeEdCPSRegions) to get regions supported by Distributed Cloud Physical Server|
|**instanceId**|String|True| |Distributed Cloud Physical Server ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|False| |Name of Distributed Cloud Physical Server|
|**description**|String|False| |Description of Distributed Cloud Physical Server|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](modifyinstance#result)| |
|**requestId**|String| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**name**|String|Name of Distributed Cloud Physical Server|
|**description**|String|Description of Distributed Cloud Physical Server|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Bad request|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
