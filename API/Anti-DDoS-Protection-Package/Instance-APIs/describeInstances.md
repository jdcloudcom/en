# describeInstances


## Description
Search protection package instance list

## Request Method
GET

## Request Address
https://antipro.jdcloud-api.com/v1/regions/{regionId}/instances

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region Code|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False|1|Page|
|**pageSize**|Integer|False|10|Paging Size|
|**name**|String|False| |Protection package name, supporting fuzzy match|


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
|**dataList**|Instance[]| |
|**currentCount**|Integer|Current Page Counts|
|**totalCount**|Integer|Total Instance Counts|
|**totalPage**|Integer|Total Number of Pages|
### Instance
|Name|Type|Description|
|---|---|---|
|**id**|String|Protection package instance Id|
|**name**|String|Protection Package Instance Name|
|**region**|String|Protection Package Instance Region|
|**type**|Integer|Package type, 1: Exclusive IP, 2: Shared IP|
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
|**type**|String|Protection object type: eip: Elastic IP, cps: Cloud Physical Server|
|**count**|Integer|Protected IP Counts|
|**ipList**|ProtectedIp[]|Protection IP List|
### ProtectedIp
|Name|Type|Description|
|---|---|---|
|**ip**|String|Protected IP|
|**safeStatus**|Integer|Security Status, 0: Secure, 1: Clean, 2: Black Hole|
|**resourceType**|Integer|Public IP type or associated resource type:<br>  0: Unknown type,<br>  1: Elastic IP (IP is elastic IP, and associated resource type is unknown),<br>  10: Elastic IP (IP is elastic IP, and no resource is associated),<br>  11: Virtual Machines,<br>  12: Load Balancer,<br>  13: Native Container Instance,<br>  14: Native Container Pod,<br>  2: Cloud Physical Server,<br>|
|**protectionRuleType**|Integer|Protection Rules Type, 0: Default (protection rule of protection package), 1: Customized rule of IP|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
