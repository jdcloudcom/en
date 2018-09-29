# describeVpcIpList


## 描述
Query the JD Cloud IP Resources of Users

## 请求方式
GET

## 请求地址
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/instance/describeVpcIpList

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True| |Belonging Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**pageNumber**|Integer|False| |Page Number: 1 by default|
|**pageSize**|Integer|False| |Paging Size, 10 by Default; Value Range [0, 100], 0 Means Full|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |

### Result
|名称|类型|描述|
|---|---|---|
|**currentCount**|Integer|Current Page Counts|
|**dataList**|VpcIpResource[]| |
|**totalCount**|Integer|Total Number of Instances|
|**totalPage**|Integer|Total Number of Pages|
### VpcIpResource
|名称|类型|描述|
|---|---|---|
|**binded**|Boolean|Associate or Not|
|**ip**|String|In-cloud IP Address|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
