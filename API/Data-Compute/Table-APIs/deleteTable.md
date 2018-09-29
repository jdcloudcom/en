# deleteTable


## 描述
Delete a specified datasheet of user instance

## 请求方式
DELETE

## 请求地址
https://xdata.jdcloud-api.com/v1/regions/{regionId}/dwTable/{tableName}

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**tableName**|String|True| |Datasheet Name|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**databaseName**|String|True| |Database Name|
|**instanceName**|String|True| |Instance Name|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |

### Result
|名称|类型|描述|
|---|---|---|
|**data**|Object| |
|**message**|String| |
|**status**|Boolean| |

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**500**|Internal server error|
