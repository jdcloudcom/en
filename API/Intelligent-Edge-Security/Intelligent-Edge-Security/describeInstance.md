# describeInstance


## Description
Search instance information

## Request Method
GET

## Request Address
https://edgesecurity.jdcloud-api.com/v1/describeInstance


## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](#result)| |
|**requestId**|String| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**instanceId**|Long|Instance ID|
|**resourceId**|String|Resource ID|
|**businessBandwidth**|Integer|Business acceleration bandwidth (normal business consumption bandwidth, Mbps)|
|**basicBandwidth**|Integer|Basic Bandwidth (Gbps)|
|**elasticBandwidth**|Integer|Elastic Bandwidth (Gbps)|
|**businessQps**|Integer|Normal Business qps|
|**peakQps**|Integer|CC Defense Peak|
|**createTime**|String|Creation Time|
|**expireTime**|String|Expiration Time|
|**chargeStatus**|Integer|Billing type (0->normal 1->arrearage 2->due)|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
