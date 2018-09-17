# calculateClusterPrice


## 描述
Calculate the cluster price of the corresponding specification attribute

## 请求方式
POST

## 请求地址
https://idata-jmr-api.jcloud.com/v1/regions/{regionId}/cluster:calculate

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**clusterListViewModel**|[ClusterListViewModel](##ClusterListViewModel)|True||Cluster information views need to be transferred in except for userName and data Center|

### <a name="ClusterListViewModel">ClusterListViewModel</a>
|名称|类型|是否必需|默认值|描述|
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

## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String||
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|名称|类型|描述|
|---|---|---|
|**data**|Integer||
|**message**|String||
|**status**|String||

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**500**|Internal server error|
