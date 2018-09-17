# getSoftwareAndVersionInfo


## 描述
Obtain the software list corresponding to the assigned JMR revision and the revision information

## 请求方式
POST

## 请求地址
https://idata-jmr-api.jcloud.com/v1/regions/{regionId}/softwareInfo/v2

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**ver**|String|True||JMR software revision number|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String||
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|名称|类型|描述|
|---|---|---|
|**data**|[SoftwareInfoAndVersion[]](##SoftwareInfoAndVersion)||
|**message**|String||
|**status**|String||
### <a name="SoftwareInfoAndVersion">SoftwareInfoAndVersion</a>
|名称|类型|描述|
|---|---|---|
|**flag**|Boolean|It means whether the obtained information is normal|
|**name**|String|Adopted software name, such as hadoop/spark|
|**version**|String|Software current revision|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**500**|Internal server error|
