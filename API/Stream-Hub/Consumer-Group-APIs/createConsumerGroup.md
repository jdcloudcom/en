# createConsumerGroup


## 描述
Create consumerGroupName

## 请求方式
POST

## 请求地址
https://streambus.jdcloud-api.com/v1/regions/{regionId}/consumerGroup

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**consumerGroupStr**|ConsumerGroup|False| |Consumer Group Object|

### ConsumerGroup
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**createdTime**|String|False| | |
|**delete**|String|False| | |
|**id**|Integer|False| | |
|**name**|String|False| | |
|**topicId**|Integer|False| | |

## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |

### Result
|名称|类型|描述|
|---|---|---|
|**message**|String| |
|**status**|Boolean| |

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**401**|STREAMHUB_UNAUTHENTICATED|
|**400**|UNAUTHENTICATED|
