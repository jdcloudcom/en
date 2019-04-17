# createSubscription


## Description
Create subscription

## Request Method
POST

## Request Address
https://jcq.jdcloud-api.com/v1/regions/{regionId}/topics/{topicName}/subscriptions

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID of the Region|
|**topicName**|String|True| |topic Name|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**consumerGroupId**|String|True| |consumerGroupId|


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
