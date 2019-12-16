# describeParameterGroups


## Description
Get all parameter group list under current account<br>- Only support MySQL

## Request Method
GET

## Request Address
https://rds.jdcloud-api.com/v1/regions/{regionId}/parameterGroups

|Name|Type|Required or not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameters
|Name|Type|Required or not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False| |Pages displaying data, which is 1 by default with value range: [-1,∞).   When pageNumber is 1, return all data page numbers; when exceeding total pages, display the last page;|
|**pageSize**|Integer|False| |Data entries displayed on each page, which is 10 by default with the value range: [10,100] and a multiple of 10.|


## Returned Parameters
|Name|Type|Description|
|---|---|---|
|**result**|[Result](describeParameterGroups#Result)| |

### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**parameterGroups**|[ParameterGroup[]](describeParameterGroups#ParameterGroup)| |
|**totalCount**|Integer| |
### <a name="ParameterGroup">ParameterGroup</a>
|Name|Type|Description|
|---|---|---|
|**parameterGroupId**|String|Parameter group ID|
|**parameterGroupName**|String|Name of Parameter Group|
|**parameterGroupStatus**|String|Status of Parameter Group|
|**description**|String|Description of Parameter Group|
|**engine**|String|Type of Instance Engine|
|**engineVersion**|String|Database Version|
|**regionId**|String|Region code, see [Table of Comparisons of Regions and Availability Zones](../Enum-Definitions/Regions-AZ.md) for value range|
|**createTime**|String|Create Time of Parameter Group|

## Return Code
|Return Code|Descripton|
|---|---|
|**200**|OK|
