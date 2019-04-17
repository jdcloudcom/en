# describeFwdGraph


## Description
Forwarding Traffic Report

## Request Method
GET

## Request Address
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/charts:fwdGraph

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**startTime**|String|True| |Start time, up to the latest 60 days can be queried, UTC time, format: yyyy-MM-dd'T'HH:mm:ssZ|
|**endTime**|String|True| |Query end time, UTC time, format: yyyy-MM-dd'T'HH:mm:ssZ|
|**instanceId**|Long[]|False| |Anti-DDoS Pro Instance Id List|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |
|**error**|Error| |

### Error
|Name|Type|Description|
|---|---|---|
|**code**|Integer|Request Error Status Code|
|**status**|String|Request Error Status Code|
|**message**|String|Request Error Notification|
### Result
|Name|Type|Description|
|---|---|---|
|**forwardRecord**|Double[]|Forwarding Traffic List|
|**time**|String[]|Time, format: yyyy-MM-dd'T'HH:mm:ssZ|
|**unit**|String|Traffic Unit, bps, Kbps, Mbps, Gbps|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
