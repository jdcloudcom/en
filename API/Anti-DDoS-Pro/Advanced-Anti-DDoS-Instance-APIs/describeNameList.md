# describeNameList


## 描述
Query the List of Advanced Anti-DDoS Instance Names

## 请求方式
GET

## 请求地址
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/instance/describeNameList

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True| |Belonging Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**id**|String|False| |Advanced Anti-DDoS Instance ID; If Blank, Query All the Instance Names|
|**name**|String|False| |Instance Name, Fuzzy Matching Available|
|**pageNumber**|Integer|False| |Page Number: 1 by default|
|**pageSize**|Integer|False| |Paging Size, 10 by Default; Value Range [0, 100]|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |

### Result
|名称|类型|描述|
|---|---|---|
|**currentCount**|Integer|Current Page Counts|
|**dataList**|InstanceIdName[]| |
|**totalCount**|Integer|Total Number of Instances|
|**totalPage**|Integer|Total Number of Pages|
### InstanceIdName
|名称|类型|描述|
|---|---|---|
|**id**|String|Instance ID|
|**name**|String|Instance Name|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
