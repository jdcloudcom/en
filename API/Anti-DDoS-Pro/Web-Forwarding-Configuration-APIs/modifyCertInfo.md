# modifyCertInfo


## 描述
Edit Certificate

## 请求方式
POST

## 请求地址
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/webRules/{webRuleId}:modifyCertInfo

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**instanceId**|String|True| |Instance ID|
|**regionId**|String|True| |Belonging Region ID|
|**webRuleId**|String|True| |Web Service Rule ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**certInfoModifySpec**|CertInfoModifySpec|True| |Request Parameters of Editing Certificate|

### CertInfoModifySpec
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**httpsCertContent**|String|False| |Certificate Content|
|**httpsRsaKey**|String|False| |Private Key|

## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String| |


## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
