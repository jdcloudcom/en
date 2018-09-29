# calculateClusterPrice


## Description
Calculate the cluster price of the corresponding specification attribute

## Request method
POST

## Request address
https://idata-jmr-api.jcloud.com/v1/regions/{regionId}/cluster:calculate

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**clusterListViewModel**|ClusterListViewModel|True| |Cluster information views need to be transferred in except for userName and data Center|

### ClusterListViewModel
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**bandwidthOut**|Integer|False| |Network Bandwidth|
|**coreInstanceType**|String|False| |Core Instance Type|
|**dataCenter**|String|False| |Data Center Location|
|**masterInstanceType**|String|False| |Master Node Instance Type|
|**masterNodeDiskType**|String|False| |Master Node Disk Type|
|**masterNodeDiskVolume**|Integer|False| |Master Node Disk Capacity|
|**masterNodeInfo**|String|False| |Master Node Information|
|**masterNodeNumber**|Integer|False| |Master Node Number|
|**slaveNodeDiskType**|String|False| |Slave Node Disk Type|
|**slaveNodeDiskVolume**|Integer|False| |Slave Node Disk Capacity|
|**slaveNodeInfo**|String|False| |Slave Node Information|
|**slaveNodeNumber**|Integer|False| |Slave Node Number|
|**userName**|String|False| |User Name|

## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**data**|Integer| |
|**message**|String| |
|**status**|String| |

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**500**|Internal server error|
