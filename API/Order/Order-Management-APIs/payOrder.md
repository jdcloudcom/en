# payOrder


## Description
Order Payment

## Request Method
POST

## Request Address
https://order.jdcloud-api.com/v2/regions/{regionId}/order/{orderNumber}:pay

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**orderNumber**|String|True| |orderNumber ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**autoPay**|Boolean|False| |When the automatic payment mark is true, the automatic payment will automatically occur, the order of Pay-As-You-Go directly pay RMB 0; if the order of Pay-In-Advance (balance + coupon) > the order payable amount, it will be successful, or the payment will be failed (it is suggested that payment shall be done by cash mode on the JD Cloud Platform)|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**orderNumber**|String|Order Number|
|**autoPay**|Boolean|When the automatic payment mark is true, the automatic payment will automatically occur, the order of Pay-As-You-Go directly pay RMB 0; if the order of Pay-In-Advance (balance + coupon) > the order payable amount, it will be successful, or the payment will be failed (it is suggested that payment shall be done by cash mode on the JD Cloud Platform)|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
