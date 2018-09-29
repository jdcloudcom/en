# setNotification


## Description
Set the media processing notification. Endpoint will be verified when setting the Notification, and SubscriptionConfirmation(x-jdcloud-message-type head) will be sent to the endpoint, which requests base64 encoding for the Message content that are then to be returned to the system (body) for verification.

## Request method
PUT

## Request address
https://mps.jdcloud-api.com/v1/regions/{regionId}/notification

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |region id|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**enabled**|Boolean|True| |Whether to enable notifications|
|**endpoint**|String|False| |Notify endpoint, support http:// and https:// currently|
|**events**|String[]|False| |Collection of events that trigger notifications (mpsTranscodeComplete, mpsThumbnailComplete)|
|**notifyContentFormat**|String|False|SIMPLIFIED|Describes the format of the message pushed to the Endpoint; JSON: contains the message text and message properties; SIMPLIFIED: message body is the message released by the user, excluding any properties information|
|**notifyStrategy**|String|False|BACKOFF_RETRY|Retry policy, BACKOFF_RETRY: Backoff retry strategy, retry 3 times. The interval between each retry is a random value between 10 seconds and 20 seconds; EXPONENTIAL_DECAY_RETRY: exponential decay retry, retry 176 times.  The interval between each retry is incremented to 512 seconds, and the total retry time is 1 day; the specific interval for each retry is: 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 512 ... 512 seconds (167 512s in total)|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |



## Response code
|Return code|Description|
|---|---|
|**200**|Successful|
