# createElasticIps


## 描述
Create One or More Elastic IPs

## 请求方式
POST

## 请求地址
https://vpc.jdcloud-api.com/v1/regions/{regionId}/elasticIps/

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**elasticIpAddress**|String|False| |Create by assigning Elastic IP address, when multiple Elastic IPs are applied for creation, it must be blank|
|**elasticIpSpec**|ElasticIpSpec|True| |Elastic IP Specification|
|**maxCount**|Integer|True| |Number of Purchased Elastic IPs; Value Range: [1,100]|

### ElasticIpSpec
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**bandwidthMbps**|Integer|True| |Elastic IP Speed lLimit (unit: Mbps). Value Range: [1-200]|
|**chargeSpec**|ChargeSpec|False| |Billing Configuration|
|**provider**|String|True| |IP service provider, values include bgp or no_bgp, cn-north-1: bgp; cn-south-1: [bgp, no_bgp]; cn-east-1: [bgp, no_bgp]; cn-east-2: bgp|
### ChargeSpec
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**chargeDuration**|Integer|False| |Pay-In-Advance billing duration, the Pay-In-Advance is compulsory and valid only when the value of chargeMode is prepaid_by_duration. When chargeUnit is month, the value shall be 1~9; when chargeUnit is year, the value shall be 1, 2 or 3|
|**chargeMode**|String|False|postpaid_by_duration|Billing model value is prepaid_by_duration, postpaid_by_usage or postpaid_by_duration; prepaid_by_duration means Pay-In-Advance, postpaid_by_usage means Pay-As-You-Go By Consumption and postpaid_by_duration means pay by configuration; is postpaid_by_duration by default. Please refer to the Help Documentation of specific product line to confirm the billing type supported by the production line|
|**chargeUnit**|String|False| |Billing unit of Pay-In-Advance, the Pay-In-Advance is compulsory, and valid only when chargeMode is prepaid_by_duration, and the value is month or year and month by default|

## 返回参数
|名称|类型|描述|
|---|---|---|
|**result**|Result|Returned Results|

### Result
|名称|类型|描述|
|---|---|---|
|**elasticIpIds**|String[]|Elastic IP ID List|
|**requestId**|String|Request ID|

## 返回码
|返回码|描述|
|---|---|
|**200**|Successful Operation|
|**400**|Invalid param 'xxx'|
|**500**|Unknown server error|
|**401**|Unauthenticated user pin 'xxx'|
|**503**|Service unavailable|
