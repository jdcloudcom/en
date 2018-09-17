# describeElasticIp


## 描述
ElasticIp resource information details

## 请求方式
GET

## 请求地址
https://vpc.jdcloud-api.com/v1/regions/{regionId}/elasticIps/{elasticIpId}

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**elasticIpId**|String|True||ElasticIp ID|
|**regionId**|String|True||Region ID|

## 请求参数
无


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String|Request ID|
|**result**|[Result](##Result)|Returned results|


### <a name="Result">Result</a>
|名称|类型|描述|
|---|---|---|
|**elasticIp**|[ElasticIp](##ElasticIp)|elasticIp resource information|
### <a name="ElasticIp">ElasticIp</a>
|名称|类型|描述|
|---|---|---|
|**bandwidthMbps**|Integer|Elastic ip speed limit (unit: Mbps)|
|**charge**|[Charge](##Charge)|Billing configuration|
|**createdTime**|String|Creation Time of elastic ip|
|**elasticIpAddress**|String|Elastic IP address|
|**elasticIpId**|String|Elastic IP Id|
|**instanceId**|String|Instance Id|
|**instanceType**|String|Instance type family|
|**networkInterfaceId**|String|Configure elastic network interface Id|
|**privateIpAddress**|String|IPV4 address of private IP|
|**provider**|String|IP service provider, values include bgp or no_bgp|
### <a name="Charge">Charge</a>
|名称|类型|描述|
|---|---|---|
|**chargeExpiredTime**|String|Expiration time, i.e. the expiration time of Pay-In-Advance resource, which shall be subject to ISO8601, with the UTC time used in the format of YYYY-MM-DDTHH:mm:ssZ. Pay-As-You-Go resource field is blank.|
|**chargeMode**|String|Payment model, the value shall be prepaid_by_duration, postpaid_by_usage or postpaid_by_duration; prepaid_by_duration refers to Pay-In-Advance; postpaid_by_usage refers to Pay By Consumption and Pay-As-You-Go; postpaid_by_duration refers to Pay By Configuration and Pay-As-You-Go, and is postpaid_by_duration by default|
|**chargeRetireTime**|String|The expected release time refers to the expected release time of resources. This value is both available for the Pay-In-Advance/Pay-As-You-Go resources, conforming to the ISO8601 standard, with the UTC time used in the format of YYYY-MM-DDTHH:mm:ssZ|
|**chargeStartTime**|String|The start time of the billing shall be subject to ISO8601, with the UTC time used in the format of YYYY-MM-DDTHH:mm:ssZ|
|**chargeStatus**|String|Cost payment status, the value is respectively normal, overdue and arrear.|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**400**|invalid parameter|
|**401**|Authentication failed|
