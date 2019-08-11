# addProtectedIp


## Description
Add protection IP of protection package.

## Request Method
POST

## Request Address
https://antipro.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}:addProtectedIp

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region Id, now the Anti-DDoS Protection Package is supported in: cn-north-1, cn-east-1 and cn-east-2|
|**instanceId**|String|True| |Protection package instance Id|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**protectedIpSpec**|ProtectedIpSpec|True| |Add protection IP request parameter of protection package|

### ProtectedIpSpec
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**ip**|String[]|True| |IP List Under Protection|

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
|**code**|Integer|Protection IP Addition Result, 0: Addition failed, 1: Addition succeeded|
|**message**|String|Please specify reasons for addition failure|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
