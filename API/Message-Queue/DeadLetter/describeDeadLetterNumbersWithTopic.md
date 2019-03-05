# describeDeadLetterNumbersWithTopic


## Description
Dead Letter Message Number

## Request Method
GET

## Request Address
https://jcq.jdcloud-api.com/v1/regions/{regionId}/topics/{topicName}/deadLetterNumbers

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID of the Region|
|**topicName**|String|True| |topic Name|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**consumerGroupId**|String|False| |If the consumerGroupId is empty, the number of dead letters in all subscription relationships under the Topic is displayed|
|**pageNumber**|Integer|False| |Page|
|**pageSize**|Integer|False| |Number on Each Page|


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**deadLetterNumbers**|DeadLetterNumber[]| |
|**totalCount**|Integer|Total Amount|
### DeadLetterNumber
|Name|Type|Description|
|---|---|---|
|**consumerGroupId**|String|consumerGroupId|
|**deadLetterNumber**|Integer|Dead Letter Queue Number|
|**topicId**|String|topic Number|
|**topicName**|String|topic Name|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
