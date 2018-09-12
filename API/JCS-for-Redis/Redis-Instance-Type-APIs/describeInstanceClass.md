# describeInstanceClass


## 描述
Query the instance list type under a certain region

## 请求方式
GET

## 请求地址
https://redis.jdcloud-api.com/v1/regions/{regionId}/instanceClass

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
|**instanceClasses**|[InstanceClass[]](##InstanceClass)||
|**totalCount**|Integer||
### <a name="InstanceClass">InstanceClass</a>
|名称|类型|描述|
|---|---|---|
|**bandwidthMbps**|Integer|Bandwidth|
|**cpu**|Integer|cpu|
|**diskGB**|Integer|Disk|
|**instanceClass**|String|For instance type code, see instance type code table|
|**maxConnetction**|Integer|The Maximum Number of Links|
|**memoryMB**|Integer|Memory|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
