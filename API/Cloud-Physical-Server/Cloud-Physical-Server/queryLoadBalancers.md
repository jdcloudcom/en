# queryLoadBalancers


## Description
Search Load Balancer instance list

## Request Method
GET

## Request Address
https://cps.jdcloud-api.com/v1/regions/{regionId}/slbs

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID, call APIs (queryCPSLBRegions) to get regions supported by Cloud Physical Server|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False|1|Page number; xxx by default1|
|**pageSize**|Integer|False|20|Segmentation size; it is 20 by default; value range[20, 100]|
|**status**|String|False| |Status|
|**name**|String|False| |Name|
|**vpcId**|String|False| |VPC ID, Exact Match|
|**bindEip**|Boolean|False| |Associate eip or not|
|**filters**|Filter[]|False| |loadBalancerId - Load Balancer instance ID, exact matching, supporting multiple IDs<br>|

### Filter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|True| |Name of Filter Requirements|
|**operator**|String|False| |Operator of filter requirements is eq by default|
|**values**|String[]|True| |Value of Filter Requirements|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**loadBalancers**|LoadBalancer[]| |
|**pageNumber**|Integer|Page Number; 1 by Default|
|**pageSize**|Integer|Segmentation size; it is 20 by default; value range[20, 100]|
|**totalCount**|Integer|Search result amount|
### LoadBalancer
|Name|Type|Description|
|---|---|---|
|**loadBalancerId**|String|Load Balancer Instance ID|
|**region**|String|Region, such as cn-east-1|
|**ipAddressType**|String|IP version, with the value ipv4|
|**netType**|String|Network Type, with the value public|
|**vpcId**|String|VPC ID|
|**elasticIpId**|String|Elastic IPID|
|**publicIp**|String|Public IP|
|**bandwidth**|Integer|Bandwidth|
|**status**|String|Status, with the value active|inactive|
|**name**|String|Name|
|**description**|String|Description|
|**createTime**|String|Creation Time|
|**charge**|Charge|Billing Configuration|
### Charge
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
