# getClusterDetailInfo


## 描述
Display the cluster details during cluster expansion

## 请求方式
POST

## 请求地址
https://idata-jmr-api.jcloud.com/v1/regions/{regionId}/clusterInfo/{clusterId}:detail

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**clusterId**|String|True||Cluster ID to be expanded|
|**regionId**|String|True||Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String||
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|名称|类型|描述|
|---|---|---|
|**data**|[ClusterDetailInfo](##ClusterDetailInfo)||
|**message**|String||
|**status**|String||
### <a name="ClusterDetailInfo">ClusterDetailInfo</a>
|名称|类型|描述|
|---|---|---|
|**masterCore**|Integer|Master node CPU|
|**masterDiskType**|String|"Master node cloud disk type, the optional types are (the following types are separated with "/")"<br>"NBD/NBD_SATA"<br>"Respectively stand for: Performance Type/Capacity Type"<br>|
|**masterDiskVolume**|Integer|Master node cloud disk capacity must be the integral multiples of 10, but greater than 20 and less than 3000GB|
|**masterInstanceInfo**|String|master node instance information|
|**masterInstanceType**|String|Master node specification, such as: g.n1.xlarge; please refer to [document](https://www.jdcloud.com/help/detail/296/isCatalog/1) for more specification|
|**masterMemory**|Integer|Master node memory (At least 8G memory is recommended; otherwise the service may fail to deploy)|
|**materNum**|Integer|Master node number|
|**slaveCore**|Integer|Slave node CPU|
|**slaveDiskType**|String|"Slave node cloud disk type, the optional types are (the following types are separated with "/")"<br>"NBD/NBD_SATA"<br>"Respectively stand for: Performance Type/Capacity Type"<br>|
|**slaveDiskVolume**|Integer|Slave node cloud disk capacity must be the integral multiples of 10, but greater than 20 and less than 3000GB|
|**slaveInstanceInfo**|String|Slave node instance information|
|**slaveInstanceType**|String|Slave node specification, such as: g.n1.xlarge; please refer to [document](https://www.jdcloud.com/help/detail/296/isCatalog/1) for more specification|
|**slaveMemory**|Integer|Slave node memory (At least 4G memory is recommended; otherwise the service may fail to deploy)|
|**slaveNum**|Integer|Slave node number|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**500**|Internal server error|
