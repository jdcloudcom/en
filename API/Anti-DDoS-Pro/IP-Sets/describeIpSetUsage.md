# describeIpSetUsage


## Description
Search instance IP blacklist and whitelist usage information

## Request Method
GET

## Request Address
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}:describeIpSetUsage

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID, Anti-DDoS Pro dose not differentiate regions, upload to cn-north-1 directly|
|**instanceId**|String|True| |Anti-DDoS Pro instance Id|

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
|**allocatedNum**|Integer|Count of IP blacklist and whitelist added to instance|
|**surplusAllocateNum**|Integer|Count of IP blacklist and whitelist additionally added to instance|
|**maxAllocateNum**|Integer|Count of maximum IP blacklist and whitelist added to instance|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
