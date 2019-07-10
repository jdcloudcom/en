# jdxQueryPrice


## Description
Inquire prices

## Request Method
POST

## Request Address
https://elite.cn-south-1.jdcloud-api.com/v1/regions/{regionId}/jdxQueryPrice

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**queryPriceParam**|QueryPriceParam|True| |Search price parameters|

### QueryPriceParam
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**cmd**|Integer|True| |Operation Type 1: Create 2: Renew 3: Upgrade and Downgrade Configuration|
|**packageCount**|Integer|True| |Number of Bundled Purchased Packages|
|**orderList**|OrderPriceProtocolVo[]|True| | |
### OrderPriceProtocolVo
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**resourceId**|String|False| |The resource id is required only during renewal and configuration upgrade and downgrade|
|**serviceCode**|String|True| |The resource types consist of vm, disk, ip, etc. Please contact us during connection for the specific value|
|**region**|String|True| |Resource Region, Value Taken cn-north-1,cn-east-1,cn-east-2,cn-south-1|
|**billingType**|Integer|True| |Billing Type: 1. Pay by Configuration 2. Pay by Consumption 3. Monthly Package|
|**formula**|OrderResourceFormulaVo[]|False| |List of Resource Configuration Items|
|**count**|Integer|True| |Resource Count|
|**timeSpan**|Integer|True| |Resource Utilization Duration|
|**timeUnit**|Integer|True| |Resource Utilization Duration Type, 1: Hour 2: Day 3. Month 4: Year|
|**networkOperator**|Integer|True| |Resource Network Type, 0: None 1: non-BGP 2: BGP, indicate 1 or 2 in case of resource type ip, and indicate 0 in the case of other resource types|
|**pin**|String|False| |As for the user pin, indicate the pin of the discount user if any, or just ignore that|
|**startTime**|String|True| |Start Time, in the Format of yyyy-MM-dd HH:mm:ss|
|**endTime**|String|False| |End Time, in the Format of yyyy-MM-dd HH:mm:ss|
### OrderResourceFormulaVo
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**key**|String|True| |As for the resource configuration item number, please contact us during connection for its specific value|
|**value**|Double|True| |Resource Configuration Item Count|

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
|**data**|QueryPriceResultVo|Query Data Result|
### QueryPriceResultVo
|Name|Type|Description|
|---|---|---|
|**totalPrice**|Number|Total Amount, Accurate to 2 Decimal Places|
|**totalPriceScale4**|Number|Total Amount, Accurate to 4 Decimal Places|
|**discountedTotalPrice**|Number|Post-discount Total Amount|
|**totalDiscount**|Number|Discount Amount|
|**totalOriginalPrice**|Number|Original Amount of Order|
|**remark**|String|Description|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**500**|Internal server error|
