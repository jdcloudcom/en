# renewInstance


## Description
Renew related instances. Calling API creates a renewal order and automatically deducts the available coupons and balances from your account to complete the payment. If the payment fails for some reason, the order is automatically canceled.

## Request Method
POST

## Request Address
https://renewal.jdcloud-api.com/v2/regions/{regionId}/instances:renew

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**renewInstanceParam**|RenewInstanceParam|True| | |

### RenewInstanceParam
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**appCode**|String|True| |Business Line|
|**serviceCode**|String|True| |Product Line|
|**timeSpan**|Integer|True| |Renewal Duration (When timeUnit=MONTH, only 1, 2, 3, 4, 5, 6, 7, 8 and 9 can be uploaded, when timeUnit=YEAR, only 1, 2 and 3 can be uploaded)|
|**timeUnit**|String|True| |Time Unit (MONTH-Month, YEAR-Year)|
|**instanceIds**|String|True| |Resource ID lists to be renewed, separate by English comma|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**orderNumber**|String|ID of successfully created order|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|Not found|
|**500**|Internal server error|
