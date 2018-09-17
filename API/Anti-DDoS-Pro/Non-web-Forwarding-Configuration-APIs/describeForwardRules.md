# describeForwardRules


## 描述
Search the non-web forwarding configuration under an instance

## 请求方式
GET

## 请求地址
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/forwardRules

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**instanceId**|String|True||Instance ID|
|**regionId**|String|True||Belonging region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**pageNumber**|Integer|False||Page number; 1 by default|
|**pageSize**|Integer|False||Paging size; it is 20 by default; value range [10, 100]|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String||
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|名称|类型|描述|
|---|---|---|
|**dataList**|[ForwardRule[]](##ForwardRule)||
|**totalCount**|Integer||
### <a name="ForwardRule">ForwardRule</a>
|名称|类型|描述|
|---|---|---|
|**algorithm**|String|Forwarding rules, wrr->Round Robin with weight  wlc->minimum weighted connection  rr->Round Robin without weight  sh->source address hash|
|**cname**|String|cname of rules|
|**id**|Integer|Rule ID|
|**instanceId**|Integer|Instance ID|
|**onlineAddr**|String[]|Online address|
|**originAddr**|[OriginAddrItem[]](##OriginAddrItem)||
|**originDomain**|String|Back-to-origin domain name|
|**originPort**|Integer|Back-to-origin port number|
|**originType**|String|Back-to-origin type, ip or domain|
|**port**|Integer|Port number|
|**protocol**|String|TCP or UDP|
|**status**|Integer|Status, 0->defense status  1->back-to-origin status|
### <a name="OriginAddrItem">OriginAddrItem</a>
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
