# queryOridbwTable


## Description
Details of Back-to-origin Bandwidth Data

## Request Method
POST

## Request Address
https://cdn.jdcloud-api.com/v1/console:oribdwTable


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**startTime**|String|True| |Search start time, UTC time, format: yyyy-MM-dd'T'HH:mm:ss’Z’, example: 2018-10-21T10:00:00Z|
|**endTime**|String|True| |Search end time, UTC time, format: yyyy-MM-dd'T'HH:mm:ss’Z’, example: 2018-10-21T10:00:00Z|
|**domain**|String|False| |Domain required to be searched must be domain with permission under user pin|
|**area**|String|False| | |
|**isp**|String|False| | |
|**sortField**|String|False| |Sorting field, oripvPercent is oripv, oriflowPercent is oriflow|
|**sortRule**|String|False| |Sorting Rule, desc by default|
|**pageSize**|Integer|False|10| |
|**pageNumber**|Integer|False|1| |
|**groupBy**|String|False| |Grouping field, domainType means grouping by business type|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](#result)| |
|**requestId**|String| |

### <div id="Result">Result</div>
|Name|Type|Description|
|---|---|---|
|**total**|Integer| |
|**data**|[OridbwTableItem[]](#oridbwtableitem)| |
### <div id="OridbwTableItem">OridbwTableItem</div>
|Name|Type|Description|
|---|---|---|
|**groupByname**|String| |
|**domainTyep**|String| |
|**oriflowPercent**|String| |
|**oripvPercent**|String| |
|**avgbandwidth**|Double| |
|**avgoribandwidth**|Double| |
|**oriTopTimeStamp**|Long| |
|**pv**|Long| |
|**oripv**|Long| |
|**flow**|Double| |
|**oriflow**|Double| |

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
