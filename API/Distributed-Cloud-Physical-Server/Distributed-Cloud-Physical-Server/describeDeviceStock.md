# describeDeviceStock


## Description
Search inventory of Distributed Cloud Physical Server

## Request Method
GET

## Request Address
https://edcps.jdcloud-api.com/v1/regions/{regionId}/deviceStock

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID, calling APIs (describeEdCPSRegions) to get regions supported by Distributed Cloud Physical Server|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**deviceType**|String|False| |Instance type, call the API (describeDeviceTypes) to obtain instance type|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](describedevicestock#result)| |
|**requestId**|String| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**devicesStock**|[ResourceStock[]](describedevicestock#resourcestock)| |
### <div id="resourcestock">ResourceStock</div>
|Name|Type|Description|
|---|---|---|
|**deviceType**|String|Instance type family, e.g. edcps.c.normal1|
|**region**|String|Region code, e.g. cn-east-tz1|
|**available**|Integer|Available Inventory|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Bad request|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
