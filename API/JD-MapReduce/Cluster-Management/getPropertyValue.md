# getPropertyValue


## Description
Software Configuration Information List

## Request method
GET

## Request address
https://idata-jmr-api.jcloud.com/v1/regions/{regionId}/softwareStack

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
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
|**data**|SoftStack|Software Configuration Information|
|**message**|String| |
|**status**|String| |
### SoftStack
|Name|Type|Description|
|---|---|---|
|**software**|String|"Adopted Software and Version, such as"<br>"HADOOP-2.6.0|HIVE-1.2.1|SPARK-2.0.0|ALLUXIO-1.0.1|ZOOKEEPER-3.4.5|ZEPPELIN-0.6.1"<br>|
|**version**|String|JD MapReduce Current Version|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**500**|Internal server error|
