# describeIpResourceProtectInfo


## 描述
Search EIP protection details

## 请求方式
GET

## 请求地址
https://baseanti.jdcloud-api.com/v1/regions/{regionId}/ipResources/{ip}/protectInfo

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**ip**|String|True| |EIP Address|
|**regionId**|String|True| |Belonging Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**limit**|Integer|False| |Records of Limited Search|
|**start**|Integer|False| |Start range of limited search|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |

### Result
|名称|类型|描述|
|---|---|---|
|**dataList**|IpResourceProtectInfo[]| |
### IpResourceProtectInfo
|名称|类型|描述|
|---|---|---|
|**cause**|Integer|Trigger Cause, 0->Unknown  1->Four-layer  2->Seven-layer  3->Four-layer and Seven-Layer|
|**endTime**|String|End Time of Attack|
|**startTime**|String|Start Time of Attack|
|**status**|Integer|Status, 0->Completed  1->Clean  2->Black Hole|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
