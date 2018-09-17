# createConsumerGroup


## Description
Create consumerGroupName

## Request method
POST

## Request address
https://streambus.jdcloud-api.com/v1/regions/{regionId}/consumerGroup

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**consumerGroupStr**|[ConsumerGroup](##ConsumerGroup)|False||Consumer group object|

### <a name="ConsumerGroup">ConsumerGroup</a>
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**createdTime**|String|False|||
|**delete**|String|False|||
|**id**|Integer|False|||
|**name**|String|False|||
|**topicId**|Integer|False|||

## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String||
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**message**|String||
|**status**|Boolean||

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
|**401**|STREAMHUB_UNAUTHENTICATED|
|**400**|UNAUTHENTICATED|
