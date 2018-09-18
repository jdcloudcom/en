# getPropertyValue


## Description
Software configuration information list

## Request method
GET

## Request address
https://idata-jmr-api.jcloud.com/v1/regions/{regionId}/softwareStack

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## Request parameter
None


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String||
|**result**|Result||


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**data**|SoftStack|Software configuration information|
|**message**|String||
|**status**|String||
### <a name="SoftStack">SoftStack</a>
|Name|Type|Description|
|---|---|---|
|**software**|String|"Adopted software and revision, such as"<br>"HADOOP-2.6.0|HIVE-1.2.1|SPARK-2.0.0|ALLUXIO-1.0.1|ZOOKEEPER-3.4.5|ZEPPELIN-0.6.1"<br>|
|**version**|String|JMR current revision|

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
|**500**|Internal server error|
