# getPropertyValue


## 描述
Software Configuration Information List

## 请求方式
GET

## 请求地址
https://idata-jmr-api.jcloud.com/v1/regions/{regionId}/softwareStack

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## 请求参数
无


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |

### Result
|名称|类型|描述|
|---|---|---|
|**data**|SoftStack|Software Configuration Information|
|**message**|String| |
|**status**|String| |
### SoftStack
|名称|类型|描述|
|---|---|---|
|**software**|String|"Adopted Software and Version, such as"<br>"HADOOP-2.6.0|HIVE-1.2.1|SPARK-2.0.0|ALLUXIO-1.0.1|ZOOKEEPER-3.4.5|ZEPPELIN-0.6.1"<br>|
|**version**|String|JD MapReduce Current Version|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**500**|Internal server error|
