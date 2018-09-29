# getClusterDetailInfo


## Description
Display the cluster details during cluster expansion

## Request method
POST

## Request address
https://idata-jmr-api.jcloud.com/v1/regions/{regionId}/clusterInfo/{clusterId}:detail

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**clusterId**|String|True| |Cluster ID to be expanded|
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
|**data**|ClusterDetailInfo| |
|**message**|String| |
|**status**|String| |
### ClusterDetailInfo
|Name|Type|Description|
|---|---|---|
|**masterCore**|Integer|Master Node CPU|
|**masterDiskType**|String|"Master node cloud disk type, the optional types are (the following types are separated with "/")"<br>"NBD/NBD_SATA"<br>"Respectively Stand for: Performance Type/Capacity Type"<br>|
|**masterDiskVolume**|Integer|Master node cloud disk capacity must be the integral multiples of 10, but greater than 20 and less than 3000GB|
|**masterInstanceInfo**|String|Master Node Instance Information|
|**masterInstanceType**|String|Master node specification, such as: g.n1.xlarge; please refer to [document](https://www.jdcloud.com/help/detail/296/isCatalog/1) for more specification|
|**masterMemory**|Integer|Master Node Memory (At least 8G memory is recommended; otherwise the service may fail to deploy)|
|**materNum**|Integer|Master Node Number|
|**slaveCore**|Integer|Slave Node CPU|
|**slaveDiskType**|String|"Slave node cloud disk type, the optional types are (the following types are separated with "/")"<br>"NBD/NBD_SATA"<br>"Respectively Stand for: Performance Type/Capacity Type"<br>|
|**slaveDiskVolume**|Integer|Slave node cloud disk capacity must be the integral multiples of 10, but greater than 20 and less than 3000GB|
|**slaveInstanceInfo**|String|Slave Node Instance Information|
|**slaveInstanceType**|String|Slave node specification, such as: g.n1.xlarge; please refer to [document](https://www.jdcloud.com/help/detail/296/isCatalog/1) for more specification|
|**slaveMemory**|Integer|Slave Node Memory (At least 4G memory is recommended; otherwise the service may fail to deploy)|
|**slaveNum**|Integer|Slave Node Number|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**500**|Internal server error|
