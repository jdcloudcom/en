# calculateClusterPrice


## Description
Calculate the cluster price of the corresponding specification attribute

## Request method
POST

## Request address
https://idata-jmr-api.jcloud.com/v1/regions/{regionId}/cluster:calculate

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**clusterListViewModel**|ClusterListViewModel|True||Cluster information views need to be transferred in except for userName and data Center|

### <a name="ClusterListViewModel">ClusterListViewModel</a>
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**bandwidthOut**|Integer|False||Network bandwidth|
|**coreInstanceType**|String|False||Core instance type|
|**dataCenter**|String|False||Data center location|
|**masterInstanceType**|String|False||Master node instance type family|
|**masterNodeDiskType**|String|False||Master node disk type|
|**masterNodeDiskVolume**|Integer|False||Master node disk capacity|
|**masterNodeInfo**|String|False||Master Node Information|
|**masterNodeNumber**|Integer|False||Master node number|
|**slaveNodeDiskType**|String|False||Slave node disk type|
|**slaveNodeDiskVolume**|Integer|False||Slave node disk capacity|
|**slaveNodeInfo**|String|False||Slave node information|
|**slaveNodeNumber**|Integer|False||Slave node number|
|**userName**|String|False||User name|

## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String||
|**result**|Result||


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**data**|Integer||
|**message**|String||
|**status**|String||

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
|**500**|Internal server error|
