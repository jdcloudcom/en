# jdxCreateOrder


## Description
Order API

## Request Method
POST

## Request Address
https://elite.cn-south-1.jdcloud-api.com/v1/regions/{regionId}/jdxCreateOrder

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**createOrderInfo**|CreateOrderInfo|True| |Order Information|

### CreateOrderInfo
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**productId**|Integer|True| |spu ID|
|**skuId**|Integer|True| |sku ID|
|**buyNum**|Integer|True| |Purchase|
|**remark**|String|False| |Remark|
|**cartExtraChargeVos**|CartExtraChargeVo[]|False| |Information of Additional Billing Items|
### CartExtraChargeVo
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|False| |Additional Billing Item Name|
|**buyNum**|Integer|False| |Purchase|

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
|**data**|CreateOrderResultVo|Order Number Generated After Placing an Order|
### CreateOrderResultVo
|Name|Type|Description|
|---|---|---|
|**orderNumber**|String|Order Number|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**500**|Internal server error|
