# queryOrder


## Description
Search Order Details

## Request Method
GET

## Request Address
https://order.jdcloud-api.com/v2/regions/{regionId}/order/{orderNumber}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region Code|
|**orderNumber**|String|True| |Order Number|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**includeDetail**|Boolean|False| |Whether commodity details are included|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**data**|OrderDetailResponseObject| |
### OrderDetailResponseObject
|Name|Type|Description|
|---|---|---|
|**appCode**|String|Business Line|
|**appName**|String|Business Line Name|
|**balancePay**|Number|Balance Payment Amount|
|**discountFee**|Number|Discount Amount|
|**refundFee**|Number|Refund Amount|
|**favorableFee**|Number|Coupon Amount|
|**totalFee**|Number|Total Order Amount|
|**moneyPay**|Number|Cash Payment Amount|
|**actualFee**|Number|Amount Payable (Total Order Amount - Discount Amount)|
|**paidFee**|Number|Total Paid Amount|
|**activityType**|String|Activity Order Type (NORMAL - Normal Order, ACTIVITY - Activity Order)|
|**chargeMode**|String|Billing Type (CONFIG - Pay By Configuration, FLOW - Pay By Consumption, MONTHLY - Monthly Package, ONCE - Pay By Times)|
|**createTime**|String|Order Creation Time (Format: yyyy-MM-dd HH:mm:ss)|
|**expirationTime**|String|Automatic Cancellation Time of Unpaid Order (Format: yyyy-MM-dd HH:mm:ss)|
|**orderNumber**|String|Order Number|
|**orderType**|String|Type of Purchase Order (NEW - New Purchase, RENEW - Renewal, RESIZE_FORMULA - Configuration Changes)|
|**payTime**|String|Order Payment Time (Format: yyyy-MM-dd HH:mm:ss)|
|**payType**|String|Payment Type (PRE_PAID - Pay-In-Advance, POST_PAID - Pay-As-You-Go)|
|**payUrl**|String|Payment Confirmation Page Address|
|**payer**|String|Payer|
|**paymentChannel**|String|Payment Channel (BALANCE_PAYMENT - Balance Payment, ENTERPRISE_BANK_PAYMENT - Enterprise Online Banking, PERSONAL_BANK_PAYMENT - Personal Online Banking, JD_PAYMENT - JD, WENXIN_PAYMENT - WeChat Payment, OFFLINE_PAYMENT - Offline Remittance)|
|**paymentNumber**|String|Pay Order Number|
|**pin**|String|User pin|
|**proposer**|String|Order Applicant, Creator|
|**remark**|String|Remarks|
|**selfSupportType**|String|Self-support Type (SELF_SUPPORT - Self-support, THIRD_PARTY_SUPPORT - Not Sold by JD Cloud)|
|**serviceName**|String|Product Line Name|
|**siteType**|String|Site Name (MAIN_SITE - Main Site, INTERNATIONAL_SITE - International Site, SUQIAN_DEDICATED_CLOUD - Suqian Proprietary Cloud)|
|**status**|String|Order Status (PAID - Paid, FAILED - Failed, NO_PAY - Unpaid, DEALING - In Processing, CANCELED-Canceled, REFUND_PART - Partly Refunded, REFUND_ALL - All Refunded)|
|**updatedTime**|String|Order Update Time|
|**childOrderDetailList**|OrderDetailResponseObject[]|Sub-order|
|**orderItemDetails**|OrderItemDetailResponseObject[]|Sub-resource Order|
### OrderItemDetailResponseObject
|Name|Type|Description|
|---|---|---|
|**totalFee**|Number|Total Order Amount|
|**actualFee**|Number|Amount Payable (Total Order Amount - Discount Amount)|
|**balancePay**|Number|Balance Payment Amount|
|**chargeDuration**|Integer|Billing Duration|
|**moneyPay**|Number|Cash Payment Amount|
|**refundFee**|Number|Refund Amount|
|**chargeMode**|String|Billing Type (CONFIG - Pay By Configuration, FLOW - Pay By Consumption, MONTHLY - Monthly Package, ONCE - Pay By Times)|
|**createTime**|String|Order Creation Time (Format: yyyy-MM-dd HH:mm:ss)|
|**expireDateAfter**|String|Expiration time for the resource after renewal (Format: yyyy-MM-dd HH:mm:ss)|
|**expireDateBefore**|String|Expiration time for the resource before renewal (Format: yyyy-MM-dd HH:mm:ss)|
|**extraInfo**|ExtraInfo[]|Sales Attribute|
|**extraInfoAfter**|ExtraInfo[]|Expiration time for the resource after renewal-Sales attribute|
|**extraInfoBefore**|ExtraInfo[]|Expiration time for the resource before renewal-Sales attribute|
|**favorableFee**|Number|Coupon Amount|
|**formula**|String|Item Billed by Configuration|
|**itemId**|String|Resources id|
|**itemName**|String|Resource Name|
|**orderNumber**|String|Order Number|
|**priceSnapshot**|String|Price Snapshot|
|**quantity**|Integer|Count|
|**remark**|String|Remarks|
|**resizeFormulaType**|String|Configuration Change Details (UP - Configuration Upgrade By Making Up Difference, DOWN - Configuration Downgrade By Time Delay, MODIFY_CONFIG - Resize，RENEW - Renewal, RENEW_UP- Configuration Upgrade By Renewal, RENEW_DOWN - Configuration Downgrade By Renewal, MONTHLY - Configuration Changed To Monthly Package RENEW_FREE - Free Renewal)|
|**serviceName**|String|Product Name|
|**siteType**|String|Site Name (MAIN_SITE - Main Site, INTERNATIONAL_SITE - International Site, SUQIAN_DEDICATED_CLOUD - Suqian Proprietary Cloud)|
|**status**|String|Resource Status (CREATING - Creating, SUCCESS - Success, FAIL-Fail)|
|**unit**|String|Billing Duration Unit (HOUR - Hour, DAY - Day, MONTH - Month, YEAR - Year)|
|**orderItemDetailResponse**|OrderItemDetailResponseObject[]|Sub-order|
### ExtraInfo
|Name|Type|Description|
|---|---|---|
|**name**|String|Name|
|**value**|String|Value|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
