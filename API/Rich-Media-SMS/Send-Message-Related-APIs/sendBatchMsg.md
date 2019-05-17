# sendBatchMsg


## Description
Send mass SMS via designated SMS Id

## Request Method
POST

## Request Address
https://rms.jdcloud-api.com/v1/regions/{regionId}/sendBatchMsg

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**sendBatchMsgSpec**|SendBatchMsgSpec|True| |Send mass SMS request parameters via designated SMS Id|

### SendBatchMsgSpec
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**appId**|String|True| |Application Id|
|**messageId**|String|True| |SMS Id|
|**phone**|String[]|True| |For domestic phone numbers for mass texting, SMS shall not be send to no more than 100 mobile phone numbers per mass testing|
|**params**|String[]|False| |Data value corresponding to SMS template variable, in the format of Array|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|Request Id|

### Result
|Name|Type|Description|
|---|---|---|
|**data**|SendBatchMsg|Send mass SMS response parameters via designated SMS Id|
### SendBatchMsg
|Name|Type|Description|
|---|---|---|
|**status**|Boolean|Request Status|
|**code**|String|Error Code|
|**message**|String|Error Message|
|**sequenceNumber**|String|Serial number of the request sent|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|INVALID_ARGUMENT|
|**500**|INTERNAL|
