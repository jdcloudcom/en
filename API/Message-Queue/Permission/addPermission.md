# addPermission


## Description
Grant specific permissions to the target user for the current topic

## Request Method
POST

## Request Address
https://jcq.jdcloud-api.com/v1/regions/{regionId}/topics/{topicName}/iam

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID of the Region|
|**topicName**|String|True| |topic Name|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**permission**|String|True| |Permission type, [PUB,SUB,PUBSUB]|
|**targetUserId**|String|True| |Target Users UserId|


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
