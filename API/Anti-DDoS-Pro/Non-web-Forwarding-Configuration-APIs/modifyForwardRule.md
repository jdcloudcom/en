# modifyForwardRule


## 描述
Update a non-web service rule

## 请求方式
PATCH

## 请求地址
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/forwardRules/{forwardRuleId}

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**forwardRuleId**|String|True||Forwarding rule ID|
|**instanceId**|String|True||Instance ID|
|**regionId**|String|True||Belonging region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**forwardRuleSpec**|[ForwardRuleSpec](##ForwardRuleSpec)|True||Non-web service rule parameter|

### <a name="ForwardRuleSpec">ForwardRuleSpec</a>
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**algorithm**|String|False||Forwarding rules: wrr->Round Robin with weight  wlc->minimum weighted connection  rr->Round Robin without weight  sh->source address hash|
|**onlineAddr**|String[]|False|||
|**originAddr**|[OriginAddrItem[]](##OriginAddrItem)|False|||
|**originDomain**|String|False||Back-to-origin domain name|
|**originPort**|Integer|False||Back-to-origin port number|
|**originType**|String|False||Back-to-origin type, ip or domain|
|**port**|Integer|False||Port number|
|**protocol**|String|False||Protocol: TCP or UDP|
### <a name="OriginAddrItem">OriginAddrItem</a>
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**inJdCloud**|Boolean|False||Confirm whether it is the Private IP/EIP address of JD Cloud?|
|**ip**|String|False||Back-to-origin IP address|
|**weight**|Integer|False||Weight|

## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String||



## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**400**|BAD_REQUEST|
|**404**|NOT_FOUND|
|**500**|INTERNAL_SERVER_ERROR|
