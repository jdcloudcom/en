# describeLivePornData


## Description
Search live porn identification number data

## Request Method
GET

## Request Address
https://live.jdcloud-api.com/v1/livePornData


## Request Parameter
|Name|Type|If Compulsory|Description|
|---|---|---|---|
|**publishDomain**|String|True|Your Pushing Streaming Accelerated Domain|
|**appName**|String|False|Application Name of the Live Streaming|
|**streamName**|String|False|Live Streaming Name|
|**startTime**|String|True|Start Time:<br>  - UTC Time Format e.g: 2019-03-12T00:00:00Z<br>|
|**endTime**|String|False|End Time:<br>  - UTC Time Format e.g: 2019-03-12T00:00:00Z<br>|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|requestId|

### Result
|Name|Type|Description|
|---|---|---|
|**pornData**|PornData[]| |
### PornData
|Name|Type|Description|
|---|---|---|
|**publishDomain**|String|Searched Pushing Streaming Domain|
|**appName**|String|Searched Application Name|
|**streamName**|String|Searched Stream Name|
|**date**|String|Date:<br>  - yyyyMMdd Example:20190308<br>|
|**total**|Integer|Total Sheets of Porn Identification Per Day:<br>  - Unit: Sheet<br>|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
