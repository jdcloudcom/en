# idataCluster


## Description
Query the cluster list corresponding to the user-assigned clusterId and related service information

## Request method
GET

## Request address
https://idata-jmr-api.jcloud.com/v1/regions/{regionId}/idata

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
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
|**data**|Object|"Include cluster information list - clusters"<br>"Cluster Machine Total Number - Total"<br>|
|**message**|String| |
|**status**|String| |

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**500**|Internal server error|
