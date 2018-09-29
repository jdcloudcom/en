# getClusterJobCount


## Description
Obtain the cluster job number

## Request method
POST

## Request address
https://idata-jmr-api.jcloud.com/v1/regions/{regionId}/clusterJob/{clusterId}:count

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**clusterId**|String|True| |Cluster ID|
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
|**data**|Integer|Cluster Job Number|
|**message**|String| |
|**status**|String| |

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**500**|Internal server error|
