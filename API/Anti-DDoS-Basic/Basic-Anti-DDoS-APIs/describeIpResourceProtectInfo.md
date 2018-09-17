# describeIpResourceProtectInfo


## 描述
Search EIP protection details

## 请求方式
GET

## 请求地址
https://baseanti.jdcloud-api.com/v1/regions/{regionId}/ipResources/{ip}/protectInfo

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**ip**|String|True||EIP address|
|**regionId**|String|True||Belonging region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**limit**|Integer|False||Records of limited search|
|**start**|Integer|False||Start range of limited search|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String||
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|名称|类型|描述|
|---|---|---|
|**dataList**|[IpResourceProtectInfo[]](##IpResourceProtectInfo)||
### <a name="IpResourceProtectInfo">IpResourceProtectInfo</a>
|名称|类型|描述|
|---|---|---|
|**cause**|Integer|Trigger cause, 0->unknown  1->four-layer  2->seven-layer  3->four-layer and seven-layer|
|**endTime**|String|End time of attack|
|**startTime**|String|Start time of attack|
|**status**|Integer|Status, 0->completed  1->clean  2->black hole|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
