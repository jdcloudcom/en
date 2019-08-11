# modifyInstance


## Description
Upgrade protection package instance

## Request Method
PATCH

## Request Address
https://antipro.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region Id, now the Anti-DDoS Protection Package is supported in: cn-north-1, cn-east-1 and cn-east-2|
|**instanceId**|String|True| |Protection package instance Id|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**modifyInstanceSpec**|ModifyInstanceSpec|True| |Upgrade protection package instance request parameter|

### ModifyInstanceSpec
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**ipNum**|Integer|True| |Protective IP counts, 1, 5, 10, 50, 100, 1,000 (infinite), can be upgraded and cannot be degraded|
|**bpGbps**|Integer|True| |Basic bandwidth: 10, 20, 30 and 50, unit: Gbps, can be upgraded and cannot be degraded|
|**epGbps**|Integer|True| |Elastic bandwidth: 0, 10 and 20, Unit: Gbps, can be upgraded and cannot be degraded|

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
|**instanceId**|String|Upgraded Protection Package Instance Id|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
