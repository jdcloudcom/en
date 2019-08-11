# describeInstance


## Description
Search protection package instance

## Request Method
GET

## Request Address
https://antipro.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region Id, now the Anti-DDoS Protection Package is supported in: cn-north-1, cn-east-1 and cn-east-2|
|**instanceId**|String|True| |Protection package instance Id|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |
|**error**|Error| |

### Error
|Name|Type|Description|
|---|---|---|
|**err**|Err| |
### Err
|Name|Type|Description|
|---|---|---|
|**code**|Long|Same as http code|
|**details**|Object| |
|**message**|String| |
|**status**|String|Specific Error|
### Result
|Name|Type|Description|
|---|---|---|
|**data**|Instance| |
### Instance
|Name|Type|Description|
|---|---|---|
|**id**|String|Protection package instance Id|
|**name**|String|Protection Package Instance Name|
|**region**|String|Protection Package Instance Region|
|**type**|Integer|Package type.<br>-1: Exclusive IP<br>- 2: Shared IP|
|**ipCount**|Integer|Protectable IP Counts|
|**basicBandwidth**|Integer|Basic bandwidth, unit: Gbps|
|**elasticBandwidth**|Integer|Elastic bandwidth: unit: Gbps|
|**expireTime**|String|Instance Expiration Time|
|**createTime**|String|Instance Creation Time|
|**protectedObjects**|ProtectedObject[]|Protection Object|
|**onTrial**|Boolean|Whether it is a trial protection package|
|**resourceId**|String|Resource Id|
### ProtectedObject
|Name|Type|Description|
|---|---|---|
|**type**|String|Protection object type: eip: Elastic IP, cps: public IP of Cloud Physical Server, ccs: public IP of Cabinet Service|
|**count**|Integer|Protected IP Counts|
|**ipList**|ProtectedIp[]|Protection IP List|
### ProtectedIp
|Name|Type|Description|
|---|---|---|
|**ip**|String|Protected IP|
|**safeStatus**|Integer|Security Status, <br>- 0: Secure<br>- 1: Clean<br>- 2: Black Hole|
|**resourceType**|Integer|Public IP type or associated resource type.<br>- 0: Unknown type,<br>- 1: Elastic IP (IP is elastic IP, and associated resource type is unknown),<br>- 10: Elastic IP (IP is elastic IP, and no resource is associated),<br>- 11: Virtual Machines,<br>- 12: Load Balancer,<br>- 13: Native Container Instance,<br>- 14: Native Container Pod,<br>- 2: Public IP of Cloud Physical Server,<br>- 4: Public IP of Cabinet Service|
|**protectionRuleType**|Integer|Protection Rules Type. <br>-0: Default (protection rule of protection package), <br>-1: Customized rule of IP|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
