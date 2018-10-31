# getConsumerGroupList


## Description
View all the consumer groups of the assigned subject

## Request method
GET

## Request address
https://streambus.jdcloud-api.com/v1/regions/{regionId}/consumerGroupList

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**topicId**|Integer|True| |Subject ID|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**consumerGroup**|Object[]| |

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|UNAUTHENTICATED|
