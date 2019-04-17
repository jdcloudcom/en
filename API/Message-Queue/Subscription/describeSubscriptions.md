# describeSubscriptions


## Description
Subscription List

## Request Method
GET

## Request Address
https://jcq.jdcloud-api.com/v1/regions/{regionId}/topics/{topicName}/subscriptions

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID of the Region|
|**topicName**|String|True| |topic Name|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**consumerGroupFilter**|String|False| |The filter requirements of consumerGroupFilter, consumerGroupId|
|**pageNumber**|Integer|False| |Page Number in Paging|
|**pageSize**|Integer|False| |Each Page Size in Paging|


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**subscriptions**|Subscription[]| |
|**totalCount**|Integer|Total Amount of Subscription Relations|
### Subscription
|Name|Type|Description|
|---|---|---|
|**consumerGroupId**|String|consumerGroupId|
|**consumerNumbers**|Integer|Online Customer Number|
|**createTime**|String|Creation Time|
|**dlqEnable**|Boolean|Whether to enable dead letter queue|
|**endPoint**|String|endPoint|
|**lastUpdateTime**|String|Last Update Time|
|**maxRetryTimes**|Integer|Maximum Retry Times|
|**messageInvisibleTimeInSeconds**|Integer|messageInvisibleTimeInSeconds|
|**subscriptionType**|String|subscriptionType|
|**tags**|String[]|tags|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
