# modifyInstanceSpec


## 描述
Change Instance Type

## 请求方式
POST

## 请求地址
https://mongodb.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}:modifyInstanceSpec

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**instanceId**|String|True||Instance ID|
|**regionId**|String|True||Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**instanceClass**|String|True||The instance type under monthly package shall not be smaller than the current type.|
|**instanceStorageGB**|Integer|True||The storage space under monthly package shall not be smaller than the current type.|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String||
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|名称|类型|描述|
|---|---|---|
|**instanceId**|String||
|**orderId**|String||

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
