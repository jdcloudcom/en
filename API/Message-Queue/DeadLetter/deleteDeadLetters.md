# deleteDeadLetters


## Description
Delete dead letter message

## Request Method
DELETE

## Request Address
https://jcq.jdcloud-api.com/v1/regions/{regionId}/topics/{topicName}/subscriptions/{consumerGroupId}:deleteDeadLetters

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**consumerGroupId**|String|True| |consumerGroupId|
|**regionId**|String|True| |Region ID of the Region|
|**topicName**|String|True| |topic Name|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**messageIds**|String|False| |messageIds, separated by multiple commas, not passing the value is to delete all dead letters|


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**messageIds**|String[]| |

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
