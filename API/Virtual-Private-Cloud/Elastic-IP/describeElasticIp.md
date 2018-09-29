# describeElasticIp


## 描述
ElasticIp Resource Information Details

## 请求方式
GET

## 请求地址
https://vpc.jdcloud-api.com/v1/regions/{regionId}/elasticIps/{elasticIpId}

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**elasticIpId**|String|True| |ElasticIp ID|
|**regionId**|String|True| |Region ID|

## 请求参数
无


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String|Request ID|
|**result**|Result|Returned Results|

### Result
|名称|类型|描述|
|---|---|---|
|**elasticIp**|ElasticIp|ElasticIp Resource Information|
### ElasticIp
|名称|类型|描述|
|---|---|---|
|**bandwidthMbps**|Integer|Elastic IP Speed Limit (unit: Mbps)|
|**charge**|Charge|Billing Configuration|
|**createdTime**|String|Creation Time of Elastic IP|
|**elasticIpAddress**|String|Elastic IP Address|
|**elasticIpId**|String|Elastic IP ID|
|**instanceId**|String|Instance ID|
|**instanceType**|String|Instance Type|
|**networkInterfaceId**|String|Configure Elastic Network Interface ID|
|**privateIpAddress**|String|IPV4 Address of Private IP|
|**provider**|String|IP Service Provider, Values include bgp or no_bgp|
### Charge
|名称|类型|描述|
|---|---|---|
|**chargeExpiredTime**|String|Expiration Time, i.e. the expiration time of Pay-In-Advance resource, which shall be subject to ISO8601, with the UTC time used in the format of YYYY-MM-DDTHH:mm:ssZ. Pay-As-You-Go resource field is blank.|
|**chargeMode**|String|Payment Model, the value shall be prepaid_by_duration, postpaid_by_usage or postpaid_by_duration; prepaid_by_duration refers to Pay-In-Advance; postpaid_by_usage refers to Pay By Consumption and Pay-As-You-Go; postpaid_by_duration refers to Pay By Configuration and Pay-As-You-Go, and is postpaid_by_duration by default|
|**chargeRetireTime**|String|The Expected Release Time refers to the expected release time of resources. This value is both available for the Pay-In-Advance/Pay-As-You-Go resources, conforming to the ISO8601 standard, with the UTC time used in the format of YYYY-MM-DDTHH:mm:ssZ|
|**chargeStartTime**|String|The start time of the billing shall be subject to ISO8601, with the UTC time used in the format of YYYY-MM-DDTHH:mm:ssZ|
|**chargeStatus**|String|Cost Payment Status, the value is respectively normal, overdue and arrear.|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**400**|invalid parameter|
|**401**|Authentication failed|
