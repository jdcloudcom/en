# describeMessage


## Description
Search message details

## Request Method
GET

## Request Address
https://jcq.jdcloud-api.com/v1/regions/{regionId}/topics/{topicName}/messages/{messageId}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**messageId**|String|True| |message Id|
|**regionId**|String|True| |Region ID of the Region|
|**topicName**|String|True| |topic Name|

## Request Parameter
None


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**message**|Message|Message Details|
### Message
|Name|Type|Description|
|---|---|---|
|**body**|String|Content|
|**messageId**|String|Message id|
|**properties**|String|Attribute json character string set by the user|
|**storeTime**|Number|Storage Time of the Message|
|**tags**|String|tag separated by commas|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
