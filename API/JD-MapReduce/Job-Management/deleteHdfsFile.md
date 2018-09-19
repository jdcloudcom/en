# deleteHdfsFile


## Description
Delete an hdfs file under the corresponding path of the specified cluster

## Request method
POST

## Request address
https://idata-jmr-api.jcloud.com/v1/regions/{regionId}/hdfsFile:delete

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**clusterId**|String|True||Cluster ID|
|**filePath**|String|True||Path of the File to be Deleted|


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String||



## Return code
|Return code|Description|
|---|---|
|**200**|OK|
|**500**|Internal server error|
