# getStoreService


## Description
Obtain cloud storage service information

## Request Method
GET

## Request Address
https://elite.cn-south-1.jdcloud-api.com/v1/regions/{regionId}/getStoreService

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**buyerPin**|String|True| |Purchase user pin|
|**businessData**|String|True| |Business data, consistent with the business data when the order is given|
|**queryAll**|Boolean|False| |Search all or not. In case of incoming false, search those with valid time currently, and in other cases, search all|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|Request ID, requests are different at each time|

### Result
|Name|Type|Description|
|---|---|---|
|**status**|Boolean|true is success, false is failure|
|**message**|String|Description Information|
|**data**|StoreServiceVo|Query Data Result|
### StoreServiceVo
|Name|Type|Description|
|---|---|---|
|**buyerPin**|String|Purchase user pin|
|**businessData**|String|Business data, incoming when the order is given|
|**storeServiceDetails**|StoreServiceDetailVo[]|Detailed List of Cloud Storage Service|
|**orderNum**|Integer|Quantity of Orders|
|**updateTime**|String|Update Time, in the format of yyyy-MM-dd HH:mm:ss|
### StoreServiceDetailVo
|Name|Type|Description|
|---|---|---|
|**spuId**|Integer|id corresponding to commodity spu|
|**skuId**|Integer|id corresponding to commodity sku|
|**storeDays**|Integer|Number of Accumulated Days|
|**startTime**|String|Start Time, in the format of yyyy-MM-dd HH:mm:ss|
|**endTime**|String|End Time, in the format of yyyy-MM-dd HH:mm:ss|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**500**|Internal server error|
