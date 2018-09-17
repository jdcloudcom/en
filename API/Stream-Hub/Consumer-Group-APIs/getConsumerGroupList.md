# getConsumerGroupList


## 描述
View all the consumer groups of the assigned subject

## 请求方式
GET

## 请求地址
https://streambus.jdcloud-api.com/v1/regions/{regionId}/consumerGroupList

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**topicId**|Integer|True||Subject id|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String||
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|名称|类型|描述|
|---|---|---|
|**consumerGroup**|Object[]||

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**400**|UNAUTHENTICATED|
