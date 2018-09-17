# describeElasticIp


## Description
ElasticIp resource information details

## Request method
GET

## Request address
https://vpc.jdcloud-api.com/v1/regions/{regionId}/elasticIps/{elasticIpId}

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**elasticIpId**|String|True||ElasticIp ID|
|**regionId**|String|True||Region ID|

## Request parameter
无


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|
|**result**|[Result](##Result)|Return result|


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**elasticIp**|[ElasticIp](##ElasticIp)|elasticIp resource information|
### <a name="ElasticIp">ElasticIp</a>
|Name|Type|Description|
|---|---|---|
|**bandwidthMbps**|Integer|Elastic ip speed limit (unit: Mbps)|
|**charge**|[Charge](##Charge)|Billing configuration|
|**createdTime**|String|Creation Time of Elastic ip|
|**elasticIpAddress**|String|Elastic IP address|
|**elasticIpId**|String|Elastic IP Id|
|**instanceId**|String|Instance Id|
|**instanceType**|String|Instance type family|
|**networkInterfaceId**|String|Configure elastic network interface Id|
|**privateIpAddress**|String|IPV4 address of private IP|
|**provider**|String|IP service provider, values include bgp or no_bgp|
### <a name="Charge">Charge</a>
|Name|Type|Description|
|---|---|---|
|**chargeExpiredTime**|String|Expiration time, i.e. the expiration time of Pay-In-Advance resource, which shall be subject to ISO8601, with the UTC time used in the format of YYYY-MM-DDTHH:mm:ssZ. Pay-As-You-Go resource field is blank.|
|**chargeMode**|String|Payment model, the value shall be prepaid_by_duration, postpaid_by_usage or postpaid_by_duration; prepaid_by_duration refers to Pay-In-Advance; postpaid_by_usage refers to Pay By Consumption and Pay-As-You-Go; postpaid_by_duration refers to Pay By Configuration and Pay-As-You-Go, and is postpaid_by_duration by default|
|**chargeRetireTime**|String|The expected release time refers to the expected release time of resources. This value is both available for the Pay-In-Advance/Pay-As-You-Go resources, conforming to the ISO8601 standard, with the UTC time used in the format of YYYY-MM-DDTHH:mm:ssZ|
|**chargeStartTime**|String|The start time of the billing shall be subject to ISO8601, with the UTC time used in the format of YYYY-MM-DDTHH:mm:ssZ|
|**chargeStatus**|String|Cost payment status, the value is respectively normal, overdue and arrear.|

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|invalid parameter|
|**401**|Authentication failed|
