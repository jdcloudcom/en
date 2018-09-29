# executeRasQuery


## 描述
Execute the Spark SQL script written by the user

## 请求方式
POST

## 请求地址
https://xdata.jdcloud-api.com/v1/regions/{regionId}/dwQuery:executeRasQuery

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**callBackURL**|String|False| |Callback Address Name|
|**databaseName**|String|False| |Database Name|
|**instanceName**|String|True| |Instance Name|
|**instanceOwnerName**|String|False| |Instance Owner Name|
|**isExplain**|String|False| |Is interpretation required or not|
|**queueName**|String|False| |Queue Name|
|**source**|String|False| |Resource Name|
|**sql**|String|True| |Sql Script|
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
|**500**|Internal server error|
