# describeForwardRule


## 描述
Search a non-web service rule

## 请求方式
GET

## 请求地址
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/forwardRules/{forwardRuleId}

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**forwardRuleId**|String|True| |Forwarding Rule ID|
|**instanceId**|String|True| |Instance ID|
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
|**data**|ForwardRule| |
### ForwardRule
|名称|类型|描述|
|---|---|---|
|**algorithm**|String|Forwarding Rules: wrr->round Robin with weight,  wlc->minimum weighted connection,  rr->round Robin without weight,  sh->source address hash|
|**cname**|String|cname of Rules|
|**id**|Integer|Rule ID|
|**instanceId**|Integer|Instance ID|
|**onlineAddr**|String[]| |
|**originAddr**|OriginAddrItem[]| |
|**originDomain**|String|Back-to-origin Domain Name|
|**originPort**|Integer|Back-to-origin Port Number|
|**originType**|String|Back-to-origin Type: ip or domain|
|**port**|Integer|Port Number|
|**protocol**|String|TCP or UDP|
|**status**|Integer|0->defense Status  1->back-to-origin Status|
### OriginAddrItem
|名称|类型|描述|
|---|---|---|
|**inJdCloud**|Boolean|Confirm whether it is the Private IP/EIP address of JD Cloud?|
|**ip**|String|Back-to-origin IP address|
|**weight**|Integer|Weight|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
