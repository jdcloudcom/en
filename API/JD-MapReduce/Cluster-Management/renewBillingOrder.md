# renewBillingOrder


## Description
Renew the specified cluster in the specified renewal method

## Request method
POST

## Request address
https://idata-jmr-api.jcloud.com/v1/regions/{regionId}/BillingOrder:renew

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**clusterId**|String|True| |Renew the cluster clusterId|
|**type**|Integer|True| |"Required Parameters, Billing Type"<br>      "* 1: Pay By Configuration"<br>      "* 601-609: Monthly package for 1 month to 9 months"<br>      "* 610: Monthly package for 1 year"<br>      "* 620: Monthly package for 2 years"<br>|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**message**|String| |
|**status**|String| |

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**500**|Internal server error|
