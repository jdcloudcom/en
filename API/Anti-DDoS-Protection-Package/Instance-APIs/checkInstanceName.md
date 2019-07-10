# checkInstanceName


## Description
Detect if instance name is available, with protection package instance name unrepeatable

## Request Method
GET

## Request Address
https://antipro.jdcloud-api.com/v1/checkInstanceName


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**instanceName**|String|True| |Name of instance to be detected, restricted to 1-80 characters in length and only supporting Chinese characters, letters, numbers, -, ., / and _|


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
|**code**|Integer|Detection result code, 0: unavailable, 1: available|
|**message**|String|Detection result, specify reasons in the case of unavailable|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
