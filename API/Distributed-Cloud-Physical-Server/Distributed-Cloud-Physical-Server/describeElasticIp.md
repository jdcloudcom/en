# describeElasticIp


## Description
Search elastic IP details

## Request Method
GET

## Request Address
https://edcps.jdcloud-api.com/v1/regions/{regionId}/elasticIps/{elasticIpId}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID, calling APIs (describeEdCPSRegions) to get regions supported by Distributed Cloud Physical Server|
|**elasticIpId**|String|True| |Elastic IPID|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](#result)| |
|**requestId**|String| |

### <div id="Result">Result</div>
|Name|Type|Description|
|---|---|---|
|**elasticIp**|[ElasticIp](#elasticip)|Elastic IP Detail Information|
### <div id="ElasticIp">ElasticIp</div>
|Name|Type|Description|
|---|---|---|
|**region**|String|Region code, e.g. cn-east-tz1|
|**elasticIpId**|String|Elastic IPID|
|**elasticIp**|String|Elastic IP|
|**bandwidth**|Integer|Bandwidth, Unit Mbps|
|**extraUplinkBandwidth**|Integer|Additional Uplink Bandwidth, unit: Mbps|
|**lineType**|String|Link Type|
|**status**|String|Status|
|**instanceType**|String|Instance Type Family|
|**instanceId**|String|Instance ID|
|**createTime**|String|Creation Time|
|**aliasIpId**|String|Alias IP id|
|**charge**|[Charge](#charge)|Billing Information|
### <div id="Charge">Charge</div>
|Name|Type|Description|
|---|---|---|
|**chargeMode**|String|Payment model, the value shall be: prepaid_by_duration, postpaid_by_usage or postpaid_by_duration. prepaid_by_duration refers to Pay-In-Advance; postpaid_by_usage refers to Pay By Consumption and Pay-As-You-Go; postpaid_by_duration refers to Pay By Configuration and Pay-As-You-Go, and the default is taken as postpaid_by_duration|
|**chargeStatus**|String|Cost payment status, the value is respectively normal, overdue and arrear.|
|**chargeStartTime**|String|The start time of the billing shall be subject to ISO8601, with the UTC time with the format of YYYY-MM-DDTHH:mm:ssZ adopted|
|**chargeExpiredTime**|String|Expiration time, i.e. the expiration time of Pay-In-Advance resource shall be up to ISO8601, with the UTC time with the format of YYYY-MM-DDTHH:mm:ssZ adopted. Pay-As-You-Go resource field is blank|
|**chargeRetireTime**|String|The expected release time refers to the expected release time of resources. This value is both available for the Pay-In-Advance/Pay-As-You-Go resources, conforming to the ISO8601 standard, using the UTC time and following the format of YYYY-MM-DDTHH:mm:ssZ|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Bad request|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
