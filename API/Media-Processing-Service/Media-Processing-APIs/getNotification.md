# getNotification


## 描述
Acquire Screenshot Notification

## 请求方式
GET

## 请求地址
https://mps.jdcloud-api.com/v1/regions/{regionId}/notification

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True||region id|

## 请求参数
无


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String||
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|名称|类型|描述|
|---|---|---|
|**notification**|[Notification](##Notification)||
### <a name="Notification">Notification</a>
|名称|类型|描述|
|---|---|---|
|**enabled**|Boolean|Whether to enable notifications|
|**endpoint**|String|Notify endpoint, support http:// and https:// currently|
|**events**|String[]|Collection of events that trigger notifications (mpsTranscodeComplete, mpsThumbnailComplete)|
|**notifyContentFormat**|String|Describes the format of the message pushed to the Endpoint; JSON: contains the message text and message properties; SIMPLIFIED: message body is the message released by the user, excluding any properties information|
|**notifyStrategy**|String|Retry policy, BACKOFF_RETRY: Backoff retry strategy, retry 3 times. The interval between each retry is a random value between 10 seconds and 20 seconds; EXPONENTIAL_DECAY_RETRY: exponential decay retry, retry 176 times.  The interval between each retry is incremented to 512 seconds, and the total retry time is 1 day; the specific interval for each retry is: 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 512 ... 512 seconds (167 512s in total)|

## 返回码
|返回码|描述|
|---|---|
|**200**|Successful|
