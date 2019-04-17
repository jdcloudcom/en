# createTopic


## Description
Create one topic with a specified name

## Request Method
POST

## Request Address
https://jcq.jdcloud-api.com/v1/regions/{regionId}/topics

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID of the Region|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**description**|String|False| |The description, the length cannot exceed 255|
|**topicName**|String|True| |topic Name|
|**type**|String|True| |Type, [normal,global_order]|


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
