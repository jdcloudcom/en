# describeSubscription


## Description
Search subscription details

## Request Method
GET

## Request Address
https://jcq.jdcloud-api.com/v1/regions/{regionId}/topics/{topicName}/subscriptions/{consumerGroupId}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**consumerGroupId**|String|True| |consumerGroupId|
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
|**subscription**|Subscription|Subscription Details|
### Subscription
|Name|Type|Description|
|---|---|---|
|**consumerGroupId**|String|consumerGroupId|
|**consumerNumbers**|Integer|Online Customer Number|
|**createTime**|String|Creation Time|
|**dlqEnable**|Boolean|Whether to enable dead letter queue|
|**endPoint**|String|endPoint|
|**lastUpdateTime**|String|Last Update Time|
|**maxRetryTimes**|Integer|Maximum Retry Times|
|**messageInvisibleTimeInSeconds**|Integer|messageInvisibleTimeInSeconds|
|**subscriptionType**|String|subscriptionType|
|**tags**|String[]|tags|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
