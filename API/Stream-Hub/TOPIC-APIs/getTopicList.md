# getTopicList


## Description
Query the topic list, return to the topic collection

## Request method
GET

## Request address
https://streambus.jdcloud-api.com/v1/regions/{regionId}/topicList

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**keyword**|String|False| | |


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**topic**|Object[]| |

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**401**|ERROR|
