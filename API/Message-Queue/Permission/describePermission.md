# describePermission


## Description
View which specific permissions are granted to which target users for the current topic

## Request Method
GET

## Request Address
https://jcq.jdcloud-api.com/v1/regions/{regionId}/topics/{topicName}/iam

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
|**permissions**|Permission[]| |
### Permission
|Name|Type|Description|
|---|---|---|
|**permission**|String|permission, [SUB, PUB, PUBSUB]|
|**userId**|String|userId|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
