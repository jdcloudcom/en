# describeIpResources


## 描述
Search the EIP resource list under the zone

## 请求方式
GET

## 请求地址
https://baseanti.jdcloud-api.com/v1/regions/{regionId}/ipResources

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**ip**|String|True||EIP address|
|**regionId**|String|True||Belonging region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**ip**|String|False||IP fuzzy matching|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String||
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|名称|类型|描述|
|---|---|---|
|**dataList**|[IpResource[]](##IpResource)||
|**totalCount**|Integer||
### <a name="IpResource">IpResource</a>
|名称|类型|描述|
|---|---|---|
|**bandwidth**|Integer|Bandwidth cap, unit: Mbps|
|**ip**|String|EIP address|
|**safeStatus**|Integer|Security status, 0->safe  1->clean  2->black hole|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
