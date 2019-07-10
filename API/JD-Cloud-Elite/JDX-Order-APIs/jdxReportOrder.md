# jdxReportOrder


## Description
Report orders

## Request Method
POST

## Request Address
https://elite.cn-south-1.jdcloud-api.com/v1/regions/{regionId}/jdxReportOrder

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**reportOrderInfo**|ReportOrderInfo|True| |Report order information|

### ReportOrderInfo
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**orderNumber**|String|True| |Order Number|
|**distributorAccount**|String|False| |Account Number of Distributor|
|**distributorName**|String|False| |Name of Distributor|
|**extraInfo**|String|False| |Supplement information, and state some descriptive information of the current order|

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
