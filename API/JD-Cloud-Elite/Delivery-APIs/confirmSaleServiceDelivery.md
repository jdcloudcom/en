# confirmSaleServiceDelivery


## Description
Confirm to deliver

## Request Method
POST

## Request Address
https://elite.cn-south-1.jdcloud-api.com/v1/regions/{regionId}/confirmSaleServiceDelivery

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**confirmDeliveryInfo**|ConfirmDeliveryInfo|True| |Delivery Information|

### ConfirmDeliveryInfo
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**deliverNumber**|String|False| |Delivery Form Number|
|**remark**|String|False| |Delivery form description, being filled with information at the time of delivery, such as website and account etc.|

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

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**500**|Internal server error|
