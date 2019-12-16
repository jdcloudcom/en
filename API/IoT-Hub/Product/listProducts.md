# listProducts


## Description
View product list API

## Request Method
GET

## Request Address
https://iothub.jdcloud-api.com/v2/regions/{regionId}/products

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False|1|page; it is 1 by default, the value range: [1,∞)|
|**pageSize**|Integer|False|10|Page size; it is 10 by default; value range[10, 100]|
|**filters**|Filter[]|False| |productName-product name, exact matching, supporting a single product name<br>productKey-product key, exact match, supporting a single product key<br>productType-product type, exact matching, supporting a single product type<br>|

### Filter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|True| |Name of Filter Requirements|
|**operator**|String|False| |Operator of filter requirements is eq by default|
|**values**|String[]|True| |Value of Filter Requirements|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**page**|PageinfoVO|Paging Information|
|**products**|Product[]|Product Details|
### Product
|Name|Type|Description|
|---|---|---|
|**productName**|String|Product Name|
|**productId**|String|Product ID|
|**productType**|Integer|0: Device The device cannot be attached with any child device. It can be directly connected to the IoT platform and also be connected to the IoT platform as the gateway child device<br>1: Gateway. The Gateway can be attached with a child device and has a child device management module maintaining child device topology and synchronizing topology to the IoT platform<br>|
|**productKey**|String|Product Key|
|**createdTime**|Long|Creation time, creation time, the time is based on UTC/GMT+08:00|
|**templateName**|String|Product Type, such as customized, etc.|
### PageinfoVO
|Name|Type|Description|
|---|---|---|
|**pageSize**|Integer|Entry(ies) displayed per page|
|**nowPage**|Integer|Current Page Number|
|**totalSize**|Integer|Number of Total Records|
|**totalPage**|Integer|Total Number of Pages|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
