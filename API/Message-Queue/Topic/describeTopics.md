# describeTopics


## Description
Search topic list

## Request Method
GET

## Request Address
https://jcq.jdcloud-api.com/v1/regions/{regionId}/topics

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID of the Region|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False| |Page Number in Paging|
|**pageSize**|Integer|False| |Each Page Size in Paging|
|**tagFilters**|TagFilter[]|False| |Tag Filter Requirements|
|**topicFilter**|String|False| |The filter conditions of topic names, uppercase and lowercase insensitive|

### TagFilter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**key**|String|True| |Tag Key|
|**values**|String[]|True| |Tag Value|

## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**topics**|Topic[]| |
|**totalCount**|Integer|Total Amount|
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
