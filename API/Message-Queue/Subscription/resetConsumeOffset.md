# resetConsumeOffset


## Description
Reset consumption bit

## Request Method
POST

## Request Address
https://jcq.jdcloud-api.com/v1/regions/{regionId}/topics/{topicName}/subscriptions/{consumerGroupId}:resetConsumeOffset

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**consumerGroupId**|String|True| |consumerGroupId|
|**regionId**|String|True| |Region ID of the Region|
|**topicName**|String|True| |topic Name|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**time**|String|True| |Time|


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
