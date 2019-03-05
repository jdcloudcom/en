# describeTopic


## Description
Search topic details

## Request Method
GET

## Request Address
https://jcq.jdcloud-api.com/v1/regions/{regionId}/topics/{topicName}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
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
|**topic**|Topic| |
### Topic
|Name|Type|Description|
|---|---|---|
|**authorizedPermission**|String|Granted permissions [PUB,SUB,PUBSUB,READ_ONLY,ADMIN]|
|**createTime**|String|Creation Time|
|**description**|String|Description|
|**lastUpdateTime**|String|Update time|
|**messageLifeTimeInHours**|Integer|Hours of message life cycle duration|
|**own**|Boolean|Is it your own topic|
|**subscriptionCount**|Integer|Number of subscriptions created by yourself|
|**tags**|Tag[]|Tag Information|
|**topicConfig**|TopicConfig|Configuration Information|
|**topicId**|String|topic Id|
|**topicName**|String|topic Name|
|**topicStatus**|String|topicStatus|
### Tag
|Name|Type|Description|
|---|---|---|
|**key**|String|Tag Key|
|**value**|String|Tag Value|
### TopicConfig
|Name|Type|Description|
|---|---|---|
|**maxMessageSizeKB**|Integer|Largest Message Length|
|**threshold**|Integer|tps|
|**topicPermission**|String|topicPermission|
|**topicType**|String|topicType|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
