# getClusterJobCount


## Description
Obtain the cluster job number

## Request method
POST

## Request address
https://idata-jmr-api.jcloud.com/v1/regions/{regionId}/clusterJob/{clusterId}:count

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**clusterId**|String|True||Cluster ID|
|**regionId**|String|True||Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String||
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**data**|Integer|Cluster job number|
|**message**|String||
|**status**|String||

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
|**500**|Internal server error|
