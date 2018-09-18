# deleteConsumerGroup


## Description
Delete consumerGroupName

## Request method
DELETE

## Request address
https://streambus.jdcloud-api.com/v1/regions/{regionId}/consumerGroup

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**consumerGroupId**|Integer|True||Consumer group ID|
|**topicId**|Integer|True||Subject ID|


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String||
|**result**|Result||


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
