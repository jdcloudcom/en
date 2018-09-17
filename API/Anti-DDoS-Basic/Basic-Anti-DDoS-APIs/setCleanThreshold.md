# setCleanThreshold


## 描述
Set the EIP cleaning threshold

## 请求方式
POST

## 请求地址
https://baseanti.jdcloud-api.com/v1/regions/{regionId}/ipResources/{ip}:setCleanThreshold

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**ip**|String|True||EIP address|
|**regionId**|String|True||Belonging region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**cleanThresholdSpec**|[CleanThresholdSpec](##CleanThresholdSpec)|True||cc parameter|

### <a name="CleanThresholdSpec">CleanThresholdSpec</a>
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**cleanThresholdBps**|Integer|False||Traffic rate of trigger cleaning, unit: bps, with the range from 10000000 to 300000000|
|**cleanThresholdPps**|Integer|False||Package rate of trigger cleaning, unit: pps, with the range from 2000 to 70000|

## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String||



## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
