# getPropertyValue


## 描述
Software configuration information list

## 请求方式
GET

## 请求地址
https://idata-jmr-api.jcloud.com/v1/regions/{regionId}/softwareStack

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## 请求参数
无


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String||
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|名称|类型|描述|
|---|---|---|
|**data**|[SoftStack](##SoftStack)|Software configuration information|
|**message**|String||
|**status**|String||
### <a name="SoftStack">SoftStack</a>
|名称|类型|描述|
|---|---|---|
|**software**|String|"Adopted software and revision, such as"<br>"HADOOP-2.6.0|HIVE-1.2.1|SPARK-2.0.0|ALLUXIO-1.0.1|ZOOKEEPER-3.4.5|ZEPPELIN-0.6.1"<br>|
|**version**|String|JMR current revision|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**500**|Internal server error|
