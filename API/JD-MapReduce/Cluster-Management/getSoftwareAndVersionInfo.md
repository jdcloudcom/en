# getSoftwareAndVersionInfo


## 描述
Obtain the software list corresponding to the assigned JD MapReduce Version and the Version information

## 请求方式
POST

## 请求地址
https://idata-jmr-api.jcloud.com/v1/regions/{regionId}/softwareInfo/v2

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**ver**|String|True| |JMR Software Version Number|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |

### Result
|名称|类型|描述|
|---|---|---|
|**data**|SoftwareInfoAndVersion[]| |
|**message**|String| |
|**status**|String| |
### SoftwareInfoAndVersion
|名称|类型|描述|
|---|---|---|
|**flag**|Boolean|It means whether the obtained information is normal|
|**name**|String|Adopted Software Name, such as hadoop/spark|
|**version**|String|Software Current Version|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**500**|Internal server error|
