# getClusterCronJobCount


## Description
Obtain the cluster deployment job number

## Request method
POST

## Request address
https://idata-jmr-api.jcloud.com/v1/regions/{regionId}/clusterCronJob/{clusterId}:count

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**clusterId**|String|True| |Cluster Id|
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
|**data**|Object|"Include JmrPlanViewModel list - cronJobs"<br>"And return list size - totalNum"<br>|
|**message**|String| |
|**status**|String| |

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**500**|Internal server error|
