# reply


## Description
SMS Reply APIs

## Request Method
POST

## Request Address
https://sms.jdcloud-api.com/v1/regions/{regionId}/reply

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True|cn-north-1|Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**appId**|String|True| |Application Id|
|**dataDate**|String|True| |Search Time|
|**phoneList**|String[]|False| |Mobile Phone Number List (Optional)|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**data**|ReplyResp[]|Pull a single SMS status response parameter|
|**status**|Boolean|Request Status|
|**code**|String|Error Code|
|**message**|String|Error Message|
### ReplyResp
|Name|Type|Description|
|---|---|---|
|**appId**|String|Application Id|
|**signId**|String|Signature Id|
|**phoneNum**|String|Mobile Phone Number|
|**dataTime**|String|Reply Time (yyyy-MM-dd HH:mm:ss)|
|**content**|String|Reply|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|INVALID_ARGUMENT|
|**500**|INTERNAL|
