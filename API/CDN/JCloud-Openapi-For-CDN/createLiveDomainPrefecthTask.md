# createLiveDomainPrefecthTask


## Description
Create live prewarm task

## Request Method
POST

## Request Address
https://cdn.jdcloud-api.com/v1/task:createLivePrefetchTask


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**urlList**|String[]|False| |Prewarm URL|
|**prefetchTime**|Integer|False| |Prewarm Duration|
|**action**|String|False| |Operation type only can be one of [start,stop]|


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
