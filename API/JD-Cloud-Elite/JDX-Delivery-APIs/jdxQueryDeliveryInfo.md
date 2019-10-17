# jdxQueryDeliveryInfo


## Description
Delivery Information Search API

## Request Method
GET

## Request Address
https://elite.cn-south-1.jdcloud-api.com/v1/regions/{regionId}/jdxQueryDeliveryInfo

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**orderNumber**|String|True| |Order Number|


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
|**data**|QueryDeliveryInfoResultVo|Query Data Result|
### QueryDeliveryInfoResultVo
|Name|Type|Description|
|---|---|---|
|**remark**|String|Delivery Information|
|**effectiveDt**|String|Effective time, format: yyyy-MM-dd HH:mm:ss|
|**failureDt**|String|Invalid time, format: yyyy-MM-dd HH:mm:ss|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**500**|Internal server error|
