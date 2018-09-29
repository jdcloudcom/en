# executePySparkQuery


## 描述
Execute the PySpark script written by the user

## 请求方式
POST

## 请求地址
https://xdata.jdcloud-api.com/v1/regions/{regionId}/dwQuery:executePySparkQuery

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**instanceName**|String|True| |Instance Name|
|**instanceOwnerName**|String|False| |Instance Owner Name|
|**script**|String|True| |PySpark Script|
|**scriptType**|String|False| |Script Type Name|
|**userName**|String|True| |User Name|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |

### Result
|名称|类型|描述|
|---|---|---|
|**data**|Integer| |
|**message**|String| |
|**status**|Boolean| |

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
