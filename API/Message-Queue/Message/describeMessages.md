# describeMessages


## Description
Message List

## Request Method
GET

## Request Address
https://jcq.jdcloud-api.com/v1/regions/{regionId}/topics/{topicName}/messages

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID of the Region|
|**topicName**|String|True| |topic Name|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**endTime**|String|True| |End Time|
|**startTime**|String|True| |Start Time|


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**messages**|Message[]| |
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
