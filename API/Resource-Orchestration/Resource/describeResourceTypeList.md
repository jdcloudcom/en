# describeResourceTypeList


## Description
Search supported resource lists

## Request Method
GET

## Request Address
https://jdro.jdcloud-api.com/v1/regions/{regionId}/resourcetypes

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Long|False| |Current page, 1 by default|
|**pageSize**|Long|False| |Page size, 20 by default; value range[1, 100]|
|**product**|String|False| |Product line type, such as VM|
|**search**|String|False| |Contents to Be Searched|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|Requested identifier id|

### Result
|Name|Type|Description|
|---|---|---|
|**resourceTypeList**|DescribeResourceTypeListItem[]| |
|**totalCount**|Long| |
### DescribeResourceTypeListItem
|Name|Type|Description|
|---|---|---|
|**describe**|String| |
|**type**|String|Resource Type|

## Return Code
|Return Code|Description|
|---|---|
|**200**|Search supported resource list results|
