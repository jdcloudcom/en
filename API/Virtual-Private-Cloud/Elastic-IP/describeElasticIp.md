# describeElasticIp


## Description
ElasticIp Resource Information Details

## Request method
GET

## Request address
https://vpc.jdcloud-api.com/v1/regions/{regionId}/elasticIps/{elasticIpId}

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**elasticIpId**|String|True| |ElasticIp ID|
|**regionId**|String|True| |Region ID|

## Request parameter
None


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|
|**result**|Result|Returned Results|


### Result
|Name|Type|Description|
|---|---|---|
|**elasticIp**|ElasticIp|ElasticIp Resource Information|
### ElasticIp
|Name|Type|Description|
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
|Name|Type|Description|
|---|---|---|
|**chargeExpiredTime**|String|Expiration Time, i.e. the expiration time of Pay-In-Advance resource, which shall be subject to ISO8601, with the UTC time used in the format of YYYY-MM-DDTHH:mm:ssZ. Pay-As-You-Go resource field is blank.|
|**chargeMode**|String|Payment Model, the value shall be prepaid_by_duration, postpaid_by_usage or postpaid_by_duration; prepaid_by_duration refers to Pay-In-Advance; postpaid_by_usage refers to Pay By Consumption and Pay-As-You-Go; postpaid_by_duration refers to Pay By Configuration and Pay-As-You-Go, and is postpaid_by_duration by default|
|**chargeRetireTime**|String|The Expected Release Time refers to the expected release time of resources. This value is both available for the Pay-In-Advance/Pay-As-You-Go resources, conforming to the ISO8601 standard, with the UTC time used in the format of YYYY-MM-DDTHH:mm:ssZ|
|**chargeStartTime**|String|The start time of the billing shall be subject to ISO8601, with the UTC time used in the format of YYYY-MM-DDTHH:mm:ssZ|
|**chargeStatus**|String|Cost Payment Status, the value is respectively normal, overdue and arrear.|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|invalid parameter|
|**401**|Authentication failed|
