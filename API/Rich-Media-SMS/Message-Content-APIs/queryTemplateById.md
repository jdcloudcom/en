# queryTemplateById


## Description
Search APIs of one Rich Media SMS

## Request Method
POST

## Request Address
https://rms.jdcloud-api.com/v2/regions/{regionId}/queryTemplateById

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True|cn-north-1|Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**templateId**|String|True| |SMS ID|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**data**|RespQueryTemplateListData|Response Data|
|**status**|Boolean|Request Status|
|**code**|String|Error Code|
|**message**|String|Error Message|
### RespQueryTemplateListData
|Name|Type|Description|
|---|---|---|
|**templateId**|String|SMS ID|
|**title**|String|SMS Title|
|**status**|String|Review Status  0: Reviewing  1: Pass  2: Failed  4: To Be Submitted|
|**reason**|String|Unapproved Reason|
|**createTime**|String|SMS Creation Time yyyy-MM-dd HH:mm:ss|
|**contentSize**|String|SMS Size|
|**aptitudesId**|String|Qualification Id|
|**description**|String|SMS Description|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|INVALID_ARGUMENT|
|**500**|INTERNAL|
