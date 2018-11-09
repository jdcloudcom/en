# releaseCluster


## Description
Release the clusters corresponding to the assigned clusterId

## Request method
POST

## Request address
https://idata-jmr-api.jcloud.com/v1/regions/{regionId}/cluster/{id}:release

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**id**|String|True| |Cluster ID: Composed of eight characters|
|**regionId**|String|True| |Region ID|

## Request parameter
None


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**message**|String| |
|**status**|String| |

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**500**|Internal server error|
