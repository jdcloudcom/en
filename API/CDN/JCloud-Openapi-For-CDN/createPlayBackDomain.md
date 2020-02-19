# createPlayBackDomain


## Description
Create restart domain

## Request Method
POST

## Request Address
https://cdn.jdcloud-api.com/v1/playBackDomain/{domain}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**domain**|String|True| |User Domain|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**x-jdcloud-channel**|String|False|cdn|Domain source cdn/cdn, video cloud|
|**referDomain**|String|True| |Associated Live Streaming Domain|
|**externId**|String|True| |Outside Id|
|**startTime**|String|False| |Start time, format: yyyy-MM-dd HH:mm:ss|
|**endTime**|String|False| |End time, format: yyyy-MM-dd HH:mm:ss|
|**shiftTime**|Long|False| |Offset time, unit: second|
|**allowReviewTimeSpan**|Long|False| |Maximum allowable watching time, unit: second|
|**accelerateRegion**|String|False| |(mainLand: Mainland China, nonMainLand: overseas regions, Hong Kong, Macao and Taiwan, all: the World) the default value is mainLand|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Object| |
|**requestId**|String| |


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
