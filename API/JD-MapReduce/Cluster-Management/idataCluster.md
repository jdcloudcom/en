# idataCluster


## Description
Query the cluster list corresponding to the user-assigned clusterId and related sevice information

## Request method
GET

## Request address
https://idata-jmr-api.jcloud.com/v1/regions/{regionId}/idata

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**id**|String|True||Cluster ID: composed of eight characters|
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
|**data**|Object|"Include cluster information list - clusters"<br>"Cluster machine total number - total"<br>|
|**message**|String||
|**status**|String||

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
|**500**|Internal server error|
