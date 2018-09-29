# describeIpResourceFlow


## 描述
Search the EIP monitoring traffic

## 请求方式
GET

## 请求地址
https://baseanti.jdcloud-api.com/v1/regions/{regionId}/ipResources/{ip}/monitorFlow

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**ip**|String|True| |EIP Address|
|**regionId**|String|True| |Belonging Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**endTime**|String|False| |Search end time, UTC time, format: yyyy-MM-dd'T'HH:mm:ssZ|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |

### Result
|名称|类型|描述|
|---|---|---|
|**data**|IpResourceFlow| |
### IpResourceFlow
|名称|类型|描述|
|---|---|---|
|**bps**|IpResourceFlowDetail| |
|**pps**|IpResourceFlowDetail| |
### IpResourceFlowDetail
|名称|类型|描述|
|---|---|---|
|**times**|String[]|Time Point|
|**used**|Integer[]|Use Value of Corresponding Time Point|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
