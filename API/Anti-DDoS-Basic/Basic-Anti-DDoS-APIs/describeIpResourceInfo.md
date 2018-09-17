# describeIpResourceInfo


## 描述
Search the EIP basic information

## 请求方式
GET

## 请求地址
https://baseanti.jdcloud-api.com/v1/regions/{regionId}/ipResources/{ip}

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**ip**|String|True||EIP address|
|**regionId**|String|True||Belonging region ID|

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
|**data**|[IpResourceInfo](##IpResourceInfo)||
### <a name="IpResourceInfo">IpResourceInfo</a>
|名称|类型|描述|
|---|---|---|
|**blackHoleThreshold**|Integer|Black hole threshold, unit: bps|
|**cleanThresholdBps**|Integer|Traffic rate of trigger cleaning, unit: bps|
|**cleanThresholdPps**|Integer|Package rate of trigger cleaning, unit: pps|
|**ip**|String|EIP address|
|**region**|String|Region, i.e. cn-north-1, cn-south-1, cn-east-1 and cn-east-2|
|**safeStatus**|Integer|Security status, 0->safe  1->clean  2->black hole|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
