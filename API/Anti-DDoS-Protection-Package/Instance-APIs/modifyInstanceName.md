# modifyInstanceName


## Description
Modify protection package instance name

## Request Method
PATCH

## Request Address
https://antipro.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}:modifyInstanceName

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region Id, now the Anti-DDoS Protection Package is supported in: cn-north-1, cn-east-1 and cn-east-2|
|**instanceId**|String|True| |Protection package instance Id|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**modifyInstanceNameSpec**|ModifyInstanceNameSpec|True| |Modify protection package instance name request parameter|

### ModifyInstanceNameSpec
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|True| |Name of new instance, restricted to 1-80 characters in length and only supporting Chinese characters, letters, numbers, -, ., / and _|

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
|**code**|Integer|Modification results, 0: Modification failed, 1: Modification succeeded|
|**message**|String|Please specify the reasons for modification failure|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
