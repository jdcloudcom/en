# createWebRule


## 描述
Add a web service rule

## 请求方式
POST

## 请求地址
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/webRules

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**instanceId**|String|True||Instance ID|
|**regionId**|String|True||Belonging region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**webRuleSpec**|[WebRuleSpec](##WebRuleSpec)|True||Web service rule parameter|

### <a name="WebRuleSpec">WebRuleSpec</a>
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**algorithm**|String|False||Forwarding rules: wrr->Round Robin with weight  rr->Round Robin without weight|
|**customPortStatus**|Integer|False||Confirm whether it is customized port number or not? 0->default  1->customized|
|**domain**|String|False||Subdomain name|
|**forceJump**|Integer|False||Confirm to enable https forced jump? The attribute may be configured when the protocol is HTTP_HTTPS  0->no  1->yes|
|**httpOrigin**|Integer|False||Confirm to enable http back-to-origin, 0->no  1->yes. The attribute may be configured when HTTPS is checked|
|**httpsCertContent**|String|False||Certificate content|
|**httpsPort**|String|False||HTTPS protocol port number, such as 443 and 8443, and multiple port numbers are separated by commas|
|**httpsRsaKey**|String|False||Certificate private key|
|**onlineAddr**|String[]|False|||
|**originAddr**|[OriginAddrItem[]](##OriginAddrItem)|False|||
|**originDomain**|String|False||Back-to-origin domain name, and the field needs to be specified when originType is CNAME|
|**originType**|String|False||Back-to-origin type, A or CNAME|
|**port**|String|False||HTTP protocol port number, such as 80 and 81, and multiple port numbers are separated by commas|
|**protocol**|String|False||Protocol: HTTP, HTTPS and HTTP_HTTPS|
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
