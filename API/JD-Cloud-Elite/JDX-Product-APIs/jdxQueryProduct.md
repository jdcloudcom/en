# jdxQueryProduct


## Description
Commodity Output API

## Request Method
GET

## Request Address
https://elite.cn-south-1.jdcloud-api.com/v1/regions/{regionId}/jdxQueryProduct

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNo**|Integer|True| |Page (min. 1)|
|**pageSize**|Integer|True| |Number of Records per Page (min. 10, max. 100)|


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
|**data**|JdxProductVoListData|Query Data Result|
### JdxProductVoListData
|Name|Type|Description|
|---|---|---|
|**pageNo**|Integer|Page|
|**pageSize**|Integer|Number of Records per Page|
|**totalRecord**|Integer|Number of Total Records|
|**totalPage**|Integer|Total Number of Pages|
|**dataList**|JdxProductVo[]|Commodity Information List|
### JdxProductVo
|Name|Type|Description|
|---|---|---|
|**productId**|Integer|Product ID|
|**productName**|String|Product Name|
|**trademarkUrl**|String|Address on Trademark Figure|
|**categoryLevel1Name**|String|Name of Level I Category|
|**categoryLevel2Name**|String|Name of Level II Category|
|**deliveryForm**|Integer|Delivery Form|
|**deliveryFormName**|String|Delivery Form Name|
|**introduction**|String|Commodity Introduction|
|**sellType**|Integer|Commodity Pricing Mode: 1. By Times, 2: By Period, 3: By Package|
|**sellTypeName**|String|Commodity Pricing Mode Name|
|**refundDays**|Integer|-1: Refund is not allowed, unit: day, default-1|
|**pcProductDetail**|String|pc End Commodity Details|
|**mProductDetail**|String|m End Commodity Details|
|**productSkuList**|JdxProductSkuVo[]|sku Details|
### JdxProductSkuVo
|Name|Type|Description|
|---|---|---|
|**skuId**|Integer|sku ID|
|**skuName**|String|sku Name|
|**saleAttributes**|String|As for sales attribute json character rings, version means version (package, period and commodities in the package all have this attribute), validity means period (commodities in the period and package have this attribute) and packageNum means entry number (only commodities in the package have this attribute): for example [{"attrCode":"version","attrValue":"Upgrade"},{"attrCode":"validity","attrValue":365},{"attrCode":"packageNum","attrValue":1000}]|
|**maxBuyNum**|Integer|Maximum Purchase Quantity|
|**minBuyNum**|Integer|Minimum Purchase Quantity|
|**skuSellingPrice**|Number|sku Price|
|**skuExtraChargeList**|JdxSkuExtraChargeVo[]|Information of Additional Billing Items|
### JdxSkuExtraChargeVo
|Name|Type|Description|
|---|---|---|
|**extraChargeName**|String|Additional Billing Item Name|
|**extraChargeUnit**|String|Unit of Additional Billing Item|
|**sellingPrice**|Number|Price|
|**numType**|Integer|1. Range 2. Enumeration|
|**num**|String|1,100 separated by a comma, numType=1 means the range of purchasable count, numType=2 means only supporting specific purchase number|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**500**|Internal server error|
