# describeIpResourceInfo


## 描述
Search the EIP basic information

## 请求方式
GET

## 请求地址
https://baseanti.jdcloud-api.com/v1/regions/{regionId}/ipResources/{ip}

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**ip**|String|True| |EIP Address|
|**regionId**|String|True| |Belonging Region ID|

## 请求参数
无


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |

### Result
|名称|类型|描述|
|---|---|---|
|**data**|IpResourceInfo| |
### IpResourceInfo
|名称|类型|描述|
|---|---|---|
|**blackHoleThreshold**|Integer|Black Hole Threshold, Unit: bps|
|**cleanThresholdBps**|Integer|Traffic Rate of Trigger Cleaning, Unit: bps|
|**cleanThresholdPps**|Integer|Package Rate of Trigger Cleaning, Unit: pps|
|**ip**|String|EIP Address|
|**region**|String|Region, i.e. cn-north-1, cn-south-1, cn-east-1 and cn-east-2|
|**safeStatus**|Integer|Security Status, 0->Safe  1->Clean  2-Black Hole|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
