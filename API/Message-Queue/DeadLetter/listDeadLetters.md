# listDeadLetters


## Description
Dead Letter Queue List

## Request Method
GET

## Request Address
https://jcq.jdcloud-api.com/v1/regions/{regionId}/topics/{topicName}/subscriptions/{consumerGroupId}:listDeadLetters

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**consumerGroupId**|String|True| |consumerGroupId|
|**regionId**|String|True| |Region ID of the Region|
|**topicName**|String|True| |topic Name|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**endTime**|String|True| |End Time|
|**pageNumber**|Integer|False| |Page Number; 1 by Default|
|**pageSize**|Integer|False| |Page size; it is 20 by default; value range[10, 100]|
|**startTime**|String|True| |Start Time|


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**deadLetters**|DeadLetter[]| |
|**totalCount**|Integer|Total Amount|
### DeadLetter
|Name|Type|Description|
|---|---|---|
|**expireTime**|String|Expiration Time|
|**messageId**|String|id|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
