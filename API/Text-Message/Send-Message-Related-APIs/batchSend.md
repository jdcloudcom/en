# batchSend


## Description
Designate template and send SMS to groups

## Request Method
POST

## Request Address
https://sms.jdcloud-api.com/v1/regions/{regionId}/batchSend

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True|cn-north-1|Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**templateId**|String|True| |Template Id|
|**signId**|String|True| |Signature Id|
|**phoneList**|String[]|True| |For domestic phone numbers for mass texting, SMS shall not be send to no more than 100 mobile phone numbers per mass testing|
|**params**|String[]|False| |Data value corresponding to SMS template variable, in the format of Array|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**data**|BatchSendResp|Send mass SMS response parameters via designated SMS Id|
|**status**|Boolean|Request Status|
|**code**|String|Error Code|
|**message**|String|Error Message|
### BatchSendResp
|Name|Type|Description|
|---|---|---|
|**sequenceNumber**|String|Serial number of the request sent|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|INVALID_ARGUMENT|
|**500**|INTERNAL|
