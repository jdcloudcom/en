# calculateClusterPrice


## 描述
Calculate the cluster price of the corresponding specification attribute

## 请求方式
POST

## 请求地址
https://idata-jmr-api.jcloud.com/v1/regions/{regionId}/cluster:calculate

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**clusterListViewModel**|ClusterListViewModel|True| |Cluster information views need to be transferred in except for userName and data Center|

### ClusterListViewModel
|名称|类型|是否必需|默认值|描述|
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

## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |

### Result
|名称|类型|描述|
|---|---|---|
|**data**|Integer| |
|**message**|String| |
|**status**|String| |

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**500**|Internal server error|
