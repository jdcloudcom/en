# describeServices


## Description
Information APIs for Product Line on the Overview Page

## Request Method
GET

## Request Address
https://monitor.jdcloud-api.com/v2/services


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**filters**|Filter[]|False| |Service Code List<br>The filter name serviceCodes refers to search rules of product lines|
|**productType**|Long|False| |The product line type to be searched include   0: all    1: resource monitoring   2: others   default: 1. If the serviceCode to be searched is designated, please ignore this parameter|

### Filter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|False| | |
|**values**|String[]|False| | |

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|Requested Identifier id|

### Result
|Name|Type|Description|
|---|---|---|
|**services**|ServiceInfoV2[]| |
### ServiceInfoV2
|Name|Type|Description|
|---|---|---|
|**dimensions**|ChartDimension[]|Grouping Information Under Product Line|
|**groupTree**|GroupTree| |
|**serviceCode**|String|Product Line ServiceCode|
|**serviceName**|String|Product Line Name|
### GroupTree
|Name|Type|Description|
|---|---|---|
|**childs**|GroupNode[]|Grouping groupCodes|
|**serviceCode**|String|serviceCode|
### GroupNode
|Name|Type|Description|
|---|---|---|
|**childs**|GroupNode[]|Grouping Child Node|
|**groupCode**|String|Grouping groupCode|
|**parent**|String|Grouping parent node groupCode|
### ChartDimension
|Name|Type|Description|
|---|---|---|
|**dimension**|String|Grouping groupCode|
|**dimensionName**|String|Group Name|
|**tags**|Object|tags corresponding to metric under group|

## Return Code
|Return Code|Description|
|---|---|
|**200**|View service information of each product line |


