# statusReport


## Description
SMS Sending Receipt APIs

## Request Method
POST

## Request Address
https://sms.jdcloud-api.com/v1/regions/{regionId}/statusReport

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True|cn-north-1|Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**sequenceNumber**|String|True| |Send SMS serial number|
|**phoneList**|String[]|False| |List of Mobile Phone Number Requiring Receipt, Optional|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**data**|StatusReportResp[]|Pull a single SMS status response parameter|
|**status**|Boolean|Request Status|
|**code**|String|Error Code|
|**message**|String|Error Message|
### StatusReportResp
|Name|Type|Description|
|---|---|---|
|**phoneNum**|String|Mobile Phone Number|
|**sequenceNumber**|String|Send SMS serial number|
|**sendTime**|String|SMS Sending Time (yyyy-MM-dd HH:mm:ss)|
|**reportTime**|String|Receipt Receiving Time (yyyy-MM-dd HH:mm:ss)|
|**status**|Integer|Sending Status|
|**code**|String|Error Code|
|**splitNum**|Integer|Long SMS Split Serial Number (directly return 1 for short SMS)|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|INVALID_ARGUMENT|
|**500**|INTERNAL|
