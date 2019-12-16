# listProductAbilities


## Description
View feature list API

## Request Method
GET

## Request Address
https://iothub.jdcloud-api.com/v2/regions/{regionId}/products/{productKey}/abilities

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**productKey**|String|True| |Product Key|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False|1|page; it is 1 by default, the value range: [1,∞)|
|**pageSize**|Integer|False|10|Page size; it is 10 by default; value range[10, 100]|
|**filters**|Filter[]|False| |abilityName-Function name, exact matching<br>abilityType-Function type, exact matching<br>|

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
|**abilities**|ProductAbility[]|Product Details|
### ProductAbility
|Name|Type|Description|
|---|---|---|
|**abilityId**|String|Unique Function Identifier|
|**abilityName**|String|Name|
|**abilityType**|Integer|Type, 0: Attribute, 1: Incident, 2: Service|
|**abilityDescription**|String|Description|
|**accessMode**|String|Read-write Attribute, read_only: read only, read_write: read and write|
|**abilityDataType**|String|Data Type|
|**abilityDataSpec**|String|Data Definition|
|**customized**|Boolean|Customized functions or not, false: No, true: Yes|
|**createdTime**|Long|Creation time, the time is based on UTC/GMT+08:00|
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
