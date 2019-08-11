# deleteProtectedIp


## Description
Delete protection IP of protection package

## Request Method
POST

## Request Address
https://antipro.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}:deleteProtectedIp

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region Id, now the Anti-DDoS Protection Package is supported in: cn-north-1, cn-east-1 and cn-east-2|
|**instanceId**|String|True| |Protection package instance Id|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**protectedIpSpec**|ProtectedIpSpec|True| |Delete protection IP request parameter of protection package|

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
|**code**|Integer|Protection IP deletion result, 0: Deletion failed, 1: Deletion succeeded|
|**message**|String|Please specify the reasons for deletion failure|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
