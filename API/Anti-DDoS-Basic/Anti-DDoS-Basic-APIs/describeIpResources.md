# describeIpResources


## 描述
Search the EIP resource list under the zone

## 请求方式
GET

## 请求地址
https://baseanti.jdcloud-api.com/v1/regions/{regionId}/ipResources

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**ip**|String|True| |EIP Address|
|**regionId**|String|True| |Belonging Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**ip**|String|False| |IP Fuzzy Matching|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |

### Result
|名称|类型|描述|
|---|---|---|
|**dataList**|IpResource[]| |
|**totalCount**|Integer| |
### IpResource
|名称|类型|描述|
|---|---|---|
|**bandwidth**|Integer|Bandwidth Cap, Unit: Mbps|
|**ip**|String|EIP Address|
|**safeStatus**|Integer|Security Status, 0->Safe  1->Clean  2-Black Hole|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
