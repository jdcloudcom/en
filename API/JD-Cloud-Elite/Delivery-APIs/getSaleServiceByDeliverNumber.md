# getSaleServiceByDeliverNumber


## Description
Search delivery form information based on delivery form number

## Request Method
GET

## Request Address
https://elite.cn-south-1.jdcloud-api.com/v1/regions/{regionId}/getSaleServiceByDeliverNumber

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**deliverNumber**|String|True| |Delivery Form Number|


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
|**data**|ProductServiceVo|Query Data Result|
### ProductServiceVo
|Name|Type|Description|
|---|---|---|
|**deliverNumber**|String|Delivery Form Number|
|**orderNumber**|String|Order Number|
|**productId**|Integer|Product ID|
|**skuId**|Integer|sku ID|
|**skuName**|String|sku Name|
|**serviceCode**|String|Service code|
|**num**|Integer|Count|
|**period**|Integer|Period|
|**periodType**|Integer|Period Type|
|**periodTypeName**|String|Period Type Name|
|**accountNum**|Integer|Quantity of Accounts|
|**deliverStatus**|Integer|Delivery Status|
|**deliverStatusName**|String|Delivery Status Name|
|**effectiveDt**|String|Service effective time, in the format of yyyy-MM-dd HH:mm:ss|
|**failureDt**|String|Service expiration time, in the format of yyyy-MM-dd HH:mm:ss|
|**extraInfo**|String|Commodity Attribute|
|**remark**|String|Delivery Form Description|
|**orderTotalFee**|String|Order Amount|
|**orderActualFee**|String|Actual Order Payment Amount|
|**paymentDt**|String|Order Payment Time|
|**extraChargeInfo**|String|Information of Additional Billing Items|
|**orderItemExtraChargeInfos**|OrderItemExtraChargeInfo[]|Information of Additional Billing Details|
### OrderItemExtraChargeInfo
|Name|Type|Description|
|---|---|---|
|**name**|String|Purchase user pin|
|**unit**|String|Unit|
|**buyNum**|Integer|Purchase|
|**sellingPrice**|String|Sales Price|
|**settlementPrice**|String|Settlement Price|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**500**|Internal server error|
