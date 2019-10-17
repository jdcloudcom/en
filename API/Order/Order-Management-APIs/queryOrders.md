# queryOrders


## Description
Search Order List

## Request Method
POST

## Request Address
https://order.jdcloud-api.com/v2/regions/{regionId}/orders

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region Code|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**queryVo**|ListOrderRequest|False| | |

### ListOrderRequest
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**appCode**|String|False| |Business Line|
|**chargeMode**|String|False| |Billing Type (CONFIG - Pay By Configuration, FLOW - Pay By Consumption, MONTHLY - Monthly Package, ONCE - Pay By Times)|
|**startTime**|Long|False| |Search Order Start Time Stamp|
|**endTime**|Long|False| |Search Order End Time Stamp|
|**orderType**|String|False| |Type of Purchase Order (NEW-New purchase, RENEW - Renewal, RESIZE_FORMULA - Configuration Changes, TEMP_UPGRADE - Temporary Configuration Upgrade)|
|**pageNumber**|Integer|False| |Page: Page No.|
|**pageSize**|Integer|False| |Page: Order Piece|
|**payType**|String|False| |Payment Type (PRE_PAID - Pay-In-Advance, POST_PAID - Pay-As-You-Go)|
|**serviceCode**|String|False| |Product Line|
|**status**|String|False| |Order Status (PAID - Paid, CANCELED - Canceled, NO_PAY - Unpaid, FAILED - Failed, DEALING - In Processing, REFUND_PART - Partly Refunded, REFUND_ALL - All Refunded)|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**resultList**|OrderResponseObject[]| |
|**totalCount**|Integer| |
|**totalPage**|Integer| |
### OrderResponseObject
|Name|Type|Description|
|---|---|---|
|**actualFee**|Number|Order Payable Amount|
|**appCode**|String|Business Line|
|**appName**|String|Business Name|
|**chargeMode**|String|Billing Type (CONFIG - Pay By Configuration, FLOW - Pay By Consumption, MONTHLY - Monthly Package, ONCE - Pay By Times)|
|**createTime**|String|Order Creation Time (Format: yyyy-MM-dd HH:mm:ss)|
|**discountFee**|Number|Discount Amount|
|**orderNumber**|String|Order Number|
|**orderType**|String|Type of Purchase Order (NEW - New Purchase, RENEW - Renewal, RESIZE_FORMULA - Configuration Changes)|
|**payTime**|String|Order Payment Time (Format: yyyy-MM-dd HH:mm:ss)|
|**payType**|String|Payment Type (PRE_PAID - Pay-In-Advance, POST_PAID - Pay-As-You-Go)|
|**paymentNumber**|String|Order Number|
|**pin**|String|User pin|
|**selfSupportType**|String|Self-support Type (SELF_SUPPORT - Self-support, THIRD_PARTY_SUPPORT - Not Sold by JD Cloud)|
|**serviceName**|String|Product Line Name|
|**status**|String|Order Status (PAID - Paid, FAILED - Failed, NO_PAY - Unpaid, DEALING - In Processing, CANCELED-Canceled, REFUND_PART - Partly Refunded, REFUND_ALL - All Refunded)|
|**totalFee**|Number|Total Order Amount|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
