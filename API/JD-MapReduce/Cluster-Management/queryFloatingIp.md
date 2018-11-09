# queryFloatingIp


## Description
Query the cluster random code (eight digits)

## Request method
POST

## Request address
https://idata-jmr-api.jcloud.com/v1/regions/{regionId}/floatingIp:query

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**recordId**|String|True| |Namely, the clusterId of cluster|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**data**|String|8-digit Random Code of the Cluster|
|**message**|String| |
|**status**|String| |

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**500**|Internal server error|
