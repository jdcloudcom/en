# describeProductsForAlarm


## Description
Search product lists used for creating monitoring rules

## Request Method
GET

## Request Address
https://monitor.jdcloud-api.com/v2/groupAlarms:products


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**serviceCode**|String|False| |Product line, filtered from the product line dimension|
|**product**|String|False| |Product type, filtered from product dimension, such as redis2.8cluster\redis2.8instance. When serviceCode and product are designated at the same time, product shall have higher priority|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**productList**|Product[]| |
### Product
|Name|Type|Description|
|---|---|---|
|**dimensions**|Dimension[]|Dimension Information|
|**product**|String|Product Identifier|
|**productName**|String|Product Name|
|**serviceCode**|String|Product Line Corresponding to product|
|**tagServiceCode**|String|Corresponding Tag Service serviceCode|
|**tags**|Object| |
### Dimension
|Name|Type|Description|
|---|---|---|
|**dimension**|String|Dimension|
|**dimensionName**|String|Dimension Name|
|**isNode**|Boolean|Child node or not|
|**tagServiceCode**|String|Service serviceCode of Corresponding Tag Service|
|**tags**|Object|tags|

## Return Code
|Return Code|Description|
|---|---|
|**200**|Search product lists used for creating rules|


