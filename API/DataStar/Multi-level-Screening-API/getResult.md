# getResult


## Description
Query Interface for Multi-level Filtered Result

## Request Method
GET

## Request Address
https://datastar.cn-south-1.jdcloud-api.com/v1/v1/regions/{regionId}/profileMultiLevel/getResult

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**profileSelectRecordId**|String|True| |Multi-level Filtered Task ID|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID, requests are different at each time|
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**data**|String|Execution Result of Multi-level Filtered Task|
|**message**|String|Description Information|
|**status**|Boolean|true is success, false is failure|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**500**|Internal server error|
