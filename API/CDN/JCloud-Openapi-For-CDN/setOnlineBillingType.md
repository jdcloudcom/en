# setOnlineBillingType


## Description
Set on-line billing method

## Request Method
POST

## Request Address
https://cdn.jdcloud-api.com/v1/onlineBillingType


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**allType**|Integer|False| |Billing Method, value [0,1], 0: Billing by daily traffic, 1: Billing by daily peak bandwidth.|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Object| |
|**requestId**|String| |


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
